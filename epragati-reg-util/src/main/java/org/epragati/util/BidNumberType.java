package org.epragati.util;

public enum BidNumberType {

	S("S","Special"),
	P("P","Premium"),
	N("N","Normal");
	/**
	 * 
	 */
	String code;
	String description;
	/**
	 * 
	 * @param code
	 * @param description
	 */
	private BidNumberType(String code, String description) {
		this.code = code;
		this.description = description;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
