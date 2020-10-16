package org.epragati.util;

public enum SourceEnum {
	
	CFST0(1,"CFST1.0"),CFST1(2,"CFST1.1");
	
	private SourceEnum(Integer code, String desc) {
		this.code = code;
		this.desc = desc;
	}
	private Integer code;
	private String desc;
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	

}
