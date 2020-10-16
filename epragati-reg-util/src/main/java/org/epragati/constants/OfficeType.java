package org.epragati.constants;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

public enum OfficeType {

	RTA("RTA"),
	UNI("UNI"),
	MVI("MVI"),
	DT("DT"),
	CP("CP");
	String code;
	private OfficeType(String code) {
		this.code = code;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	
	public static OfficeType getCode(String code){

		if (StringUtils.isBlank(code)) {
			return null;
		}
		return Arrays.stream(OfficeType.values()).filter(c->c.getCode().equals(code)).findAny().orElse(null);
	}
}
