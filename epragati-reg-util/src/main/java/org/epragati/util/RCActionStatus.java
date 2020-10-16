package org.epragati.util;

public enum RCActionStatus {

	SUSPEND("SUSPEND"),
	REVOKED("REVOKED");
	
	RCActionStatus(String desc) {
		this.description = desc;
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
