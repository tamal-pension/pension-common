package com.tamal.pension.common.modules.reports.transformers;

import java.util.Arrays;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.tamal.pension.common.Version;
import com.tamal.pension.common.modules.reports.ReportType;

import io.vertx.core.json.JsonObject;

public class TransformersOptions {
	
	private final boolean throwOnDuplicate;
	private final ModelVersionOptions[] modelVersions;
	
	public static class ModelVersionOptions extends ModelVersion {
		private ReportType reportType;

		public ModelVersionOptions(ReportType reportType, Version version, Class<?> clazz) {
			super(version, clazz);
			this.reportType = reportType;
		}

		public ReportType getReportType() {
			return reportType;
		}
		
		@Override
		public String toString() {
			return MoreObjects.toStringHelper(this).add("reportType", reportType).add("version", getVersion()).toString();
		}
	}
	
	public TransformersOptions() {
		throwOnDuplicate = true;
		modelVersions = new ModelVersionOptions[0];
	}
	
	public TransformersOptions(JsonObject config) {
		throwOnDuplicate = config.getBoolean("throw_on_duplicate", true);
		modelVersions =
		config.getJsonArray("versions").stream().map(obj -> (JsonObject)obj).map(json -> {
			if(json.getBoolean("active", true)) {
				ReportType reportType = ReportType.valueOf(Preconditions.checkNotNull(json.getString("type"), "type").toUpperCase());
				Version version = Version.of(Preconditions.checkNotNull(json.getString("version"), "version"));
				String className = Preconditions.checkNotNull(json.getString("class"), "class");
				
				Class<?> clazz;
				try {
					clazz = ClassLoader.getSystemClassLoader().loadClass(className);
				} catch (ClassNotFoundException e) {
					throw new TransformerException("Unable to load class", e);
				}
				return new ModelVersionOptions(reportType, version, clazz);
			} 
			return null;
		}).filter(nill -> null != nill).toArray(ModelVersionOptions[]::new);
	}
	
	public ModelVersionOptions[] getModelVersionOptions() {
		return modelVersions;
	}
	
	public boolean isThrowOnDuplicate() {
		return throwOnDuplicate;
	}

	public static TransformersOptions create(JsonObject json) {
		return null == json ? new TransformersOptions() : new TransformersOptions(json);
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).omitNullValues().add("throwOnDuplicate", throwOnDuplicate)
				.add("modelVersions", Arrays.deepToString(modelVersions)).toString();
	}
}
