package com.tamal.pension.common.jaxb.event;

import java.util.List;

import com.tamal.pension.common.jaxb.KoteretKovetzBase;

public interface IncomingEventsModel {
	
	
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
			
			String getMISPARZIHUIPNIMIETZELYATZRAN();
			
			List<? extends YeshutLakoachMeidaBsisiBase> getYeshutLakoachMeidaBsisi();
			
			interface YeshutLakoachMeidaBsisiBase{
				
				int getSUGLAKOACH();
				
				int getSUGMEZAHELAKOACH();
                
                String getMISPARMEZAHELAKOACH();
                
                String getSHEMPRATILAKOACH();
                
                String getSHEMMISHPACHALAKOACH();

                String getSHEMMAASIK();

                String getKODMEZAHEMAASIKETZELYATZRAN();

                String getKODMEDINA();

                String getTAARICHLEIDA();
                
                List<? extends EiruaBase> getEirua();
                
                interface EiruaBase{
                	
                	KodEiruaBase getKodEirua();
                	
                	interface KodEiruaBase{
                		
            			int getKODEIRUA();
                        
                        String getMISPARMEZAHERESHUMA();
                        
                        String getMISPARMISLAKA();
                        
                        String getMISPARMISLAKALPNIIYACHOZORET();
                        
                        int getOFENHAAVARATMEIDAMIMISLLAKALELAKOACH();
                        
                        String getTAARICHNECHONUTMEIDA();
                        
                        Integer getMAANEACHZAKOT();
                        
                        Integer getDOCHBEINAIM();
                        
                        String getMISPARMISLAKALEBITUL();
                        
                        Integer getBAKASHAMITMASHECHET();
                        
                        Integer getTADIRUTBAKASHA();
                        
                        Integer getHAZHARATMAASIKHPKASUR();
                        
                        Integer getRIANUNFISHING();
                        
                        String getKODZIHUIOVEDBAMISLAKA();
                        
                        Integer getZIHUIHOSHECHBAMISLAKA();
                        
                        Integer getNITANLEYADEABAALRISHAYON();
                        
                        String getASMACHTAMISLAKA();
                        
                        String getRESERVAMISLAKA();
                        
                        YipuiKoachBase getYipuiKoach();
                       
                        MismachimBase getMismachim();
                        
                        MutzarBase getMutzar();
                        
                        interface MismachimBase{
							MismachimNilvimBeramatEiruaBase getMismachimNilvimBeramatEirua();
                            
                            List<? extends ZihuiShemMismachBeramatEiruaBase> getZihuiShemMismachBeramatEirua();
							
                            interface MismachimNilvimBeramatEiruaBase{
                            	
                                int getKOLMISMACHIMTZURFU();
                            	
                            	int getTFASIMDRUSHIMCHATUMIM();
                            }
                            
                            interface ZihuiShemMismachBeramatEiruaBase{

                            	String getSHEMKOVETZSHELMISMACHBERAMATEIRUAVEBERAMATLAKOACH();
                                
                                int getSUGMISMACH();
                                
                                String getASMACHTAKOVEZ();
                                
                                String getTAARICHCHTIMALAKOACH();
                                
                                String getTAARICHCHTIMABAALRISHAION();
                                
                                int getCHATIMAGRAFIT();
                                
                                int getISHURMEMUCSHAV();
                            }             	
						}
                        
                        interface MutzarBase{
                        	NetuneiMutzarBase getNetuneiMutzar();
                        	
                        	interface NetuneiMutzarBase{
                        		String getKODMEZAHEYATZRAN();
                        		
                        		Integer getSUGMUTZARPENSIONI();
                        		
                        		HeshbonOPolisaBase getHeshbonOPolisa();
                        		
                        		BakashaLekabalatMeidaPitzuimBase getBakashaLekabalatMeidaPitzuim();
                        		
                                BakashatBitulYipuiKoachBase getBakashatBitulYipuiKoach();
                                
                                PratimIshiimHadashimAmitBase getPratimIshiimHadashimAmit();

                                List<? extends SeerLePensiyaBase> getSeerLePensiya();
                                
                                List<? extends MaasiklprodBase> getMaasiklprod();
                                
                                interface BakashaLekabalatMeidaPitzuimBase{
                                	
                                	int getSUGMEZAHEOVED();
                                	
                                	String getMISPARMEZAHEOVED();
                                    
                                    String getSHEMPRATI();
                                    
                                    String getSHEMMISHPACHA();
                                    
                                    String getKODMUTZARLEFIKIDUDACHID();
                                    
                                    String getMISPARPOLISAOHESHBON();
                                    
                                    String getKODMEDINA();
                                }
                                
                                interface BakashatBitulYipuiKoachBase{
                                	
                                	Integer getSUGMEZAHEBAALRI();
                                	
                                	String getMISPARMEZAHEBAALRI();
                                    
                                    String getSHEMBAALRI();
								}
                                
                                interface HeshbonOPolisaBase{
                                	
                                	String getSHEMMUTZAR();
                                	
