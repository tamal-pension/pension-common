
package com.tamal.pension.common.jaxb.mesakem;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.common.base.MoreObjects;
import com.tamal.pension.common.jaxb.KoteretKovetzBase;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "koteretKovetz", "gufHamimshak", "reshumatSgira" })
@XmlRootElement(name = "MimshakMaasikimHizunMesakem")
public class MesakemV04Model implements MesakemModel {

	@XmlElement(name = "KoteretKovetz", required = true)
	protected MesakemV04Model.KoteretKovetz koteretKovetz;
	@XmlElement(name = "GufHamimshak", required = true)
	protected GufHamimshak gufHamimshak;
	@XmlElement(name = "ReshumatSgira", required = true)
	protected ReshumatSgira reshumatSgira;

	@Override
	public MesakemV04Model.KoteretKovetz getKoteretKovetz() {
		return koteretKovetz;
	}

	public void setKoteretKovetz(MesakemV04Model.KoteretKovetz value) {
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
		protected List<MesakemV04Model.GufHamimshak.YeshutGoremPoneLemislaka> yeshutGoremPoneLemislaka;

		@Override
		public List<MesakemV04Model.GufHamimshak.YeshutGoremPoneLemislaka> getYeshutGoremPoneLemislaka() {
			if (yeshutGoremPoneLemislaka == null) {
				yeshutGoremPoneLemislaka = new ArrayList<MesakemV04Model.GufHamimshak.YeshutGoremPoneLemislaka>();
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
			protected List<MesakemV04Model.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim> statosPirteiHaavaratKsafim;

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
			public List<MesakemV04Model.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim> getStatosPirteiHaavaratKsafim() {
				if (statosPirteiHaavaratKsafim == null) {
					statosPirteiHaavaratKsafim = new ArrayList<MesakemV04Model.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim>();
				}
				return this.statosPirteiHaavaratKsafim;
			}

			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "sugmafkid", "sugmezahemaasik", "misparzihuymaasik",
					"misparbankmosdi","misparsnifmosdi","misparcheshbonmosdi",
					"kodmezahemaasiketzelyatzran", "kodmasav", "shemmaasik", "taaricherechhafkada",
					"taaricherechhafkadacheshbonnehemanut", "misparasmachtaleahavaratksafim", "sachhafkadakupahp",
					"sachhafkadaklitabapoal", "sachksafimshuichu", "ksafimbemahavar", "hashavatksafimyezuma", "statustipulbeksafim",
					"perutstatus", "sugmimshaklegabavmuavarhizunchozer", "misparzihui", "taarichnechonut",
					"misparmislaka", "pirteiOved", "dochNigraim"})

			public static class StatosPirteiHaavaratKsafim implements StatosPirteiHaavaratKsafimBase {

				@XmlElement(name = "SUG-MAFKID")
				protected int sugmafkid;
				@XmlElement(name = "SUG-MEZAHE-MAASIK")
				protected int sugmezahemaasik;
				@XmlElement(name = "MISPAR-ZIHUY-MAASIK", required = true)
				protected String misparzihuymaasik;
				@XmlElement(name = "MISPAR-BANK-MOSDI", required = true)
				protected String misparbankmosdi;
				@XmlElement(name = "MISPAR-SNIF-MOSDI", required = true)
				protected String misparsnifmosdi;
				@XmlElement(name = "MISPAR-CHESHBON-MOSDI", required = true)
				protected String misparcheshbonmosdi;
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
				@XmlElement(name = "HASHAVAT-KSAFIM-YEZUMA", required = true, nillable = true)
				protected BigDecimal hashavatksafimyezuma;
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
				protected List<MesakemV04Model.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim.PirteiOved> pirteiOved;
				@XmlElement(name = "Doch-Nigraim", required = true)
				protected List<MesakemV04Model.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim.DochNigraim> dochNigraim;

				@Override
				public int getSUGMAFKID() {
					return sugmafkid;
				}

				public void setSUGMAFKID(int value) {
					this.sugmafkid = value;
				}

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
				public String getMISPARBANKMOSDI() {
					return misparbankmosdi;
				}
				
				public void setMISPARBANKMOSDI(String value) {
					this.misparbankmosdi = value;
				}
				
				@Override
				public String getMISPARSNIFMOSDI() {
					return misparsnifmosdi;
				}
				
				public void setMISPARSNIFMOSDI(String value) {
					this.misparsnifmosdi = value;
				}
				
				@Override
				public String getMISPARCHESHBONMOSDI() {
					return misparcheshbonmosdi;
				}
				
				public void setMISPARCHESHBONMOSDI(String value) {
					this.misparcheshbonmosdi = value;
				}

				@Override
				public String getKODMEZAHEMAASIKETZELYATZRAN() {
					return kodmezahemaasiketzelyatzran;
				}

				public void setKODMEZAHEMAASIKETZELYATZRAN(String value) {
					this.kodmezahemaasiketzelyatzran = value;
				}

				@Override
				public String getKODMASAV() {
					return kodmasav;
				}

				public void setKODMASAV(String value) {
					this.kodmasav = value;
				}

				@Override
				public String getSHEMMAASIK() {
					return shemmaasik;
				}

				public void setSHEMMAASIK(String value) {
					this.shemmaasik = value;
				}

				@Override
				public String getTAARICHERECHHAFKADA() {
					return taaricherechhafkada;
				}

				public void setTAARICHERECHHAFKADA(String value) {
					this.taaricherechhafkada = value;
				}

				@Override
				public String getTAARICHERECHHAFKADACHESHBONNEHEMANUT() {
					return taaricherechhafkadacheshbonnehemanut;
				}

				public void setTAARICHERECHHAFKADACHESHBONNEHEMANUT(String value) {
					this.taaricherechhafkadacheshbonnehemanut = value;
				}

				@Override
				public String getMISPARASMACHTALEAHAVARATKSAFIM() {
					return misparasmachtaleahavaratksafim;
				}

				public void setMISPARASMACHTALEAHAVARATKSAFIM(String value) {
					this.misparasmachtaleahavaratksafim = value;
				}

				@Override
				public BigDecimal getSACHHAFKADAKUPAHP() {
					return sachhafkadakupahp;
				}

				public void setSACHHAFKADAKUPAHP(BigDecimal value) {
					this.sachhafkadakupahp = value;
				}

				@Override
				public BigDecimal getSACHHAFKADAKLITABAPOAL() {
					return sachhafkadaklitabapoal;
				}

				public void setSACHHAFKADAKLITABAPOAL(BigDecimal value) {
					this.sachhafkadaklitabapoal = value;
				}

				@Override
				public BigDecimal getSACHKSAFIMSHUICHU() {
					return sachksafimshuichu;
				}

				public void setSACHKSAFIMSHUICHU(BigDecimal value) {
					this.sachksafimshuichu = value;
				}

				@Override
				public BigDecimal getKSAFIMBEMAHAVAR() {
					return ksafimbemahavar;
				}

				public void setKSAFIMBEMAHAVAR(BigDecimal value) {
					this.ksafimbemahavar = value;
				}

				@Override
				public BigDecimal getHASHAVATKSAFIMYEZUMA() {
					return hashavatksafimyezuma;
				}

				public void setHASHAVATKSAFIMYEZUMA(BigDecimal value) {
					this.hashavatksafimyezuma = value;
				}				
				
				@Override
				public int getSTATUSTIPULBEKSAFIM() {
					return statustipulbeksafim;
				}

				public void setSTATUSTIPULBEKSAFIM(int value) {
					this.statustipulbeksafim = value;
				}

				@Override
				public String getPERUTSTATUS() {
					return perutstatus;
				}

				public void setPERUTSTATUS(String value) {
					this.perutstatus = value;
				}

				@Override
				public int getSUGMIMSHAKLEGABAVMUAVARHIZUNCHOZER() {
					return sugmimshaklegabavmuavarhizunchozer;
				}

				public void setSUGMIMSHAKLEGABAVMUAVARHIZUNCHOZER(int value) {
					this.sugmimshaklegabavmuavarhizunchozer = value;
				}

				@Override
				public String getMISPARZIHUI() {
					return misparzihui;
				}

				public void setMISPARZIHUI(String value) {
					this.misparzihui = value;
				}

				@Override
				public String getTAARICHNECHONUT() {
					return taarichnechonut;
				}

				public void setTAARICHNECHONUT(String value) {
					this.taarichnechonut = value;
				}

				@Override
				public String getMISPARMISLAKA() {
					return misparmislaka;
				}

				public void setMISPARMISLAKA(String value) {
					this.misparmislaka = value;
				}

				@Override
				public List<MesakemV04Model.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim.PirteiOved> getPirteiOved() {
					if (pirteiOved == null) {
						pirteiOved = new ArrayList<MesakemV04Model.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim.PirteiOved>();
					}
					return this.pirteiOved;
				}
				
				@Override
				public List<DochNigraim> getDochNigraim(){
					if (dochNigraim == null) {
						dochNigraim = new ArrayList<MesakemV04Model.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim.DochNigraim>();
					}
					return this.dochNigraim;
				}
				
				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = { "kodmezahekupahp", "sugkupa", "sugmezaheoved", "misparmezahe",
						"shemprati", "shemmishpacha", "sacharacharon", "misparchodsheichov" })
				public static class DochNigraim implements DochNigraimBase {

					@XmlElement(name = "KOD-MEZAHE-KUPA-H-P")
					protected String kodmezahekupahp;
					@XmlElement(name = "SUG-KUPA", required = true)
					protected Integer sugkupa;
					@XmlElement(name = "SUG-MEZAHE-OVED", required = true)
					protected Integer sugmezaheoved;
					@XmlElement(name = "MISPAR-MEZAHE", required = true)
					protected String misparmezahe;
					@XmlElement(name = "SHEM-PRATI", required = true)
					protected String shemprati;
					@XmlElement(name = "SHEM-MISHPACHA", required = true)
					protected String shemmishpacha;
					@XmlElement(name = "SACHAR-ACHARON", required = true)
					protected String sacharacharon;
					@XmlElement(name = "MISPAR-CHODSHEI-CHOV", required = true, nillable = true)
					protected Integer misparchodsheichov;
					
					@Override
					public String getKODMEZAHEKUPAHP() {
						return kodmezahekupahp;
					};
					
					public void setKODMEZAHEKUPAHP(String value) {
						this.kodmezahekupahp = value;
					}
					
					@Override
					public Integer getSUGKUPA() {
						return sugkupa;
					};
					
					public void setSUGKUPA(Integer value) {
						this.sugkupa = value;
					}

					@Override
					public Integer getSUGMEZAHEOVED() {
						return sugmezaheoved;
					};
					
					public void setSUGMEZAHEOVED(Integer value) {
						this.sugmezaheoved = value;
					}
					
					@Override
					public String getMISPARMEZAHE() {
						return misparmezahe;
					};
					
					public void setMISPARMEZAHE(String value) {
						this.misparmezahe = value;
					}
					
					@Override
					public String getSHEMPRATI() {
						return shemprati;
					};
					
					public void setSHEMPRATI(String value) {
						this.shemprati = value;
					}
					
					@Override
					public String getSHEMMISHPACHA() {
						return shemmishpacha;
					};
					
					public void setSHEMMISHPACHA(String value) {
						this.shemmishpacha = value;
					}
					
					@Override
					public String getSACHARACHARON() {
						return sacharacharon;
					};
					
					public void setSACHARACHARON(String value) {
						this.sacharacharon = value;
					}
					
					@Override
					public Integer getMISPARCHODSHEICHOV() {
						return misparchodsheichov;
					};
					
					public void setMISPARCHODSHEICHOV(Integer value) {
						this.misparchodsheichov = value;
					}

				}

				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = { "sugmezaheoved", "misparmezahe", "shemprati", "shemmishpacha",
						"taarichleida", "misparovedetzelmaasik", "statosPirteiKlitatReshuma" })

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
					@XmlElement(name = "StatosPirteiKlitatReshuma", required = true)
					protected List<MesakemV04Model.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim.PirteiOved.StatosPirteiKlitatReshuma> statosPirteiKlitatReshuma;

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
					public List<MesakemV04Model.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim.PirteiOved.StatosPirteiKlitatReshuma> getStatosPirteiKlitatReshuma() {
						if (statosPirteiKlitatReshuma == null) {
							statosPirteiKlitatReshuma = new ArrayList<MesakemV04Model.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim.PirteiOved.StatosPirteiKlitatReshuma>();
						}
						return this.statosPirteiKlitatReshuma;
					}

