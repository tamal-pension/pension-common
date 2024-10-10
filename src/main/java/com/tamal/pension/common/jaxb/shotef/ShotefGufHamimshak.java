package com.tamal.pension.common.jaxb.shotef;

import java.math.BigDecimal;
import java.util.List;

public interface ShotefGufHamimshak {
	List<? extends ShotefGufHamimshak.YeshutGoremPoneLemislakaBase> getYeshutGoremPoneLemislaka();

	public interface YeshutGoremPoneLemislakaBase {

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

		List<? extends YeshutGoremPoneLemislakaBase.PirteiHaavaratKsafimBase> getPirteiHaavaratKsafim();

		public interface PirteiHaavaratKsafimBase {

			String getKODMEZAHEKUPAHP();

			int getSUGMAFKID();

			int getSUGMEZAHEMAASIK();

			String getMISPARZIHUYMAASIK();
			
			String getMISPARTIKNIKUIMMAASIK();

			String getKODMEZAHEMAASIKETZELYATZRAN();

			String getKODMASAV();

			BigDecimal getSCHUMHAFKADAKOLEL();

			String getSHEMMAASIK();
			
			String getSHEMPRATIISHKESHERMAASIK();
			
			String getSHEMMISHPACHAISHKESHERMAASIK();
			
			String getMISPARTELEPHONEKAVIISHKESHERMAASIK();
			
			String getEMAILISHKESHERMAASIK();
			
			String getMISPARCELLULARIISHKESHERMAASIK();
			
			int getSUGPEULA();

			Integer getKODEMTZAITASHLUM();

			BigDecimal getSACHHAFKADAKUPAHP();

			String getTAARICHERECHHAFKADALEKUPA();

			String getTAARICHERECHHAFKADACHESHBONNEHEMANUT();

			String getMISPARASMACHTALEAHAVARATKSAFIM();

			String getMISPARZIHUI();

			String getMISPARBANKMAASIK();

			String getMISPARSNIFMAASIK();

			String getMISPARCHESHBONMAASIK();

			String getSUGCHESHBON();

			Integer getSUGKARTISMAASIK();

			int getSUGCHESHBONMAASIK();

			int getSUGCHESHBONKOLETTASHLUM();

			String getMISPARBANKKOLET();

			String getMISPARSNIFKOLET();

			String getMISPARCHESHBONKOLET();

			String getMISPARZIHUIKODEM();

			String getMISPARMISLAKA();

			String getMISPARMISLAKAKODEM();

			List<? extends PirteiHaavaratKsafimBase.ZihuiShemMismachBeramatEiruaBase> getZihuiShemMismachBeramatEirua();

			List<? extends PirteiHaavaratKsafimBase.PirteiKupaBase> getPirteiKupa();

			public interface ZihuiShemMismachBeramatEiruaBase {

				String getSHEMKOVETZSHELMISMACHBERAMATEIRUAVEBERAMATLAKOACH();

				int getSUGMISMACH();

			}

			public interface PirteiKupaBase {

				int getSUGKUPA();

				Integer getSUGKERENPENSIA();

				String getSHEMKUPAETZELMAASIK();

				String getMISPARKUPAETZELMAASIK();

				List<? extends PirteiKupaBase.PirteiOvedBase> getPirteiOved();

				PirteiKupaBase.SachHafrashaLeKupaMaasikBase getSachHafrashaLeKupaMaasik();

				public interface PirteiOvedBase {

					int getSUGMEZAHEOVED();

					String getMISPARMEZAHE();

					String getSHEMPRATI();

					String getSHEMMISHPACHA();

					String getTAARICHLEIDA();

					String getMISPAROVEDETZELMAASIK();

					String getKODMEZAHEMAASIKETZELYATZRAN();

					String getShemyeshuv();

					String getShemrechov();

					String getMisparbait();

					Integer getMispardira();

					Integer getMikud();

					Integer getTadoar();

					String getEmail();

					String getMisparcellulari();

					Integer getMin();

					String getMoedtchilatahasakatoved();
					
					Integer getHASHAVAKIBUTZI();
					
					Integer getHATZHARATOVED();
					
					Integer getSEIFARBAESRELAOVED();
					
					List<? extends PirteiOvedBase.ChodeshMaskoretVestatusOvedBase> getChodeshMaskoretVestatusOved();

					PirteiOvedBase.SachHafrashaLeOvedBekupaBase getSachHafrashaLeOvedBekupa();

					public interface ChodeshMaskoretVestatusOvedBase {

						String getCHODESHMASKORET();

						int getMAHAMADHAFKADABEKUPA();

						int getSUGTAKBUL();
						
						Integer getROVEDSACHAR();
						
						Integer getSIBATBAKASHLECHZERKSAFIM();

						BigDecimal getSACHARMEDUVACH();

						int getSTATUSOVEDBECHODESHMASKORET();

						String getTAARICHTCHILATSTATUS();

						BigDecimal getCHELKIUTMISRA();

						Integer getYEMEIAVODABECHODESH();

						String getMISPARPOLISAOHESHBON();

						List<? extends ChodeshMaskoretVestatusOvedBase.PizulHafrashotOvedBeKupaBase> getPizulHafrashotOvedBeKupa();

						ChodeshMaskoretVestatusOvedBase.SachHafrashaLeKupaBechodeshMaskoretOvedBase getSachHafrashaLeKupaBechodeshMaskoretOved();

						public interface PizulHafrashotOvedBeKupaBase {

							int getSUGHAFRASHA();

							BigDecimal getSHIURHAFRASHA();

							BigDecimal getSCHUMHAFRASHA();

							BigDecimal getSACHTASHLUMIMPTURIM();

							String getMISPARMEZAHERESHUMA();

							String getMISPARMEZAHERESHUMAKODEM();

						}

						public interface SachHafrashaLeKupaBechodeshMaskoretOvedBase {

							BigDecimal getSACHHAFRASHABECHODESHMASKORET();

						}
					}

					public interface SachHafrashaLeOvedBekupaBase {

						BigDecimal getSACHHAFRASHALEOVEDBEKUPA();

					}
				}

				public interface SachHafrashaLeKupaMaasikBase {

					Integer getMISPARAMITIMBERAMATMAASIK();

					BigDecimal getSACHHAFKADALEKUPABERAMATMAASIK();

					BigDecimal getSACHHAFRASHALEKUPABERAMATMAASIK();

				}
			}
		}
	}
}