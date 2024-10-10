package com.tamal.pension.common.jaxb.event;


import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import com.tamal.pension.common.jaxb.KoteretKovetzBase;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "koteretKovetz",
    "gufHamimshak",
    "reshumatSgira"
})
@XmlRootElement(name = "Mimshak")
public class IncomingEventsV06Model implements IncomingEventsModel{

    @XmlElement(name = "KoteretKovetz", required = true)
    protected KoteretKovetz koteretKovetz;
    @XmlElement(name = "GufHamimshak", required = true)
    protected GufHamimshak gufHamimshak;
    @XmlElement(name = "ReshumatSgira", required = true)
    protected ReshumatSgira reshumatSgira;

    @Override
    public KoteretKovetz getKoteretKovetz() {
        return koteretKovetz;
    }

    public void setKoteretKovetz(KoteretKovetz value) {
        this.koteretKovetz = value;
    }

    @Override
    public GufHamimshak getGufHamimshak() {
        return gufHamimshak;
    }

    public void setGufHamimshak(GufHamimshak value) {
        this.gufHamimshak = value;
    }

    @Override
    public ReshumatSgira getReshumatSgira() {
        return reshumatSgira;
    }

    public void setReshumatSgira(ReshumatSgira value) {
        this.reshumatSgira = value;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "yeshutGoremPoneLemislaka"
    })
    public static class GufHamimshak implements GufHamimshakBase {

        @XmlElement(name = "YeshutGoremPoneLemislaka", required = true)
        protected List<YeshutGoremPoneLemislaka> yeshutGoremPoneLemislaka;

        @Override
        public List<YeshutGoremPoneLemislaka> getYeshutGoremPoneLemislaka() {
            if (yeshutGoremPoneLemislaka == null) {
                yeshutGoremPoneLemislaka = new ArrayList<IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka>();
            }
            return this.yeshutGoremPoneLemislaka;
        }
        
        public void setYeshutGoremPoneLemislaka(List<YeshutGoremPoneLemislaka> value) {
        	this.yeshutGoremPoneLemislaka = value;
        }


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "sugpone",
            "sugkodmezahepone",
            "misparmezahepone",
            "shemgorempone",
            "misparmezahemetafel",
            "shempratiponelemislaka",
            "shemmishpachaponelemislaka",
            "mispartelephonekaviponelemislaka",
            "emailponelemislaka",
            "misparcellulari",
            "misparzihuipnimietzelyatzran",
            "yeshutLakoachMeidaBsisi"
        })
        public static class YeshutGoremPoneLemislaka implements YeshutGoremPoneLemislakaBase{

            @XmlElement(name = "SUG-PONE", required = true, type = Integer.class, nillable = true)
            protected Integer sugpone;
            @XmlElement(name = "SUG-KOD-MEZAHE-PONE", required = true, type = Integer.class, nillable = true)
            protected Integer sugkodmezahepone;
            @XmlElement(name = "MISPAR-MEZAHE-PONE", required = true, nillable = true)
            protected String misparmezahepone;
            @XmlElement(name = "SHEM-GOREM-PONE", required = true, nillable = true)
            protected String shemgorempone;
            @XmlElement(name = "MISPAR-MEZAHE-METAFEL", required = true, nillable = true)
            protected String misparmezahemetafel;
            @XmlElement(name = "SHEM-PRATI-PONE-LEMISLAKA", required = true, nillable = true)
            protected String shempratiponelemislaka;
            @XmlElement(name = "SHEM-MISHPACHA-PONE-LEMISLAKA", required = true, nillable = true)
            protected String shemmishpachaponelemislaka;
            @XmlElement(name = "MISPAR-TELEPHONE-KAVI-PONE-LEMISLAKA", required = true, nillable = true)
            protected String mispartelephonekaviponelemislaka;
            @XmlElement(name = "E-MAIL-PONE-LEMISLAKA", required = true, nillable = true)
            protected String emailponelemislaka;
            @XmlElement(name = "MISPAR-CELLULARI", required = true, nillable = true)
            protected String misparcellulari;
            @XmlElement(name = "MISPAR-ZIHUI-PNIMI-ETZEL-YATZRAN", required = true, nillable = true)
            protected String misparzihuipnimietzelyatzran;
            @XmlElement(name = "YeshutLakoachMeidaBsisi", required = true)
            protected List<IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi> yeshutLakoachMeidaBsisi;

            @Override
            public Integer getSUGPONE() {
                return sugpone;
            }

            public void setSUGPONE(Integer value) {
                this.sugpone = value;
            }
            
            @Override
            public Integer getSUGKODMEZAHEPONE() {
                return sugkodmezahepone;
            }

            public void setSUGKODMEZAHEPONE(Integer value) {
                this.sugkodmezahepone = value;
            }

            @Override
            public String getMISPARMEZAHEPONE() {
                return misparmezahepone;
            }

            public void setMISPARMEZAHEPONE(String value) {
                this.misparmezahepone = value;
            }

            @Override
            public String getSHEMGOREMPONE() {
                return shemgorempone;
            }

            public void setSHEMGOREMPONE(String value) {
                this.shemgorempone = value;
            }

            @Override
            public String getMISPARMEZAHEMETAFEL() {
                return misparmezahemetafel;
            }

            public void setMISPARMEZAHEMETAFEL(String value) {
                this.misparmezahemetafel = value;
            }
            
            @Override
            public String getSHEMPRATIPONELEMISLAKA() {
                return shempratiponelemislaka;
            }

            public void setSHEMPRATIPONELEMISLAKA(String value) {
                this.shempratiponelemislaka = value;
            }
            
            @Override
            public String getSHEMMISHPACHAPONELEMISLAKA() {
                return shemmishpachaponelemislaka;
            }
            
            public void setSHEMMISHPACHAPONELEMISLAKA(String value) {
                this.shemmishpachaponelemislaka = value;
            }

            @Override
            public String getMISPARTELEPHONEKAVIPONELEMISLAKA() {
                return mispartelephonekaviponelemislaka;
            }

            public void setMISPARTELEPHONEKAVIPONELEMISLAKA(String value) {
                this.mispartelephonekaviponelemislaka = value;
            }

            @Override
            public String getEMAILPONELEMISLAKA() {
                return emailponelemislaka;
            }

            
            public void setEMAILPONELEMISLAKA(String value) {
                this.emailponelemislaka = value;
            }

            @Override
            public String getMISPARCELLULARI() {
                return misparcellulari;
            }

            public void setMISPARCELLULARI(String value) {
                this.misparcellulari = value;
            }

            @Override
            public String getMISPARZIHUIPNIMIETZELYATZRAN() {
                return misparzihuipnimietzelyatzran;
            }


            public void setMISPARZIHUIPNIMIETZELYATZRAN(String value) {
                this.misparzihuipnimietzelyatzran = value;
            }

            @Override
            public List<YeshutLakoachMeidaBsisi> getYeshutLakoachMeidaBsisi() {
                if (yeshutLakoachMeidaBsisi == null) {
                    yeshutLakoachMeidaBsisi = new ArrayList<IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi>();
                }
                return this.yeshutLakoachMeidaBsisi;
            }
            
            public void setYeshutLakoachMeidaBsisi(List<YeshutLakoachMeidaBsisi> value) {
            	this.yeshutLakoachMeidaBsisi = value;
            }

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "suglakoach",
                "sugmezahelakoach",
                "misparmezahelakoach",
                "shempratilakoach",
                "shemmishpachalakoach",
                "shemmaasik",
                "kodmezahemaasiketzelyatzran",
                "kodmedina",
                "taarichleida",
                "eirua"
            })
            public static class YeshutLakoachMeidaBsisi implements YeshutLakoachMeidaBsisiBase{

                @XmlElement(name = "SUG-LAKOACH")
                protected int suglakoach;
                @XmlElement(name = "SUG-MEZAHE-LAKOACH")
                protected int sugmezahelakoach;
                @XmlElement(name = "MISPAR-MEZAHE-LAKOACH", required = true)
                protected String misparmezahelakoach;
                @XmlElement(name = "SHEM-PRATI-LAKOACH", required = true, nillable = true)
                protected String shempratilakoach;
                @XmlElement(name = "SHEM-MISHPACHA-LAKOACH", required = true, nillable = true)
                protected String shemmishpachalakoach;
                @XmlElement(name = "SHEM-MAASIK", required = true, nillable = true)
                protected String shemmaasik;
                @XmlElement(name = "KOD-MEZAHE-MAASIK-ETZEL-YATZRAN", required = true, nillable = true)
                protected String kodmezahemaasiketzelyatzran;
                @XmlElement(name = "KOD-MEDINA", required = true, nillable = true)
                protected String kodmedina;
                @XmlElement(name = "TAARICH-LEIDA", required = true, nillable = true)
                protected String taarichleida;
                @XmlElement(name = "Eirua", required = true)
                protected List<IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua> eirua;

                @Override
                public int getSUGLAKOACH() {
                    return suglakoach;
                }

                public void setSUGLAKOACH(int value) {
                    this.suglakoach = value;
                }

                @Override
                public int getSUGMEZAHELAKOACH() {
                    return sugmezahelakoach;
                }

                public void setSUGMEZAHELAKOACH(int value) {
                    this.sugmezahelakoach = value;
                }

                @Override
                public String getMISPARMEZAHELAKOACH() {
                    return misparmezahelakoach;
                }

                public void setMISPARMEZAHELAKOACH(String value) {
                    this.misparmezahelakoach = value;
                }

                @Override
                public String getSHEMPRATILAKOACH() {
                    return shempratilakoach;
                }

                public void setSHEMPRATILAKOACH(String value) {
                    this.shempratilakoach = value;
                }

                @Override
                public String getSHEMMISHPACHALAKOACH() {
                    return shemmishpachalakoach;
                }

                public void setSHEMMISHPACHALAKOACH(String value) {
                    this.shemmishpachalakoach = value;
                }

                @Override
                public String getSHEMMAASIK() {
                    return shemmaasik;
                }

                public void setSHEMMAASIK(String value) {
                    this.shemmaasik = value;
                }

                @Override
                public String getKODMEZAHEMAASIKETZELYATZRAN() {
                    return kodmezahemaasiketzelyatzran;
                }

                public void setKODMEZAHEMAASIKETZELYATZRAN(String value) {
                    this.kodmezahemaasiketzelyatzran = value;
                }

                @Override
                public String getKODMEDINA() {
                    return kodmedina;
                }

                public void setKODMEDINA(String value) {
                    this.kodmedina = value;
                }

                @Override
                public String getTAARICHLEIDA() {
                    return taarichleida;
                }

                public void setTAARICHLEIDA(String value) {
                    this.taarichleida = value;
                }

                @Override
                public List<IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua> getEirua() {
                    if (eirua == null) {
                        eirua = new ArrayList<IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua>();
                    }
                    return this.eirua;
                }
                
                public void setEirua(List<Eirua> value) {
                	this.eirua = value;
                }

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "kodEirua"
                })
                public static class Eirua implements EiruaBase{

                    @XmlElement(name = "KodEirua", required = true)
                    protected IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua kodEirua;

                    @Override
                    public IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua getKodEirua() {
                        return kodEirua;
                    }

                    public void setKodEirua(IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua value) {
                        this.kodEirua = value;
                    }
                    
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "kodeirua",
                        "misparmezahereshuma",
                        "misparmislaka",
                        "misparmislakalpniiyachozoret",
                        "ofenhaavaratmeidamimisllakalelakoach",
                        "taarichnechonutmeida",
                        "maaneachzakot",
                        "dochbeinaim",
                        "misparmislakalebitul",
                        "bakashamitmashechet",
                        "tadirutbakasha",
                        "hazharatmaasikhpkasur",
                        "rianunfishing",
                        "kodzihuiovedbamislaka",
                        "zihuihoshechbamislaka",
                        "nitanleyadeabaalrishayon",
                        "asmachtamislaka",
                        "reservamislaka",
                        "yipuiKoach",
                        "mismachim",
                        "mutzar"
                    })
                    public static class KodEirua implements KodEiruaBase {

                        @XmlElement(name = "KOD-EIRUA")
                        protected int kodeirua;
                        @XmlElement(name = "MISPAR-MEZAHE-RESHUMA", required = true, nillable = true)
                        protected String misparmezahereshuma;
                        @XmlElement(name = "MISPAR-MISLAKA", required = true, nillable = true)
                        protected String misparmislaka;
                        @XmlElement(name = "MISPAR-MISLAKA-LPNIIYA-CHOZORET", required = true, nillable = true)
                        protected String misparmislakalpniiyachozoret;
                        @XmlElement(name = "OFEN-HAAVARAT-MEIDA-MIMISLLAKA-LELAKOACH")
                        protected int ofenhaavaratmeidamimisllakalelakoach;
                        @XmlElement(name = "TAARICH-NECHONUT-MEIDA", required = true, nillable = true)
                        protected String taarichnechonutmeida;
                        @XmlElement(name = "MAANE-ACHZAKOT", required = true, type = Integer.class, nillable = true)
                        protected Integer maaneachzakot;
                        @XmlElement(name = "DOCH-BEINAIM", required = true, type = Integer.class, nillable = true)
                        protected Integer dochbeinaim;
                        @XmlElement(name = "MISPAR-MISLAKA-LEBITUL", required = true, nillable = true)
                        protected String misparmislakalebitul;
                        @XmlElement(name = "BAKASHA-MITMASHECHET", required = true, type = Integer.class, nillable = true)
                        protected Integer bakashamitmashechet;
                        @XmlElement(name = "TADIRUT-BAKASHA", required = true, type = Integer.class, nillable = true)
                        protected Integer tadirutbakasha;
                        @XmlElement(name = "HAZHARAT-MAASIK-H-P-KASUR", required = true, type = Integer.class, nillable = true)
                        protected Integer hazharatmaasikhpkasur;
                        @XmlElement(name = "RIANUN-FISHING", required = true, type = Integer.class, nillable = true)
                        protected Integer rianunfishing;
                        @XmlElement(name = "KOD-ZIHUI-OVED-BAMISLAKA", required = true, nillable = true)
                        protected String kodzihuiovedbamislaka;
                        @XmlElement(name = "ZIHUI-HOSHECH-BAMISLAKA", required = true, type = Integer.class, nillable = true)
                        protected Integer zihuihoshechbamislaka; 
                        @XmlElement(name = "NITAN-LEYADEA-BAAL-RISHAYON", required = true, type = Integer.class, nillable = true)
                        protected Integer nitanleyadeabaalrishayon;
                        @XmlElement(name = "ASMACHTA-MISLAKA", required = true, nillable = true)
                        protected String asmachtamislaka;
                        @XmlElement(name = "RESERVA-MISLAKA", required = true, nillable = true)
                        protected String reservamislaka;
                        @XmlElement(name = "YipuiKoach", required = true)
                        protected IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.YipuiKoach yipuiKoach;
                        @XmlElement(required = true)
                        protected IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.Mismachim mismachim;
                        @XmlElement(name = "Mutzar")
                        protected IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.Mutzar mutzar;

                        @Override
                        public int getKODEIRUA() {
                            return kodeirua;
                        }

                        public void setKODEIRUA(int value) {
                            this.kodeirua = value;
                        }

                        @Override
                        public String getMISPARMEZAHERESHUMA() {
                            return misparmezahereshuma;
                        }

                        public void setMISPARMEZAHERESHUMA(String value) {
                            this.misparmezahereshuma = value;
                        }

                        @Override
                        public String getMISPARMISLAKA() {
                            return misparmislaka;
                        }

                        public void setMISPARMISLAKA(String value) {
                            this.misparmislaka = value;
                        }

                        @Override
                        public String getMISPARMISLAKALPNIIYACHOZORET() {
                            return misparmislakalpniiyachozoret;
                        }

                        public void setMISPARMISLAKALPNIIYACHOZORET(String value) {
                            this.misparmislakalpniiyachozoret = value;
                        }

                        @Override
                        public int getOFENHAAVARATMEIDAMIMISLLAKALELAKOACH() {
                            return ofenhaavaratmeidamimisllakalelakoach;
                        }

                        public void setOFENHAAVARATMEIDAMIMISLLAKALELAKOACH(int value) {
                            this.ofenhaavaratmeidamimisllakalelakoach = value;
                        }

                        @Override
                        public String getTAARICHNECHONUTMEIDA() {
                            return taarichnechonutmeida;
                        }

                        public void setTAARICHNECHONUTMEIDA(String value) {
                            this.taarichnechonutmeida = value;
                        }

                        @Override
                        public Integer getMAANEACHZAKOT() {
                            return maaneachzakot;
                        }

                        public void setMAANEACHZAKOT(Integer value) {
                            this.maaneachzakot = value;
                        }

                        @Override
                        public Integer getDOCHBEINAIM() {
                            return dochbeinaim;
                        }

                        public void setDOCHBEINAIM(Integer value) {
                            this.dochbeinaim = value;
                        }

                        @Override
                        public String getMISPARMISLAKALEBITUL() {
                            return misparmislakalebitul;
                        }

                        public void setMISPARMISLAKALEBITUL(String value) {
                            this.misparmislakalebitul = value;
                        }

                        @Override
                        public Integer getBAKASHAMITMASHECHET() {
                            return bakashamitmashechet;
                        }

                        public void setBAKASHAMITMASHECHET(Integer value) {
                            this.bakashamitmashechet = value;
                        }

                        @Override
                        public Integer getTADIRUTBAKASHA() {
                            return tadirutbakasha;
                        }

                        public void setTADIRUTBAKASHA(Integer value) {
                            this.tadirutbakasha = value;
                        }

                        @Override
                        public Integer getHAZHARATMAASIKHPKASUR() {
                            return hazharatmaasikhpkasur;
                        }

                        public void setHAZHARATMAASIKHPKASUR(Integer value) {
                            this.hazharatmaasikhpkasur = value;
                        }
                        
                        @Override
                        public Integer getRIANUNFISHING() {
                            return rianunfishing;
                        }

                        public void setRIANUNFISHING(Integer value) {
                            this.rianunfishing = value;
                        }
                        
                        @Override
                        public String getKODZIHUIOVEDBAMISLAKA() {
                            return kodzihuiovedbamislaka;
                        }

                        public void setKODZIHUIOVEDBAMISLAKA(String value) {
                            this.kodzihuiovedbamislaka = value;
                        }
                        
                        @Override
                        public Integer getZIHUIHOSHECHBAMISLAKA() {
                            return zihuihoshechbamislaka;
                        }

                        public void setZIHUIHOSHECHBAMISLAKA(Integer value) {
                            this.zihuihoshechbamislaka = value;
                        }
                        
                        @Override
                        public Integer getNITANLEYADEABAALRISHAYON() {
                            return nitanleyadeabaalrishayon;
                        }

                        public void setNITANLEYADEABAALRISHAYON(Integer value) {
                            this.nitanleyadeabaalrishayon = value;
                        }                        

                        @Override
                        public String getASMACHTAMISLAKA() {
                            return asmachtamislaka;
                        }

                        public void setASMACHTAMISLAKA(String value) {
                            this.asmachtamislaka = value;
                        }

                        @Override
                        public String getRESERVAMISLAKA() {
                            return reservamislaka;
                        }

                        public void setRESERVAMISLAKA(String value) {
                            this.reservamislaka = value;
                        }

                        @Override
                        public IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.YipuiKoach getYipuiKoach() {
                            return yipuiKoach;
                        }

                        public void setYipuiKoach(IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.YipuiKoach value) {
                            this.yipuiKoach = value;
                        }

                        @Override
                        public IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.Mismachim getMismachim() {
                            return mismachim;
                        }

                        public void setMismachim(IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.Mismachim value) {
                            this.mismachim = value;
                        }

                        @Override
                        public IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.Mutzar getMutzar() {
                            return mutzar;
                        }

                        public void setMutzar(IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.Mutzar value) {
                            this.mutzar = value;
                        }


                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "mismachimNilvimBeramatEirua",
                            "zihuiShemMismachBeramatEirua"
                        })
                        public static class Mismachim implements MismachimBase {

                            @XmlElement(name = "mismachim-Nilvim-Beramat-Eirua")
                            protected MismachimNilvimBeramatEirua mismachimNilvimBeramatEirua;
                            @XmlElement(name = "ZihuiShemMismachBeramatEirua")
                            protected List<ZihuiShemMismachBeramatEirua> zihuiShemMismachBeramatEirua;

                            @Override
                            public MismachimNilvimBeramatEirua getMismachimNilvimBeramatEirua() {
                                return mismachimNilvimBeramatEirua;
                            }

                            public void setMismachimNilvimBeramatEirua(IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.Mismachim.MismachimNilvimBeramatEirua value) {
                                this.mismachimNilvimBeramatEirua = value;
                            }

                            @Override
                            public List<ZihuiShemMismachBeramatEirua> getZihuiShemMismachBeramatEirua() {
                                if (zihuiShemMismachBeramatEirua == null) {
                                    zihuiShemMismachBeramatEirua = new ArrayList<IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.Mismachim.ZihuiShemMismachBeramatEirua>();
                                }
                                return this.zihuiShemMismachBeramatEirua;
                            }

                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "kolmismachimtzurfu",
                                "tfasimdrushimchatumim"
                            })
                            public static class MismachimNilvimBeramatEirua implements MismachimNilvimBeramatEiruaBase {

                                @XmlElement(name = "KOL-MISMACHIM-TZURFU")
                                protected int kolmismachimtzurfu;
                                @XmlElement(name = "TFASIM-DRUSHIM-CHATUMIM")
                                protected int tfasimdrushimchatumim;

                                @Override
                                public int getKOLMISMACHIMTZURFU() {
                                    return kolmismachimtzurfu;
                                }

                                public void setKOLMISMACHIMTZURFU(int value) {
                                    this.kolmismachimtzurfu = value;
                                }

                                @Override
                                public int getTFASIMDRUSHIMCHATUMIM() {
                                    return tfasimdrushimchatumim;
                                }

                                public void setTFASIMDRUSHIMCHATUMIM(int value) {
                                    this.tfasimdrushimchatumim = value;
                                }

                            }

                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "shemkovetzshelmismachberamateiruaveberamatlakoach",
                                "sugmismach",
                                "asmachtakovez",
                                "taarichchtimalakoach",
                                "taarichchtimabaalrishaion",
                                "chatimagrafit",
                                "ishurmemucshav"
                            })
                            public static class ZihuiShemMismachBeramatEirua implements ZihuiShemMismachBeramatEiruaBase {

                                @XmlElement(name = "SHEM-KOVETZ-SHEL-MISMACH-BERAMAT-EIRUA-VEBERAMAT-LAKOACH", required = true)
                                protected String shemkovetzshelmismachberamateiruaveberamatlakoach;
                                @XmlElement(name = "SUG-MISMACH")
                                protected int sugmismach;
                                @XmlElement(name = "ASMACHTA-KOVEZ", required = true, nillable = true)
                                protected String asmachtakovez;
                                @XmlElement(name = "TAARICH-CHTIMA-LAKOACH", required = true, nillable = true)
                                protected String taarichchtimalakoach;
                                @XmlElement(name = "TAARICH-CHTIMA-BAAL-RISHAION", required = true, nillable = true)
                                protected String taarichchtimabaalrishaion;
                                @XmlElement(name = "CHATIMA-GRAFIT")
                                protected int chatimagrafit;
                                @XmlElement(name = "ISHUR-MEMUCSHAV")
                                protected int ishurmemucshav;

                                @Override
                                public String getSHEMKOVETZSHELMISMACHBERAMATEIRUAVEBERAMATLAKOACH() {
                                    return shemkovetzshelmismachberamateiruaveberamatlakoach;
                                }

                                public void setSHEMKOVETZSHELMISMACHBERAMATEIRUAVEBERAMATLAKOACH(String value) {
                                    this.shemkovetzshelmismachberamateiruaveberamatlakoach = value;
                                }

                                @Override
                                public int getSUGMISMACH() {
                                    return sugmismach;
                                }

                                public void setSUGMISMACH(int value) {
                                    this.sugmismach = value;
                                }

                                @Override
                                public String getASMACHTAKOVEZ() {
                                    return asmachtakovez;
                                }

                                public void setASMACHTAKOVEZ(String value) {
                                    this.asmachtakovez = value;
                                }

                                @Override
                                public String getTAARICHCHTIMALAKOACH() {
                                    return taarichchtimalakoach;
                                }

                                public void setTAARICHCHTIMALAKOACH(String value) {
                                    this.taarichchtimalakoach = value;
                                }

                                @Override
                                public String getTAARICHCHTIMABAALRISHAION() {
                                    return taarichchtimabaalrishaion;
                                }

                                public void setTAARICHCHTIMABAALRISHAION(String value) {
                                    this.taarichchtimabaalrishaion = value;
                                }

                                @Override
                                public int getCHATIMAGRAFIT() {
                                    return chatimagrafit;
                                }

                                public void setCHATIMAGRAFIT(int value) {
                                    this.chatimagrafit = value;
                                }

                                @Override
                                public int getISHURMEMUCSHAV() {
                                    return ishurmemucshav;
                                }

                                public void setISHURMEMUCSHAV(int value) {
                                    this.ishurmemucshav = value;
                                }
                            }
                        }

                        
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "netuneiMutzar"
                        })
                        public static class Mutzar implements MutzarBase{

                            @XmlElement(name = "NetuneiMutzar")
                            protected IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.Mutzar.NetuneiMutzar netuneiMutzar;

                            @Override
                            public IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.Mutzar.NetuneiMutzar getNetuneiMutzar() {
                                return netuneiMutzar;
                            }
                            
                            public void setNetuneiMutzar(IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.Mutzar.NetuneiMutzar value) {
                                this.netuneiMutzar = value;
                            }

                            
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "kodmezaheyatzran",
                                "sugmutzarpensioni",
                                "heshbonOPolisa",
                                "bakashaLekabalatMeidaPitzuim",
                                "bakashatBitulYipuiKoach",
                                "pratimIshiimHadashimAmit",
                                "seerLePensiya",
                                "maasiklprod"
                            })
                            public static class NetuneiMutzar implements NetuneiMutzarBase {

                                @XmlElement(name = "KOD-MEZAHE-YATZRAN", required = true)
                                protected String kodmezaheyatzran;
                                @XmlElement(name = "SUG-MUTZAR-PENSIONI", required = true, type = Integer.class, nillable = true)
                                protected Integer sugmutzarpensioni;
                                @XmlElement(name = "HeshbonOPolisa")
                                protected IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.Mutzar.NetuneiMutzar.HeshbonOPolisa heshbonOPolisa;
                                @XmlElement(name = "BakashaLekabalatMeidaPitzuim")
                                protected IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.Mutzar.NetuneiMutzar.BakashaLekabalatMeidaPitzuim bakashaLekabalatMeidaPitzuim;
                                @XmlElement(name = "BakashatBitulYipuiKoach")
                                protected IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.Mutzar.NetuneiMutzar.BakashatBitulYipuiKoach bakashatBitulYipuiKoach;
                                @XmlElement(name = "PratimIshiimHadashimAmit")
                                protected IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.Mutzar.NetuneiMutzar.PratimIshiimHadashimAmit pratimIshiimHadashimAmit;
                                @XmlElement(name = "SeerLePensiya")
                                protected List<IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.Mutzar.NetuneiMutzar.SeerLePensiya> seerLePensiya;
                                @XmlElement(name = "Maasiklprod")
                                protected List<IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.Mutzar.NetuneiMutzar.Maasiklprod> maasiklprod;

                                @Override
                                public String getKODMEZAHEYATZRAN() {
                                    return kodmezaheyatzran;
                                }

                                public void setKODMEZAHEYATZRAN(String value) {
                                    this.kodmezaheyatzran = value;
                                }

                                @Override
                                public Integer getSUGMUTZARPENSIONI() {
                                    return sugmutzarpensioni;
                                }

                                public void setSUGMUTZARPENSIONI(Integer value) {
                                    this.sugmutzarpensioni = value;
                                }

                                @Override
                                public HeshbonOPolisa getHeshbonOPolisa() {
                                    return heshbonOPolisa;
                                }

                                public void setHeshbonOPolisa(IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.Mutzar.NetuneiMutzar.HeshbonOPolisa value) {
                                    this.heshbonOPolisa = value;
                                }

                                @Override
                                public BakashaLekabalatMeidaPitzuim getBakashaLekabalatMeidaPitzuim() {
                                    return bakashaLekabalatMeidaPitzuim;
                                }

                                public void setBakashaLekabalatMeidaPitzuim(IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.Mutzar.NetuneiMutzar.BakashaLekabalatMeidaPitzuim value) {
                                    this.bakashaLekabalatMeidaPitzuim = value;
                                }

                                @Override
                                public IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.Mutzar.NetuneiMutzar.BakashatBitulYipuiKoach getBakashatBitulYipuiKoach() {
                                    return bakashatBitulYipuiKoach;
                                }

                                public void setBakashatBitulYipuiKoach(IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.Mutzar.NetuneiMutzar.BakashatBitulYipuiKoach value) {
                                    this.bakashatBitulYipuiKoach = value;
                                }

                                @Override
                                public IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.Mutzar.NetuneiMutzar.PratimIshiimHadashimAmit getPratimIshiimHadashimAmit() {
                                    return pratimIshiimHadashimAmit;
                                }

                                public void setPratimIshiimHadashimAmit(IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.Mutzar.NetuneiMutzar.PratimIshiimHadashimAmit value) {
                                    this.pratimIshiimHadashimAmit = value;
                                }

                                @Override
                                public List<IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.Mutzar.NetuneiMutzar.SeerLePensiya> getSeerLePensiya() {
                                    if (seerLePensiya == null) {
                                        seerLePensiya = new ArrayList<IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.Mutzar.NetuneiMutzar.SeerLePensiya>();
                                    }
                                    return this.seerLePensiya;
                                }
                                
                                @Override
                                public List<IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.Mutzar.NetuneiMutzar.Maasiklprod> getMaasiklprod() {
                                    if (maasiklprod == null) {
                                        maasiklprod = new ArrayList<IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.Mutzar.NetuneiMutzar.Maasiklprod>();
                                    }
                                    return this.maasiklprod;
                                }


                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "sugmezaheoved",
                                    "misparmezaheoved",
                                    "shemprati",
                                    "shemmishpacha",
                                    "kodmutzarlefikidudachid",
                                    "misparpolisaoheshbon",
                                    "kodmedina"
                                })
                                public static class BakashaLekabalatMeidaPitzuim implements BakashaLekabalatMeidaPitzuimBase {

                                    @XmlElement(name = "SUG-MEZAHE-OVED")
                                    protected int sugmezaheoved;
                                    @XmlElement(name = "MISPAR-MEZAHE-OVED", required = true)
                                    protected String misparmezaheoved;
                                    @XmlElement(name = "SHEM-PRATI", required = true)
                                    protected String shemprati;
                                    @XmlElement(name = "SHEM-MISHPACHA", required = true)
                                    protected String shemmishpacha;
                                    @XmlElement(name = "KOD-MUTZAR-LEFI-KIDUD-ACHID", required = true, nillable = true)
                                    protected String kodmutzarlefikidudachid;
                                    @XmlElement(name = "MISPAR-POLISA-O-HESHBON", required = true, nillable = true)
                                    protected String misparpolisaoheshbon;
                                    @XmlElement(name = "KOD-MEDINA", required = true, nillable = true)
                                    protected String kodmedina;

                                    @Override
                                    public int getSUGMEZAHEOVED() {
                                        return sugmezaheoved;
                                    }

                                    public void setSUGMEZAHEOVED(int value) {
                                        this.sugmezaheoved = value;
                                    }

                                    @Override
                                    public String getMISPARMEZAHEOVED() {
                                        return misparmezaheoved;
                                    }

                                    public void setMISPARMEZAHEOVED(String value) {
                                        this.misparmezaheoved = value;
                                    }

                                    @Override
                                    public String getSHEMPRATI() {
                                        return shemprati;
                                    }

                                    
                                    public void setSHEMPRATI(String value) {
                                        this.shemprati = value;
                                    }

                                    @Override
                                    public String getSHEMMISHPACHA() {
                                        return shemmishpacha;
                                    }

                                    public void setSHEMMISHPACHA(String value) {
                                        this.shemmishpacha = value;
                                    }

                                    @Override
                                    public String getKODMUTZARLEFIKIDUDACHID() {
                                        return kodmutzarlefikidudachid;
                                    }

                                    public void setKODMUTZARLEFIKIDUDACHID(String value) {
                                        this.kodmutzarlefikidudachid = value;
                                    }

                                    @Override
                                    public String getMISPARPOLISAOHESHBON() {
                                        return misparpolisaoheshbon;
                                    }

                                    public void setMISPARPOLISAOHESHBON(String value) {
                                        this.misparpolisaoheshbon = value;
                                    }

                                    @Override
                                    public String getKODMEDINA() {
                                        return kodmedina;
                                    }

                                    public void setKODMEDINA(String value) {
                                        this.kodmedina = value;
                                    }

                                }

                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "sugmezahebaalri",
                                    "misparmezahebaalri",
                                    "shembaalri"
                                })
                                public static class BakashatBitulYipuiKoach implements BakashatBitulYipuiKoachBase{

                                    @XmlElement(name = "SUG-MEZAHE-BAALRI", required = true, type = Integer.class, nillable = true)
                                    protected Integer sugmezahebaalri;
                                    @XmlElement(name = "MISPAR-MEZAHE-BAALRI", required = true, nillable = true)
                                    protected String misparmezahebaalri;
                                    @XmlElement(name = "SHEM-BAALRI", required = true, nillable = true)
                                    protected String shembaalri;

                                    @Override
                                    public Integer getSUGMEZAHEBAALRI() {
                                        return sugmezahebaalri;
                                    }

                                    public void setSUGMEZAHEBAALRI(Integer value) {
                                        this.sugmezahebaalri = value;
                                    }

                                    @Override
                                    public String getMISPARMEZAHEBAALRI() {
                                        return misparmezahebaalri;
                                    }

                                    public void setMISPARMEZAHEBAALRI(String value) {
                                        this.misparmezahebaalri = value;
                                    }

                                    @Override
                                    public String getSHEMBAALRI() {
                                        return shembaalri;
                                    }

                                    public void setSHEMBAALRI(String value) {
                                        this.shembaalri = value;
                                    }

                                }

                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "shemmutzar",
                                    "kodmutzarlefikidudachid",
                                    "misparpolisaoheshbon"
                                })
                                public static class HeshbonOPolisa implements HeshbonOPolisaBase {

                                    @XmlElement(name = "SHEM-MUTZAR", required = true)
                                    protected String shemmutzar;
                                    @XmlElement(name = "KOD-MUTZAR-LEFI-KIDUD-ACHID", required = true, nillable = true)
                                    protected String kodmutzarlefikidudachid;
                                    @XmlElement(name = "MISPAR-POLISA-O-HESHBON", required = true)
                                    protected String misparpolisaoheshbon;

                                    @Override
                                    public String getSHEMMUTZAR() {
                                        return shemmutzar;
                                    }

                                    public void setSHEMMUTZAR(String value) {
                                        this.shemmutzar = value;
                                    }

                                    @Override
                                    public String getKODMUTZARLEFIKIDUDACHID() {
                                        return kodmutzarlefikidudachid;
                                    }

                                    public void setKODMUTZARLEFIKIDUDACHID(String value) {
                                        this.kodmutzarlefikidudachid = value;
                                    }
                                    
                                    @Override
                                    public String getMISPARPOLISAOHESHBON() {
                                        return misparpolisaoheshbon;
                                    }

                                    public void setMISPARPOLISAOHESHBON(String value) {
                                        this.misparpolisaoheshbon = value;
                                    }

                                }

                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "sugmezahemaasik",
                                    "misparmezahemaasik",
                                    "shemmaasik",
                                    "kodmezahemaasiketzelyatzran"
                                })
                                public static class Maasiklprod implements MaasiklprodBase {

                                    @XmlElement(name = "SUG-MEZAHE-MAASIK")
                                    protected int sugmezahemaasik;
                                    @XmlElement(name = "MISPAR-MEZAHE-MAASIK", required = true)
                                    protected String misparmezahemaasik;
                                    @XmlElement(name = "SHEM-MAASIK", required = true, nillable = true)
                                    protected String shemmaasik;
                                    @XmlElement(name = "KOD-MEZAHE-MAASIK-ETZEL-YATZRAN", required = true, nillable = true)
                                    protected String kodmezahemaasiketzelyatzran;

                                    @Override
                                    public int getSUGMEZAHEMAASIK() {
                                        return sugmezahemaasik;
                                    }

                                    public void setSUGMEZAHEMAASIK(int value) {
                                        this.sugmezahemaasik = value;
                                    }

                                    @Override
                                    public String getMISPARMEZAHEMAASIK() {
                                        return misparmezahemaasik;
                                    }

                                    public void setMISPARMEZAHEMAASIK(String value) {
                                        this.misparmezahemaasik = value;
                                    }

                                    @Override
                                    public String getSHEMMAASIK() {
                                        return shemmaasik;
                                    }

                                    public void setSHEMMAASIK(String value) {
                                        this.shemmaasik = value;
                                    }

                                    @Override
                                    public String getKODMEZAHEMAASIKETZELYATZRAN() {
                                        return kodmezahemaasiketzelyatzran;
                                    }

                                    public void setKODMEZAHEMAASIKETZELYATZRAN(String value) {
                                        this.kodmezahemaasiketzelyatzran = value;
                                    }

                                }
                                
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "sugmezaheamit",
                                    "misparmezaheamit",
                                    "shemprati",
                                    "shemmishpaha",
                                    "taarichleida",
                                    "min",
                                    "matsavmishpachti",
                                    "shemyeshuv",
                                    "shemrechov",
                                    "misparbait",
                                    "mispardira",
                                    "mikud",
                                    "tadoar",
                                    "mispartelephonekavi",
                                    "misparcellulari",
                                    "email",
                                    "haavaratmismachimbamail",
                                    "kayamidkunsheerim",
                                    "ktovetmisradpnim"
                                })
                                public static class PratimIshiimHadashimAmit implements PratimIshiimHadashimAmitBase {

                                    @XmlElement(name = "SUG-MEZAHE-AMIT")
                                    protected int sugmezaheamit;
                                    @XmlElement(name = "MISPAR-MEZAHE-AMIT", required = true)
                                    protected String misparmezaheamit;
                                    @XmlElement(name = "SHEM-PRATI", required = true, nillable = true)
                                    protected String shemprati;
                                    @XmlElement(name = "SHEM-MISHPAHA", required = true, nillable = true)
                                    protected String shemmishpaha;
                                    @XmlElement(name = "TAARICH-LEIDA", required = true, nillable = true)
                                    protected String taarichleida;
                                    @XmlElement(name = "MIN", required = true, type = Integer.class, nillable = true)
                                    protected Integer min;
                                    @XmlElement(name = "MATSAV-MISHPACHTI", required = true, type = Integer.class, nillable = true)
                                    protected Integer matsavmishpachti;
                                    @XmlElement(name = "SHEM-YESHUV", required = true, nillable = true)
                                    protected String shemyeshuv;
                                    @XmlElement(name = "SHEM-RECHOV", required = true, nillable = true)
                                    protected String shemrechov;
                                    @XmlElement(name = "MISPAR-BAIT", required = true, nillable = true)
                                    protected String misparbait;
                                    @XmlElement(name = "MISPAR-DIRA", required = true, type = Integer.class, nillable = true)
                                    protected Integer mispardira;
                                    @XmlElement(name = "MIKUD", required = true, type = Integer.class, nillable = true)
                                    protected Integer mikud;
                                    @XmlElement(name = "TA-DOAR", required = true, type = Integer.class, nillable = true)
                                    protected Integer tadoar;
                                    @XmlElement(name = "MISPAR-TELEPHONE-KAVI", required = true, nillable = true)
                                    protected String mispartelephonekavi;
                                    @XmlElement(name = "MISPAR-CELLULARI", required = true, nillable = true)
                                    protected String misparcellulari;
                                    @XmlElement(name = "E-MAIL", required = true, nillable = true)
                                    protected String email;
                                    @XmlElement(name = "HAAVARAT-MISMACHIM-BAMAIL", required = true, type = Integer.class, nillable = true)
                                    protected Integer haavaratmismachimbamail;
                                    @XmlElement(name = "KAYAM-IDKUN-SHEERIM")
                                    protected int kayamidkunsheerim;
                                    @XmlElement(name = "KTOVET-MISRAD-PNIM", required = true, type = Integer.class, nillable = true)
                                    protected Integer ktovetmisradpnim;

                                    @Override
                                    public int getSUGMEZAHEAMIT() {
                                        return sugmezaheamit;
                                    }

                                    public void setSUGMEZAHEAMIT(int value) {
                                        this.sugmezaheamit = value;
                                    }

                                    @Override
                                    public String getMISPARMEZAHEAMIT() {
                                        return misparmezaheamit;
                                    }

                                    public void setMISPARMEZAHEAMIT(String value) {
                                        this.misparmezaheamit = value;
                                    }

                                    @Override
                                    public String getSHEMPRATI() {
                                        return shemprati;
                                    }

                                    public void setSHEMPRATI(String value) {
                                        this.shemprati = value;
                                    }
                                    
                                    @Override
                                    public String getSHEMMISHPAHA() {
                                        return shemmishpaha;
                                    }

                                    public void setSHEMMISHPAHA(String value) {
                                        this.shemmishpaha = value;
                                    }

                                    @Override
                                    public String getTAARICHLEIDA() {
                                        return taarichleida;
                                    }

                                    public void setTAARICHLEIDA(String value) {
                                        this.taarichleida = value;
                                    }

                                    @Override
                                    public Integer getMIN() {
                                        return min;
                                    }

                                    public void setMIN(Integer value) {
                                        this.min = value;
                                    }

                                    @Override
                                    public Integer getMATSAVMISHPACHTI() {
                                        return matsavmishpachti;
                                    }
                                    
                                    public void setMATSAVMISHPACHTI(Integer value) {
                                        this.matsavmishpachti = value;
                                    }

                                    @Override
                                    public String getSHEMYESHUV() {
                                        return shemyeshuv;
                                    }

                                    public void setSHEMYESHUV(String value) {
                                        this.shemyeshuv = value;
                                    }

                                    @Override
                                    public String getSHEMRECHOV() {
                                        return shemrechov;
                                    }

                                    public void setSHEMRECHOV(String value) {
                                        this.shemrechov = value;
                                    }

                                    @Override
                                    public String getMISPARBAIT() {
                                        return misparbait;
                                    }

                                    public void setMISPARBAIT(String value) {
                                        this.misparbait = value;
                                    }

                                    @Override
                                    public Integer getMISPARDIRA() {
                                        return mispardira;
                                    }

                                    public void setMISPARDIRA(Integer value) {
                                        this.mispardira = value;
                                    }

                                    @Override
                                    public Integer getMIKUD() {
                                        return mikud;
                                    }

                                    public void setMIKUD(Integer value) {
                                        this.mikud = value;
                                    }

                                    @Override
                                    public Integer getTADOAR() {
                                        return tadoar;
                                    }

                                    public void setTADOAR(Integer value) {
                                        this.tadoar = value;
                                    }

                                    @Override
                                    public String getMISPARTELEPHONEKAVI() {
                                        return mispartelephonekavi;
                                    }

                                    public void setMISPARTELEPHONEKAVI(String value) {
                                        this.mispartelephonekavi = value;
                                    }

                                    @Override
                                    public String getMISPARCELLULARI() {
                                        return misparcellulari;
                                    }

                                    public void setMISPARCELLULARI(String value) {
                                        this.misparcellulari = value;
                                    }

                                    @Override
                                    public String getEMAIL() {
                                        return email;
                                    }

                                    public void setEMAIL(String value) {
                                        this.email = value;
                                    }
                                    
                                    @Override
                                    public Integer getHAAVARATMISMACHIMBAMAIL() {
                                        return haavaratmismachimbamail;
                                    }

                                    public void setHAAVARATMISMACHIMBAMAIL(Integer value) {
                                        this.haavaratmismachimbamail = value;
                                    }

                                    @Override
                                    public int getKAYAMIDKUNSHEERIM() {
                                        return kayamidkunsheerim;
                                    }
                                    
                                    public void setKAYAMIDKUNSHEERIM(int value) {
                                        this.kayamidkunsheerim = value;
                                    }

                                    @Override
                                    public Integer getKTOVETMISRADPNIM() {
                                        return ktovetmisradpnim;
                                    }

                                    public void setKTOVETMISRADPNIM(Integer value) {
                                        this.ktovetmisradpnim = value;
                                    }

                                }

                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "sugzika",
                                    "kodzihuisheerim",
                                    "misparmezahesheerim",
                                    "shempratisheerim",
                                    "shemmishpachasheerim",
                                    "taarichleida"
                                })
                                public static class SeerLePensiya implements SeerLePensiyaBase {

                                    @XmlElement(name = "SUG-ZIKA")
                                    protected int sugzika;
                                    @XmlElement(name = "KOD-ZIHUI-SHEERIM")
                                    protected int kodzihuisheerim;
                                    @XmlElement(name = "MISPAR-MEZAHE-SHEERIM", required = true)
                                    protected String misparmezahesheerim;
                                    @XmlElement(name = "SHEM-PRATI-SHEERIM", required = true)
                                    protected String shempratisheerim;
                                    @XmlElement(name = "SHEM-MISHPACHA-SHEERIM", required = true)
                                    protected String shemmishpachasheerim;
                                    @XmlElement(name = "TAARICH-LEIDA", required = true)
                                    protected String taarichleida;

                                    @Override
                                    public int getSUGZIKA() {
                                        return sugzika;
                                    }

                                    public void setSUGZIKA(int value) {
                                        this.sugzika = value;
                                    }

                                    @Override
                                    public int getKODZIHUISHEERIM() {
                                        return kodzihuisheerim;
                                    }

                                    public void setKODZIHUISHEERIM(int value) {
                                        this.kodzihuisheerim = value;
                                    }

                                    @Override
                                    public String getMISPARMEZAHESHEERIM() {
                                        return misparmezahesheerim;
                                    }

                                    public void setMISPARMEZAHESHEERIM(String value) {
                                        this.misparmezahesheerim = value;
                                    }

                                    @Override
                                    public String getSHEMPRATISHEERIM() {
                                        return shempratisheerim;
                                    }

                                    public void setSHEMPRATISHEERIM(String value) {
                                        this.shempratisheerim = value;
                                    }

                                    @Override
                                    public String getSHEMMISHPACHASHEERIM() {
                                        return shemmishpachasheerim;
                                    }

                                    public void setSHEMMISHPACHASHEERIM(String value) {
                                        this.shemmishpachasheerim = value;
                                    }

                                    @Override
                                    public String getTAARICHLEIDA() {
                                        return taarichleida;
                                    }

                                    public void setTAARICHLEIDA(String value) {
                                        this.taarichleida = value;
                                    }

                                }

                            }

                        }

                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "bakashatMefitzLeinianYipuiKoach",
                            "achragotVeharshot"
                        })
                        public static class YipuiKoach implements YipuiKoachBase {

                            @XmlElement(name = "BakashatMefitzLeinianYipuiKoach")
                            protected IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.YipuiKoach.BakashatMefitzLeinianYipuiKoach bakashatMefitzLeinianYipuiKoach;
                            @XmlElement(name = "AchragotVeharshot")
                            protected IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.YipuiKoach.AchragotVeharshot achragotVeharshot;

                            @Override
                            public IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.YipuiKoach.BakashatMefitzLeinianYipuiKoach getBakashatMefitzLeinianYipuiKoach() {
                                return bakashatMefitzLeinianYipuiKoach;
                            }

                            public void setBakashatMefitzLeinianYipuiKoach(IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.YipuiKoach.BakashatMefitzLeinianYipuiKoach value) {
                                this.bakashatMefitzLeinianYipuiKoach = value;
                            }

                            @Override
                            public IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.YipuiKoach.AchragotVeharshot getAchragotVeharshot() {
                                return achragotVeharshot;
                            }

                            public void setAchragotVeharshot(IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.YipuiKoach.AchragotVeharshot value) {
                                this.achragotVeharshot = value;
                            }

                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "mutzarMuchrag",
                                "harshaaBeramatMutzar"
                            })
                            public static class AchragotVeharshot implements AchragotVeharshotBase{

                                @XmlElement(name = "MutzarMuchrag")
                                protected List<IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.YipuiKoach.AchragotVeharshot.MutzarMuchrag> mutzarMuchrag;
                                @XmlElement(name = "HarshaaBeramatMutzar")
                                protected List<IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.YipuiKoach.AchragotVeharshot.HarshaaBeramatMutzar> harshaaBeramatMutzar;

                                @Override
                                public List<IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.YipuiKoach.AchragotVeharshot.MutzarMuchrag> getMutzarMuchrag() {
                                    if (mutzarMuchrag == null) {
                                        mutzarMuchrag = new ArrayList<IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.YipuiKoach.AchragotVeharshot.MutzarMuchrag>();
                                    }
                                    return this.mutzarMuchrag;
                                }
                                
                                @Override
                                public List<IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.YipuiKoach.AchragotVeharshot.HarshaaBeramatMutzar> getHarshaaBeramatMutzar() {
                                    if (harshaaBeramatMutzar == null) {
                                        harshaaBeramatMutzar = new ArrayList<IncomingEventsV06Model.GufHamimshak.YeshutGoremPoneLemislaka.YeshutLakoachMeidaBsisi.Eirua.KodEirua.YipuiKoach.AchragotVeharshot.HarshaaBeramatMutzar>();
                                    }
                                    return this.harshaaBeramatMutzar;
                                }

                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "kidudmutzarlonitnaharshaha",
                                    "misparcheshbonbemutzarlonitnaharshaha",
                                    "kabalatmeidabilvad",
                                    "misparsohenpnimietzelmosdi"
                                    
                                })
                                public static class HarshaaBeramatMutzar implements HarshaaBeramatMutzarBase {

                                    @XmlElement(name = "KIDUD-MUTZAR-LO-NITNA-HARSHAHA", required = true, nillable = true)
                                    protected String kidudmutzarlonitnaharshaha;
                                    @XmlElement(name = "MISPAR-CHESHBON-BEMUTZAR-LO-NITNA-HARSHAHA", required = true, nillable = true)
                                    protected String misparcheshbonbemutzarlonitnaharshaha;
                                    @XmlElement(name = "KABALAT-MEIDA-BILVAD")
                                    protected int kabalatmeidabilvad;
                                    @XmlElement(name = "MISPAR-SOHEN-PNIMI-ETZEL-MOSDI", required = true)
                                    protected String misparsohenpnimietzelmosdi;

                                    @Override
                                    public String getKIDUDMUTZARLONITNAHARSHAHA() {
                                        return kidudmutzarlonitnaharshaha;
                                    }

                                    public void setKIDUDMUTZARLONITNAHARSHAHA(String value) {
                                        this.kidudmutzarlonitnaharshaha = value;
                                    }

                                    @Override
                                    public String getMISPARCHESHBONBEMUTZARLONITNAHARSHAHA() {
                                        return misparcheshbonbemutzarlonitnaharshaha;
                                    }

                                    public void setMISPARCHESHBONBEMUTZARLONITNAHARSHAHA(String value) {
                                        this.misparcheshbonbemutzarlonitnaharshaha = value;
                                    }

                                    @Override
                                    public int getKABALATMEIDABILVAD() {
                                        return kabalatmeidabilvad;
                                    }

                                    public void setKABALATMEIDABILVAD(int value) {
                                        this.kabalatmeidabilvad = value;
                                    }
                                    
                                    @Override
                                    public String getMISPARSOHENPNIMIETZELMOSDI() {
                                        return misparsohenpnimietzelmosdi;
                                    }

                                    public void setMISPARSOHENPNIMIETZELMOSDI(String value) {
                                        this.misparsohenpnimietzelmosdi = value;
                                    }

                                }

                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "sugmutzarmuchrag",
                                    "kidudmutzarpensionimuchrag",
                                    "misparcheshbonbemutzarmuchrag",
                                    "ofenhachraga"
                                })
                                public static class MutzarMuchrag implements MutzarMuchragBase {

                                    @XmlElement(name = "SUG-MUTZAR-MUCHRAG", required = true, type = Integer.class, nillable = true)
                                    protected Integer sugmutzarmuchrag;
                                    @XmlElement(name = "KIDUD-MUTZAR-PENSIONI-MUCHRAG", required = true, nillable = true)
                                    protected String kidudmutzarpensionimuchrag;
                                    @XmlElement(name = "MISPAR-CHESHBON-BEMUTZAR-MUCHRAG", required = true, nillable = true)
                                    protected String misparcheshbonbemutzarmuchrag;
                                    @XmlElement(name = "OFEN-HACHRAGA", required = true, type = Integer.class, nillable = true)
                                    protected Integer ofenhachraga;

                                    @Override
                                    public Integer getSUGMUTZARMUCHRAG() {
                                        return sugmutzarmuchrag;
                                    }

                                    public void setSUGMUTZARMUCHRAG(Integer value) {
                                        this.sugmutzarmuchrag = value;
                                    }

                                    @Override
                                    public String getKIDUDMUTZARPENSIONIMUCHRAG() {
                                        return kidudmutzarpensionimuchrag;
                                    }

                                    public void setKIDUDMUTZARPENSIONIMUCHRAG(String value) {
                                        this.kidudmutzarpensionimuchrag = value;
                                    }

                                    @Override
                                    public String getMISPARCHESHBONBEMUTZARMUCHRAG() {
                                        return misparcheshbonbemutzarmuchrag;
                                    }

                                    public void setMISPARCHESHBONBEMUTZARMUCHRAG(String value) {
                                        this.misparcheshbonbemutzarmuchrag = value;
                                    }

                                    @Override
                                    public Integer getOFENHACHRAGA() {
                                        return ofenhachraga;
                                    }

                                    public void setOFENHACHRAGA(Integer value) {
                                        this.ofenhachraga = value;
                                    }

                                }

                            }

                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "tzurafmismachyipuikoach",
                                "kodzihuiyipuikoachbemislaka",
                                "mismachzihui",
                                "sugbakashatmefitzleeinianyipuikoach",
                                "kayammutzarmuchrag",
                                "taarichchtimalakoach",
                                "taarichchtimabaalrishaion",
                                "tokefyipuikoach",
                                "moedpkiha",
                                "harshaalemashkanta",
                                "atarmeuvtach",
                                "eretz",
                                "shemyishuv",
                                "semelyeshuv",
                                "shemrechov",
                                "misparbait",
                                "misparknisa",
                                "mispardira",
                                "mikud",
                                "tadoar",
                                "nispachd",
                                "bitularshaa",
                                "sugrishayon",
                                "misparrishayon",
                                "misparsohenpnimietzelmosdi"
                            })
                            public static class BakashatMefitzLeinianYipuiKoach implements BakashatMefitzLeinianYipuiKoachBase {

                                @XmlElement(name = "TZURAF-MISMACH-YIPUI-KOACH")
                                protected int tzurafmismachyipuikoach;
                                @XmlElement(name = "KOD-ZIHUI-YIPUI-KOACH-BEMISLAKA", required = true, nillable = true)
                                protected String kodzihuiyipuikoachbemislaka;
                                @XmlElement(name = "MISMACH-ZIHUI")
                                protected int mismachzihui;
                                @XmlElement(name = "SUG-BAKASHAT-MEFITZ-LEEINIAN-YIPUI-KOACH", required = true, type = Integer.class, nillable = true)
                                protected Integer sugbakashatmefitzleeinianyipuikoach;
                                @XmlElement(name = "KAYAM-MUTZAR-MUCHRAG", required = true, type = Integer.class, nillable = true)
                                protected Integer kayammutzarmuchrag;
                                @XmlElement(name = "TAARICH-CHTIMA-LAKOACH", required = true, nillable = true)
                                protected String taarichchtimalakoach;
                                @XmlElement(name = "TAARICH-CHTIMA-BAAL-RISHAION", required = true, nillable = true)
                                protected String taarichchtimabaalrishaion;
                                @XmlElement(name = "TOKEF-YIPUI-KOACH", required = true, type = Integer.class, nillable = true)
                                protected Integer tokefyipuikoach;
                                @XmlElement(name = "MOED-PKIHA", required = true, nillable = true)
                                protected String moedpkiha;
                                @XmlElement(name = "HARSHAA-LEMASHKANTA", required = true, type = Integer.class, nillable = true)
                                protected Integer harshaalemashkanta;
                                @XmlElement(name = "ATAR-MEUVTACH", required = true, type = Integer.class, nillable = true)
                                protected Integer atarmeuvtach;
                                @XmlElement(name = "ERETZ", required = true, nillable = true)
                                protected String eretz;
                                @XmlElement(name = "SHEM-YISHUV", required = true, nillable = true)
                                protected String shemyishuv;
                                @XmlElement(name = "SEMEL-YESHUV", required = true, type = Integer.class, nillable = true)
                                protected Integer semelyeshuv;
                                @XmlElement(name = "SHEM-RECHOV", required = true, nillable = true)
                                protected String shemrechov;
                                @XmlElement(name = "MISPAR-BAIT", required = true, nillable = true)
                                protected String misparbait;
                                @XmlElement(name = "MISPAR-KNISA", required = true, nillable = true)
                                protected String misparknisa;
                                @XmlElement(name = "MISPAR-DIRA", required = true, type = Integer.class, nillable = true)
                                protected Integer mispardira;
                                @XmlElement(name = "MIKUD", required = true, type = Integer.class, nillable = true)
                                protected Integer mikud;
                                @XmlElement(name = "TA-DOAR", required = true, type = Integer.class, nillable = true)
                                protected Integer tadoar;
                                @XmlElement(name = "NISPACH-D", required = true, type = Integer.class, nillable = true)
                                protected Integer nispachd;
                                @XmlElement(name = "BITUL-ARSHAA", required = true, type = Integer.class, nillable = true)
                                protected Integer bitularshaa;
                                @XmlElement(name = "SUG-RISHAYON", required = true, type = Integer.class, nillable = true)
                                protected Integer sugrishayon;
                                @XmlElement(name = "MISPAR-RISHAYON", required = true, nillable = true)
                                protected String misparrishayon;
                                @XmlElement(name = "MISPAR-SOHEN-PNIMI-ETZEL-MOSDI", required = true, nillable = true)
                                protected String misparsohenpnimietzelmosdi;
                                
                                

                                
                                @Override
                                public int getTZURAFMISMACHYIPUIKOACH() {
                                    return tzurafmismachyipuikoach;
                                }

                                public void setTZURAFMISMACHYIPUIKOACH(int value) {
                                    this.tzurafmismachyipuikoach = value;
                                }

                                @Override
                                public String getKODZIHUIYIPUIKOACHBEMISLAKA() {
                                    return kodzihuiyipuikoachbemislaka;
                                }

                                public void setKODZIHUIYIPUIKOACHBEMISLAKA(String value) {
                                    this.kodzihuiyipuikoachbemislaka = value;
                                }

                                @Override
                                public int getMISMACHZIHUI() {
                                    return mismachzihui;
                                }

                                public void setMISMACHZIHUI(int value) {
                                    this.mismachzihui = value;
                                }

                                @Override
                                public Integer getSUGBAKASHATMEFITZLEEINIANYIPUIKOACH() {
                                    return sugbakashatmefitzleeinianyipuikoach;
                                }

                                
                                public void setSUGBAKASHATMEFITZLEEINIANYIPUIKOACH(Integer value) {
                                    this.sugbakashatmefitzleeinianyipuikoach = value;
                                }
                                
                                @Override
                                public Integer getKAYAMMUTZARMUCHRAG() {
                                    return kayammutzarmuchrag;
                                }

                                public void setKAYAMMUTZARMUCHRAG(Integer value) {
                                    this.kayammutzarmuchrag = value;
                                }

                                @Override
                                public String getTAARICHCHTIMALAKOACH() {
                                    return taarichchtimalakoach;
                                }

                                public void setTAARICHCHTIMALAKOACH(String value) {
                                    this.taarichchtimalakoach = value;
                                }

                                @Override
                                public String getTAARICHCHTIMABAALRISHAION() {
                                    return taarichchtimabaalrishaion;
                                }

                                public void setTAARICHCHTIMABAALRISHAION(String value) {
                                    this.taarichchtimabaalrishaion = value;
                                }
                                
                                @Override
                                public Integer getTOKEFYIPUIKOACH() {
                                    return tokefyipuikoach;
                                }

                                public void setTOKEFYIPUIKOACH(Integer value) {
                                    this.tokefyipuikoach = value;
                                }

                                @Override
                                public String getMOEDPKIHA() {
                                    return moedpkiha;
                                }

                                public void setMOEDPKIHA(String value) {
                                    this.moedpkiha = value;
                                }
                                
                                @Override
                                public Integer getHARSHAALEMASHKANTA() {
                                    return harshaalemashkanta;
                                }

                                public void setHARSHAALEMASHKANTA(Integer value) {
                                    this.harshaalemashkanta = value;
                                }
                                
                                @Override
                                public Integer getATARMEUVTACH() {
                                    return atarmeuvtach;
                                }

                                public void setATARMEUVTACH(Integer value) {
                                    this.atarmeuvtach = value;
                                }

                                @Override
                                public String getERETZ() {
                                    return eretz;
                                }

                                public void setERETZ(String value) {
                                    this.eretz = value;
                                }

                                @Override
                                public String getSHEMYISHUV() {
                                    return shemyishuv;
                                }

                                public void setSHEMYISHUV(String value) {
                                    this.shemyishuv = value;
                                }

                                @Override
                                public Integer getSEMELYESHUV() {
                                    return semelyeshuv;
                                }

                                public void setSEMELYESHUV(Integer value) {
                                    this.semelyeshuv = value;
                                }

                                @Override
                                public String getSHEMRECHOV() {
                                    return shemrechov;
                                }

                                public void setSHEMRECHOV(String value) {
                                    this.shemrechov = value;
                                }

                                @Override
                                public String getMISPARBAIT() {
                                    return misparbait;
                                }

                                public void setMISPARBAIT(String value) {
                                    this.misparbait = value;
                                }

                                @Override
                                public String getMISPARKNISA() {
                                    return misparknisa;
                                }

                                public void setMISPARKNISA(String value) {
                                    this.misparknisa = value;
                                }

                                @Override
                                public Integer getMISPARDIRA() {
                                    return mispardira;
                                }

                                public void setMISPARDIRA(Integer value) {
                                    this.mispardira = value;
                                }

                                @Override
                                public Integer getMIKUD() {
                                    return mikud;
                                }

                                public void setMIKUD(Integer value) {
                                    this.mikud = value;
                                }

                                @Override
                                public Integer getTADOAR() {
                                    return tadoar;
                                }

                                public void setTADOAR(Integer value) {
                                    this.tadoar = value;
                                }

                                @Override
                                public Integer getNISPACHD() {
                                    return nispachd;
                                }

                                public void setNISPACHD(Integer value) {
                                    this.nispachd = value;
                                }

                                @Override
                                public Integer getBITULARSHAA() {
                                    return bitularshaa;
                                }

                                public void setBITULARSHAA(Integer value) {
                                    this.bitularshaa = value;
                                }
                                
                                @Override
                                public Integer getSUGRISHAYON() {
                                    return sugrishayon;
                                }

                                public void setSUGRISHAYON(Integer value) {
                                    this.sugrishayon = value;
                                }   
                                
                                @Override
                                public String getMISPARRISHAYON() {
                                    return misparrishayon;
                                }

                                public void setMISPARRISHAYON(String value) {
                                    this.misparrishayon = value;
                                }   
                                
                                @Override
                                public String getMISPARSOHENPNIMIETZELMOSDI() {
                                    return misparsohenpnimietzelmosdi;
                                }

                                public void setMISPARSOHENPNIMIETZELMOSDI(String value) {
                                    this.misparsohenpnimietzelmosdi = value;
                                }   
                                
                            }

                        }

                    }

                }

            }


        }

    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sugmimshak",
        "mispargirsatxml",
        "taarichbitzua",
        "kodsvivatavoda",
        "misparhakovetz",
        "misparsiduri",
        "netuneiGoremSholech",
        "netuneiGoremNimaan"
    })
    
    public static class KoteretKovetz implements KoteretKovetzBase {

        @XmlElement(name = "SUG-MIMSHAK")
        protected int sugmimshak;
        @XmlElement(name = "MISPAR-GIRSAT-XML", required = true)
        protected String mispargirsatxml;
        @XmlElement(name = "TAARICH-BITZUA", required = true)
        protected String taarichbitzua;
        @XmlElement(name = "KOD-SVIVAT-AVODA")
        protected int kodsvivatavoda;
        @XmlElement(name = "MISPAR-HAKOVETZ", required = true)
        protected String misparhakovetz;
        @XmlElement(name = "MISPAR-SIDURI", required = true, type = Integer.class, nillable = true)
        protected Integer misparsiduri;
        @XmlElement(name = "NetuneiGoremSholech", required = true)
        protected NetuneiGoremSholech netuneiGoremSholech;
        @XmlElement(name = "NetuneiGoremNimaan", required = true)
        protected NetuneiGoremNimaan netuneiGoremNimaan;

        @Override
        public int getSUGMIMSHAK() {
            return sugmimshak;
        }
        
        public void setSUGMIMSHAK(int value) {
            this.sugmimshak = value;
        }
        
        @Override
        public String getMISPARGIRSATXML() {
            return mispargirsatxml;
        }

        public void setMISPARGIRSATXML(String value) {
            this.mispargirsatxml = value;
        }

        @Override
        public String getTAARICHBITZUA() {
            return taarichbitzua;
        }

        public void setTAARICHBITZUA(String value) {
            this.taarichbitzua = value;
        }

        @Override
        public int getKODSVIVATAVODA() {
            return kodsvivatavoda;
        }

        public void setKODSVIVATAVODA(int value) {
            this.kodsvivatavoda = value;
        }

        @Override
        public String getMISPARHAKOVETZ() {
            return misparhakovetz;
        }

        public void setMISPARHAKOVETZ(String value) {
            this.misparhakovetz = value;
        }

        @Override
        public Integer getMISPARSIDURI() {
            return misparsiduri;
        }

        public void setMISPARSIDURI(Integer value) {
            this.misparsiduri = value;
        }

        @Override
        public NetuneiGoremSholech getNetuneiGoremSholech() {
            return netuneiGoremSholech;
        }

        public void setNetuneiGoremSholech(NetuneiGoremSholech value) {
            this.netuneiGoremSholech = value;
        }

        @Override
        public NetuneiGoremNimaan getNetuneiGoremNimaan() {
            return netuneiGoremNimaan;
        }

        public void setNetuneiGoremNimaan(NetuneiGoremNimaan value) {
            this.netuneiGoremNimaan = value;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "kodnimaan",
            "sugmezahenimaan",
            "misparzihuinimaan",
            "misparzihuietzelyatzrannimaan"
        })
        public static class NetuneiGoremNimaan implements NetuneiGoremNimaanBase {

            @XmlElement(name = "KOD-NIMAAN")
            protected int kodnimaan;
            @XmlElement(name = "SUG-MEZAHE-NIMAAN")
            protected int sugmezahenimaan;
            @XmlElement(name = "MISPAR-ZIHUI-NIMAAN", required = true)
            protected String misparzihuinimaan;
            @XmlElement(name = "MISPAR-ZIHUI-ETZEL-YATZRAN-NIMAAN", required = true, nillable = true)
            protected String misparzihuietzelyatzrannimaan;

            @Override
            public int getKODNIMAAN() {
                return kodnimaan;
            }
            public void setKODNIMAAN(int value) {
                this.kodnimaan = value;
            }

            @Override
            public int getSUGMEZAHENIMAAN() {
                return sugmezahenimaan;
            }

            public void setSUGMEZAHENIMAAN(int value) {
                this.sugmezahenimaan = value;
            }

            @Override
            public String getMISPARZIHUINIMAAN() {
                return misparzihuinimaan;
            }

            public void setMISPARZIHUINIMAAN(String value) {
                this.misparzihuinimaan = value;
            }

            @Override
            public String getMISPARZIHUIETZELYATZRANNIMAAN() {
                return misparzihuietzelyatzrannimaan;
            }

            public void setMISPARZIHUIETZELYATZRANNIMAAN(String value) {
                this.misparzihuietzelyatzrannimaan = value;
            }

        }


        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "kodsholech",
            "sugmezahesholech",
            "misparzihuisholech",
            "shemgoremsholech",
            "shempratiishkeshersholech",
            "shemmishpachaishkeshersholech",
            "mispartelephonekaviishkeshersholech",
            "emailishkeshersholech",
            "misparcellulariishkeshersholech",
            "misparzihuietzelyatzrannimaan"
        })
        public static class NetuneiGoremSholech implements NetuneiGoremSholechBase {

            @XmlElement(name = "KOD-SHOLECH")
            protected int kodsholech;
            @XmlElement(name = "SUG-MEZAHE-SHOLECH")
            protected int sugmezahesholech;
            @XmlElement(name = "MISPAR-ZIHUI-SHOLECH", required = true)
            protected String misparzihuisholech;
            @XmlElement(name = "SHEM-GOREM-SHOLECH", required = true)
            protected String shemgoremsholech;
            @XmlElement(name = "SHEM-PRATI-ISH-KESHER-SHOLECH", required = true)
            protected String shempratiishkeshersholech;
            @XmlElement(name = "SHEM-MISHPACHA-ISH-KESHER-SHOLECH", required = true)
            protected String shemmishpachaishkeshersholech;
            @XmlElement(name = "MISPAR-TELEPHONE-KAVI-ISH-KESHER-SHOLECH", required = true)
            protected String mispartelephonekaviishkeshersholech;
            @XmlElement(name = "E-MAIL-ISH-KESHER-SHOLECH", required = true)
            protected String emailishkeshersholech;
            @XmlElement(name = "MISPAR-CELLULARI-ISH-KESHER-SHOLECH", required = true, nillable = true)
            protected String misparcellulariishkeshersholech;
            @XmlElement(name = "MISPAR-ZIHUI-ETZEL-YATZRAN-NIMAAN", required = true, nillable = true)
            protected String misparzihuietzelyatzrannimaan;

            @Override
            public int getKODSHOLECH() {
                return kodsholech;
            }

            public void setKODSHOLECH(int value) {
                this.kodsholech = value;
            }

            @Override
            public int getSUGMEZAHESHOLECH() {
                return sugmezahesholech;
            }

            public void setSUGMEZAHESHOLECH(int value) {
                this.sugmezahesholech = value;
            }

            @Override
            public String getMISPARZIHUISHOLECH() {
                return misparzihuisholech;
            }
            
            public void setMISPARZIHUISHOLECH(String value) {
                this.misparzihuisholech = value;
            }

            @Override
            public String getSHEMGOREMSHOLECH() {
                return shemgoremsholech;
            }

            public void setSHEMGOREMSHOLECH(String value) {
                this.shemgoremsholech = value;
            }

            @Override
            public String getSHEMPRATIISHKESHERSHOLECH() {
                return shempratiishkeshersholech;
            }

            public void setSHEMPRATIISHKESHERSHOLECH(String value) {
                this.shempratiishkeshersholech = value;
            }

            @Override
            public String getSHEMMISHPACHAISHKESHERSHOLECH() {
                return shemmishpachaishkeshersholech;
            }

            public void setSHEMMISHPACHAISHKESHERSHOLECH(String value) {
                this.shemmishpachaishkeshersholech = value;
            }
            
            @Override
            public String getMISPARTELEPHONEKAVIISHKESHERSHOLECH() {
                return mispartelephonekaviishkeshersholech;
            }

            public void setMISPARTELEPHONEKAVIISHKESHERSHOLECH(String value) {
                this.mispartelephonekaviishkeshersholech = value;
            }

            @Override
            public String getEMAILISHKESHERSHOLECH() {
                return emailishkeshersholech;
            }

            public void setEMAILISHKESHERSHOLECH(String value) {
                this.emailishkeshersholech = value;
            }
            
            @Override
            public String getMISPARCELLULARIISHKESHERSHOLECH() {
                return misparcellulariishkeshersholech;
            }

            public void setMISPARCELLULARIISHKESHERSHOLECH(String value) {
                this.misparcellulariishkeshersholech = value;
            }

            @Override
            public String getMISPARZIHUIETZELYATZRANNIMAAN() {
                return misparzihuietzelyatzrannimaan;
            }

            public void setMISPARZIHUIETZELYATZRANNIMAAN(String value) {
                this.misparzihuietzelyatzrannimaan = value;
            }

        }

    }

    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "misparyeshuyutlakoachbakovetz",
        "misparbakashot"
    })
    public static class ReshumatSgira implements ReshumatSgiraBase {

        @XmlElement(name = "MISPAR-YESHUYUT-LAKOACH-BAKOVETZ")
        protected int misparyeshuyutlakoachbakovetz;
        @XmlElement(name = "MISPAR-BAKASHOT")
        protected int misparbakashot;

        @Override
        public int getMISPARYESHUYUTLAKOACHBAKOVETZ() {
            return misparyeshuyutlakoachbakovetz;
        }

        public void setMISPARYESHUYUTLAKOACHBAKOVETZ(int value) {
            this.misparyeshuyutlakoachbakovetz = value;
        }
        
        @Override
        public int getMISPARBAKASHOT() {
            return misparbakashot;
        }

        public void setMISPARBAKASHOT(int value) {
            this.misparbakashot = value;
        }

    }
    

}