					@XmlAccessorType(XmlAccessType.FIELD)
					@XmlType(name = "", propOrder = { "misparmezahereshuma", "reshumanikleta", "sugshgiha",
							"perutshgihashum", "perutshgihataarich", "shembaalrishaion", "hpbaalrishaion" 
							,"emailbaalrishaion" ,"ofenRishumZchuiot", "kodmezahekupahp" })
					public static class StatosPirteiKlitatReshuma implements StatosPirteiKlitatReshumaBase {

						@XmlElement(name = "MISPAR-MEZAHE-RESHUMA", required = true)
						protected String misparmezahereshuma;
						@XmlElement(name = "RESHUMA-NIKLETA")
						protected int reshumanikleta;
						@XmlElement(name = "SUG-SHGIHA")
						protected int sugshgiha;
						@XmlElement(name = "PERUT-SHGIHA-SHUM", required = true, nillable = true)
						protected BigDecimal perutshgihashum;
						@XmlElement(name = "PERUT-SHGIHA-TAARICH", required = true, nillable = true)
						protected String perutshgihataarich;
						@XmlElement(name = "SHEM-BAAL-RISHAION", required = true)
						protected String shembaalrishaion;
						@XmlElement(name = "HP-BAAL-RISHAION", required = true)
						protected BigDecimal hpbaalrishaion;
						@XmlElement(name = "E-MAIL-BAAL-RISHAION", required = true)
						protected String emailbaalrishaion;
						@XmlElement(name = "OfenRishumZchuiot")
						protected List<MesakemV04Model.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim.PirteiOved.StatosPirteiKlitatReshuma.OfenRishumZchuiot> ofenRishumZchuiot;
						@XmlElement(name = "KOD-MEZAHE-KUPA-H-P", required = true)
						protected String kodmezahekupahp;

