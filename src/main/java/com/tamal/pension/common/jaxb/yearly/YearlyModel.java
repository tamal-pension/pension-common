package com.tamal.pension.common.jaxb.yearly;

import java.math.BigDecimal;
import java.util.List;

import com.tamal.pension.common.jaxb.KoteretKovetzBase;

public interface YearlyModel {

	KoteretKovetzBase getKoteretKovetz();

	GufHamimshakBase getGufHamimshak();

	ReshumatSgiraBase getReshumatSgira();

	interface ReshumatSgiraBase {

		int getMISPARKUPOTYATZRANIMBAKOVETZ();

		int getMISPARMAASIKIM();

		int getMISPARRESHUMOT();

		int getMISPARAMITIM();
	}
	
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
				
				String getKODMEZAHEKUPAHP();

				int getSUGMEZAHEMAASIK();

				String getMISPARZIHUYMAASIK();

				String getKODMEZAHEMAASIKETZELYATZRAN();

				String getSHEMMAASIK();

				int getSHENATDIVUHACH();

				BigDecimal getSACHHAFKADADIVUACHMAASIK();

				BigDecimal getSACHHAFKADADIVUACHSHLILI();

				BigDecimal getSACHHAFKADAKLITABAPOAL();

				BigDecimal getDIVUACHSHLILIHUCHZARLEMAFKID();

				BigDecimal getKSAFIMBECHESHBONMAHAVAR();

				List<? extends PirteiMutzarBase> getPirteiMutzar();
				
				String getMISPARMISLAKAACHARON();

				interface PirteiMutzarBase {

					int getSUGMUTZAR();

					String getKODMEZAHEKUPA();

					Integer getSUGKERENPENSIA();

					String getMISPARKUPAETZELMAASIK();

					String getSHEMKUPAETZELMAASIK();

					List<? extends PirteiOvedBase> getPirteiOved();

					interface PirteiOvedBase {

						int getSUGMEZAHEOVED();

						String getMISPARMEZAHE();

						String getSHEMPRATI();

						String getSHEMMISHPACHA();

						String getTAARICHLEIDA();

						String getMISPAROVEDETZELMAASIK();

						List<? extends SachHafkadotShnatiotBase> getSachHafkadotShnatiot();

						interface SachHafkadotShnatiotBase {

							String getMISPARPOLISAOHESHBON();

							int getSUGHAFRASHA();

							BigDecimal getSHIURHAFRASHA();

							BigDecimal getSCHUMHAFRASHA();

							BigDecimal getSACHTASHLUMIMPTURIM();
						}
					}
				}
			}
		}
	}
}