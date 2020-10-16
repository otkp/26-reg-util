package org.epragati.util.payment;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * @author krishnarjun.pampana
 *
 */
public enum AxleTypeEnum {
	SINGLE("SINGLE"),
	MULTIPLE("MULTIPLE");
	String desc;

	private AxleTypeEnum(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public static List<AxleTypeEnum> getAxleTypes() {

		return Arrays.asList(SINGLE, MULTIPLE);

	}
	
}
