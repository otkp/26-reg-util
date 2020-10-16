package org.epragati.util;

public enum MandalServiceEnum {
	n("n"),
	t("t"),
	h("h"),
	POLICE("POLICE"),
	STU("stu");
	MandalServiceEnum()
	{			
		
	}
	MandalServiceEnum(String desc )
	{
		this.description=desc;
	}
	String description;
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
