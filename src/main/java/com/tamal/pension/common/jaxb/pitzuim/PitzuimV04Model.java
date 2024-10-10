
package com.tamal.pension.common.jaxb.pitzuim;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import com.tamal.pension.common.jaxb.KoteretKovetzBase;
import com.tamal.pension.common.jaxb.KoteretKovetzBase.NetuneiGoremNimaanBase;
import com.tamal.pension.common.jaxb.KoteretKovetzBase.NetuneiGoremSholechBase;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "koteretKovetz",
    "gufHamimshak",
    "reshumatSgira"
})
@XmlRootElement(name = "MimshakPitzuin")
public class PitzuimV04Model implements PitzuimModel{

    @XmlElement(name = "KoteretKovetz", required = true)
    protected PitzuimV04Model.KoteretKovetz koteretKovetz;
    @XmlElement(name = "GufHamimshak", required = true)
    protected PitzuimV04Model.GufHamimshak gufHamimshak;
    @XmlElement(name = "ReshumatSgira", required = true)
    protected PitzuimV04Model.ReshumatSgira reshumatSgira;

    @Override
    public KoteretKovetz getKoteretKovetz() {
        return koteretKovetz;
    }

    public void setKoteretKovetz(PitzuimV04Model.KoteretKovetz value) {
        this.koteretKovetz = value;
    }

    @Override
    public PitzuimV04Model.GufHamimshak getGufHamimshak() {
        return gufHamimshak;
    }

    public void setGufHamimshak(PitzuimV04Model.GufHamimshak value) {
        this.gufHamimshak = value;
    }

    @Override
    public PitzuimV04Model.ReshumatSgira getReshumatSgira() {
        return reshumatSgira;
    }

