package org.epragati.util;

public enum UserType {
	
	
	CITIZEN(1,"CITIZEN"),RTA(2,"RTA"),SUPPORT(3,"SUPPORT");
	/**
	 * 
	 */
	Integer code;
	String description;
	/**
	 * 
	 * @param code
	 * @param description
	 */
	private UserType(Integer code, String description) {
		this.code = code;
		this.description = description;
	}
	/**
	 * 
	 * @return
	 */
	public Integer getCode() {
		return code;
	}
	/**
	 * 
	 * @param code
	 */
	public void setCode(Integer code) {
		this.code = code;
	}
	/**
	 * 
	 * @return
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
}
