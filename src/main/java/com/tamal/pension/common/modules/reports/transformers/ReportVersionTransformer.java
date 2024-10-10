package com.tamal.pension.common.modules.reports.transformers;

import com.tamal.pension.common.Version;

public interface ReportVersionTransformer {
	<T> T unmarshal(CharSequence str);
	
	<T> T tryUnmarshal(CharSequence str);
	
	String marshal(Object obj, boolean withValidation);
	
	default String marshal(Object obj) {
		return marshal(obj, true);
	}
	
	Version version();
}
