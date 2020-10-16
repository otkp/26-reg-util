package org.epragati.util;

public enum CfstStatusTypes {



	Y("Y","Yes"),
	N("N","No"),
	OK("OK","OK"),
	Ina("Ina","Invalid"),
	A("A","Active");
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
	private CfstStatusTypes(String code, String description) {
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
