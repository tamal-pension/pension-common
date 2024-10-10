package com.tamal.pension.common.jaxb.negative;

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
import com.tamal.pension.common.jaxb.ReshumatSgiraBase;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "koteretKovetz", "gufHamimshak", "reshumatSgira" })
@XmlRootElement(name = "MimshakMaasikim")
public class NegativeV01Model implements NegativeModel {

	@XmlElement(name = "KoteretKovetz", required = true)
	protected NegativeV01Model.KoteretKovetz koteretKovetz;
	@XmlElement(name = "GufHamimshak", required = true)
	protected GufHamimshak gufHamimshak;
	@XmlElement(name = "ReshumatSgira", required = true)
	protected NegativeV01Model.ReshumatSgira reshumatSgira;

	@Override
	public NegativeV01Model.KoteretKovetz getKoteretKovetz() {
		return koteretKovetz;
	}

	public void setKoteretKovetz(NegativeV01Model.KoteretKovetz value) {
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
	public NegativeV01Model.ReshumatSgira getReshumatSgira() {
		return reshumatSgira;
	}

	public void setReshumatSgira(NegativeV01Model.ReshumatSgira value) {
		this.reshumatSgira = value;
	}

	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = { "yeshutGoremPoneLemislaka" })
	public static class GufHamimshak implements GufHamimshakBase {

		@XmlElement(name = "YeshutGoremPoneLemislaka", required = true)
		protected List<NegativeV01Model.GufHamimshak.YeshutGoremPoneLemislaka> yeshutGoremPoneLemislaka;

