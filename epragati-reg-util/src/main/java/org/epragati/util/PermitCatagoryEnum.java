package org.epragati.util;

public enum PermitCatagoryEnum {
	
	TVP(21),PC(20),EIP(22),PPC(23),NPPUC(24),PTV(24),SBP(25),SSP(26),SPSO(27);
	
	
	
	private PermitCatagoryEnum(Integer catagory) {
		this.catagory = catagory;
	}

	private Integer catagory;

	public Integer getCatagory() {
		return catagory;
	}

	public void setCatagory(Integer catagory) {
		this.catagory = catagory;
	}
	

}
