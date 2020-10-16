package org.epragati.util;

import java.util.Arrays;
import java.util.List;

public enum PresentAddressEnum {
 SAMEASAADHAAR("SAME AS AADHAAR"),NONE("NONE"),RATIONCARD("RATION CARD");
	
	private String name;

	PresentAddressEnum(String name){
	this.name=name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static List<String> getOfficersOnly() {
		return Arrays.asList(SAMEASAADHAAR.getName(), NONE.getName(), RATIONCARD.getName());
	}
} 
