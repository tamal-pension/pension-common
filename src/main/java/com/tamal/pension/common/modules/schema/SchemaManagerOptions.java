package com.tamal.pension.common.modules.schema;

import java.util.Optional;
import java.util.Set;

import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Sets;
import com.tamal.pension.common.Version;
import com.tamal.pension.common.modules.reports.ReportType;

import io.vertx.core.json.JsonObject;

public class SchemaManagerOptions {
	public static class ReportVersionSchemaOptions {
		private Version version;
		private ReportType reportType;
		private String fileName;
		
		ReportVersionSchemaOptions() {
		}
		
		public ReportVersionSchemaOptions(ReportType reportType, Version version, String fileName) {
			super();
			this.version = Preconditions.checkNotNull(version, "version");
			this.reportType = Preconditions.checkNotNull(reportType, "reportType");
			this.fileName = Preconditions.checkNotNull(fileName, "fileName");
		}
		
		public ReportVersionSchemaOptions(ReportType reportType, String version, String fileName) {
			this(reportType, Version.of(Preconditions.checkNotNull(version, "version")), fileName);
		}

		public Version getVersion() {
			return version;
		}

		public ReportType getReportType() {
			return reportType;
		}

		public String getFileName() {
			return fileName;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((fileName == null) ? 0 : fileName.hashCode());
			result = prime * result + ((reportType == null) ? 0 : reportType.hashCode());
			result = prime * result + ((version == null) ? 0 : version.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ReportVersionSchemaOptions other = (ReportVersionSchemaOptions) obj;
			if (fileName == null) {
				if (other.fileName != null)
					return false;
			} else if (!fileName.equals(other.fileName))
				return false;
			if (reportType != other.reportType)
				return false;
			if (version == null) {
				if (other.version != null)
					return false;
			} else if (!version.equals(other.version))
				return false;
			return true;
		}
		
		@Override
		public String toString() {
			return MoreObjects.toStringHelper(this).omitNullValues().add("fileName", fileName)
					.add("reportType", reportType).add("version", version).toString();
		}
	}
	
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).omitNullValues().add("basePath", basePath)
				.add("reportVersionSchemaMap", reportVersionSchemaMap).toString();
	}

	private String basePath;
	private final Set<ReportVersionSchemaOptions> reportVersionSchemaMap = Sets.newHashSet(); 
	
	public SchemaManagerOptions() {
		this(SchemaManager.DEFAULT_SCHEMA_FOLDER);
		
		addReportOptions(ReportType.FIRST, Version.of(5), "first/Mimshak_Maasikim_First_XSD_v5.xsd")
		.addReportOptions(ReportType.MESAKEM, Version.of(1), "mesakem/Mimshak_Mesakem_XSD_Schema_v1.xsd")
		.addReportOptions(ReportType.NEGATIVE, Version.of(1), "negative/Mimshak_Maasikim_Shliliim_XSD_Schema_v1.xsd")
		.addReportOptions(ReportType.SHOTEF, Version.of(1), "shotef/Mimshak_Maasikim_Shotef_XSD_Schema_v1.xsd")
		.addReportOptions(ReportType.YEARLY, Version.of(1), "yearly/Mimshak_Mesakem_Shnati_XSD_Schema_v1.xsd");
	}
	
	public SchemaManagerOptions(String basePath) {
		this.basePath = basePath;
	}
	
	public SchemaManagerOptions(JsonObject config) {
		this.basePath = config.getString("base_path");
		
		Optional.ofNullable(config.getJsonArray("reports"))
		.ifPresent(jsonArray -> jsonArray.forEach(obj -> addReportOptions((JsonObject)obj)));
	}
	
	private SchemaManagerOptions addReportOptions(JsonObject json) {
		if(json.getBoolean("active", true)) {
			ReportType reportType = ReportType.valueOf(json.getString("type").toUpperCase());
			return addReportOptions(new ReportVersionSchemaOptions(reportType,  json.getString("version"), json.getString("file")));
		}
		
		return this;
	}
	
	public SchemaManagerOptions addReportOptions(ReportType reportType, Version version, String fileName) {
		return addReportOptions(new ReportVersionSchemaOptions(reportType, version, fileName));
	}
	
	public SchemaManagerOptions addReportOptions(ReportVersionSchemaOptions options) {
		reportVersionSchemaMap.add(options);
		return this;
	}

	public String getBasePath() {
		return basePath;
	}

	public Set<ReportVersionSchemaOptions> getSchemasOptions() {
		return reportVersionSchemaMap;
	}

	public static SchemaManagerOptions create(JsonObject json) {
		return null == json ? new SchemaManagerOptions() : new SchemaManagerOptions(json);
	}
}
