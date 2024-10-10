package com.tamal.pension.common.jaxb.first;

import java.util.List;

import com.tamal.pension.common.jaxb.KoteretKovetzBase;

public interface FirstModel {

	KoteretKovetzBase getKoteretKovetz();

	GufHamimshakBase getGufHamimshak();
	
	interface GufHamimshakBase {

		List<? extends YeshutGoremPoneLemislakaBase> getYeshutGoremPoneLemislaka();
		
		interface YeshutGoremPoneLemislakaBase {

			Integer getSUGPONE();

			Integer getSUGKODMEZAHEPONE();

			String getMISPARMEZAHEPONE();

			String getSHEMGOREMPONE();

			String getMISPARMEZAHEMETAFEL();

			String getSHEMPRATIPONELEMISLAKA();

			String getSHEMMISHPACHAPONELEMISLAKA();

			String getMISPARTELEPHONEKAVIPONELEMISLAKA();

			String getEMAILPONELEMISLAKA();

			String getMISPARCELLULARI();

			String getMISPARZIHUIETZELYATZRANNIMAAN();

			List<? extends SugMashovBase> getSugMashov();

			interface SugMashovBase {

				int getSUGMIMSHAKLEGABAVMUAVARHIZUNCHOZER();

				String getSHEMHAKOVETZ();

				String getMISPARHAKOVETZ();

				int getRAMATMASHOV();

				int getSUGMASHOV();

				Integer getSugdivuach();

				Integer getKamutreshumottkinot();

				Integer getKamutreshumotkolel();

				MashovBeramatKovetzBase getMashovBeramatKovetz();

				List<? extends MashovBeramatReshumaBase> getMashovBeramatReshuma();

				interface MashovBeramatKovetzBase {

					int getKODSHGIHA();

					List<? extends PerutShgihaBeramatKovetzBase> getPerutShgihaBeramatKovetz();

					interface PerutShgihaBeramatKovetzBase {
						
						String getPERUTSHGIHABERAMATKOVETZ();
					}
				}
				
				
				
				interface MashovBeramatReshumaBase {

					String getMISPARMISLAKA();

					String getMISPARMEZAHERESHUMA();

					int getSTATUSRESHUMA();

					Integer getKODSHGIHABERAMATRESHUMA();

					List<? extends MaaneMiYazranBase> getMaaneMiYazran();

					List<? extends PerutShgihaBeramatReshumaBase> getPerutShgihaBeramatReshuma();

					interface MaaneMiYazranBase {

						int getMAANEBERAMATRESHUMA();
					}
					
					interface PerutShgihaBeramatReshumaBase {

						String getPERUTSHGIHABERAMATRESHUMA();
					}
					
					List<? extends YipuiKoachBase> getYipuiKoach();
					
					interface YipuiKoachBase{
						Integer getSUGBAKASHATMEFITZLEEINIANYIPUIKOACH();
						
						Integer getHARSHAHAOHACHRAGA();
						
						String getKIDUDMUTZA();
						
						Integer getSUGMUTZAR();
						
						String getMISPARHESHBONYIPUIKOACH();
						
						Integer getMEHUSHARNIDHA();
						
						Integer getMEIDAOPEULOT();
						
						String getPERUTSHGIHA();
					}
		
				}
			}
		}
	}
}