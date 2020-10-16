package org.epragati.util;

public enum PermitTypeEnum {
	/**
	 * Remaining permittypes not considered in future added
	 * 
	 * CSPP(4,"COUNTER SIGNATURE PERMIT PUCCKA"),
	 * SP(11,"SETWIN PERMIT"),TCP(12,"TAXI CAB PERMIT"),CSP(13,"COUNTER SIGNATURE PERMIT"),
	SSP(14,"SPECIAL PERMIT"),SSPSO(15,"SPECIAL PERMIT FOR SPECIAL OCCASIONS"),STL(16,"SHORT TERM LICENSES")
	 */
	
	AITC(1,"ALL INDIA TOURIST CAB",PermitCatagoryEnum.TVP),
	AITP(2,"ALL INDIA TOURIST PERMIT",PermitCatagoryEnum.TVP),
	CCP(3,"CONTRACT CARRIAGE PERMIT",PermitCatagoryEnum.PC),
	EIB(5,"EDUCATIONAL INSTITUTE PERMIT",PermitCatagoryEnum.EIP),
	GCP(6,"GOODS CARRIAGE PERMIT",PermitCatagoryEnum.PPC),
	NP(7,"NATIONAL PERMIT",PermitCatagoryEnum.NPPUC),
	PSVP(8,"PRIVATE SERVICE VEHICLE PERMIT",PermitCatagoryEnum.PTV),
	SBP(9,"SPARE BUS PERMIT",PermitCatagoryEnum.SBP),
	SCP(10,"STAGE CARRIAGE PERMIT",PermitCatagoryEnum.SBP),
	TCCP(17,"TEMPORARY CONTRACT CARRIAGE PERMIT",PermitCatagoryEnum.PC),
	TGCP(18,"TEMPORARY GOODS CARRIAGE PERMIT",PermitCatagoryEnum.PPC),
	TSCP(19,"TEMPORARY STAGE CARRIAGE PERMIT",PermitCatagoryEnum.SBP),
	SSPSO(15,"SPECIAL PERMIT FOR SPECIAL OCCASIONS",PermitCatagoryEnum.SPSO),
	SSP(20,"SPECIAL PERMIT",PermitCatagoryEnum.SSP);

	
	private PermitTypeEnum(Integer permitId, String permitDesc, PermitCatagoryEnum permitCatagoryEnum) {
		this.permitId = permitId;
		this.permitDesc = permitDesc;
		this.permitCatagoryEnum = permitCatagoryEnum;
	}
	
	private Integer permitId;
	private String permitDesc;
	private PermitCatagoryEnum permitCatagoryEnum;
	
	public Integer getPermitId() {
		return permitId;
	}
	public void setPermitId(Integer permitId) {
		this.permitId = permitId;
	}
	public String getPermitDesc() {
		return permitDesc;
	}
	public void setPermitDesc(String permitDesc) {
		this.permitDesc = permitDesc;
	}
	public PermitCatagoryEnum getPermitCatagoryEnum() {
		return permitCatagoryEnum;
	}
	public void setPermitCatagoryEnum(PermitCatagoryEnum permitCatagoryEnum) {
		this.permitCatagoryEnum = permitCatagoryEnum;
	}

}
