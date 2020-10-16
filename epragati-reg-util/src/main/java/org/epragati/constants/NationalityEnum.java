package org.epragati.constants;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

public enum NationalityEnum {

	INDIAN("INDIAN"), NRI("NRI"),AP("AP"), FOREIGNER("FOREIGNER"),IND("IND");
	private String name;

	public String getName() {
		return name;
	}

	NationalityEnum(final String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.getName();
	}
	
	public static NationalityEnum getNationalityEnum(String name){
		
		if(StringUtils.isBlank(name)){
			return null;
		}
		return Arrays.stream(NationalityEnum.values()).filter(nationalityEnum->nationalityEnum.getName().equals(name))
				.findAny().orElse(null);
}
}
