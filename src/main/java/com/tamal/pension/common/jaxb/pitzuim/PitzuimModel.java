package com.tamal.pension.common.jaxb.pitzuim;

import java.math.BigDecimal;
import java.util.List;

import com.tamal.pension.common.jaxb.KoteretKovetzBase;



public interface PitzuimModel {
	
	GufHamimshakBase getGufHamimshak();
	
	ReshumatSgiraBase getReshumatSgira();
	
	KoteretKovetzBase getKoteretKovetz();
	
	interface ReshumatSgiraBase{
		
		int getMISPARYATZRANIM();
		
		int getMISPARMAAVIDIM();
        
        int getMISPARRESHUMOT();
        
        BigDecimal getMISPAROVDIM();
	}
	
	interface GufHamimshakBase{
		List<? extends YeshutGoremPoneLemislakaBase> getYeshutGoremPoneLemislaka();
		
		interface YeshutGoremPoneLemislakaBase{
			
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

            List<? extends PirteiMaasikBase> getPirteiMaasik();
            
            interface PirteiMaasikBase{
            	
            	int getSUGMEZAHEMAASIK();
            	
            	String getMISPARMEZAHEMAASIK();
                
                String getKODMEZAHEMAASIKETZELYATZRAN();
                
                String getSHEMMAASIK();
                
                int getSIVUGMAASIK();
                
                String getKODMEZAHEYATZRAN();
                
                String getSHEMYATZRAN();
                
                int getMISPARTIKNIKUIIM();
                
                List<? extends PirteiOvedBase> getPirteiOved();
                
                interface PirteiOvedBase{
                	
                	int getSUGMEZAHEOVED();
                	
                	String getMISPARMEZAHEOVED();
                    
                    String getSHEMPRATI();
                    
                    String getSHEMMISHPACHA();
                    
                    String getTAARICHERECHYITROT();
                    
                    String getMISPARMISLAKA();
                    
                    String getMISPARMEZAHERESHUMA();
                    
                    String getSHEMKOVETZMEKORI();
                    
                    String getMISPARSHURAMEKORI();
                    
                    String getRESERVAMISLAKA();
                    
                    List<? extends SachKaspeiPitzuimOvedBemutzarBase> getSachKaspeiPitzuimOvedBemutzar();
                    
                    interface SachKaspeiPitzuimOvedBemutzarBase{
                    	
                    	int getSUGMUTZARPENSIONI();
                    	
                    	String getMISPARKUPA();
                        
                        BigDecimal getERECHPIDIONPITZUIMMAASIKNOCHECHI();
                        
                        BigDecimal getERECHPIDIONPITZUIMMAASIKNOCHECHILEMAS();
                        
                        BigDecimal getERECHPIDIONPITZUIMPTURIM();
                        
                        int getKODPITZUIM();
                        
                        Integer getKODSHIHARUCHYITRA();
                        
                        String getMISPARPOLISAOHESHBON();
                        
                        String getTAARICHTZVIRAMAASIK();
                        
                        String getTAARICHHAFKADARISHONA();
                        
                        String getTAARICHHAFKADAACHRONA();
                        
                        Integer getMAMADKASPEIPITZUIM();
                        
                        String getTAARICHTOKEF();
                        
                        BigDecimal getSACHAKOLERECHPIDIONPITZUIMADKNISALETOKEF();
                        
                        String getTAARICHMADADYITRA();
                        
                        BigDecimal getMADADYITRANEKUDOT();
                        
                        BigDecimal getSHIARUCHPITZUIMMITZTABERBEMADADMECHIRIM();
                        
                        BigDecimal getSHIARUCHPITZUIMMITZTABERBEMADADHASHKAOT();
                        
                        BigDecimal getITRATPITZUIMSEIF97AA4();
                        
                        BigDecimal getITRATPITZUIMSEIF97AZAD2000();
                        
                        BigDecimal getITRATPITZUIMSEIF97AZM2000();
                    }
                }
            }
		}
	}
	

}
