package org.epragati.constants;

/**
 * 
 * @author pbattula
 *
 */
public enum FlowAction {

	APPROVED("APPROVED"),
	REJECTED("REJECTED"),
	PENDING("REJECTED"),
	FORWARD("FORWARD");

	private String action;
	
	FlowAction(String action) {
		this.action = action;
	}

	/**
	 * @return the action
	 */
	public String getAction() {
		return action;
	}

	/**
	 * @param action
	 *            the action to set
	 */
	public void setAction(String action) {
		this.action = action;
	}
}