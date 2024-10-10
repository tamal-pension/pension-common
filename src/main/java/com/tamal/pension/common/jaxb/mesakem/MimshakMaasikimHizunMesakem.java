package com.tamal.pension.common.jaxb.mesakem;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "koteretKovetz", "gufHamimshak", "reshumatSgira" })
@XmlRootElement(name = "MimshakMaasikimHizunMesakem")
public class MimshakMaasikimHizunMesakem {

	@XmlElement(name = "KoteretKovetz", required = true)
	protected MimshakMaasikimHizunMesakem.KoteretKovetz koteretKovetz;
	@XmlElement(name = "GufHamimshak", required = true)
	protected MimshakMaasikimHizunMesakem.GufHamimshak gufHamimshak;
	@XmlElement(name = "ReshumatSgira", required = true)
	protected MimshakMaasikimHizunMesakem.ReshumatSgira reshumatSgira;

	public MimshakMaasikimHizunMesakem.KoteretKovetz getKoteretKovetz() {
		return koteretKovetz;
	}

	public void setKoteretKovetz(MimshakMaasikimHizunMesakem.KoteretKovetz value) {
		this.koteretKovetz = value;
	}

	public MimshakMaasikimHizunMesakem.GufHamimshak getGufHamimshak() {
		return gufHamimshak;
	}

	public void setGufHamimshak(MimshakMaasikimHizunMesakem.GufHamimshak value) {
		this.gufHamimshak = value;
	}

	public MimshakMaasikimHizunMesakem.ReshumatSgira getReshumatSgira() {
		return reshumatSgira;
	}

