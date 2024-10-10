package com.tamal.pension.common.modules.reports.transformers;

import com.tamal.pension.common.Version;
import com.tamal.pension.common.modules.reports.ReportType;

public class ReportTypeVersion {
	private final ReportType reportType;
	private final Version version;
	
	public ReportTypeVersion(ReportType reportType, Version version) {
		super();
		this.reportType = reportType;
		this.version = version;
	}

	public ReportType reportType() {
		return reportType;
	}

	public Version version() {
		return version;
	}
	
	public static ReportTypeVersion of(ReportType reportType, Version version) {
		return new ReportTypeVersion(reportType, version);
	}
}
