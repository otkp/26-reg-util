package org.epragati.util;

public enum RecordStatus {
	
	ACTIVE(1,"ACTIVE"),INACTIVE(2,"INACTIVE"),FUTURE(3,"FUTURE"),OLD(4,"OLD"),ACTIVE_INCOMPLET(5,"ACTIVE_INCOMPLET");
	/**
	 * 
	 * 
	 * 
	 */
	Integer code;
	String description;
	/**
	 * 
	 * @param code
	 * @param description
	 */
	private RecordStatus(Integer code, String description) {
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
