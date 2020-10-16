package org.epragati.util;

public enum StatusActions {

	APPROVED("APPROVED"),
	REJECTED("REJECTED");
	
	
	private String status;
	
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	StatusActions(String status){
		this.status = status;
	}
	
}