    public void setReshumatSgira(PitzuimV04Model.ReshumatSgira value) {
        this.reshumatSgira = value;
    }


    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "yeshutGoremPoneLemislaka"
    })
    public static class GufHamimshak implements GufHamimshakBase {

        @XmlElement(name = "YeshutGoremPoneLemislaka", required = true)
        protected List<PitzuimV04Model.GufHamimshak.YeshutGoremPoneLemislaka> yeshutGoremPoneLemislaka;

        @Override
        public List<PitzuimV04Model.GufHamimshak.YeshutGoremPoneLemislaka> getYeshutGoremPoneLemislaka() {
            if (yeshutGoremPoneLemislaka == null) {
                yeshutGoremPoneLemislaka = new ArrayList<PitzuimV04Model.GufHamimshak.YeshutGoremPoneLemislaka>();
            }
            return this.yeshutGoremPoneLemislaka;
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
            "misparzihuietzelyatzrannimaan",
            "pirteiMaasik"
        })
        public static class YeshutGoremPoneLemislaka implements YeshutGoremPoneLemislakaBase {

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
            @XmlElement(name = "MISPAR-ZIHUI-ETZEL-YATZRAN-NIMAAN", required = true, nillable = true)
            protected String misparzihuietzelyatzrannimaan;
            @XmlElement(name = "PirteiMaasik", required = true)
            protected List<PitzuimV04Model.GufHamimshak.YeshutGoremPoneLemislaka.PirteiMaasik> pirteiMaasik;

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
            public String getMISPARZIHUIETZELYATZRANNIMAAN() {
                return misparzihuietzelyatzrannimaan;
            }
            
            public void setMISPARZIHUIETZELYATZRANNIMAAN(String value) {
                this.misparzihuietzelyatzrannimaan = value;
            }

            @Override
            public List<PitzuimV04Model.GufHamimshak.YeshutGoremPoneLemislaka.PirteiMaasik> getPirteiMaasik() {
                if (pirteiMaasik == null) {
                    pirteiMaasik = new ArrayList<PitzuimV04Model.GufHamimshak.YeshutGoremPoneLemislaka.PirteiMaasik>();
                }
                return this.pirteiMaasik;
            }

            
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "sugmezahemaasik",
                "misparmezahemaasik",
                "kodmezahemaasiketzelyatzran",
                "shemmaasik",
                "sivugmaasik",
                "kodmezaheyatzran",
                "shemyatzran",
                "mispartiknikuiim",
                "pirteiOved"
            })
            public static class PirteiMaasik implements PirteiMaasikBase{

                @XmlElement(name = "SUG-MEZAHE-MAASIK")
                protected int sugmezahemaasik;
                @XmlElement(name = "MISPAR-MEZAHE-MAASIK", required = true)
                protected String misparmezahemaasik;
                @XmlElement(name = "KOD-MEZAHE-MAASIK-ETZEL-YATZRAN", required = true, nillable = true)
                protected String kodmezahemaasiketzelyatzran;
                @XmlElement(name = "SHEM-MAASIK", required = true, nillable = true)
                protected String shemmaasik;
                @XmlElement(name = "SIVUG-MAASIK")
                protected int sivugmaasik;
                @XmlElement(name = "KOD-MEZAHE-YATZRAN", required = true)
                protected String kodmezaheyatzran;
                @XmlElement(name = "SHEM-YATZRAN", required = true)
                protected String shemyatzran;
                @XmlElement(name = "MISPAR-TIK-NIKUIIM")
                protected int mispartiknikuiim;
                @XmlElement(name = "PirteiOved", required = true)
                protected List<PitzuimV04Model.GufHamimshak.YeshutGoremPoneLemislaka.PirteiMaasik.PirteiOved> pirteiOved;

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
                public String getKODMEZAHEMAASIKETZELYATZRAN() {
                    return kodmezahemaasiketzelyatzran;
                }

                
                public void setKODMEZAHEMAASIKETZELYATZRAN(String value) {
                    this.kodmezahemaasiketzelyatzran = value;
                }

                @Override
                public String getSHEMMAASIK() {
                    return shemmaasik;
                }

                public void setSHEMMAASIK(String value) {
                    this.shemmaasik = value;
                }

                @Override
                public int getSIVUGMAASIK() {
                    return sivugmaasik;
                }

                public void setSIVUGMAASIK(int value) {
                    this.sivugmaasik = value;
                }

                @Override
                public String getKODMEZAHEYATZRAN() {
                    return kodmezaheyatzran;
                }

                public void setKODMEZAHEYATZRAN(String value) {
                    this.kodmezaheyatzran = value;
                }

                @Override
                public String getSHEMYATZRAN() {
                    return shemyatzran;
                }

                public void setSHEMYATZRAN(String value) {
                    this.shemyatzran = value;
                }

                @Override
                public int getMISPARTIKNIKUIIM() {
                    return mispartiknikuiim;
                }

                public void setMISPARTIKNIKUIIM(int value) {
                    this.mispartiknikuiim = value;
                }

                @Override
                public List<PitzuimV04Model.GufHamimshak.YeshutGoremPoneLemislaka.PirteiMaasik.PirteiOved> getPirteiOved() {
                    if (pirteiOved == null) {
                        pirteiOved = new ArrayList<PitzuimV04Model.GufHamimshak.YeshutGoremPoneLemislaka.PirteiMaasik.PirteiOved>();
                    }
                    return this.pirteiOved;
                }


                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "sugmezaheoved",
                    "misparmezaheoved",
                    "shemprati",
                    "shemmishpacha",
                    "taaricherechyitrot",
                    "misparmislaka",
                    "misparmezahereshuma",
                    "shemkovetzmekori",
                    "misparshuramekori",
                    "reservamislaka",
                    "sachKaspeiPitzuimOvedBemutzar"
                })
                public static class PirteiOved implements PirteiOvedBase {

                    @XmlElement(name = "SUG-MEZAHE-OVED")
                    protected int sugmezaheoved;
                    @XmlElement(name = "MISPAR-MEZAHE-OVED", required = true)
                    protected String misparmezaheoved;
                    @XmlElement(name = "SHEM-PRATI", required = true)
                    protected String shemprati;
                    @XmlElement(name = "SHEM-MISHPACHA", required = true)
                    protected String shemmishpacha;
                    @XmlElement(name = "TAARICH-ERECH-YITROT", required = true)
                    protected String taaricherechyitrot;
                    @XmlElement(name = "MISPAR-MISLAKA", required = true, nillable = true)
                    protected String misparmislaka;
                    @XmlElement(name = "MISPAR-MEZAHE-RESHUMA", required = true, nillable = true)
                    protected String misparmezahereshuma;
                    @XmlElement(name = "SHEM-KOVETZ-MEKORI", required = true, nillable = true)
                    protected String shemkovetzmekori;
                    @XmlElement(name = "MISPAR-SHURA-MEKORI", required = true, nillable = true)
                    protected String misparshuramekori;
                    @XmlElement(name = "RESERVA-MISLAKA", required = true, nillable = true)
                    protected String reservamislaka;
                    @XmlElement(name = "SachKaspeiPitzuimOvedBemutzar", required = true)
                    protected List<PitzuimV04Model.GufHamimshak.YeshutGoremPoneLemislaka.PirteiMaasik.PirteiOved.SachKaspeiPitzuimOvedBemutzar> sachKaspeiPitzuimOvedBemutzar;

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
                    public String getTAARICHERECHYITROT() {
                        return taaricherechyitrot;
                    }

                    public void setTAARICHERECHYITROT(String value) {
                        this.taaricherechyitrot = value;
                    }

                    @Override
                    public String getMISPARMISLAKA() {
                        return misparmislaka;
                    }

                    public void setMISPARMISLAKA(String value) {
                        this.misparmislaka = value;
                    }

                    @Override
                    public String getMISPARMEZAHERESHUMA() {
                        return misparmezahereshuma;
                    }

                    public void setMISPARMEZAHERESHUMA(String value) {
                        this.misparmezahereshuma = value;
                    }

                    @Override
                    public String getSHEMKOVETZMEKORI() {
                        return shemkovetzmekori;
                    }

                    public void setSHEMKOVETZMEKORI(String value) {
                        this.shemkovetzmekori = value;
                    }

                    @Override
                    public String getMISPARSHURAMEKORI() {
                        return misparshuramekori;
                    }

                    public void setMISPARSHURAMEKORI(String value) {
                        this.misparshuramekori = value;
                    }

                    @Override
                    public String getRESERVAMISLAKA() {
                        return reservamislaka;
                    }

                    public void setRESERVAMISLAKA(String value) {
                        this.reservamislaka = value;
                    }
                    
                    @Override
                    public List<PitzuimV04Model.GufHamimshak.YeshutGoremPoneLemislaka.PirteiMaasik.PirteiOved.SachKaspeiPitzuimOvedBemutzar> getSachKaspeiPitzuimOvedBemutzar() {
                        if (sachKaspeiPitzuimOvedBemutzar == null) {
                            sachKaspeiPitzuimOvedBemutzar = new ArrayList<PitzuimV04Model.GufHamimshak.YeshutGoremPoneLemislaka.PirteiMaasik.PirteiOved.SachKaspeiPitzuimOvedBemutzar>();
                        }
                        return this.sachKaspeiPitzuimOvedBemutzar;
                    }


                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "sugmutzarpensioni",
                        "misparkupa",
                        "erechpidionpitzuimmaasiknochechi",
                        "erechpidionpitzuimmaasiknochechilemas",
                        "erechpidionpitzuimpturim",
                        "kodpitzuim",
                        "kodshiharuchyitra",
                        "misparpolisaoheshbon",
                        "taarichtzviramaasik",
                        "taarichhafkadarishona",
                        "taarichhafkadaachrona",
                        "mamadkaspeipitzuim",
                        "taarichtokef",
                        "sachakolerechpidionpitzuimadknisaletokef",
                        "taarichmadadyitra",
                        "madadyitranekudot",
                        "shiaruchpitzuimmitztaberbemadadmechirim",
                        "shiaruchpitzuimmitztaberbemadadhashkaot",
                        "itratpitzuimseif97AA4",
                        "itratpitzuimseif97AZAD2000",
                        "itratpitzuimseif97AZM2000"
                    })
                    public static class SachKaspeiPitzuimOvedBemutzar implements SachKaspeiPitzuimOvedBemutzarBase{

                        @XmlElement(name = "SUG-MUTZAR-PENSIONI")
                        protected int sugmutzarpensioni;
                        @XmlElement(name = "MISPAR-KUPA", required = true)
                        protected String misparkupa;
                        @XmlElement(name = "ERECH-PIDION-PITZUIM-MAASIK-NOCHECHI", required = true)
                        protected BigDecimal erechpidionpitzuimmaasiknochechi;
                        @XmlElement(name = "ERECH-PIDION-PITZUIM-MAASIK-NOCHECHI-LEMAS", required = true, nillable = true)
                        protected BigDecimal erechpidionpitzuimmaasiknochechilemas;
                        @XmlElement(name = "ERECH-PIDION-PITZUIM-PTURIM", required = false)
                        protected BigDecimal erechpidionpitzuimpturim;
                        @XmlElement(name = "KOD-PITZUIM")
                        protected int kodpitzuim;
                        @XmlElement(name = "KOD-SHIHARUCH-YITRA", required = true, type = Integer.class, nillable = true)
                        protected Integer kodshiharuchyitra;
                        @XmlElement(name = "MISPAR-POLISA-O-HESHBON", required = true)
                        protected String misparpolisaoheshbon;
                        @XmlElement(name = "TAARICH-TZVIRA-MAASIK", required = true)
                        protected String taarichtzviramaasik;
                        @XmlElement(name = "TAARICH-HAFKADA-RISHONA", required = true, nillable = true)
                        protected String taarichhafkadarishona;
                        @XmlElement(name = "TAARICH-HAFKADA-ACHRONA", required = true)
                        protected String taarichhafkadaachrona;
                        @XmlElement(name = "MAMAD-KASPEI-PITZUIM", required = true, type = Integer.class, nillable = true)
                        protected Integer mamadkaspeipitzuim;
                        @XmlElement(name = "TAARICH-TOKEF", required = true, nillable = true)
                        protected String taarichtokef;
                        @XmlElement(name = "SACH-AKOL-ERECH-PIDION-PITZUIM-AD-KNISA-LETOKEF", required = true, nillable = true)
                        protected BigDecimal sachakolerechpidionpitzuimadknisaletokef;
                        @XmlElement(name = "TAARICH-MADAD-YITRA", required = true, nillable = true)
                        protected String taarichmadadyitra;
                        @XmlElement(name = "MADAD-YITRA-NEKUDOT", required = true, nillable = true)
                        protected BigDecimal madadyitranekudot;
                        @XmlElement(name = "SHIARUCH-PITZUIM-MITZTABER-BEMADAD-MECHIRIM", required = true, nillable = true)
                        protected BigDecimal shiaruchpitzuimmitztaberbemadadmechirim;
                        @XmlElement(name = "SHIARUCH-PITZUIM-MITZTABER-BEMADAD-HASHKAOT", required = true, nillable = true)
                        protected BigDecimal shiaruchpitzuimmitztaberbemadadhashkaot;
                        @XmlElement(name = "ITRAT-PITZUIM-SEIF-9-7A-A-4", required = true, nillable = true)
                        protected BigDecimal itratpitzuimseif97AA4;
                        @XmlElement(name = "ITRAT-PITZUIM-SEIF-9-7A-Z-AD2000", required = true, nillable = true)
                        protected BigDecimal itratpitzuimseif97AZAD2000;
                        @XmlElement(name = "ITRAT-PITZUIM-SEIF-9-7A-Z-M2000", required = true, nillable = true)
                        protected BigDecimal itratpitzuimseif97AZM2000;

                        @Override
                        public int getSUGMUTZARPENSIONI() {
                            return sugmutzarpensioni;
                        }

                        public void setSUGMUTZARPENSIONI(int value) {
                            this.sugmutzarpensioni = value;
                        }

                        @Override
                        public String getMISPARKUPA() {
                            return misparkupa;
                        }

                        public void setMISPARKUPA(String value) {
                            this.misparkupa = value;
                        }

                        @Override
                        public BigDecimal getERECHPIDIONPITZUIMMAASIKNOCHECHI() {
                            return erechpidionpitzuimmaasiknochechi;
                        }

                        public void setERECHPIDIONPITZUIMMAASIKNOCHECHI(BigDecimal value) {
                            this.erechpidionpitzuimmaasiknochechi = value;
                        }

                        @Override
                        public BigDecimal getERECHPIDIONPITZUIMMAASIKNOCHECHILEMAS() {
                            return erechpidionpitzuimmaasiknochechilemas;
                        }

                        public void setERECHPIDIONPITZUIMMAASIKNOCHECHILEMAS(BigDecimal value) {
                            this.erechpidionpitzuimmaasiknochechilemas = value;
                        }

                        @Override
                        public BigDecimal getERECHPIDIONPITZUIMPTURIM() {
                            return erechpidionpitzuimpturim;
                        }

                        public void setERECHPIDIONPITZUIMPTURIM(BigDecimal value) {
                            this.erechpidionpitzuimpturim = value;
                        }

                        @Override
                        public int getKODPITZUIM() {
                            return kodpitzuim;
                        }

                        public void setKODPITZUIM(int value) {
                            this.kodpitzuim = value;
                        }

                        @Override
                        public Integer getKODSHIHARUCHYITRA() {
                            return kodshiharuchyitra;
                        }

                        public void setKODSHIHARUCHYITRA(Integer value) {
                            this.kodshiharuchyitra = value;
                        }

                        @Override
                        public String getMISPARPOLISAOHESHBON() {
                            return misparpolisaoheshbon;
                        }

                        public void setMISPARPOLISAOHESHBON(String value) {
                            this.misparpolisaoheshbon = value;
                        }

                        @Override
                        public String getTAARICHTZVIRAMAASIK() {
                            return taarichtzviramaasik;
                        }

                        public void setTAARICHTZVIRAMAASIK(String value) {
                            this.taarichtzviramaasik = value;
                        }

                        @Override
                        public String getTAARICHHAFKADARISHONA() {
                            return taarichhafkadarishona;
                        }

                        public void setTAARICHHAFKADARISHONA(String value) {
                            this.taarichhafkadarishona = value;
                        }

                        @Override
                        public String getTAARICHHAFKADAACHRONA() {
                            return taarichhafkadaachrona;
                        }

                        public void setTAARICHHAFKADAACHRONA(String value) {
                            this.taarichhafkadaachrona = value;
                        }

                        @Override
                        public Integer getMAMADKASPEIPITZUIM() {
                            return mamadkaspeipitzuim;
                        }

                        public void setMAMADKASPEIPITZUIM(Integer value) {
                            this.mamadkaspeipitzuim = value;
                        }

                        @Override
                        public String getTAARICHTOKEF() {
                            return taarichtokef;
                        }

                        public void setTAARICHTOKEF(String value) {
                            this.taarichtokef = value;
                        }

                        @Override
                        public BigDecimal getSACHAKOLERECHPIDIONPITZUIMADKNISALETOKEF() {
                            return sachakolerechpidionpitzuimadknisaletokef;
                        }

                        public void setSACHAKOLERECHPIDIONPITZUIMADKNISALETOKEF(BigDecimal value) {
                            this.sachakolerechpidionpitzuimadknisaletokef = value;
                        }

                        @Override
                        public String getTAARICHMADADYITRA() {
                            return taarichmadadyitra;
                        }

                        public void setTAARICHMADADYITRA(String value) {
                            this.taarichmadadyitra = value;
                        }

                        @Override
                        public BigDecimal getMADADYITRANEKUDOT() {
                            return madadyitranekudot;
                        }
                        
                        public void setMADADYITRANEKUDOT(BigDecimal value) {
                            this.madadyitranekudot = value;
                        }

                        @Override
                        public BigDecimal getSHIARUCHPITZUIMMITZTABERBEMADADMECHIRIM() {
                            return shiaruchpitzuimmitztaberbemadadmechirim;
                        }

                        public void setSHIARUCHPITZUIMMITZTABERBEMADADMECHIRIM(BigDecimal value) {
                            this.shiaruchpitzuimmitztaberbemadadmechirim = value;
                        }

                        @Override
                        public BigDecimal getSHIARUCHPITZUIMMITZTABERBEMADADHASHKAOT() {
                            return shiaruchpitzuimmitztaberbemadadhashkaot;
                        }

                        public void setSHIARUCHPITZUIMMITZTABERBEMADADHASHKAOT(BigDecimal value) {
                            this.shiaruchpitzuimmitztaberbemadadhashkaot = value;
                        }
                        
                        @Override
                        public BigDecimal getITRATPITZUIMSEIF97AA4() {
                            return itratpitzuimseif97AA4;
                        }

                        public void setITRATPITZUIMSEIF97AA4(BigDecimal value) {
                            this.itratpitzuimseif97AA4 = value;
                        }

                        @Override
                        public BigDecimal getITRATPITZUIMSEIF97AZAD2000() {
                            return itratpitzuimseif97AZAD2000;
                        }

                        public void setITRATPITZUIMSEIF97AZAD2000(BigDecimal value) {
                            this.itratpitzuimseif97AZAD2000 = value;
                        }

                        @Override
                        public BigDecimal getITRATPITZUIMSEIF97AZM2000() {
                            return itratpitzuimseif97AZM2000;
                        }

                        public void setITRATPITZUIMSEIF97AZM2000(BigDecimal value) {
                            this.itratpitzuimseif97AZM2000 = value;
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
    public static class KoteretKovetz implements KoteretKovetzBase{

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
        protected PitzuimV04Model.KoteretKovetz.NetuneiGoremSholech netuneiGoremSholech;
        @XmlElement(name = "NetuneiGoremNimaan", required = true)
        protected PitzuimV04Model.KoteretKovetz.NetuneiGoremNimaan netuneiGoremNimaan;

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

        public void setNetuneiGoremSholech(PitzuimV04Model.KoteretKovetz.NetuneiGoremSholech value) {
            this.netuneiGoremSholech = value;
        }
        
        @Override
        public PitzuimV04Model.KoteretKovetz.NetuneiGoremNimaan getNetuneiGoremNimaan() {
            return netuneiGoremNimaan;
        }

        public void setNetuneiGoremNimaan(PitzuimV04Model.KoteretKovetz.NetuneiGoremNimaan value) {
            this.netuneiGoremNimaan = value;
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "kodnimaan",
            "sugmezahenimaan",
            "misparzihuinimaan",
            "misparzihuietzelyatzrannimaan"
        })
        public static class NetuneiGoremNimaan implements  NetuneiGoremNimaanBase{

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
        "misparyatzranim",
        "misparmaavidim",
        "misparreshumot",
        "misparovdim"
    })
    public static class ReshumatSgira implements ReshumatSgiraBase {

        @XmlElement(name = "MISPAR-YATZRANIM")
        protected int misparyatzranim;
        @XmlElement(name = "MISPAR-MAAVIDIM")
        protected int misparmaavidim;
        @XmlElement(name = "MISPAR-RESHUMOT")
        protected int misparreshumot;
        @XmlElement(name = "MISPAR-OVDIM", required = true)
        protected BigDecimal misparovdim;

        @Override
        public int getMISPARYATZRANIM() {
            return misparyatzranim;
        }

        public void setMISPARYATZRANIM(int value) {
            this.misparyatzranim = value;
        }

        @Override
        public int getMISPARMAAVIDIM() {
            return misparmaavidim;
        }

        public void setMISPARMAAVIDIM(int value) {
            this.misparmaavidim = value;
        }

        @Override
        public int getMISPARRESHUMOT() {
            return misparreshumot;
        }

        public void setMISPARRESHUMOT(int value) {
            this.misparreshumot = value;
        }

        @Override
        public BigDecimal getMISPAROVDIM() {
            return misparovdim;
        }

        public void setMISPAROVDIM(BigDecimal value) {
            this.misparovdim = value;
        }

    }

}
