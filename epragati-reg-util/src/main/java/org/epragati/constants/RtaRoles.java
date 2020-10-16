package org.epragati.constants;

public enum RtaRoles {

	CCO("CCO"),MVI("MVI"),AO("AO"),RTA("RTA");
	
	private String desc;

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	private RtaRoles(String desc) {
		this.desc = desc;
	}
	   
	
}
