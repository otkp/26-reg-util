package org.epragati.util;

public enum CorrectionEnum {
	
	TAXCORRECTION("Tax Corrected"),
	FCCORRECTION("FC Corrected"),
	RCCORRECTION("RC Corrected"),
	PERMITCORRECTION("Permit Corrected");
	
	private String code;
	
	private CorrectionEnum(String code) {
		this.code = code;
	}

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
	


}
