package org.epragati.constants;

import org.apache.commons.lang3.StringUtils;

public enum OwnerTypeEnum {

	Individual("INV"), Company("CMPY"), Government("GOVN"), Organization("ORG"), POLICE("POLICE"), Stu(
			"STU"), Diplomatic("Diplomatic");

	private String code;

	OwnerTypeEnum(String code) {
		this.code = code;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	public static OwnerTypeEnum getOwnerType(String code) {

		OwnerTypeEnum ownerTypeEnum = null;

		if (StringUtils.isBlank(code)) {
			return ownerTypeEnum;
		}

		switch (code) {
		case "INV":
			ownerTypeEnum = Individual;
			break;

		case "CMPY":
			ownerTypeEnum = Company;
			break;

		case "GOVN":
			ownerTypeEnum = Government;
			break;

		case "ORG":
			ownerTypeEnum = Organization;
			break;

		case "POLICE":
			ownerTypeEnum = POLICE;
			break;

		case "STU":
			ownerTypeEnum = Stu;
			break;
		case "Diplomatic":
			ownerTypeEnum = Diplomatic;
			break;

		}
		return ownerTypeEnum;
	}

}