						@Override
						public String getMISPARMEZAHERESHUMA() {
							return misparmezahereshuma;
						}

						public void setMISPARMEZAHERESHUMA(String value) {
							this.misparmezahereshuma = value;
						}

						@Override
						public int getRESHUMANIKLETA() {
							return reshumanikleta;
						}

						public void setRESHUMANIKLETA(int value) {
							this.reshumanikleta = value;
						}

						@Override
						public int getSUGSHGIHA() {
							return sugshgiha;
						}

						public void setSUGSHGIHA(int value) {
							this.sugshgiha = value;
						}

						@Override
						@JsonIgnore
						public String getPERUTSHGIHA() {
							return null;
						}

						
						@Override
						public BigDecimal getPERUTSHGIHASHUM() {
							return perutshgihashum;
						}
						
						public void setPERUTSHGIHASHUM(BigDecimal value) {
							this.perutshgihashum = value;
						}
						
						@Override
						public String getPERUTSHGIHATAARICH() {
							return perutshgihataarich;
						}
						
						public void setPERUTSHGIHATAARICH(String value) {
							this.perutshgihataarich = value;
						}
						
						@Override
						public String getSHEMBAALRISHAION(){
							return shembaalrishaion;
						}
						
						public void setSHEMBAALRISHAION(String value) {
							this.shembaalrishaion = value;
						}
						
