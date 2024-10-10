package com.tamal.pension.common.modules.reports.transformers;

import java.util.List;

import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.tamal.pension.common.Version;
import com.tamal.pension.common.modules.reports.ReportType;

public interface ReportTransformer {
	
	<T> T unmarshal(CharSequence str);
	
	<T> T tryUnmarshal(CharSequence str);
	
	<T> T unmarshal(CharSequence str, Version version);
	
	<T> T tryUnmarshal(CharSequence str, Version version);

	String marshal(Object obj, Version version);
	
	boolean isSupportForVersion(Version version);

	<T> T tryUnmarshal(CharSequence str, Version version, T def);
	
	default ReportTransformerBuilder builder() {
		return new ReportTransformerBuilder();
	}
	
	public static class ReportTransformerBuilder {
		private ReportType reportType;
		private List<ReportVersion> reportVersionList = Lists.newArrayList();
		
		public ReportTransformerBuilder reportType(ReportType reportType) {
			this.reportType = reportType;
			
			return this;
		}
		public ReportTransformerBuilder addModelVersion(ReportVersion reportVersion) {
			this.reportVersionList.add(reportVersion);
			
			return this;
		}
		
		public ReportTransformer build() {
			Preconditions.checkArgument(reportVersionList.size() > 0, "at least one ModelVersion required");
			return new ReportTransformerImpl(reportType, reportVersionList.toArray(new ReportVersion[reportVersionList.size()]));
		}
	}

	ReportVersionTransformer getVersionTransformer(Version version);
}
