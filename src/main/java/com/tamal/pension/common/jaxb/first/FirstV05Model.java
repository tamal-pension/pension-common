package com.tamal.pension.common.jaxb.first;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.base.MoreObjects;
import com.tamal.pension.common.jaxb.KoteretKovetzBase;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "koteretKovetz", "gufHamimshak" })

@XmlRootElement(name = "Mimshak")
public class FirstV05Model implements FirstModel {

	@XmlElement(name = "KoteretKovetz", required = true)
	protected FirstV05Model.KoteretKovetz koteretKovetz;
	@XmlElement(name = "GufHamimshak", required = true)
	protected GufHamimshak gufHamimshak;

	@Override
	public FirstV05Model.KoteretKovetz getKoteretKovetz() {
		return koteretKovetz;
	}

	public void setKoteretKovetz(FirstV05Model.KoteretKovetz value) {
		this.koteretKovetz = value;
	}

	@Override
	public GufHamimshak getGufHamimshak() {
		return gufHamimshak;
	}

	public void setGufHamimshak(GufHamimshak value) {
		this.gufHamimshak = value;
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "yeshutGoremPoneLemislaka" })

	public static class GufHamimshak implements GufHamimshakBase {

		@XmlElement(name = "YeshutGoremPoneLemislaka", required = true)
		protected List<FirstV05Model.GufHamimshak.YeshutGoremPoneLemislaka> yeshutGoremPoneLemislaka;

		@Override
		public List<FirstV05Model.GufHamimshak.YeshutGoremPoneLemislaka> getYeshutGoremPoneLemislaka() {
			if (yeshutGoremPoneLemislaka == null) {
				yeshutGoremPoneLemislaka = new ArrayList<FirstV05Model.GufHamimshak.YeshutGoremPoneLemislaka>();
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
            "sugMashov"
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
			@XmlElement(name = "SugMashov", required = true)
			protected List<FirstV05Model.GufHamimshak.YeshutGoremPoneLemislaka.SugMashov> sugMashov;

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
			public List<FirstV05Model.GufHamimshak.YeshutGoremPoneLemislaka.SugMashov> getSugMashov() {
				if (sugMashov == null) {
					sugMashov = new ArrayList<FirstV05Model.GufHamimshak.YeshutGoremPoneLemislaka.SugMashov>();
				}
				return this.sugMashov;
			}

			@XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "sugmimshaklegabavmuavarhizunchozer",
                "shemhakovetz",
                "misparhakovetz",
                "ramatmashov",
                "sugmashov",
                "mashovBeramatKovetz",
                "mashovBeramatReshuma"
            })
			public static class SugMashov implements SugMashovBase {

				@XmlElement(name = "SUG-MIMSHAK-LEGABAV-MUAVAR-HIZUN-CHOZER")
				protected int sugmimshaklegabavmuavarhizunchozer;
				@XmlElement(name = "SHEM-HAKOVETZ", required = true)
				protected String shemhakovetz;
				@XmlElement(name = "MISPAR-HAKOVETZ", required = true)
				protected String misparhakovetz;
				@XmlElement(name = "RAMAT-MASHOV")
				protected int ramatmashov;
				@XmlElement(name = "SUG-MASHOV")
				protected int sugmashov;
				@XmlElement(name = "MashovBeramatKovetz")
				protected MashovBeramatKovetz mashovBeramatKovetz;
				@XmlElement(name = "MashovBeramatReshuma")
				protected List<FirstV05Model.GufHamimshak.YeshutGoremPoneLemislaka.SugMashov.MashovBeramatReshuma> mashovBeramatReshuma;

				@Override
				public int getSUGMIMSHAKLEGABAVMUAVARHIZUNCHOZER() {
					return sugmimshaklegabavmuavarhizunchozer;
				}

				public void setSUGMIMSHAKLEGABAVMUAVARHIZUNCHOZER(int value) {
					this.sugmimshaklegabavmuavarhizunchozer = value;
				}

				@Override
				public String getSHEMHAKOVETZ() {
					return shemhakovetz;
				}

				public void setSHEMHAKOVETZ(String value) {
					this.shemhakovetz = value;
				}

				@Override
				public String getMISPARHAKOVETZ() {
					return misparhakovetz;
				}

				public void setMISPARHAKOVETZ(String value) {
					this.misparhakovetz = value;
				}

				@Override
				public int getRAMATMASHOV() {
					return ramatmashov;
				}

				public void setRAMATMASHOV(int value) {
					this.ramatmashov = value;
				}

				@Override
				public int getSUGMASHOV() {
					return sugmashov;
				}

				public void setSUGMASHOV(int value) {
					this.sugmashov = value;
				}


				@Override
				public MashovBeramatKovetz getMashovBeramatKovetz() {
					return mashovBeramatKovetz;
				}

				public void setMashovBeramatKovetz(
						MashovBeramatKovetz value) {
					this.mashovBeramatKovetz = value;
				}

				@Override
				public List<FirstV05Model.GufHamimshak.YeshutGoremPoneLemislaka.SugMashov.MashovBeramatReshuma> getMashovBeramatReshuma() {
					if (mashovBeramatReshuma == null) {
						mashovBeramatReshuma = new ArrayList<FirstV05Model.GufHamimshak.YeshutGoremPoneLemislaka.SugMashov.MashovBeramatReshuma>();
					}
					return this.mashovBeramatReshuma;
				}

				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = { "kodshgiha", "perutShgihaBeramatKovetz" })
				public static class MashovBeramatKovetz implements MashovBeramatKovetzBase {

					@XmlElement(name = "KOD-SHGIHA")
					protected int kodshgiha;
					@XmlElement(name = "PerutShgihaBeramatKovetz")
					protected List<FirstV05Model.GufHamimshak.YeshutGoremPoneLemislaka.SugMashov.MashovBeramatKovetz.PerutShgihaBeramatKovetz> perutShgihaBeramatKovetz;

					@Override
					public int getKODSHGIHA() {
						return kodshgiha;
					}

					public void setKODSHGIHA(int value) {
						this.kodshgiha = value;
					}

					@Override
					public List<FirstV05Model.GufHamimshak.YeshutGoremPoneLemislaka.SugMashov.MashovBeramatKovetz.PerutShgihaBeramatKovetz> getPerutShgihaBeramatKovetz() {
						if (perutShgihaBeramatKovetz == null) {
							perutShgihaBeramatKovetz = new ArrayList<FirstV05Model.GufHamimshak.YeshutGoremPoneLemislaka.SugMashov.MashovBeramatKovetz.PerutShgihaBeramatKovetz>();
						}
						return this.perutShgihaBeramatKovetz;
					}

					@XmlAccessorType(XmlAccessType.FIELD)
					@XmlType(name = "", propOrder = { "perutshgihaberamatkovetz" })
					public static class PerutShgihaBeramatKovetz implements PerutShgihaBeramatKovetzBase {

						@XmlElement(name = "PERUT-SHGIHA-BERAMAT-KOVETZ", required = true, nillable = true)
						protected String perutshgihaberamatkovetz;

						@Override
						public String getPERUTSHGIHABERAMATKOVETZ() {
							return perutshgihaberamatkovetz;
						}

						public void setPERUTSHGIHABERAMATKOVETZ(String value) {
							this.perutshgihaberamatkovetz = value;
						}

					}

				}

				@XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "misparmislaka",
                    "misparmezahereshuma",
                    "statusreshuma",
                    "kodshgihaberamatreshuma",
                    "maaneMiYazran",
                    "perutShgihaBeramatReshuma"
                })
				public static class MashovBeramatReshuma implements MashovBeramatReshumaBase {

					@XmlElement(name = "MISPAR-MISLAKA", required = true, nillable = true)
					protected String misparmislaka;
					@XmlElement(name = "MISPAR-MEZAHE-RESHUMA", required = true)
					protected String misparmezahereshuma;
					@XmlElement(name = "STATUS-RESHUMA")
					protected int statusreshuma;
					@XmlElement(name = "KOD-SHGIHA-BERAMAT-RESHUMA", required = true, type = Integer.class, nillable = true)
					protected Integer kodshgihaberamatreshuma;
					@XmlElement(name = "MaaneMiYazran")
					protected List<FirstV05Model.GufHamimshak.YeshutGoremPoneLemislaka.SugMashov.MashovBeramatReshuma.MaaneMiYazran> maaneMiYazran;
					@XmlElement(name = "PerutShgihaBeramatReshuma")
					protected List<FirstV05Model.GufHamimshak.YeshutGoremPoneLemislaka.SugMashov.MashovBeramatReshuma.PerutShgihaBeramatReshuma> perutShgihaBeramatReshuma;

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
					public int getSTATUSRESHUMA() {
						return statusreshuma;
					}

					public void setSTATUSRESHUMA(int value) {
						this.statusreshuma = value;
					}

					@Override
					public Integer getKODSHGIHABERAMATRESHUMA() {
						return kodshgihaberamatreshuma;
					}

					public void setKODSHGIHABERAMATRESHUMA(Integer value) {
						this.kodshgihaberamatreshuma = value;
					}

					@Override
					public List<FirstV05Model.GufHamimshak.YeshutGoremPoneLemislaka.SugMashov.MashovBeramatReshuma.MaaneMiYazran> getMaaneMiYazran() {
						if (maaneMiYazran == null) {
							maaneMiYazran = new ArrayList<FirstV05Model.GufHamimshak.YeshutGoremPoneLemislaka.SugMashov.MashovBeramatReshuma.MaaneMiYazran>();
						}
						return this.maaneMiYazran;
					}

					@Override
					public List<FirstV05Model.GufHamimshak.YeshutGoremPoneLemislaka.SugMashov.MashovBeramatReshuma.PerutShgihaBeramatReshuma> getPerutShgihaBeramatReshuma() {
						if (perutShgihaBeramatReshuma == null) {
							perutShgihaBeramatReshuma = new ArrayList<FirstV05Model.GufHamimshak.YeshutGoremPoneLemislaka.SugMashov.MashovBeramatReshuma.PerutShgihaBeramatReshuma>();
						}
						return this.perutShgihaBeramatReshuma;
					}

					@XmlAccessorType(XmlAccessType.FIELD)
					@XmlType(name = "", propOrder = { "maaneberamatreshuma" })
					public static class MaaneMiYazran implements MaaneMiYazranBase {

						@XmlElement(name = "MAANE-BERAMAT-RESHUMA")
						protected int maaneberamatreshuma;

						@Override
						public int getMAANEBERAMATRESHUMA() {
							return maaneberamatreshuma;
						}

						public void setMAANEBERAMATRESHUMA(int value) {
							this.maaneberamatreshuma = value;
						}

					}

					@XmlAccessorType(XmlAccessType.FIELD)
					@XmlType(name = "", propOrder = { "perutshgihaberamatreshuma" })
					public static class PerutShgihaBeramatReshuma implements PerutShgihaBeramatReshumaBase {

						@XmlElement(name = "PERUT-SHGIHA-BERAMAT-RESHUMA", required = true)
						protected String perutshgihaberamatreshuma;

						@Override
						public String getPERUTSHGIHABERAMATRESHUMA() {
							return perutshgihaberamatreshuma;
						}

						public void setPERUTSHGIHABERAMATRESHUMA(String value) {
							this.perutshgihaberamatreshuma = value;
						}
					}
					
					@Override
					@JsonIgnore
					public List<? extends YipuiKoachBase> getYipuiKoach(){
						return null;
					}
				}

				@Override
				@JsonIgnore
				public Integer getSugdivuach() {
					return null;
				}

				@Override
				@JsonIgnore
				public Integer getKamutreshumottkinot() {
					return null;
				}

				@Override
				@JsonIgnore
				public Integer getKamutreshumotkolel() {
					return null;
				}

			}

			@Override
			@JsonIgnore
			public String getMISPARZIHUIETZELYATZRANNIMAAN() {
				return null;
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
		protected FirstV05Model.KoteretKovetz.NetuneiGoremSholech netuneiGoremSholech;
		@XmlElement(name = "NetuneiGoremNimaan", required = true)
		protected FirstV05Model.KoteretKovetz.NetuneiGoremNimaan netuneiGoremNimaan;

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
		public FirstV05Model.KoteretKovetz.NetuneiGoremSholech getNetuneiGoremSholech() {
			return netuneiGoremSholech;
		}

		public void setNetuneiGoremSholech(FirstV05Model.KoteretKovetz.NetuneiGoremSholech value) {
			this.netuneiGoremSholech = value;
		}

		@Override
		public FirstV05Model.KoteretKovetz.NetuneiGoremNimaan getNetuneiGoremNimaan() {
			return netuneiGoremNimaan;
		}

		public void setNetuneiGoremNimaan(FirstV05Model.KoteretKovetz.NetuneiGoremNimaan value) {
			this.netuneiGoremNimaan = value;
		}

		@XmlAccessorType(XmlAccessType.FIELD)
		 @XmlType(name = "", propOrder = {
            "kodnimaan",
            "sugmezahenimaan",
            "misparzihuinimaan",
            "misparzihuietzelyatzrannimaan"
        })
		public static class NetuneiGoremNimaan implements KoteretKovetzBase.NetuneiGoremNimaanBase {

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
            "misparcellulariishkeshersholech"
        })
		public static class NetuneiGoremSholech implements KoteretKovetzBase.NetuneiGoremSholechBase {

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
			@JsonIgnore
			public String getMISPARZIHUIETZELYATZRANNIMAAN() {
				return null;
			}

		}
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).toString();
	}
}