		@Override
		public List<NegativeV01Model.GufHamimshak.YeshutGoremPoneLemislaka> getYeshutGoremPoneLemislaka() {
			if (yeshutGoremPoneLemislaka == null) {
				yeshutGoremPoneLemislaka = new ArrayList<NegativeV01Model.GufHamimshak.YeshutGoremPoneLemislaka>();
			}
			return this.yeshutGoremPoneLemislaka;
		}

		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = { "sugpone", "sugkodmezahepone", "misparmezahepone", "shemgorempone",
				"misparmezahemetafel", "shempratiponelemislaka", "shemmishpachaponelemislaka",
				"mispartelephonekaviponelemislaka", "emailponelemislaka", "misparcellulari", "pirteiHaavaratKsafim" })
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
			@XmlElement(name = "PirteiHaavaratKsafim", required = true)
			protected List<NegativeV01Model.GufHamimshak.YeshutGoremPoneLemislaka.PirteiHaavaratKsafim> pirteiHaavaratKsafim;

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
			public List<NegativeV01Model.GufHamimshak.YeshutGoremPoneLemislaka.PirteiHaavaratKsafim> getPirteiHaavaratKsafim() {
				if (pirteiHaavaratKsafim == null) {
					pirteiHaavaratKsafim = new ArrayList<NegativeV01Model.GufHamimshak.YeshutGoremPoneLemislaka.PirteiHaavaratKsafim>();
				}
				return this.pirteiHaavaratKsafim;
			}

			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = { "kodmezahekupahp", "sugmafkid", "sugmezahemaasik", "misparzihuymaasik",
					"kodmezahemaasiketzelyatzran", "kodmasav", "shemmaasik", "sugpeula", "kodemtzaitashlum",
					"sachhafkadakupahp", "taaricherechhafkadalekupa", "taaricherechhafkadacheshbonnehemanut",
					"misparasmachtaleahavaratksafim", "misparzihui", "misparbankmaasik", "misparsnifmaasik",
					"misparcheshbonmaasik", "sugcheshbon", "sugkartismaasik", "sugcheshbonmaasik",
					"sugcheshbonkolettashlum", "misparbankkolet", "misparsnifkolet", "misparcheshbonkolet",
					"misparzihuikodem", "misparmislaka", "misparmislakakodem", "zihuiShemMismachBeramatEirua",
					"pirteiKupa" })
			public static class PirteiHaavaratKsafim implements PirteiHaavaratKsafimBase {

				@XmlElement(name = "KOD-MEZAHE-KUPA-H-P", required = true)
				protected String kodmezahekupahp;
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
				@XmlElement(name = "SUG-PEULA")
				protected int sugpeula;
				@XmlElement(name = "KOD-EMTZAI-TASHLUM", required = true, type = Integer.class, nillable = true)
				protected Integer kodemtzaitashlum;
				@XmlElement(name = "SACH-HAFKADA-KUPA-H-P", required = true)
				protected BigDecimal sachhafkadakupahp;
				@XmlElement(name = "TAARICH-ERECH-HAFKADA-LEKUPA", required = true, nillable = true)
				protected String taaricherechhafkadalekupa;
				@XmlElement(name = "TAARICH-ERECH-HAFKADA-CHESHBON-NEHEMANUT", required = true, nillable = true)
				protected String taaricherechhafkadacheshbonnehemanut;
				@XmlElement(name = "MISPAR-ASMACHTA-LEAHAVARAT-KSAFIM", required = true, nillable = true)
				protected String misparasmachtaleahavaratksafim;
				@XmlElement(name = "MISPAR-ZIHUI", required = true, nillable = true)
				protected String misparzihui;
				@XmlElement(name = "MISPAR-BANK-MAASIK", required = true, nillable = true)
				protected String misparbankmaasik;
				@XmlElement(name = "MISPAR-SNIF-MAASIK", required = true, nillable = true)
				protected String misparsnifmaasik;
				@XmlElement(name = "MISPAR-CHESHBON-MAASIK", required = true, nillable = true)
				protected String misparcheshbonmaasik;
				@XmlElement(name = "SUG-CHESHBON", required = true, nillable = true)
				protected String sugcheshbon;
				@XmlElement(name = "SUG-KARTIS-MAASIK", required = true, type = Integer.class, nillable = true)
				protected Integer sugkartismaasik;
				@XmlElement(name = "SUG-CHESHBON-MAASIK", required = true, type = Integer.class, nillable = true)
				protected Integer sugcheshbonmaasik;
				@XmlElement(name = "SUG-CHESHBON-KOLET-TASHLUM", required = true, type = Integer.class, nillable = true)
				protected Integer sugcheshbonkolettashlum;
				@XmlElement(name = "MISPAR-BANK-KOLET", required = true, nillable = true)
				protected String misparbankkolet;
				@XmlElement(name = "MISPAR-SNIF-KOLET", required = true, nillable = true)
				protected String misparsnifkolet;
				@XmlElement(name = "MISPAR-CHESHBON-KOLET", required = true, nillable = true)
				protected String misparcheshbonkolet;
				@XmlElement(name = "MISPAR-ZIHUI-KODEM", required = true, nillable = true)
				protected String misparzihuikodem;
				@XmlElement(name = "MISPAR-MISLAKA", required = true, nillable = true)
				protected String misparmislaka;
				@XmlElement(name = "MISPAR-MISLAKA-KODEM", required = true, nillable = true)
				protected String misparmislakakodem;
				@XmlElement(name = "ZihuiShemMismachBeramatEirua", required = true)
				protected List<NegativeV01Model.GufHamimshak.YeshutGoremPoneLemislaka.PirteiHaavaratKsafim.ZihuiShemMismachBeramatEirua> zihuiShemMismachBeramatEirua;
				@XmlElement(name = "PirteiKupa")
				protected List<NegativeV01Model.GufHamimshak.YeshutGoremPoneLemislaka.PirteiHaavaratKsafim.PirteiKupa> pirteiKupa;

				@Override
				public String getKODMEZAHEKUPAHP() {
					return kodmezahekupahp;
				}

				public void setKODMEZAHEKUPAHP(String value) {
					this.kodmezahekupahp = value;
				}

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
				
				@Override
				@JsonIgnore
				public String getMISPARTIKNIKUIMMAASIK() {
					return null;
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
				@JsonIgnore
				public String getSHEMPRATIISHKESHERMAASIK() {
					return null;
				}
				
				@Override
				@JsonIgnore
				public String getSHEMMISHPACHAISHKESHERMAASIK() {
					return null;
				}
				
				@Override
				@JsonIgnore
				public String getMISPARTELEPHONEKAVIISHKESHERMAASIK() {
					return null;
				}
				
				@Override
				@JsonIgnore
				public String getEMAILISHKESHERMAASIK() {
					return null;
				}
				
				@Override
				@JsonIgnore
				public String getMISPARCELLULARIISHKESHERMAASIK() {
					return null;
				}
				
				@Override
				public int getSUGPEULA() {
					return sugpeula;
				}

				public void setSUGPEULA(int value) {
					this.sugpeula = value;
				}

				@Override
				public Integer getKODEMTZAITASHLUM() {
					return kodemtzaitashlum;
				}

				public void setKODEMTZAITASHLUM(Integer value) {
					this.kodemtzaitashlum = value;
				}

				@Override
				public BigDecimal getSACHHAFKADAKUPAHP() {
					return sachhafkadakupahp;
				}

				public void setSACHHAFKADAKUPAHP(BigDecimal value) {
					this.sachhafkadakupahp = value;
				}

				@Override
				public String getTAARICHERECHHAFKADALEKUPA() {
					return taaricherechhafkadalekupa;
				}

				public void setTAARICHERECHHAFKADALEKUPA(String value) {
					this.taaricherechhafkadalekupa = value;
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
				public String getMISPARZIHUI() {
					return misparzihui;
				}

				public void setMISPARZIHUI(String value) {
					this.misparzihui = value;
				}

				@Override
				public String getMISPARBANKMAASIK() {
					return misparbankmaasik;
				}

				public void setMISPARBANKMAASIK(String value) {
					this.misparbankmaasik = value;
				}

				@Override
				public String getMISPARSNIFMAASIK() {
					return misparsnifmaasik;
				}

				public void setMISPARSNIFMAASIK(String value) {
					this.misparsnifmaasik = value;
				}

				@Override
				public String getMISPARCHESHBONMAASIK() {
					return misparcheshbonmaasik;
				}

				public void setMISPARCHESHBONMAASIK(String value) {
					this.misparcheshbonmaasik = value;
				}

				@Override
				public String getSUGCHESHBON() {
					return sugcheshbon;
				}

				public void setSUGCHESHBON(String value) {
					this.sugcheshbon = value;
				}

				@Override
				public Integer getSUGKARTISMAASIK() {
					return sugkartismaasik;
				}

				public void setSUGKARTISMAASIK(Integer value) {
					this.sugkartismaasik = value;
				}

				@Override
				public Integer getSUGCHESHBONMAASIK() {
					return sugcheshbonmaasik;
				}

				public void setSUGCHESHBONMAASIK(Integer value) {
					this.sugcheshbonmaasik = value;
				}

				@Override
				public Integer getSUGCHESHBONKOLETTASHLUM() {
					return sugcheshbonkolettashlum;
				}

				public void setSUGCHESHBONKOLETTASHLUM(Integer value) {
					this.sugcheshbonkolettashlum = value;
				}

				@Override
				public String getMISPARBANKKOLET() {
					return misparbankkolet;
				}

				public void setMISPARBANKKOLET(String value) {
					this.misparbankkolet = value;
				}

				@Override
				public String getMISPARSNIFKOLET() {
					return misparsnifkolet;
				}

				public void setMISPARSNIFKOLET(String value) {
					this.misparsnifkolet = value;
				}

				@Override
				public String getMISPARCHESHBONKOLET() {
					return misparcheshbonkolet;
				}

				public void setMISPARCHESHBONKOLET(String value) {
					this.misparcheshbonkolet = value;
				}

				@Override
				public String getMISPARZIHUIKODEM() {
					return misparzihuikodem;
				}

				public void setMISPARZIHUIKODEM(String value) {
					this.misparzihuikodem = value;
				}

				@Override
				public String getMISPARMISLAKA() {
					return misparmislaka;
				}

				public void setMISPARMISLAKA(String value) {
					this.misparmislaka = value;
				}

				@Override
				public String getMISPARMISLAKAKODEM() {
					return misparmislakakodem;
				}

				public void setMISPARMISLAKAKODEM(String value) {
					this.misparmislakakodem = value;
				}

				@Override
				public List<NegativeV01Model.GufHamimshak.YeshutGoremPoneLemislaka.PirteiHaavaratKsafim.ZihuiShemMismachBeramatEirua> getZihuiShemMismachBeramatEirua() {
					if (zihuiShemMismachBeramatEirua == null) {
						zihuiShemMismachBeramatEirua = new ArrayList<NegativeV01Model.GufHamimshak.YeshutGoremPoneLemislaka.PirteiHaavaratKsafim.ZihuiShemMismachBeramatEirua>();
					}
					return this.zihuiShemMismachBeramatEirua;
				}

				@Override
				public List<NegativeV01Model.GufHamimshak.YeshutGoremPoneLemislaka.PirteiHaavaratKsafim.PirteiKupa> getPirteiKupa() {
					if (pirteiKupa == null) {
						pirteiKupa = new ArrayList<NegativeV01Model.GufHamimshak.YeshutGoremPoneLemislaka.PirteiHaavaratKsafim.PirteiKupa>();
					}
					return this.pirteiKupa;
				}

				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = { "sugkupa", "sugkerenpensia", "shemkupaetzelmaasik",
						"misparkupaetzelmaasik", "pirteiOved", "sachHafrashaLeKupaMaasik" })
				public static class PirteiKupa implements PirteiKupaBase {

					@XmlElement(name = "SUG-KUPA")
					protected int sugkupa;
					@XmlElement(name = "SUG-KEREN-PENSIA", required = true, type = Integer.class, nillable = true)
					protected Integer sugkerenpensia;
					@XmlElement(name = "SHEM-KUPA-ETZEL-MAASIK", required = true, nillable = true)
					protected String shemkupaetzelmaasik;
					@XmlElement(name = "MISPAR-KUPA-ETZEL-MAASIK", required = true, nillable = true)
					protected String misparkupaetzelmaasik;
					@XmlElement(name = "PirteiOved", required = true)
					protected List<NegativeV01Model.GufHamimshak.YeshutGoremPoneLemislaka.PirteiHaavaratKsafim.PirteiKupa.PirteiOved> pirteiOved;
					@XmlElement(name = "SachHafrashaLeKupaMaasik", required = true)
					protected SachHafrashaLeKupaMaasik sachHafrashaLeKupaMaasik;

					@Override
					public int getSUGKUPA() {
						return sugkupa;
					}

					public void setSUGKUPA(int value) {
						this.sugkupa = value;
					}

					@Override
					public Integer getSUGKERENPENSIA() {
						return sugkerenpensia;
					}

					public void setSUGKERENPENSIA(Integer value) {
						this.sugkerenpensia = value;
					}

					@Override
					public String getSHEMKUPAETZELMAASIK() {
						return shemkupaetzelmaasik;
					}

					public void setSHEMKUPAETZELMAASIK(String value) {
						this.shemkupaetzelmaasik = value;
					}

					@Override
					public String getMISPARKUPAETZELMAASIK() {
						return misparkupaetzelmaasik;
					}

					public void setMISPARKUPAETZELMAASIK(String value) {
						this.misparkupaetzelmaasik = value;
					}

					@Override
					public List<NegativeV01Model.GufHamimshak.YeshutGoremPoneLemislaka.PirteiHaavaratKsafim.PirteiKupa.PirteiOved> getPirteiOved() {
						if (pirteiOved == null) {
							pirteiOved = new ArrayList<NegativeV01Model.GufHamimshak.YeshutGoremPoneLemislaka.PirteiHaavaratKsafim.PirteiKupa.PirteiOved>();
						}
						return this.pirteiOved;
					}

					@Override
					public SachHafrashaLeKupaMaasik getSachHafrashaLeKupaMaasik() {
						return sachHafrashaLeKupaMaasik;
					}

					public void setSachHafrashaLeKupaMaasik(SachHafrashaLeKupaMaasik value) {
						this.sachHafrashaLeKupaMaasik = value;
					}

					@XmlAccessorType(XmlAccessType.FIELD)
					@XmlType(name = "", propOrder = { "sugmezaheoved", "misparmezahe", "shemprati", "shemmishpacha",
							"taarichleida", "misparovedetzelmaasik", "kodmezahemaasiketzelyatzran",
							"chodeshMaskoretVestatusOved", "sachHafrashaLeOvedBekupa" })
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
						@XmlElement(name = "KOD-MEZAHE-MAASIK-ETZEL-YATZRAN", required = true, nillable = true)
						protected String kodmezahemaasiketzelyatzran;
						@XmlElement(name = "ChodeshMaskoretVestatusOved", required = true)
						protected List<NegativeV01Model.GufHamimshak.YeshutGoremPoneLemislaka.PirteiHaavaratKsafim.PirteiKupa.PirteiOved.ChodeshMaskoretVestatusOved> chodeshMaskoretVestatusOved;
						@XmlElement(name = "SachHafrashaLeOvedBekupa", required = true)
						protected SachHafrashaLeOvedBekupa sachHafrashaLeOvedBekupa;

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
						public String getKODMEZAHEMAASIKETZELYATZRAN() {
							return kodmezahemaasiketzelyatzran;
						}

						public void setKODMEZAHEMAASIKETZELYATZRAN(String value) {
							this.kodmezahemaasiketzelyatzran = value;
						}

						@Override
						public List<NegativeV01Model.GufHamimshak.YeshutGoremPoneLemislaka.PirteiHaavaratKsafim.PirteiKupa.PirteiOved.ChodeshMaskoretVestatusOved> getChodeshMaskoretVestatusOved() {
							if (chodeshMaskoretVestatusOved == null) {
								chodeshMaskoretVestatusOved = new ArrayList<NegativeV01Model.GufHamimshak.YeshutGoremPoneLemislaka.PirteiHaavaratKsafim.PirteiKupa.PirteiOved.ChodeshMaskoretVestatusOved>();
							}
							return this.chodeshMaskoretVestatusOved;
						}

						@Override
						public SachHafrashaLeOvedBekupa getSachHafrashaLeOvedBekupa() {
							return sachHafrashaLeOvedBekupa;
						}

						public void setSachHafrashaLeOvedBekupa(SachHafrashaLeOvedBekupa value) {
							this.sachHafrashaLeOvedBekupa = value;
						}

						@XmlAccessorType(XmlAccessType.FIELD)
						@XmlType(name = "", propOrder = { "chodeshmaskoret", "mahamadhafkadabekupa", "sugtakbul",
								"sacharmeduvach", "statusovedbechodeshmaskoret", "taarichtchilatstatus",
								"chelkiutmisra", "yemeiavodabechodesh", "misparpolisaoheshbon",
								"pizulHafrashotOvedBeKupa", "sachHafrashaLeKupaBechodeshMaskoretOved" })
						public static class ChodeshMaskoretVestatusOved implements ChodeshMaskoretVestatusOvedBase {

							@XmlElement(name = "CHODESH-MASKORET", required = true)
							protected String chodeshmaskoret;
							@XmlElement(name = "MAHAMAD-HAFKADA-BEKUPA", required = true, type = Integer.class, nillable = true)
							protected Integer mahamadhafkadabekupa;
							@XmlElement(name = "SUG-TAKBUL")
							protected int sugtakbul;
							@XmlElement(name = "SACHAR-MEDUVACH", required = true, nillable = true)
							protected BigDecimal sacharmeduvach;
							@XmlElement(name = "STATUS-OVED-BECHODESH-MASKORET", required = true, type = Integer.class, nillable = true)
							protected Integer statusovedbechodeshmaskoret;
							@XmlElement(name = "TAARICH-TCHILAT-STATUS", required = true, nillable = true)
							protected String taarichtchilatstatus;
							@XmlElement(name = "CHELKIUT-MISRA", required = true, nillable = true)
							protected BigDecimal chelkiutmisra;
							@XmlElement(name = "YEMEI-AVODA-BECHODESH", required = true, type = Integer.class, nillable = true)
							protected Integer yemeiavodabechodesh;
							@XmlElement(name = "MISPAR-POLISA-O-HESHBON", required = true, nillable = true)
							protected String misparpolisaoheshbon;
							@XmlElement(name = "PizulHafrashotOvedBeKupa", required = true)
							protected List<NegativeV01Model.GufHamimshak.YeshutGoremPoneLemislaka.PirteiHaavaratKsafim.PirteiKupa.PirteiOved.ChodeshMaskoretVestatusOved.PizulHafrashotOvedBeKupa> pizulHafrashotOvedBeKupa;
							@XmlElement(name = "SachHafrashaLeKupaBechodeshMaskoretOved", required = true)
							protected SachHafrashaLeKupaBechodeshMaskoretOved sachHafrashaLeKupaBechodeshMaskoretOved;

							@Override
							public String getCHODESHMASKORET() {
								return chodeshmaskoret;
							}

							public void setCHODESHMASKORET(String value) {
								this.chodeshmaskoret = value;
							}

							@Override
							public Integer getMAHAMADHAFKADABEKUPA() {
								return mahamadhafkadabekupa;
							}

							public void setMAHAMADHAFKADABEKUPA(Integer value) {
								this.mahamadhafkadabekupa = value;
							}

							@Override
							public int getSUGTAKBUL() {
								return sugtakbul;
							}

							public void setSUGTAKBUL(int value) {
								this.sugtakbul = value;
							}
							
							@Override
							@JsonIgnore
							public Integer getROVEDSACHAR() {
								return null;
							}
							
							@Override
							@JsonIgnore
							public Integer getSIBATBAKASHLECHZERKSAFIM() {
								return null;
							}

							@Override
							public BigDecimal getSACHARMEDUVACH() {
								return sacharmeduvach;
							}

							public void setSACHARMEDUVACH(BigDecimal value) {
								this.sacharmeduvach = value;
							}

							@Override
							public Integer getSTATUSOVEDBECHODESHMASKORET() {
								return statusovedbechodeshmaskoret;
							}

							public void setSTATUSOVEDBECHODESHMASKORET(Integer value) {
								this.statusovedbechodeshmaskoret = value;
							}

							@Override
							public String getTAARICHTCHILATSTATUS() {
								return taarichtchilatstatus;
							}

							public void setTAARICHTCHILATSTATUS(String value) {
								this.taarichtchilatstatus = value;
							}

							@Override
							public BigDecimal getCHELKIUTMISRA() {
								return chelkiutmisra;
							}

							public void setCHELKIUTMISRA(BigDecimal value) {
								this.chelkiutmisra = value;
							}

							@Override
							public Integer getYEMEIAVODABECHODESH() {
								return yemeiavodabechodesh;
							}

							public void setYEMEIAVODABECHODESH(Integer value) {
								this.yemeiavodabechodesh = value;
							}

							@Override
							public String getMISPARPOLISAOHESHBON() {
								return misparpolisaoheshbon;
							}

							public void setMISPARPOLISAOHESHBON(String value) {
								this.misparpolisaoheshbon = value;
							}

							@Override
							public List<NegativeV01Model.GufHamimshak.YeshutGoremPoneLemislaka.PirteiHaavaratKsafim.PirteiKupa.PirteiOved.ChodeshMaskoretVestatusOved.PizulHafrashotOvedBeKupa> getPizulHafrashotOvedBeKupa() {
								if (pizulHafrashotOvedBeKupa == null) {
									pizulHafrashotOvedBeKupa = new ArrayList<NegativeV01Model.GufHamimshak.YeshutGoremPoneLemislaka.PirteiHaavaratKsafim.PirteiKupa.PirteiOved.ChodeshMaskoretVestatusOved.PizulHafrashotOvedBeKupa>();
								}
								return this.pizulHafrashotOvedBeKupa;
							}

							@Override
							public SachHafrashaLeKupaBechodeshMaskoretOved getSachHafrashaLeKupaBechodeshMaskoretOved() {
								return sachHafrashaLeKupaBechodeshMaskoretOved;
							}

							public void setSachHafrashaLeKupaBechodeshMaskoretOved(
									SachHafrashaLeKupaBechodeshMaskoretOved value) {
								this.sachHafrashaLeKupaBechodeshMaskoretOved = value;
							}

							@XmlAccessorType(XmlAccessType.FIELD)
							@XmlType(name = "", propOrder = { "sughafrasha", "shiurhafrasha", "schumhafrasha",
									"sachtashlumimpturim", "misparmezahereshuma", "misparmezahereshumakodem" })
							public static class PizulHafrashotOvedBeKupa implements PizulHafrashotOvedBeKupaBase {

								@XmlElement(name = "SUG-HAFRASHA")
								protected int sughafrasha;
								@XmlElement(name = "SHIUR-HAFRASHA", required = true, nillable = true)
								protected BigDecimal shiurhafrasha;
								@XmlElement(name = "SCHUM-HAFRASHA", required = true)
								protected BigDecimal schumhafrasha;
								@XmlElement(name = "SACH-TASHLUMIM-PTURIM", required = true, nillable = true)
								protected BigDecimal sachtashlumimpturim;
								@XmlElement(name = "MISPAR-MEZAHE-RESHUMA", required = true)
								protected String misparmezahereshuma;
								@XmlElement(name = "MISPAR-MEZAHE-RESHUMA-KODEM", required = true, nillable = true)
								protected String misparmezahereshumakodem;

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

								@Override
								public String getMISPARMEZAHERESHUMA() {
									return misparmezahereshuma;
								}

								public void setMISPARMEZAHERESHUMA(String value) {
									this.misparmezahereshuma = value;
								}

								@Override
								public String getMISPARMEZAHERESHUMAKODEM() {
									return misparmezahereshumakodem;
								}

								public void setMISPARMEZAHERESHUMAKODEM(String value) {
									this.misparmezahereshumakodem = value;
								}

							}

							@XmlAccessorType(XmlAccessType.FIELD)
							@XmlType(name = "", propOrder = { "sachhafrashabechodeshmaskoret" })
							public static class SachHafrashaLeKupaBechodeshMaskoretOved
									implements SachHafrashaLeKupaBechodeshMaskoretOvedBase {

								@XmlElement(name = "SACH-HAFRASHA-BECHODESH-MASKORET", required = true)
								protected BigDecimal sachhafrashabechodeshmaskoret;

								@Override
								public BigDecimal getSACHHAFRASHABECHODESHMASKORET() {
									return sachhafrashabechodeshmaskoret;
								}

								public void setSACHHAFRASHABECHODESHMASKORET(BigDecimal value) {
									this.sachhafrashabechodeshmaskoret = value;
								}

							}

						}

						@XmlAccessorType(XmlAccessType.FIELD)
						@XmlType(name = "", propOrder = { "sachhafrashaleovedbekupa" })
						public static class SachHafrashaLeOvedBekupa implements SachHafrashaLeOvedBekupaBase {

							@XmlElement(name = "SACH-HAFRASHA-LEOVED-BEKUPA", required = true)
							protected BigDecimal sachhafrashaleovedbekupa;

							@Override
							public BigDecimal getSACHHAFRASHALEOVEDBEKUPA() {
								return sachhafrashaleovedbekupa;
							}

							public void setSACHHAFRASHALEOVEDBEKUPA(BigDecimal value) {
								this.sachhafrashaleovedbekupa = value;
							}

						}

						@Override
						@JsonIgnore
						public String getShemyeshuv() {
							return null;
						}

						@Override
						@JsonIgnore
						public String getShemrechov() {
							return null;
						}

						@Override
						@JsonIgnore
						public String getMisparbait() {
							return null;
						}

						@Override
						@JsonIgnore
						public Integer getMispardira() {
							return null;
						}

						@Override
						@JsonIgnore
						public Integer getMikud() {
							return null;
						}

						@Override
						@JsonIgnore
						public Integer getTadoar() {
							return null;
						}

						@Override
						@JsonIgnore
						public String getEmail() {
							return null;
						}

						@Override
						@JsonIgnore
						public String getMisparcellulari() {
							return null;
						}

						@Override
						@JsonIgnore
						public Integer getMin() {
							return null;
						}

						@Override
						@JsonIgnore
						public String getMoedtchilatahasakatoved() {
							return null;
						}
						
						@Override
						@JsonIgnore
						public Integer getHASHAVAKIBUTZI() {
							return null;
						}
						
						@Override
						@JsonIgnore
						public Integer getHATZHARATOVED() {
							return null;
						}
						
						@Override
						@JsonIgnore
						public Integer getSEIFARBAESRELAOVED() {
							return null;
						}

					}

					@XmlAccessorType(XmlAccessType.FIELD)
					@XmlType(name = "", propOrder = { "sachhafrashalekupaberamatmaasik",
							"sachhafkadalekupaberamatmaasik", "misparamitimberamatmaasik" })
					public static class SachHafrashaLeKupaMaasik implements SachHafrashaLeKupaMaasikBase {

						@XmlElement(name = "SACH-HAFRASHA-LEKUPA-BERAMAT-MAASIK", required = true)
						protected BigDecimal sachhafrashalekupaberamatmaasik;
						@XmlElement(name = "SACH-HAFKADA-LEKUPA-BERAMAT-MAASIK", required = true)
						protected BigDecimal sachhafkadalekupaberamatmaasik;
						@XmlElement(name = "MISPAR-AMITIM-BERAMAT-MAASIK")
						protected int misparamitimberamatmaasik;

						@Override
						public BigDecimal getSACHHAFRASHALEKUPABERAMATMAASIK() {
							return sachhafrashalekupaberamatmaasik;
						}

						public void setSACHHAFRASHALEKUPABERAMATMAASIK(BigDecimal value) {
							this.sachhafrashalekupaberamatmaasik = value;
						}

						@Override
						public BigDecimal getSACHHAFKADALEKUPABERAMATMAASIK() {
							return sachhafkadalekupaberamatmaasik;
						}

						public void setSACHHAFKADALEKUPABERAMATMAASIK(BigDecimal value) {
							this.sachhafkadalekupaberamatmaasik = value;
						}

						@Override
						public Integer getMISPARAMITIMBERAMATMAASIK() {
							return misparamitimberamatmaasik;
						}

						public void setMISPARAMITIMBERAMATMAASIK(Integer value) {
							this.misparamitimberamatmaasik = value;
						}

					}

				}

				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = { "shemkovetzshelmismachberamateiruaveberamatlakoach", "sugmismach" })
				public static class ZihuiShemMismachBeramatEirua implements ZihuiShemMismachBeramatEiruaBase {

					@XmlElement(name = "SHEM-KOVETZ-SHEL-MISMACH-BERAMAT-EIRUA-VEBERAMAT-LAKOACH", required = true)
					protected String shemkovetzshelmismachberamateiruaveberamatlakoach;
					@XmlElement(name = "SUG-MISMACH")
					protected int sugmismach;

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

				}

				@Override
				@JsonIgnore
				public BigDecimal getSCHUMHAFKADAKOLEL() {
					return null;
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
		protected NegativeV01Model.KoteretKovetz.NetuneiGoremSholech netuneiGoremSholech;
		@XmlElement(name = "NetuneiGoremNimaan", required = true)
		protected NegativeV01Model.KoteretKovetz.NetuneiGoremNimaan netuneiGoremNimaan;

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

		public NegativeV01Model.KoteretKovetz.NetuneiGoremSholech getNetuneiGoremSholech() {
			return netuneiGoremSholech;
		}

		public void setNetuneiGoremSholech(NegativeV01Model.KoteretKovetz.NetuneiGoremSholech value) {
			this.netuneiGoremSholech = value;
		}

		public NegativeV01Model.KoteretKovetz.NetuneiGoremNimaan getNetuneiGoremNimaan() {
			return netuneiGoremNimaan;
		}

		public void setNetuneiGoremNimaan(NegativeV01Model.KoteretKovetz.NetuneiGoremNimaan value) {
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
		@XmlType(name = "", propOrder = { "kodsholech", "sugmezahesholech", "misparzihuisholech", "shemgoremsholech" })
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
	@XmlType(name = "", propOrder = { "misparkupotyatzranimbakovetz", "misparmaasikim", "misparreshumot",
			"misparamitim", "sachhafrashotbakovetz", "sachhafkadotbakovetz" })
	public static class ReshumatSgira implements ReshumatSgiraBase {

		@XmlElement(name = "MISPAR-KUPOT-YATZRANIM-BAKOVETZ")
		protected int misparkupotyatzranimbakovetz;
		@XmlElement(name = "MISPAR-MAASIKIM")
		protected int misparmaasikim;
		@XmlElement(name = "MISPAR-RESHUMOT")
		protected int misparreshumot;
		@XmlElement(name = "MISPAR-AMITIM")
		protected int misparamitim;
		@XmlElement(name = "SACH-HAFRASHOT-BAKOVETZ", required = true)
		protected BigDecimal sachhafrashotbakovetz;
		@XmlElement(name = "SACH-HAFKADOT-BAKOVETZ", required = true)
		protected BigDecimal sachhafkadotbakovetz;

		public int getMISPARKUPOTYATZRANIMBAKOVETZ() {
			return misparkupotyatzranimbakovetz;
		}

		public void setMISPARKUPOTYATZRANIMBAKOVETZ(int value) {
			this.misparkupotyatzranimbakovetz = value;
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

		public BigDecimal getSACHHAFKADOTBAKOVETZ() {
			return sachhafkadotbakovetz;
		}

		public void setSACHHAFKADOTBAKOVETZ(BigDecimal value) {
			this.sachhafkadotbakovetz = value;
		}

	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).toString();
	}
}
