package com.tamal.pension.common.modules.schema;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.apache.logging.log4j.util.Lazy;

import com.google.common.collect.Maps;
import com.inqwise.errors.Bug;
import com.tamal.pension.common.Version;
import com.tamal.pension.common.modules.reports.ReportType;
import com.tamal.pension.common.modules.reports.transformers.ReportTypeVersion;

public class SchemaManager {
	
	static final String DEFAULT_SCHEMA_FOLDER = "schema";
	private final SchemaManagerOptions options;
	private final Map<ReportType, LinkedHashMap<Version, Lazy<SchemaVersion>>> schemasMap = Maps.newHashMap();
	private final Map<ReportType, Version> versionsMap = Maps.newHashMap();
	private final SchemaProvider schemaProvider;

	public SchemaManager(SchemaManagerOptions options) {
		this.options = options;
		
		options.getSchemasOptions().forEach(schemaOptions -> {
			this.versionsMap.merge(schemaOptions.getReportType(), schemaOptions.getVersion(), Version::max);
			
			this.schemasMap
			.computeIfAbsent(schemaOptions.getReportType(), reportType -> Maps.newLinkedHashMap())
			.computeIfAbsent(schemaOptions.getVersion(), version -> Lazy.lazy(() -> getSchema(schemaOptions)));
		});
		
		//validate
		for (ReportType reportType : ReportType.values()) {
			if(!versionsMap.containsKey(reportType)) {
				throw new Bug("SchemaManager do not contain data for ReportType: '{}'", reportType);
			}
		}
		
		schemaProvider = new SchemaProvider(options.getBasePath());
	}
	
	public Optional<SchemaVersion> getSchemaOrDefault(ReportTypeVersion reportTypeVersion){
		return getSchemaOrDefault(reportTypeVersion.reportType(), reportTypeVersion.version());
	}
	
	public Optional<SchemaVersion> getSchemaOrDefault(ReportType reportType, Version version){
		return getSchema(reportType, version).map(Optional::of).orElseGet(() -> getSchema(reportType, getDefaultVersion(reportType)));
	}
	
	public Optional<SchemaVersion> getSchema(ReportTypeVersion reportTypeVersion){
		return getSchema(reportTypeVersion.reportType(), reportTypeVersion.version());
	}
	
	public Optional<SchemaVersion> getSchema(ReportType reportType, Version version) {
		return Optional.ofNullable(schemasMap.get(reportType))
				.flatMap(m -> Optional.ofNullable(m.get(version)))
				.map(v -> v.value());
	}
	
	private SchemaVersion getSchema(SchemaManagerOptions.ReportVersionSchemaOptions options) {
		return new SchemaVersion(schemaProvider.getSchema(options.getFileName()), options.getVersion());
	}
	
	public Version getDefaultVersion(ReportType reportType) {
		return versionsMap.get(reportType);
	}

	public Set<Version> getVersions(ReportType reportType) {
		return schemasMap.get(reportType).keySet();
	}
}
