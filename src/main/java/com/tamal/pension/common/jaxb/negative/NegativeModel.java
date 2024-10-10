package com.tamal.pension.common.jaxb.negative;

import java.math.BigDecimal;
import java.util.List;

import com.tamal.pension.common.jaxb.KoteretKovetzBase;
import com.tamal.pension.common.jaxb.ReshumatSgiraBase;

public interface NegativeModel {

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

			List<? extends PirteiHaavaratKsafimBase> getPirteiHaavaratKsafim();

			interface PirteiHaavaratKsafimBase {

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

				Integer getSUGCHESHBONMAASIK();

				Integer getSUGCHESHBONKOLETTASHLUM();

				String getMISPARBANKKOLET();

				String getMISPARSNIFKOLET();

				String getMISPARCHESHBONKOLET();

				String getMISPARZIHUIKODEM();

				String getMISPARMISLAKA();

				String getMISPARMISLAKAKODEM();

				List<? extends ZihuiShemMismachBeramatEiruaBase> getZihuiShemMismachBeramatEirua();

				List<? extends PirteiKupaBase> getPirteiKupa();

				interface ZihuiShemMismachBeramatEiruaBase {

					String getSHEMKOVETZSHELMISMACHBERAMATEIRUAVEBERAMATLAKOACH();

					int getSUGMISMACH();

				}

				interface PirteiKupaBase {

					int getSUGKUPA();

					Integer getSUGKERENPENSIA();

					String getSHEMKUPAETZELMAASIK();

					String getMISPARKUPAETZELMAASIK();

					List<? extends PirteiOvedBase> getPirteiOved();

					SachHafrashaLeKupaMaasikBase getSachHafrashaLeKupaMaasik();

					interface PirteiOvedBase {

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

						List<? extends ChodeshMaskoretVestatusOvedBase> getChodeshMaskoretVestatusOved();

						SachHafrashaLeOvedBekupaBase getSachHafrashaLeOvedBekupa();

						interface SachHafrashaLeOvedBekupaBase {

							BigDecimal getSACHHAFRASHALEOVEDBEKUPA();

						}

						interface ChodeshMaskoretVestatusOvedBase {

							String getCHODESHMASKORET();

							Integer getMAHAMADHAFKADABEKUPA();

							int getSUGTAKBUL();
							
							Integer getROVEDSACHAR();
							
							Integer getSIBATBAKASHLECHZERKSAFIM();

							BigDecimal getSACHARMEDUVACH();

							Integer getSTATUSOVEDBECHODESHMASKORET();

							String getTAARICHTCHILATSTATUS();

							BigDecimal getCHELKIUTMISRA();

							Integer getYEMEIAVODABECHODESH();

							String getMISPARPOLISAOHESHBON();

							List<? extends PizulHafrashotOvedBeKupaBase> getPizulHafrashotOvedBeKupa();

							SachHafrashaLeKupaBechodeshMaskoretOvedBase getSachHafrashaLeKupaBechodeshMaskoretOved();

							interface PizulHafrashotOvedBeKupaBase {

								int getSUGHAFRASHA();

								BigDecimal getSHIURHAFRASHA();

								BigDecimal getSCHUMHAFRASHA();

								BigDecimal getSACHTASHLUMIMPTURIM();

								String getMISPARMEZAHERESHUMA();

								String getMISPARMEZAHERESHUMAKODEM();

							}

							interface SachHafrashaLeKupaBechodeshMaskoretOvedBase {

								BigDecimal getSACHHAFRASHABECHODESHMASKORET();

							}
						}
					}

					interface SachHafrashaLeKupaMaasikBase {

						BigDecimal getSACHHAFRASHALEKUPABERAMATMAASIK();

						BigDecimal getSACHHAFKADALEKUPABERAMATMAASIK();

						Integer getMISPARAMITIMBERAMATMAASIK();

					}
				}
			}
		}
	}
}