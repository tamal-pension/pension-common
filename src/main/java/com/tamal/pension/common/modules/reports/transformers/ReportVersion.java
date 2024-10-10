package com.tamal.pension.common.modules.reports.transformers;

import java.util.Optional;
import java.util.function.Function;

import javax.xml.validation.Schema;

import com.google.common.base.Preconditions;
import com.tamal.pension.common.Version;
import com.tamal.pension.common.modules.reports.ReportType;
import com.tamal.pension.common.modules.schema.SchemaVersion;

public class ReportVersion extends ModelVersion {
	private final Function<ReportTypeVersion, Optional<SchemaVersion>> schemaFactory;
	private final ReportType reportType;
	
	public ReportVersion(ReportType reportType, ModelVersion modelVersion, Function<ReportTypeVersion, Optional<SchemaVersion>> schemaFactory) {
		this(reportType, modelVersion.getVersion(), modelVersion.getClazz(), schemaFactory);
	}
	
	public ReportVersion(ReportType reportType, Version version, Class<?> clazz, Function<ReportTypeVersion, Optional<SchemaVersion>> schemaFactory) {
		super(version, clazz);
		this.reportType = Preconditions.checkNotNull(reportType);
		this.schemaFactory = Preconditions.checkNotNull(schemaFactory);
	}

	public Optional<Schema> getSchema() {
		return getSchemaVersion().map(SchemaVersion::schema);
	}
	
	public Optional<SchemaVersion> getSchemaVersion() {
		return schemaFactory.apply(ReportTypeVersion.of(reportType, getVersion()));
	}
	
	@Override
	public String toString() {
		return super.toStringHelper().add("reportType", reportType).toString();
	}
}
