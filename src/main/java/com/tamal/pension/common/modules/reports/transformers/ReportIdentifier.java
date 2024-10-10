package com.tamal.pension.common.modules.reports.transformers;

import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.common.base.Preconditions;

public class ReportIdentifier {
	private static final Logger logger = LogManager.getLogger(ReportIdentifier.class);
	private final StringBuilder builder;
	
	public ReportIdentifier(StringBuilder builder) {
		this.builder = Preconditions.checkNotNull(builder);
	}
	
	public ReportIdentifier(CharSequence cs) {
		this(new StringBuilder(cs));
	}
	
	public Optional<FileHeaders> identify() {
		FileHeaders meta = null;
		try {
			meta = FileHeaders.parse(builder.toString());
			if(null == meta){
				logger.warn("Failed to determine report type. '{}...'", builder.substring(0, Math.max(10, builder.length())));
			}
		} catch (Exception e) {
			logger.error(String.format("Failed to determine report type. '%s...'", builder.substring(0, Math.max(10, builder.length()))), e);
		}
		
		return Optional.ofNullable(meta);
	}
}
