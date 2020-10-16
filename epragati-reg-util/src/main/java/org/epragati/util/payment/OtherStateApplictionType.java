package org.epragati.util.payment;

public enum OtherStateApplictionType {

	ApplicationNO("ApplicationNO"),
	TrNo("TrNo"),
	PrNo("PrNo");
	
	private String code ;
	
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	OtherStateApplictionType(String code) {
		
		this.code = code;
	}
}
