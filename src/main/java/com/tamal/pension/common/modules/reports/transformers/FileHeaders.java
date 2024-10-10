package com.tamal.pension.common.modules.reports.transformers;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Lazy;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.stream.Format;

import com.google.common.base.MoreObjects;
import com.google.common.base.Strings;
import com.tamal.pension.common.Version;
import com.tamal.pension.common.modules.reports.ReportType;

@Root(name="KoteretKovetz", strict=false)
public class FileHeaders {
	
	private static final Logger logger = LogManager.getLogger(FileHeaders.class);
	
	private static final String META_OPEN_TAG = "<KoteretKovetz";
	private static final String SCHEMA = " xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"";
	private static final String META_CLOSE_TAG = "</KoteretKovetz>";
	
	@Element(name="SUG-MIMSHAK")
	private int interfaceTypeId;
	
	@Element(name="TAARICH-BITZUA")
	private String executionDateStr;
	
	@Element(name="MISPAR-GIRSAT-XML")
	private String version; 
	
	@Element(name="KOD-SVIVAT-AVODA")
	private int kodSvivatAvoda;
	
	@Element(name="MISPAR-HAKOVETZ")
	private String fileId;
	
	@Element(name="MISPAR-SIDURI", required=false)
	private Integer serialNumber;
	
	private final Lazy<ReportType> reportType = Lazy.lazy(() -> ReportType.findByIterfaceType(interfaceTypeId).orElseGet(() -> {
			logger.warn("Undefined interfaceTypeId {}", interfaceTypeId);
			return null;
	}));
	
	static FileHeaders parse(String string) throws Exception {
		String substring = find(string);
		if(null == substring) return null;
		
		Serializer serializer = new Persister(new Format("<?xml version=\"1.0\" encoding= \"UTF-8\" ?>"));
		
		return serializer.read(FileHeaders.class, substring);
	}
	
	static String find(String string){
		String result = StringUtils.substringBetween(string, META_OPEN_TAG, META_CLOSE_TAG);
		
		if(Strings.isNullOrEmpty(result)) return null;
		
		if(result.contains(SCHEMA)){
			result = StringUtils.join(META_OPEN_TAG, result, META_CLOSE_TAG);
		} else {
			result = StringUtils.join(META_OPEN_TAG, SCHEMA, result, META_CLOSE_TAG);
		}
		
		return result;
	}

	public ReportType reportType() {
		return reportType.value();
	}
	
	public Version version() {
		return Version.of(version);
	}
	
	public String fileId() {
		return fileId;
	}
	
	public String executionDateStr() {
		return executionDateStr;
	}
	
	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this)
				.add("interfaceTypeId", interfaceTypeId)
				.add("reportType", reportType())
				.add("version", version)
				.add("executionDateStr", executionDateStr)
				.add("kodSvivatAvoda", kodSvivatAvoda)
				.add("fileId", fileId)
				.add("serialNumber", serialNumber)
				.toString();
	}
}