						@Override
						public BigDecimal getHPBAALRISHAION(){
							return hpbaalrishaion;
						}
						
						public void setHPBAALRISHAION(BigDecimal value) {
							this.hpbaalrishaion = value;
						}
						
						@Override
						public String getEMAILBAALRISHAION(){
							return emailbaalrishaion;
						}
						
						public void setEMAILBAALRISHAION(String value) {
							this.emailbaalrishaion = value;
						}

						@Override
						public List<MesakemV04Model.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim.PirteiOved.StatosPirteiKlitatReshuma.OfenRishumZchuiot> getOfenRishumZchuiot() {
							if (ofenRishumZchuiot == null) {
								ofenRishumZchuiot = new ArrayList<MesakemV04Model.GufHamimshak.YeshutGoremPoneLemislaka.StatosPirteiHaavaratKsafim.PirteiOved.StatosPirteiKlitatReshuma.OfenRishumZchuiot>();
							}
							return this.ofenRishumZchuiot;
						}

						@Override
						public String getKODMEZAHEKUPAHP() {
							return kodmezahekupahp;
						}

						public void setKODMEZAHEKUPAHP(String value) {
							this.kodmezahekupahp = value;
						}

						@XmlAccessorType(XmlAccessType.FIELD)
						@XmlType(name = "", propOrder = { "kodmezahekupahp", "sacharmechushav", "chodeshmaskoret", "misparpolisaoheshbon",
								"sughafrasha", "shiurhafrasha", "schumhafrasha", "nikuimas", "sachhechzermevukash",
								"taarichbakashathechzer" ,"sachtashlumimpturim", "shiurkisui", "shiurhafrashanochechi",
								"shiurhafrashaatidi", "taarichidkuntzafui", "sibatidkuntaarif"})
						public static class OfenRishumZchuiot implements OfenRishumZchuiotBase {
							@XmlElement(name = "KOD-MEZAHE-KUPA-H-P", required = true)
							protected String kodmezahekupahp;
							@XmlElement(name = "SACHAR-MECHUSHAV", required = true)
							protected BigDecimal sacharmechushav;
							@XmlElement(name = "CHODESH-MASKORET", required = true)
							protected String chodeshmaskoret;
							@XmlElement(name = "MISPAR-POLISA-O-HESHBON", required = true, nillable = true)
							protected String misparpolisaoheshbon;
							@XmlElement(name = "SUG-HAFRASHA")
							protected int sughafrasha;
							@XmlElement(name = "SHIUR-HAFRASHA", required = true)
							protected BigDecimal shiurhafrasha;
							@XmlElement(name = "SCHUM-HAFRASHA", required = true)
							protected BigDecimal schumhafrasha;
							@XmlElement(name = "NIKUI-MAS", required = true, nillable = true)
							protected BigDecimal nikuimas;
							@XmlElement(name = "SACH-HECHZER-MEVUKASH", required = true)
							protected BigDecimal sachhechzermevukash;
							@XmlElement(name = "TAARICH-BAKASHAT-HECHZER", required = true, nillable = true)
							protected String taarichbakashathechzer;
							@XmlElement(name = "SACH-TASHLUMIM-PTURIM", required = true)
							protected BigDecimal sachtashlumimpturim;
							@XmlElement(name = "SHIUR-KISUI", required = true)
							protected BigDecimal shiurkisui;
							@XmlElement(name = "SHIUR-HAFRASHA-NOCHECHI", required = true)
							protected BigDecimal shiurhafrashanochechi;
							@XmlElement(name = "SHIUR-HAFRASHA-ATIDI", required = true)
							protected BigDecimal shiurhafrashaatidi;
							@XmlElement(name = "TAARICH-IDKUN-TZAFUI", required = true)
							protected String taarichidkuntzafui;
							@XmlElement(name = "SIBAT-IDKUN_TAARIF", required = true)
							protected Integer sibatidkuntaarif;
							
