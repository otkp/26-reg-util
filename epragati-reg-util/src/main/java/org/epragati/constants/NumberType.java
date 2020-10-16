package org.epragati.constants;

public enum NumberType {
	SPECIAL("S","Special Number"),
	NORMAL("N","Normal Number"),
	PRIME("P","Prime Number");
	
	String code;
	String description;
	
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
	private NumberType(String code, String description) {
		this.code = code;
		this.description = description;
	}
	
	
}
