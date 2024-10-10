package com.tamal.pension.common.jaxb;

public interface KoteretKovetzBase {

	int getSUGMIMSHAK();

	String getMISPARGIRSATXML();

	String getTAARICHBITZUA();

	int getKODSVIVATAVODA();

	String getMISPARHAKOVETZ();

	Integer getMISPARSIDURI();

	KoteretKovetzBase.NetuneiGoremSholechBase getNetuneiGoremSholech();

	KoteretKovetzBase.NetuneiGoremNimaanBase getNetuneiGoremNimaan();

	public interface NetuneiGoremSholechBase {

		int getKODSHOLECH();

		int getSUGMEZAHESHOLECH();

		String getMISPARZIHUISHOLECH();

		String getSHEMGOREMSHOLECH();

		String getSHEMPRATIISHKESHERSHOLECH();

		String getSHEMMISHPACHAISHKESHERSHOLECH();

		String getMISPARTELEPHONEKAVIISHKESHERSHOLECH();

		String getEMAILISHKESHERSHOLECH();

		String getMISPARCELLULARIISHKESHERSHOLECH();
		
		String getMISPARZIHUIETZELYATZRANNIMAAN();

	}

	public interface NetuneiGoremNimaanBase {

		int getKODNIMAAN();

		int getSUGMEZAHENIMAAN();

		String getMISPARZIHUINIMAAN();

		String getMISPARZIHUIETZELYATZRANNIMAAN();

	}

}