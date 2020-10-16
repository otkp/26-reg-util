package org.epragati.util;

public enum SuspensionEnum {

	APPROVED("APPROVED","approved"),REJECTED("REJECTED","rejected");
	private String status;
	private String desc;
	
	private SuspensionEnum(String status, String desc) {
		this.status = status;
		this.desc = desc;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	
}
