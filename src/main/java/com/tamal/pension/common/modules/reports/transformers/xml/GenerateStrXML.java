package com.tamal.pension.common.modules.reports.transformers.xml;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.inqwise.errors.ErrorCodes;
import com.inqwise.errors.ErrorTicket;
import com.tamal.pension.common.Version;
import com.tamal.pension.common.jaxb.negative.NegativeModel;
import com.tamal.pension.common.jaxb.shotef.ShotefModel;
import com.tamal.pension.common.modules.reports.ReportType;
import com.tamal.pension.common.modules.reports.transformers.TransformersManager;

public class GenerateStrXML {
	
	private static final Logger logger = LogManager.getLogger(GenerateStrXML.class);
	
	private TransformersManager tranManager;
	private ReportType reportType;
	private String transformerVersion;
	private ShotefModel shotefModel;
	private NegativeModel negativeModel;
	private Boolean withValidation;
	

	public GenerateStrXML(TransformersManager tranManager, ReportType reportType, String transformerVersion, ShotefModel shotefModel, NegativeModel negativeModel, Boolean withValidation) {
		this.tranManager = tranManager;
		this.reportType = reportType;
		this.transformerVersion = transformerVersion;
		this.shotefModel = shotefModel;
		this.negativeModel = negativeModel;
		this.withValidation = withValidation;
	}
	
	public String generate() {
		logger.debug("generate with reportType:{} and shotef model:{} and negative model:{}", reportType, shotefModel, negativeModel);
		if(this.reportType.equals(ReportType.SHOTEF) && this.shotefModel != null) {
			logger.debug("shotef generator");
			return tranManager.getTransformer(ReportType.SHOTEF)
					.getVersionTransformer(Version.of(this.transformerVersion))
					.marshal(this.shotefModel, withValidation);
		}
		
		if(this.reportType.equals(ReportType.NEGATIVE) && this.negativeModel != null) {
			logger.debug("negative generator");
			return tranManager.getTransformer(ReportType.NEGATIVE)
					.getVersionTransformer(Version.of(this.transformerVersion))
					.marshal(this.negativeModel, withValidation);
		}
		throw ErrorTicket.builder().withError(ErrorCodes.ArgumentNull).withDetails("report type or model is missing").build();
	}
}
