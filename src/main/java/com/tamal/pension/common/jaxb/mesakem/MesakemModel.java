package com.tamal.pension.common.jaxb.mesakem;

import java.math.BigDecimal;
import java.util.List;

import com.tamal.pension.common.jaxb.KoteretKovetzBase;

public interface MesakemModel {

	KoteretKovetzBase getKoteretKovetz();

	GufHamimshakBase getGufHamimshak();

	ReshumatSgiraBase getReshumatSgira();

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

			List<? extends StatosPirteiHaavaratKsafimBase> getStatosPirteiHaavaratKsafim();
			
			interface StatosPirteiHaavaratKsafimBase {

				int getSUGMAFKID();

				int getSUGMEZAHEMAASIK();

				String getMISPARZIHUYMAASIK();
				
				String getMISPARBANKMOSDI();
				
				String getMISPARSNIFMOSDI();
				
				String getMISPARCHESHBONMOSDI();

				String getKODMEZAHEMAASIKETZELYATZRAN();

				String getKODMASAV();

				String getSHEMMAASIK();

				String getTAARICHERECHHAFKADA();

				String getTAARICHERECHHAFKADACHESHBONNEHEMANUT();

				String getMISPARASMACHTALEAHAVARATKSAFIM();

				BigDecimal getSACHHAFKADAKUPAHP();

				BigDecimal getSACHHAFKADAKLITABAPOAL();

				BigDecimal getSACHKSAFIMSHUICHU();

				BigDecimal getKSAFIMBEMAHAVAR();
				
				BigDecimal getHASHAVATKSAFIMYEZUMA();

				int getSTATUSTIPULBEKSAFIM();

				String getPERUTSTATUS();

				int getSUGMIMSHAKLEGABAVMUAVARHIZUNCHOZER();

				String getMISPARZIHUI();

				String getTAARICHNECHONUT();

				String getMISPARMISLAKA();

				List<? extends PirteiOvedBase> getPirteiOved();
				
				interface PirteiOvedBase {

					int getSUGMEZAHEOVED();

					String getMISPARMEZAHE();

					String getSHEMPRATI();

					String getSHEMMISHPACHA();

					String getTAARICHLEIDA();

					String getMISPAROVEDETZELMAASIK();

					List<? extends StatosPirteiKlitatReshumaBase> getStatosPirteiKlitatReshuma();

					interface StatosPirteiKlitatReshumaBase {

						String getMISPARMEZAHERESHUMA();

						int getRESHUMANIKLETA();

						int getSUGSHGIHA();

						String getPERUTSHGIHA();
						
						BigDecimal getPERUTSHGIHASHUM();
						
						String getPERUTSHGIHATAARICH();
						
						String getSHEMBAALRISHAION();
						
						BigDecimal getHPBAALRISHAION();
						
						String getEMAILBAALRISHAION();
						
						List<? extends OfenRishumZchuiotBase> getOfenRishumZchuiot();

						String getKODMEZAHEKUPAHP();

						interface OfenRishumZchuiotBase {

							BigDecimal getSACHARMECHUSHAV();

							String getCHODESHMASKORET();

							String getMISPARPOLISAOHESHBON();

							int getSUGHAFRASHA();

							BigDecimal getSHIURHAFRASHA();

							BigDecimal getSCHUMHAFRASHA();

							BigDecimal getNIKUIMAS();

							BigDecimal getSACHHECHZERMEVUKASH();
							
							String getTAARICHBAKASHATHECHZER();
							
							BigDecimal getSACHTASHLUMIMPTURIM();

							BigDecimal getSHIURHAFRASHACHAZUI();

							BigDecimal getSHIURHAFRASHAMETZUPE();
							
							BigDecimal getSHIURKISUI();

							BigDecimal getSCHUMHAFRASHACHAZUI();

							BigDecimal getSCHUMHAFRASHAMETZUPE();
							
							BigDecimal getSHIURHAFRASHANOCHECHI();

							BigDecimal getSHIURHAFRASHAATIDI();
							
							String getTAARICHIDKUNTZAFUI();
							
							Integer getSIBATIDKUNTAARIF();
							
							String getKODMEZAHEKUPAHP();
						}
					}
				}
				
				List<? extends DochNigraimBase> getDochNigraim();
				
				interface DochNigraimBase {

					String getKODMEZAHEKUPAHP();

					Integer getSUGKUPA();
					
					Integer getSUGMEZAHEOVED();
					
					String getMISPARMEZAHE();
					
					String getSHEMPRATI();
					
					String getSHEMMISHPACHA();
					
					String getSACHARACHARON();
					
					Integer getMISPARCHODSHEICHOV();

				}
			}
		}
	}
	
	interface ReshumatSgiraBase {

		Integer getMISPARYATZRANIM();

		int getMISPARMAASIKIM();

		int getMISPARRESHUMOT();

		int getMISPARAMITIM();

		BigDecimal getSACHHAFRASHOTBAKOVETZ();
	}
}