                                	String getKODMUTZARLEFIKIDUDACHID();
                                    
                                    String getMISPARPOLISAOHESHBON();
                                }
                                
                                interface MaasiklprodBase{
									
                                	int getSUGMEZAHEMAASIK();
									
									String getMISPARMEZAHEMAASIK();
                                    
                                    String getSHEMMAASIK();
                                    
                                    String getKODMEZAHEMAASIKETZELYATZRAN();
								}
								
								
								
								interface PratimIshiimHadashimAmitBase{
									
									int getSUGMEZAHEAMIT();
									
									String getMISPARMEZAHEAMIT();
                                    
                                    String getSHEMPRATI();
                                    
                                    String getSHEMMISHPAHA();
                                    
                                    String getTAARICHLEIDA();
                                    
                                    Integer getMIN();
                                    
                                    Integer getMATSAVMISHPACHTI();
                                    
                                    String getSHEMYESHUV();
                                    
                                    String getSHEMRECHOV();
                                    
                                    String getMISPARBAIT();
                                    
                                    Integer getMISPARDIRA();
                                    
                                    Integer getMIKUD();
                                    
                                    Integer getTADOAR();
                                    
                                    String getMISPARTELEPHONEKAVI();
                                    
                                    String getMISPARCELLULARI();
                                    
                                    String getEMAIL();
                                    
                                    Integer getHAAVARATMISMACHIMBAMAIL();
                                    
                                    int getKAYAMIDKUNSHEERIM();
                                    
                                    Integer getKTOVETMISRADPNIM();
								}
								
								interface SeerLePensiyaBase{
									
									int getSUGZIKA();
									
									int getKODZIHUISHEERIM();
                                    
                                    String getMISPARMEZAHESHEERIM();
                                    
                                    String getSHEMPRATISHEERIM();
                                    
                                    String getSHEMMISHPACHASHEERIM();
                                    
                                    String getTAARICHLEIDA();
								}
                        	}
						}

                        interface YipuiKoachBase{
                        	
                        	BakashatMefitzLeinianYipuiKoachBase getBakashatMefitzLeinianYipuiKoach();
                            
                        	AchragotVeharshotBase getAchragotVeharshot();
                        	
                        	
                        	interface AchragotVeharshotBase{
                        		
                        		List<? extends MutzarMuchragBase> getMutzarMuchrag();
                                
                                List<? extends HarshaaBeramatMutzarBase> getHarshaaBeramatMutzar();
                                
                                interface MutzarMuchragBase{
                                	
                                	Integer getSUGMUTZARMUCHRAG();
                                	
                                	String getKIDUDMUTZARPENSIONIMUCHRAG();
                                    
                                    String getMISPARCHESHBONBEMUTZARMUCHRAG();
                                    
                                    Integer getOFENHACHRAGA();
                                }
                                
                                interface HarshaaBeramatMutzarBase{
                                	
                                	String getKIDUDMUTZARLONITNAHARSHAHA();
                                	
                                	String getMISPARCHESHBONBEMUTZARLONITNAHARSHAHA();
                                    
                                    int getKABALATMEIDABILVAD();
                                    
                                    String getMISPARSOHENPNIMIETZELMOSDI();
                                    
                                }
                        	}

                        	interface BakashatMefitzLeinianYipuiKoachBase{
                        		
                        		int getTZURAFMISMACHYIPUIKOACH();
                        		
                        		String getKODZIHUIYIPUIKOACHBEMISLAKA();
                                
                                int getMISMACHZIHUI();
                                
                                Integer getSUGBAKASHATMEFITZLEEINIANYIPUIKOACH();
                                
                                Integer getKAYAMMUTZARMUCHRAG();
                                
                                String getTAARICHCHTIMALAKOACH();
                                
                                String getTAARICHCHTIMABAALRISHAION();
                                
                                Integer getTOKEFYIPUIKOACH();
                                
                                String getMOEDPKIHA();
                                
                                Integer getHARSHAALEMASHKANTA();
                                
                                Integer getATARMEUVTACH();
                                
                                String getERETZ();
                                
                                String getSHEMYISHUV();
                                
                                Integer getSEMELYESHUV();
                                
                                String getSHEMRECHOV();
                                
                                String getMISPARBAIT();
                                
                                String getMISPARKNISA();
                                
                                Integer getMISPARDIRA();
                                
                                Integer getMIKUD();
                                
                                Integer getTADOAR();
                                
                                Integer getNISPACHD();
                                
                                Integer getBITULARSHAA();
                                
                                Integer getSUGRISHAYON();
                                
                                String getMISPARRISHAYON();
                                
                                String getMISPARSOHENPNIMIETZELMOSDI();
                                
                        	}
                        	
                        	
                        }
                        
						
						
						
                		
                	}
                	
                }
			}

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
				}
			}
		}
	}
	
	interface ReshumatSgiraBase{
		 int getMISPARYESHUYUTLAKOACHBAKOVETZ();
		 
		 int getMISPARBAKASHOT();
	}
	

}