	public void setReshumatSgira(MimshakMaasikimHizunMesakem.ReshumatSgira value) {
		this.reshumatSgira = value;
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "yeshutGoremPoneLemislaka" })
	public static class GufHamimshak {

		@XmlElement(name = "YeshutGoremPoneLemislaka", required = true)
		protected List<MimshakMaasikimHizunMesakem.GufHamimshak.YeshutGoremPoneLemislaka> yeshutGoremPoneLemislaka;

		public List<MimshakMaasikimHizunMesakem.GufHamimshak.YeshutGoremPoneLemislaka> getYeshutGoremPoneLemislaka() {
			if (yeshutGoremPoneLemislaka == null) {
				yeshutGoremPoneLemislaka = new ArrayList<MimshakMaasikimHizunMesakem.GufHamimshak.YeshutGoremPoneLemislaka>();
			}
			return this.yeshutGoremPoneLemislaka;
		}

		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "sugpone", "sugkodmezahepone", "misparmezahepone", "shemgorempone",
				"misparmezahemetafel", "shempratiponelemislaka", "shemmishpachaponelemislaka",
				"mispartelephonekaviponelemislaka", "emailponelemislaka", "misparcellulari",
				"statosPirteiHaavaratKsafim" })
		public static class YeshutGoremPoneLemislaka {

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
			protected List<MimshakMaasikimHizunMesakem.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim> statosPirteiHaavaratKsafim;

			public Integer getSUGPONE() {
				return sugpone;
			}

			public void setSUGPONE(Integer value) {
				this.sugpone = value;
			}

			public Integer getSUGKODMEZAHEPONE() {
				return sugkodmezahepone;
			}

			public void setSUGKODMEZAHEPONE(Integer value) {
				this.sugkodmezahepone = value;
			}

			public String getMISPARMEZAHEPONE() {
				return misparmezahepone;
			}

			public void setMISPARMEZAHEPONE(String value) {
				this.misparmezahepone = value;
			}

			public String getSHEMGOREMPONE() {
				return shemgorempone;
			}

			public void setSHEMGOREMPONE(String value) {
				this.shemgorempone = value;
			}

			public String getMISPARMEZAHEMETAFEL() {
				return misparmezahemetafel;
			}

			public void setMISPARMEZAHEMETAFEL(String value) {
				this.misparmezahemetafel = value;
			}

			public String getSHEMPRATIPONELEMISLAKA() {
				return shempratiponelemislaka;
			}

			public void setSHEMPRATIPONELEMISLAKA(String value) {
				this.shempratiponelemislaka = value;
			}

			public String getSHEMMISHPACHAPONELEMISLAKA() {
				return shemmishpachaponelemislaka;
			}

			public void setSHEMMISHPACHAPONELEMISLAKA(String value) {
				this.shemmishpachaponelemislaka = value;
			}

			public String getMISPARTELEPHONEKAVIPONELEMISLAKA() {
				return mispartelephonekaviponelemislaka;
			}

			public void setMISPARTELEPHONEKAVIPONELEMISLAKA(String value) {
				this.mispartelephonekaviponelemislaka = value;
			}

			public String getEMAILPONELEMISLAKA() {
				return emailponelemislaka;
			}

			public void setEMAILPONELEMISLAKA(String value) {
				this.emailponelemislaka = value;
			}

			public String getMISPARCELLULARI() {
				return misparcellulari;
			}

			public void setMISPARCELLULARI(String value) {
				this.misparcellulari = value;
			}

			public List<MimshakMaasikimHizunMesakem.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim> getStatosPirteiHaavaratKsafim() {
				if (statosPirteiHaavaratKsafim == null) {
					statosPirteiHaavaratKsafim = new ArrayList<MimshakMaasikimHizunMesakem.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim>();
				}
				return this.statosPirteiHaavaratKsafim;
			}

			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "sugmafkid", "sugmezahemaasik", "misparzihuymaasik",
					"kodmezahemaasiketzelyatzran", "kodmasav", "shemmaasik", "taaricherechhafkada",
					"taaricherechhafkadacheshbonnehemanut", "misparasmachtaleahavaratksafim", "sachhafkadakupahp",
					"sachhafkadaklitabapoal", "sachksafimshuichu", "ksafimbemahavar", "statustipulbeksafim",
					"perutstatus", "sugmimshaklegabavmuavarhizunchozer", "misparzihui", "taarichnechonut",
					"misparmislaka", "pirteiOved" })
			public static class StatosPirteiHaavaratKsafim {

				@XmlElement(name = "SUG-MAFKID")
				protected int sugmafkid;
				@XmlElement(name = "SUG-MEZAHE-MAASIK")
				protected int sugmezahemaasik;
				@XmlElement(name = "MISPAR-ZIHUY-MAASIK", required = true)
				protected String misparzihuymaasik;
				@XmlElement(name = "KOD-MEZAHE-MAASIK-ETZEL-YATZRAN", required = true, nillable = true)
				protected String kodmezahemaasiketzelyatzran;
				@XmlElement(name = "KOD-MASAV", required = true, nillable = true)
				protected String kodmasav;
				@XmlElement(name = "SHEM-MAASIK", required = true)
				protected String shemmaasik;
				@XmlElement(name = "TAARICH-ERECH-HAFKADA", required = true, nillable = true)
				protected String taaricherechhafkada;
				@XmlElement(name = "TAARICH-ERECH-HAFKADA-CHESHBON-NEHEMANUT", required = true, nillable = true)
				protected String taaricherechhafkadacheshbonnehemanut;
				@XmlElement(name = "MISPAR-ASMACHTA-LEAHAVARAT-KSAFIM", required = true)
				protected String misparasmachtaleahavaratksafim;
				@XmlElement(name = "SACH-HAFKADA-KUPA-H-P", required = true)
				protected BigDecimal sachhafkadakupahp;
				@XmlElement(name = "SACH-HAFKADA-KLITA-BAPOAL", required = true)
				protected BigDecimal sachhafkadaklitabapoal;
				@XmlElement(name = "SACH-KSAFIM-SHUICHU", required = true)
				protected BigDecimal sachksafimshuichu;
				@XmlElement(name = "KSAFIM-BEMAHAVAR", required = true)
				protected BigDecimal ksafimbemahavar;
				@XmlElement(name = "STATUS-TIPUL-BEKSAFIM")
				protected int statustipulbeksafim;
				@XmlElement(name = "PERUT-STATUS", required = true, nillable = true)
				protected String perutstatus;
				@XmlElement(name = "SUG-MIMSHAK-LEGABAV-MUAVAR-HIZUN-CHOZER")
				protected int sugmimshaklegabavmuavarhizunchozer;
				@XmlElement(name = "MISPAR-ZIHUI", required = true, nillable = true)
				protected String misparzihui;
				@XmlElement(name = "TAARICH-NECHONUT", required = true)
				protected String taarichnechonut;
				@XmlElement(name = "MISPAR-MISLAKA", required = true, nillable = true)
				protected String misparmislaka;
				@XmlElement(name = "PirteiOved", required = true)
				protected List<MimshakMaasikimHizunMesakem.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim.PirteiOved> pirteiOved;

				public int getSUGMAFKID() {
					return sugmafkid;
				}

				public void setSUGMAFKID(int value) {
					this.sugmafkid = value;
				}

				public int getSUGMEZAHEMAASIK() {
					return sugmezahemaasik;
				}

				public void setSUGMEZAHEMAASIK(int value) {
					this.sugmezahemaasik = value;
				}

				public String getMISPARZIHUYMAASIK() {
					return misparzihuymaasik;
				}

				public void setMISPARZIHUYMAASIK(String value) {
					this.misparzihuymaasik = value;
				}

				public String getKODMEZAHEMAASIKETZELYATZRAN() {
					return kodmezahemaasiketzelyatzran;
				}

				public void setKODMEZAHEMAASIKETZELYATZRAN(String value) {
					this.kodmezahemaasiketzelyatzran = value;
				}

				public String getKODMASAV() {
					return kodmasav;
				}

				public void setKODMASAV(String value) {
					this.kodmasav = value;
				}

				public String getSHEMMAASIK() {
					return shemmaasik;
				}

				public void setSHEMMAASIK(String value) {
					this.shemmaasik = value;
				}

				public String getTAARICHERECHHAFKADA() {
					return taaricherechhafkada;
				}

				public void setTAARICHERECHHAFKADA(String value) {
					this.taaricherechhafkada = value;
				}

				public String getTAARICHERECHHAFKADACHESHBONNEHEMANUT() {
					return taaricherechhafkadacheshbonnehemanut;
				}

				public void setTAARICHERECHHAFKADACHESHBONNEHEMANUT(String value) {
					this.taaricherechhafkadacheshbonnehemanut = value;
				}

				public String getMISPARASMACHTALEAHAVARATKSAFIM() {
					return misparasmachtaleahavaratksafim;
				}

				public void setMISPARASMACHTALEAHAVARATKSAFIM(String value) {
					this.misparasmachtaleahavaratksafim = value;
				}

				public BigDecimal getSACHHAFKADAKUPAHP() {
					return sachhafkadakupahp;
				}

				public void setSACHHAFKADAKUPAHP(BigDecimal value) {
					this.sachhafkadakupahp = value;
				}

				public BigDecimal getSACHHAFKADAKLITABAPOAL() {
					return sachhafkadaklitabapoal;
				}

				public void setSACHHAFKADAKLITABAPOAL(BigDecimal value) {
					this.sachhafkadaklitabapoal = value;
				}

				public BigDecimal getSACHKSAFIMSHUICHU() {
					return sachksafimshuichu;
				}

				public void setSACHKSAFIMSHUICHU(BigDecimal value) {
					this.sachksafimshuichu = value;
				}

				public BigDecimal getKSAFIMBEMAHAVAR() {
					return ksafimbemahavar;
				}

				public void setKSAFIMBEMAHAVAR(BigDecimal value) {
					this.ksafimbemahavar = value;
				}

				public int getSTATUSTIPULBEKSAFIM() {
					return statustipulbeksafim;
				}

				public void setSTATUSTIPULBEKSAFIM(int value) {
					this.statustipulbeksafim = value;
				}

				public String getPERUTSTATUS() {
					return perutstatus;
				}

				public void setPERUTSTATUS(String value) {
					this.perutstatus = value;
				}

				public int getSUGMIMSHAKLEGABAVMUAVARHIZUNCHOZER() {
					return sugmimshaklegabavmuavarhizunchozer;
				}

				public void setSUGMIMSHAKLEGABAVMUAVARHIZUNCHOZER(int value) {
					this.sugmimshaklegabavmuavarhizunchozer = value;
				}

				public String getMISPARZIHUI() {
					return misparzihui;
				}

				public void setMISPARZIHUI(String value) {
					this.misparzihui = value;
				}

				public String getTAARICHNECHONUT() {
					return taarichnechonut;
				}

				public void setTAARICHNECHONUT(String value) {
					this.taarichnechonut = value;
				}

				public String getMISPARMISLAKA() {
					return misparmislaka;
				}

				public void setMISPARMISLAKA(String value) {
					this.misparmislaka = value;
				}

				public List<MimshakMaasikimHizunMesakem.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim.PirteiOved> getPirteiOved() {
					if (pirteiOved == null) {
						pirteiOved = new ArrayList<MimshakMaasikimHizunMesakem.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim.PirteiOved>();
					}
					return this.pirteiOved;
				}

				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = { "sugmezaheoved", "misparmezahe", "shemprati", "shemmishpacha",
						"taarichleida", "misparovedetzelmaasik", "statosPirteiKlitatReshuma" })
				public static class PirteiOved {

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
					@XmlElement(name = "StatosPirteiKlitatReshuma", required = true)
					protected List<MimshakMaasikimHizunMesakem.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim.PirteiOved.StatosPirteiKlitatReshuma> statosPirteiKlitatReshuma;

					public int getSUGMEZAHEOVED() {
						return sugmezaheoved;
					}

					public void setSUGMEZAHEOVED(int value) {
						this.sugmezaheoved = value;
					}

					public String getMISPARMEZAHE() {
						return misparmezahe;
					}

					public void setMISPARMEZAHE(String value) {
						this.misparmezahe = value;
					}

					public String getSHEMPRATI() {
						return shemprati;
					}

					public void setSHEMPRATI(String value) {
						this.shemprati = value;
					}

					public String getSHEMMISHPACHA() {
						return shemmishpacha;
					}

					public void setSHEMMISHPACHA(String value) {
						this.shemmishpacha = value;
					}

					public String getTAARICHLEIDA() {
						return taarichleida;
					}

					public void setTAARICHLEIDA(String value) {
						this.taarichleida = value;
					}

					public String getMISPAROVEDETZELMAASIK() {
						return misparovedetzelmaasik;
					}

					public void setMISPAROVEDETZELMAASIK(String value) {
						this.misparovedetzelmaasik = value;
					}

					public List<MimshakMaasikimHizunMesakem.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim.PirteiOved.StatosPirteiKlitatReshuma> getStatosPirteiKlitatReshuma() {
						if (statosPirteiKlitatReshuma == null) {
							statosPirteiKlitatReshuma = new ArrayList<MimshakMaasikimHizunMesakem.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim.PirteiOved.StatosPirteiKlitatReshuma>();
						}
						return this.statosPirteiKlitatReshuma;
					}

					@XmlAccessorType(XmlAccessType.FIELD)
					@XmlType(name = "", propOrder = { "misparmezahereshuma", "reshumanikleta", "sugshgiha",
							"perutshgiha", "ofenRishumZchuiot" })
					public static class StatosPirteiKlitatReshuma {

						@XmlElement(name = "MISPAR-MEZAHE-RESHUMA", required = true)
						protected String misparmezahereshuma;
						@XmlElement(name = "RESHUMA-NIKLETA")
						protected int reshumanikleta;
						@XmlElement(name = "SUG-SHGIHA")
						protected int sugshgiha;
						@XmlElement(name = "PERUT-SHGIHA", required = true, nillable = true)
						protected String perutshgiha;
						@XmlElement(name = "OfenRishumZchuiot")
						protected List<MimshakMaasikimHizunMesakem.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim.PirteiOved.StatosPirteiKlitatReshuma.OfenRishumZchuiot> ofenRishumZchuiot;

						public String getMISPARMEZAHERESHUMA() {
							return misparmezahereshuma;
						}

						public void setMISPARMEZAHERESHUMA(String value) {
							this.misparmezahereshuma = value;
						}

						public int getRESHUMANIKLETA() {
							return reshumanikleta;
						}

						public void setRESHUMANIKLETA(int value) {
							this.reshumanikleta = value;
						}

						public int getSUGSHGIHA() {
							return sugshgiha;
						}

						public void setSUGSHGIHA(int value) {
							this.sugshgiha = value;
						}

						public String getPERUTSHGIHA() {
							return perutshgiha;
						}

						public void setPERUTSHGIHA(String value) {
							this.perutshgiha = value;
						}

						public List<MimshakMaasikimHizunMesakem.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim.PirteiOved.StatosPirteiKlitatReshuma.OfenRishumZchuiot> getOfenRishumZchuiot() {
							if (ofenRishumZchuiot == null) {
								ofenRishumZchuiot = new ArrayList<MimshakMaasikimHizunMesakem.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim.PirteiOved.StatosPirteiKlitatReshuma.OfenRishumZchuiot>();
							}
							return this.ofenRishumZchuiot;
						}

						@XmlAccessorType(XmlAccessType.FIELD)
						@XmlType(name = "", propOrder = { "sacharmechushav", "chodeshmaskoret", "misparpolisaoheshbon",
								"sughafrasha", "shiurhafrasha", "schumhafrasha", "sachtashlumimpturim",
								"shiurhafrashachazui", "schumhafrashachazui" })
						public static class OfenRishumZchuiot {

							@XmlElement(name = "SACHAR-MECHUSHAV", required = true)
							protected BigDecimal sacharmechushav;
							@XmlElement(name = "CHODESH-MASKORET", required = true)
							protected String chodeshmaskoret;
							@XmlElement(name = "MISPAR-POLISA-O-HESHBON", required = true)
							protected String misparpolisaoheshbon;
							@XmlElement(name = "SUG-HAFRASHA")
							protected int sughafrasha;
							@XmlElement(name = "SHIUR-HAFRASHA", required = true)
							protected BigDecimal shiurhafrasha;
							@XmlElement(name = "SCHUM-HAFRASHA", required = true)
							protected BigDecimal schumhafrasha;
							@XmlElement(name = "SACH-TASHLUMIM-PTURIM", required = true)
							protected BigDecimal sachtashlumimpturim;
							@XmlElement(name = "SHIUR-HAFRASHA-CHAZUI", required = true, nillable = true)
							protected BigDecimal shiurhafrashachazui;
							@XmlElement(name = "SCHUM-HAFRASHA-CHAZUI", required = true, nillable = true)
							protected BigDecimal schumhafrashachazui;

							public BigDecimal getSACHARMECHUSHAV() {
								return sacharmechushav;
							}

							public void setSACHARMECHUSHAV(BigDecimal value) {
								this.sacharmechushav = value;
							}

							public String getCHODESHMASKORET() {
								return chodeshmaskoret;
							}

							public void setCHODESHMASKORET(String value) {
								this.chodeshmaskoret = value;
							}

							public String getMISPARPOLISAOHESHBON() {
								return misparpolisaoheshbon;
							}

							public void setMISPARPOLISAOHESHBON(String value) {
								this.misparpolisaoheshbon = value;
							}

							public int getSUGHAFRASHA() {
								return sughafrasha;
							}

							public void setSUGHAFRASHA(int value) {
								this.sughafrasha = value;
							}

							public BigDecimal getSHIURHAFRASHA() {
								return shiurhafrasha;
							}

							public void setSHIURHAFRASHA(BigDecimal value) {
								this.shiurhafrasha = value;
							}

							public BigDecimal getSCHUMHAFRASHA() {
								return schumhafrasha;
							}

							public void setSCHUMHAFRASHA(BigDecimal value) {
								this.schumhafrasha = value;
							}

							public BigDecimal getSACHTASHLUMIMPTURIM() {
								return sachtashlumimpturim;
							}

							public void setSACHTASHLUMIMPTURIM(BigDecimal value) {
								this.sachtashlumimpturim = value;
							}

							public BigDecimal getSHIURHAFRASHACHAZUI() {
								return shiurhafrashachazui;
							}

							public void setSHIURHAFRASHACHAZUI(BigDecimal value) {
								this.shiurhafrashachazui = value;
							}

							public BigDecimal getSCHUMHAFRASHACHAZUI() {
								return schumhafrashachazui;
							}

							public void setSCHUMHAFRASHACHAZUI(BigDecimal value) {
								this.schumhafrashachazui = value;
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
	public static class KoteretKovetz {

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
		protected MimshakMaasikimHizunMesakem.KoteretKovetz.NetuneiGoremSholech netuneiGoremSholech;
		@XmlElement(name = "NetuneiGoremNimaan", required = true)
		protected MimshakMaasikimHizunMesakem.KoteretKovetz.NetuneiGoremNimaan netuneiGoremNimaan;

		public int getSUGMIMSHAK() {
			return sugmimshak;
		}

		public void setSUGMIMSHAK(int value) {
			this.sugmimshak = value;
		}

		public String getMISPARGIRSATXML() {
			return mispargirsatxml;
		}

		public void setMISPARGIRSATXML(String value) {
			this.mispargirsatxml = value;
		}

		public String getTAARICHBITZUA() {
			return taarichbitzua;
		}

		public void setTAARICHBITZUA(String value) {
			this.taarichbitzua = value;
		}

		public int getKODSVIVATAVODA() {
			return kodsvivatavoda;
		}

		public void setKODSVIVATAVODA(int value) {
			this.kodsvivatavoda = value;
		}

		public String getMISPARHAKOVETZ() {
			return misparhakovetz;
		}

		public void setMISPARHAKOVETZ(String value) {
			this.misparhakovetz = value;
		}

		public Integer getMISPARSIDURI() {
			return misparsiduri;
		}

		public void setMISPARSIDURI(Integer value) {
			this.misparsiduri = value;
		}

		public MimshakMaasikimHizunMesakem.KoteretKovetz.NetuneiGoremSholech getNetuneiGoremSholech() {
			return netuneiGoremSholech;
		}

		public void setNetuneiGoremSholech(MimshakMaasikimHizunMesakem.KoteretKovetz.NetuneiGoremSholech value) {
			this.netuneiGoremSholech = value;
		}

		public MimshakMaasikimHizunMesakem.KoteretKovetz.NetuneiGoremNimaan getNetuneiGoremNimaan() {
			return netuneiGoremNimaan;
		}

		public void setNetuneiGoremNimaan(MimshakMaasikimHizunMesakem.KoteretKovetz.NetuneiGoremNimaan value) {
			this.netuneiGoremNimaan = value;
		}

		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "kodnimaan", "sugmezahenimaan", "misparzihuinimaan",
				"misparzihuietzelyatzrannimaan" })
		public static class NetuneiGoremNimaan {

			@XmlElement(name = "KOD-NIMAAN")
			protected int kodnimaan;
			@XmlElement(name = "SUG-MEZAHE-NIMAAN")
			protected int sugmezahenimaan;
			@XmlElement(name = "MISPAR-ZIHUI-NIMAAN", required = true)
			protected String misparzihuinimaan;
			@XmlElement(name = "MISPAR-ZIHUI-ETZEL-YATZRAN-NIMAAN", required = true, nillable = true)
			protected String misparzihuietzelyatzrannimaan;

			public int getKODNIMAAN() {
				return kodnimaan;
			}

			public void setKODNIMAAN(int value) {
				this.kodnimaan = value;
			}

			public int getSUGMEZAHENIMAAN() {
				return sugmezahenimaan;
			}

			public void setSUGMEZAHENIMAAN(int value) {
				this.sugmezahenimaan = value;
			}

			public String getMISPARZIHUINIMAAN() {
				return misparzihuinimaan;
			}

			public void setMISPARZIHUINIMAAN(String value) {
				this.misparzihuinimaan = value;
			}

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
		public static class NetuneiGoremSholech {

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

			public int getKODSHOLECH() {
				return kodsholech;
			}

			public void setKODSHOLECH(int value) {
				this.kodsholech = value;
			}

			public int getSUGMEZAHESHOLECH() {
				return sugmezahesholech;
			}

			public void setSUGMEZAHESHOLECH(int value) {
				this.sugmezahesholech = value;
			}

			public String getMISPARZIHUISHOLECH() {
				return misparzihuisholech;
			}

			public void setMISPARZIHUISHOLECH(String value) {
				this.misparzihuisholech = value;
			}

			public String getSHEMGOREMSHOLECH() {
				return shemgoremsholech;
			}

			public void setSHEMGOREMSHOLECH(String value) {
				this.shemgoremsholech = value;
			}

			public String getSHEMPRATIISHKESHERSHOLECH() {
				return shempratiishkeshersholech;
			}

			public void setSHEMPRATIISHKESHERSHOLECH(String value) {
				this.shempratiishkeshersholech = value;
			}

			public String getSHEMMISHPACHAISHKESHERSHOLECH() {
				return shemmishpachaishkeshersholech;
			}

			public void setSHEMMISHPACHAISHKESHERSHOLECH(String value) {
				this.shemmishpachaishkeshersholech = value;
			}

			public String getMISPARTELEPHONEKAVIISHKESHERSHOLECH() {
				return mispartelephonekaviishkeshersholech;
			}

			public void setMISPARTELEPHONEKAVIISHKESHERSHOLECH(String value) {
				this.mispartelephonekaviishkeshersholech = value;
			}

			public String getEMAILISHKESHERSHOLECH() {
				return emailishkeshersholech;
			}

			public void setEMAILISHKESHERSHOLECH(String value) {
				this.emailishkeshersholech = value;
			}

			public String getMISPARCELLULARIISHKESHERSHOLECH() {
				return misparcellulariishkeshersholech;
			}

			public void setMISPARCELLULARIISHKESHERSHOLECH(String value) {
				this.misparcellulariishkeshersholech = value;
			}

		}

	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "misparyatzranim", "misparmaasikim", "misparreshumot", "misparamitim",
			"sachhafrashotbakovetz" })
	public static class ReshumatSgira {

		@XmlElement(name = "MISPAR-YATZRANIM")
		protected int misparyatzranim;
		@XmlElement(name = "MISPAR-MAASIKIM")
		protected int misparmaasikim;
		@XmlElement(name = "MISPAR-RESHUMOT")
		protected int misparreshumot;
		@XmlElement(name = "MISPAR-AMITIM")
		protected int misparamitim;
		@XmlElement(name = "SACH-HAFRASHOT-BAKOVETZ", required = true, nillable = true)
		protected BigDecimal sachhafrashotbakovetz;

		public int getMISPARYATZRANIM() {
			return misparyatzranim;
		}

		public void setMISPARYATZRANIM(int value) {
			this.misparyatzranim = value;
		}

		public int getMISPARMAASIKIM() {
			return misparmaasikim;
		}

		public void setMISPARMAASIKIM(int value) {
			this.misparmaasikim = value;
		}

		public int getMISPARRESHUMOT() {
			return misparreshumot;
		}

		public void setMISPARRESHUMOT(int value) {
			this.misparreshumot = value;
		}

		public int getMISPARAMITIM() {
			return misparamitim;
		}

		public void setMISPARAMITIM(int value) {
			this.misparamitim = value;
		}

		public BigDecimal getSACHHAFRASHOTBAKOVETZ() {
			return sachhafrashotbakovetz;
		}

		public void setSACHHAFRASHOTBAKOVETZ(BigDecimal value) {
			this.sachhafrashotbakovetz = value;
		}

	}

}
