package com.tamal.pension.common.jaxb.yearly;

import java.math.BigDecimal;
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
@XmlType(name = "", propOrder = { "koteretKovetz", "gufHamimshak", "reshumatSgira" })
@XmlRootElement(name = "MimshakMaasikimHizunMesakemShnati")
public class YearlyV01Model implements YearlyModel {

	@XmlElement(name = "KoteretKovetz", required = true)
	protected YearlyV01Model.KoteretKovetz koteretKovetz;
	@XmlElement(name = "GufHamimshak", required = true)
	protected GufHamimshak gufHamimshak;
	@XmlElement(name = "ReshumatSgira", required = true)
	protected ReshumatSgira reshumatSgira;

	@Override
	public YearlyV01Model.KoteretKovetz getKoteretKovetz() {
		return koteretKovetz;
	}

	public void setKoteretKovetz(YearlyV01Model.KoteretKovetz value) {
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
	@XmlType(name = "", propOrder = { "yeshutGoremPoneLemislaka" })
	public static class GufHamimshak implements GufHamimshakBase {

		@XmlElement(name = "YeshutGoremPoneLemislaka", required = true)
		protected List<YearlyV01Model.GufHamimshak.YeshutGoremPoneLemislaka> yeshutGoremPoneLemislaka;

		@Override
		public List<YearlyV01Model.GufHamimshak.YeshutGoremPoneLemislaka> getYeshutGoremPoneLemislaka() {
			if (yeshutGoremPoneLemislaka == null) {
				yeshutGoremPoneLemislaka = new ArrayList<YearlyV01Model.GufHamimshak.YeshutGoremPoneLemislaka>();
			}
			return this.yeshutGoremPoneLemislaka;
		}

		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "sugpone", "sugkodmezahepone", "misparmezahepone", "shemgorempone",
				"misparmezahemetafel", "shempratiponelemislaka", "shemmishpachaponelemislaka",
				"mispartelephonekaviponelemislaka", "emailponelemislaka", "misparcellulari",
				"statosPirteiHaavaratKsafim" })
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
			@XmlElement(name = "StatosPirteiHaavaratKsafim", required = true)
			protected List<YearlyV01Model.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim> statosPirteiHaavaratKsafim;

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
			public List<YearlyV01Model.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim> getStatosPirteiHaavaratKsafim() {
				if (statosPirteiHaavaratKsafim == null) {
					statosPirteiHaavaratKsafim = new ArrayList<YearlyV01Model.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim>();
				}
				return this.statosPirteiHaavaratKsafim;
			}

			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "sugmezahemaasik", "misparzihuymaasik", "kodmezahemaasiketzelyatzran",
					"shemmaasik", "shenatdivuhach", "sachhafkadadivuachmaasik", "sachhafkadadivuachshlili",
					"sachhafkadaklitabapoal", "divuachshlilihuchzarlemafkid", "ksafimbecheshbonmahavar",
					"pirteiMutzar" })
			public static class StatosPirteiHaavaratKsafim implements StatosPirteiHaavaratKsafimBase {

				@XmlElement(name = "SUG-MEZAHE-MAASIK")
				protected int sugmezahemaasik;
				@XmlElement(name = "MISPAR-ZIHUY-MAASIK", required = true)
				protected String misparzihuymaasik;
				@XmlElement(name = "KOD-MEZAHE-MAASIK-ETZEL-YATZRAN", required = true, nillable = true)
				protected String kodmezahemaasiketzelyatzran;
				@XmlElement(name = "SHEM-MAASIK", required = true)
				protected String shemmaasik;
				@XmlElement(name = "SHENAT-DIVUHACH")
				protected int shenatdivuhach;
				@XmlElement(name = "SACH-HAFKADA-DIVUACH-MAASIK", required = true)
				protected BigDecimal sachhafkadadivuachmaasik;
				@XmlElement(name = "SACH-HAFKADA-DIVUACH-SHLILI", required = true)
				protected BigDecimal sachhafkadadivuachshlili;
				@XmlElement(name = "SACH-HAFKADA-KLITA-BAPOAL", required = true)
				protected BigDecimal sachhafkadaklitabapoal;
				@XmlElement(name = "DIVUACH-SHLILI-HUCHZAR-LEMAFKID", required = true)
				protected BigDecimal divuachshlilihuchzarlemafkid;
				@XmlElement(name = "KSAFIM-BECHESHBON-MAHAVAR", required = true)
				protected BigDecimal ksafimbecheshbonmahavar;
				@XmlElement(name = "PirteiMutzar", required = true)
				protected List<YearlyV01Model.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim.PirteiMutzar> pirteiMutzar;

				@Override
				@JsonIgnore
				public String getKODMEZAHEKUPAHP() {
					return null;
				};
				
				@Override
				public int getSUGMEZAHEMAASIK() {
					return sugmezahemaasik;
				}

				public void setSUGMEZAHEMAASIK(int value) {
					this.sugmezahemaasik = value;
				}

				@Override
				public String getMISPARZIHUYMAASIK() {
					return misparzihuymaasik;
				}

				public void setMISPARZIHUYMAASIK(String value) {
					this.misparzihuymaasik = value;
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
				public int getSHENATDIVUHACH() {
					return shenatdivuhach;
				}

				public void setSHENATDIVUHACH(int value) {
					this.shenatdivuhach = value;
				}

				@Override
				public BigDecimal getSACHHAFKADADIVUACHMAASIK() {
					return sachhafkadadivuachmaasik;
				}

				public void setSACHHAFKADADIVUACHMAASIK(BigDecimal value) {
					this.sachhafkadadivuachmaasik = value;
				}

				@Override
				public BigDecimal getSACHHAFKADADIVUACHSHLILI() {
					return sachhafkadadivuachshlili;
				}

				public void setSACHHAFKADADIVUACHSHLILI(BigDecimal value) {
					this.sachhafkadadivuachshlili = value;
				}

				@Override
				public BigDecimal getSACHHAFKADAKLITABAPOAL() {
					return sachhafkadaklitabapoal;
				}

				public void setSACHHAFKADAKLITABAPOAL(BigDecimal value) {
					this.sachhafkadaklitabapoal = value;
				}

				@Override
				public BigDecimal getDIVUACHSHLILIHUCHZARLEMAFKID() {
					return divuachshlilihuchzarlemafkid;
				}

				public void setDIVUACHSHLILIHUCHZARLEMAFKID(BigDecimal value) {
					this.divuachshlilihuchzarlemafkid = value;
				}

				@Override
				public BigDecimal getKSAFIMBECHESHBONMAHAVAR() {
					return ksafimbecheshbonmahavar;
				}

				public void setKSAFIMBECHESHBONMAHAVAR(BigDecimal value) {
					this.ksafimbecheshbonmahavar = value;
				}
				
				@Override
				@JsonIgnore
				public String getMISPARMISLAKAACHARON() {
					return null;
				}

				@Override
				public List<YearlyV01Model.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim.PirteiMutzar> getPirteiMutzar() {
					if (pirteiMutzar == null) {
						pirteiMutzar = new ArrayList<YearlyV01Model.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim.PirteiMutzar>();
					}
					return this.pirteiMutzar;
				}

				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = { "sugmutzar", "kodmezahekupa", "sugkerenpensia",
						"misparkupaetzelmaasik", "shemkupaetzelmaasik", "pirteiOved" })
				public static class PirteiMutzar implements PirteiMutzarBase {

					@XmlElement(name = "SUG-MUTZAR")
					protected int sugmutzar;
					@XmlElement(name = "KOD-MEZAHE-KUPA", required = true)
					protected String kodmezahekupa;
					@XmlElement(name = "SUG-KEREN-PENSIA", required = true, type = Integer.class, nillable = true)
					protected Integer sugkerenpensia;
					@XmlElement(name = "MISPAR-KUPA-ETZEL-MAASIK", required = true, nillable = true)
					protected String misparkupaetzelmaasik;
					@XmlElement(name = "SHEM-KUPA-ETZEL-MAASIK", required = true, nillable = true)
					protected String shemkupaetzelmaasik;
					@XmlElement(name = "PirteiOved", required = true)
					protected List<YearlyV01Model.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim.PirteiMutzar.PirteiOved> pirteiOved;

					@Override
					public int getSUGMUTZAR() {
						return sugmutzar;
					}

					public void setSUGMUTZAR(int value) {
						this.sugmutzar = value;
					}

					@Override
					public String getKODMEZAHEKUPA() {
						return kodmezahekupa;
					}

					public void setKODMEZAHEKUPA(String value) {
						this.kodmezahekupa = value;
					}

					@Override
					public Integer getSUGKERENPENSIA() {
						return sugkerenpensia;
					}

					public void setSUGKERENPENSIA(Integer value) {
						this.sugkerenpensia = value;
					}

					@Override
					public String getMISPARKUPAETZELMAASIK() {
						return misparkupaetzelmaasik;
					}

					public void setMISPARKUPAETZELMAASIK(String value) {
						this.misparkupaetzelmaasik = value;
					}

					@Override
					public String getSHEMKUPAETZELMAASIK() {
						return shemkupaetzelmaasik;
					}

					public void setSHEMKUPAETZELMAASIK(String value) {
						this.shemkupaetzelmaasik = value;
					}

					@Override
					public List<YearlyV01Model.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim.PirteiMutzar.PirteiOved> getPirteiOved() {
						if (pirteiOved == null) {
							pirteiOved = new ArrayList<YearlyV01Model.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim.PirteiMutzar.PirteiOved>();
						}
						return this.pirteiOved;
					}

					@XmlAccessorType(XmlAccessType.FIELD)
					@XmlType(name = "", propOrder = { "sugmezaheoved", "misparmezahe", "shemprati", "shemmishpacha",
							"taarichleida", "misparovedetzelmaasik", "sachHafkadotShnatiot" })
					public static class PirteiOved implements PirteiOvedBase {

						@XmlElement(name = "SUG-MEZAHE-OVED")
						protected int sugmezaheoved;
						@XmlElement(name = "MISPAR-MEZAHE", required = true)
						protected String misparmezahe;
						@XmlElement(name = "SHEM-PRATI", required = true)
						protected String shemprati;
						@XmlElement(name = "SHEM-MISHPACHA", required = true)
						protected String shemmishpacha;
						@XmlElement(name = "TAARICH-LEIDA", required = true, nillable = true)
						protected String taarichleida;
						@XmlElement(name = "MISPAR-OVED-ETZEL-MAASIK", required = true, nillable = true)
						protected String misparovedetzelmaasik;
						@XmlElement(name = "SachHafkadotShnatiot", required = true)
						protected List<YearlyV01Model.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim.PirteiMutzar.PirteiOved.SachHafkadotShnatiot> sachHafkadotShnatiot;

						@Override
						public int getSUGMEZAHEOVED() {
							return sugmezaheoved;
						}

						public void setSUGMEZAHEOVED(int value) {
							this.sugmezaheoved = value;
						}

						@Override
						public String getMISPARMEZAHE() {
							return misparmezahe;
						}

						public void setMISPARMEZAHE(String value) {
							this.misparmezahe = value;
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
						public String getTAARICHLEIDA() {
							return taarichleida;
						}

						public void setTAARICHLEIDA(String value) {
							this.taarichleida = value;
						}

						@Override
						public String getMISPAROVEDETZELMAASIK() {
							return misparovedetzelmaasik;
						}

						public void setMISPAROVEDETZELMAASIK(String value) {
							this.misparovedetzelmaasik = value;
						}

						@Override
						public List<YearlyV01Model.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim.PirteiMutzar.PirteiOved.SachHafkadotShnatiot> getSachHafkadotShnatiot() {
							if (sachHafkadotShnatiot == null) {
								sachHafkadotShnatiot = new ArrayList<YearlyV01Model.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim.PirteiMutzar.PirteiOved.SachHafkadotShnatiot>();
							}
							return this.sachHafkadotShnatiot;
						}

						@XmlAccessorType(XmlAccessType.FIELD)
						@XmlType(name = "", propOrder = { "misparpolisaoheshbon", "sughafrasha", "shiurhafrasha",
								"schumhafrasha", "sachtashlumimpturim" })
						public static class SachHafkadotShnatiot implements SachHafkadotShnatiotBase {

							@XmlElement(name = "MISPAR-POLISA-O-HESHBON", required = true, nillable = true)
							protected String misparpolisaoheshbon;
							@XmlElement(name = "SUG-HAFRASHA")
							protected int sughafrasha;
							@XmlElement(name = "SHIUR-HAFRASHA", required = true, nillable = true)
							protected BigDecimal shiurhafrasha;
							@XmlElement(name = "SCHUM-HAFRASHA", required = true)
							protected BigDecimal schumhafrasha;
							@XmlElement(name = "SACH-TASHLUMIM-PTURIM", required = true)
							protected BigDecimal sachtashlumimpturim;

							@Override
							public String getMISPARPOLISAOHESHBON() {
								return misparpolisaoheshbon;
							}

							public void setMISPARPOLISAOHESHBON(String value) {
								this.misparpolisaoheshbon = value;
							}

							@Override
							public int getSUGHAFRASHA() {
								return sughafrasha;
							}

							public void setSUGHAFRASHA(int value) {
								this.sughafrasha = value;
							}

							@Override
							public BigDecimal getSHIURHAFRASHA() {
								return shiurhafrasha;
							}

							public void setSHIURHAFRASHA(BigDecimal value) {
								this.shiurhafrasha = value;
							}

							@Override
							public BigDecimal getSCHUMHAFRASHA() {
								return schumhafrasha;
							}

							public void setSCHUMHAFRASHA(BigDecimal value) {
								this.schumhafrasha = value;
							}

							@Override
							public BigDecimal getSACHTASHLUMIMPTURIM() {
								return sachtashlumimpturim;
							}

							public void setSACHTASHLUMIMPTURIM(BigDecimal value) {
								this.sachtashlumimpturim = value;
							}

						}

					}

				}

			}

		}

	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "sugmimshak", "mispargirsatxml", "taarichbitzua", "kodsvivatavoda",
			"misparhakovetz", "misparsiduri", "netuneiGoremSholech", "netuneiGoremNimaan" })
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
		protected YearlyV01Model.KoteretKovetz.NetuneiGoremSholech netuneiGoremSholech;
		@XmlElement(name = "NetuneiGoremNimaan", required = true)
		protected YearlyV01Model.KoteretKovetz.NetuneiGoremNimaan netuneiGoremNimaan;

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
		public YearlyV01Model.KoteretKovetz.NetuneiGoremSholech getNetuneiGoremSholech() {
			return netuneiGoremSholech;
		}

		public void setNetuneiGoremSholech(YearlyV01Model.KoteretKovetz.NetuneiGoremSholech value) {
			this.netuneiGoremSholech = value;
		}

		@Override
		public YearlyV01Model.KoteretKovetz.NetuneiGoremNimaan getNetuneiGoremNimaan() {
			return netuneiGoremNimaan;
		}

		public void setNetuneiGoremNimaan(YearlyV01Model.KoteretKovetz.NetuneiGoremNimaan value) {
			this.netuneiGoremNimaan = value;
		}

		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "kodnimaan", "sugmezahenimaan", "misparzihuinimaan",
				"misparzihuietzelyatzrannimaan" })
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
		@XmlType(name = "", propOrder = { "kodsholech", "sugmezahesholech", "misparzihuisholech", "shemgoremsholech",
				"shempratiishkeshersholech", "shemmishpachaishkeshersholech", "mispartelephonekaviishkeshersholech",
				"emailishkeshersholech", "misparcellulariishkeshersholech" })
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

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "misparkupotyatzranimbakovetz", "misparmaasikim", "misparreshumot",
			"misparamitim" })
	public static class ReshumatSgira implements ReshumatSgiraBase {

		@XmlElement(name = "MISPAR-KUPOT-YATZRANIM-BAKOVETZ")
		protected int misparkupotyatzranimbakovetz;
		@XmlElement(name = "MISPAR-MAASIKIM")
		protected int misparmaasikim;
		@XmlElement(name = "MISPAR-RESHUMOT")
		protected int misparreshumot;
		@XmlElement(name = "MISPAR-AMITIM")
		protected int misparamitim;

		@Override
		public int getMISPARKUPOTYATZRANIMBAKOVETZ() {
			return misparkupotyatzranimbakovetz;
		}

		public void setMISPARKUPOTYATZRANIMBAKOVETZ(int value) {
			this.misparkupotyatzranimbakovetz = value;
		}

		@Override
		public int getMISPARMAASIKIM() {
			return misparmaasikim;
		}

		public void setMISPARMAASIKIM(int value) {
			this.misparmaasikim = value;
		}

		@Override
		public int getMISPARRESHUMOT() {
			return misparreshumot;
		}

		public void setMISPARRESHUMOT(int value) {
			this.misparreshumot = value;
		}

		@Override
		public int getMISPARAMITIM() {
			return misparamitim;
		}

		public void setMISPARAMITIM(int value) {
			this.misparamitim = value;
		}

	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).toString();
	}
}