							@Override
							public BigDecimal getSACHARMECHUSHAV() {
								return sacharmechushav;
							}

							public void setSACHARMECHUSHAV(BigDecimal value) {
								this.sacharmechushav = value;
							}

							@Override
							public String getCHODESHMASKORET() {
								return chodeshmaskoret;
							}

							public void setCHODESHMASKORET(String value) {
								this.chodeshmaskoret = value;
							}

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
							public BigDecimal getNIKUIMAS() {
								return nikuimas;
							};
							
							public void setNIKUIMAS(BigDecimal value) {
								this.nikuimas = value;
							}
							
							@Override
							public BigDecimal getSACHHECHZERMEVUKASH() {
								return sachhechzermevukash;
							};
							
							public void setSACHHECHZERMEVUKASH(BigDecimal value) {
								this.sachhechzermevukash = value;
							}
							
							@Override
							public String getTAARICHBAKASHATHECHZER() {
								return taarichbakashathechzer;
							};
							
							public void setTAARICHBAKASHATHECHZER(String value) {
								this.taarichbakashathechzer = value;
							}

							@Override
							public BigDecimal getSACHTASHLUMIMPTURIM() {
								return sachtashlumimpturim;
							}

							public void setSACHTASHLUMIMPTURIM(BigDecimal value) {
								this.sachtashlumimpturim = value;
							}
							
							@Override
							@JsonIgnore
							public BigDecimal getSHIURHAFRASHACHAZUI() {
								return null;
							}
							
							@Override
							@JsonIgnore
							public BigDecimal getSHIURHAFRASHAMETZUPE() {
								return null;
							}

							@Override
							public BigDecimal getSHIURKISUI() {
								return shiurkisui;
							}
							
