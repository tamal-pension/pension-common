package com.tamal.pension.common.modules.reports.transformers;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.tamal.pension.common.Version;
import com.tamal.pension.common.modules.reports.ReportType;
import com.tamal.pension.common.modules.reports.transformers.TransformersOptions.ModelVersionOptions;
import com.tamal.pension.common.modules.schema.SchemaManager;
import com.tamal.pension.common.modules.schema.SchemaVersion;

public class TransformersManager {
	private static final Logger logger = LogManager.getLogger(TransformersManager.class);
	
	private final SchemaManager schemaManager;
	private final Map<ReportType, ReportTransformerImpl> transformersMap = Maps.newHashMap();
	private boolean initialized = false;
	private final TransformersOptions options;
	
	public TransformersManager(TransformersOptions options, SchemaManager schemaManager) {
		this.options = Preconditions.checkNotNull(options, "options");
		this.schemaManager = Preconditions.checkNotNull(schemaManager, "schemaManager");
		init();
	}
	
	public TransformersManager init() {
		logger.debug("init");
		if(!initialized) {
			logger.trace("options:versions:{}", options.getModelVersionOptions());
			
			// fill version_transformers from config
			for (ModelVersionOptions modelVersion : options.getModelVersionOptions()) {
				if(addTransformerVersion(modelVersion) && options.isThrowOnDuplicate()) {
					// duplicate transformer fount
					throw new TransformerException(String.format("duplicate model_version found details: '%s'", modelVersion));
				}
			}
			
			logger.trace("defaults");
			// append default version_transformers
			// versions list by type exists in schemaManager;
			for (ReportType reportType : ReportType.values()) {
				for(Version version : schemaManager.getVersions(reportType)) {
					addTransformerVersion(reportType, ModelVersion.of(version, reportType.modelClass()), true);
				}
			}
			
			initialized = true;
		}
		return this;
	}
	
	private boolean addTransformerVersion(ReportType reportType, ModelVersion modelVerion, boolean skipIfExist) {
		logger.debug("addTransformerVersion({},{})", reportType, modelVerion);
		boolean result = false;
		ReportTransformerImpl transformer = transformersMap.get(reportType);
		if(null == transformer) {
			transformersMap.put(reportType, transformer = createReportTransformer(reportType, modelVerion));
		} else {
			result = transformer.addReportVersion(createReportVersion(modelVerion, reportType), skipIfExist);
		}
		return result;
	}

	private boolean addTransformerVersion(ModelVersionOptions options) {
		 return addTransformerVersion(options.getReportType(), options, false);
	}
	
	private ReportVersion createReportVersion(ModelVersion version, ReportType reportType) {
		logger.debug("createReportVersion({},{})", version, reportType);
		
		Function<ReportTypeVersion, Optional<SchemaVersion>> schemaFactory = schemaManager::getSchemaOrDefault;
		return new ReportVersion(reportType, version, schemaFactory);
	}
	
	private ReportTransformerImpl createReportTransformer(ReportType reportType, ModelVersion... modelVersions) {
		logger.debug("createReportTransformer({},{})", reportType, modelVersions);
		ReportVersion[] reportVersions =  Arrays.stream(modelVersions).map(version -> createReportVersion(version, reportType)).toArray(ReportVersion[]::new);
		return new ReportTransformerImpl(reportType, reportVersions);
	}
	
	public ReportTransformer getTransformer(ReportType reportType) {
		logger.debug("getTransformer({})", reportType);
		return transformersMap.get(reportType);
	}
}
