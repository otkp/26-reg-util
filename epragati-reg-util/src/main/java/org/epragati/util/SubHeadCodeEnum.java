package org.epragati.util;

import java.util.Arrays;

public enum SubHeadCodeEnum {
	APPLICATION_FEE("Application","Application Fee"),
	FITNESS_FEE("FF","Fitness Fee"),
	PERMIT_FEE("PE","Permit Fee"),
	QLY_TAX("QT","Qly Fee"),
	LIFE_TAX("LT","Life Fee"),
	GREEN_TAX("GT","Green Tax Fee"),
	SERVICE_FEE("Service Fee","Service Fee"),
	POSTAL_FEE("Postal","Postal Fee"),
	TEST_FEE("TF","Test Fee"),
	CARD_FEE("Card","Card Fee"),
	LATE_FEE("LTF","Late Fee"),
	MEESEVA_FEE("MSF","Meeseva Fee");
	String code;
	String typeDesc;
	SubHeadCodeEnum(String description,String typeDesc){
		this.code=description;
		this.typeDesc=typeDesc;
	}
	public String getCode(){
		return this.code;
	}
	public String getTypeDesc(){
		return this.typeDesc;
	}
	
	public static SubHeadCodeEnum getSubHeadCodeEnum(String code){
		if(code==null) {
			return null;
		}
		return Arrays.stream(SubHeadCodeEnum.values()).filter(statusEnum->statusEnum.getCode().equals(code))
				.findAny().orElse(null);
	}

}
