package org.epragati.constants;

import org.apache.commons.lang3.StringUtils;

public enum PurposeEnum {

	FRESH("FRESH"),RENEWAL("RENEWAL"),TRANSFER("TRANSFER"),VEHICLEREPLACE("VEHICLEREPLACE");
	
	private String code;
	PurposeEnum(String code){
		this.code = code;
	}
	
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	
	public static PurposeEnum getPurposeEnum(String code) {

		PurposeEnum purposeEnum = null;

		if (StringUtils.isBlank(code)) {
			return purposeEnum;
		}

		switch (code) {
		case "FRESH":
			purposeEnum = FRESH;
			break;

		case "RENEWAL":
			purposeEnum = RENEWAL;
			break;

		case "TRNSFER":
			purposeEnum = TRANSFER;
			break;

		case "VEHICLEREPLACE":
			purposeEnum = VEHICLEREPLACE;
			break;


		}
		return purposeEnum;
	}

	
}