							public void setSHIURKISUI(BigDecimal value) {
								this.shiurkisui = value;
							}
							
							@Override
							@JsonIgnore
							public BigDecimal getSCHUMHAFRASHAMETZUPE() {
								return null;
							}
							
							@Override
							public BigDecimal getSHIURHAFRASHANOCHECHI() {
								return shiurhafrashanochechi;
							}
							
							public void setSHIURHAFRASHANOCHECHI(BigDecimal value) {
								this.shiurhafrashanochechi = value;
							}
							
							@Override
							public BigDecimal getSHIURHAFRASHAATIDI() {
								return shiurhafrashaatidi;
							}
							
							public void setSHIURHAFRASHAATIDI(BigDecimal value) {
								this.shiurhafrashaatidi = value;
							}
							
							@Override
							public String getTAARICHIDKUNTZAFUI() {
								return taarichidkuntzafui;
							}
							
							public void setTAARICHIDKUNTZAFUI(String value) {
								this.taarichidkuntzafui = value;
							}
							
							@Override
							public Integer getSIBATIDKUNTAARIF() {
								return sibatidkuntaarif;
							}
							
							public void setSIBATIDKUNTAARIF(Integer value) {
								this.sibatidkuntaarif = value;
							}

							@Override
							@JsonIgnore
							public BigDecimal getSCHUMHAFRASHACHAZUI() {
								return null;
							}

							
							@Override
							public String getKODMEZAHEKUPAHP() {
								return kodmezahekupahp;
							}

							public void setKODMEZAHEKUPAHP(String value) {
								this.kodmezahekupahp = value;
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
		protected MesakemV04Model.KoteretKovetz.NetuneiGoremSholech netuneiGoremSholech;
		@XmlElement(name = "NetuneiGoremNimaan", required = true)
		protected MesakemV04Model.KoteretKovetz.NetuneiGoremNimaan netuneiGoremNimaan;

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

		public MesakemV04Model.KoteretKovetz.NetuneiGoremSholech getNetuneiGoremSholech() {
			return netuneiGoremSholech;
		}

		public void setNetuneiGoremSholech(MesakemV04Model.KoteretKovetz.NetuneiGoremSholech value) {
			this.netuneiGoremSholech = value;
		}

		public MesakemV04Model.KoteretKovetz.NetuneiGoremNimaan getNetuneiGoremNimaan() {
			return netuneiGoremNimaan;
		}

		public void setNetuneiGoremNimaan(MesakemV04Model.KoteretKovetz.NetuneiGoremNimaan value) {
			this.netuneiGoremNimaan = value;
		}

		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "kodnimaan", "sugmezahenimaan", "misparzihuinimaan",
				"misparzihuietzelyatzrannimaan" })

		public static class NetuneiGoremNimaan implements KoteretKovetzBase.NetuneiGoremNimaanBase {

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
			
			@Override
			@JsonIgnore
			public String getMISPARZIHUIETZELYATZRANNIMAAN() {
				return null;
			}
		}
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "misparyatzranim", "misparmaasikim", "misparreshumot", "misparamitim",
			"sachhafrashotbakovetz" })

	public static class ReshumatSgira implements ReshumatSgiraBase {

		@XmlElement(name = "MISPAR-YATZRANIM", nillable = true)
		protected Integer misparyatzranim;
		@XmlElement(name = "MISPAR-MAASIKIM")
		protected int misparmaasikim;
		@XmlElement(name = "MISPAR-RESHUMOT")
		protected int misparreshumot;
		@XmlElement(name = "MISPAR-AMITIM")
		protected int misparamitim;
		@XmlElement(name = "SACH-HAFRASHOT-BAKOVETZ", required = true, nillable = true)
		protected BigDecimal sachhafrashotbakovetz;

		@Override
		public Integer getMISPARYATZRANIM() {
			return misparyatzranim;
		}

		public void setMISPARYATZRANIM(Integer value) {
			this.misparyatzranim = value;
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

		@Override
		public BigDecimal getSACHHAFRASHOTBAKOVETZ() {
			return sachhafrashotbakovetz;
		}

		public void setSACHHAFRASHOTBAKOVETZ(BigDecimal value) {
			this.sachhafrashotbakovetz = value;
		}

	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).toString();
	}
}
