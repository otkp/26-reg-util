package org.epragati.constants;

public enum ActionTypeEnum {

	HPA("HPA"),
	HAT("HAT"),
	FRC("FRC");
	String desc;
	private ActionTypeEnum(String desc) {
		this.desc = desc;
	}
	/**
	 * @return the number
	 */
	public String getDesc() {
		return desc;
	}
	
}
