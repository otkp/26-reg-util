package org.epragati.constants;

public enum NotificationTypeEnum {
	EMAIL("EMAIL"),
	SMS("SMS");
	
	private String type;

	private NotificationTypeEnum(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
