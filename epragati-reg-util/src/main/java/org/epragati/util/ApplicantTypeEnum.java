package org.epragati.util;

public enum ApplicantTypeEnum {

	CITIZEN("CITIZEN"),FINANCIER("FINANCIER"),MVI("MVI"),CCO("CCO"),AUCTION("AUCTION"),AO("AO");
	
	private String type;
	
	ApplicantTypeEnum(String type) {
		this.type = type;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	
	public static ApplicantTypeEnum getName(String name) {
		
		ApplicantTypeEnum type = null;
		switch(name)
		{
		case "CITIZEN":
			type= ApplicantTypeEnum.CITIZEN;
		break;
		case "FINANCIER":
			type= ApplicantTypeEnum.FINANCIER;
		break;
		case "MVI":
			type= ApplicantTypeEnum.MVI;
		break;
		case "CCO":
			type= ApplicantTypeEnum.CCO;
		break;
		case "AO":
			type= ApplicantTypeEnum.AO;
		break;
		}
		return type;
	}
}
