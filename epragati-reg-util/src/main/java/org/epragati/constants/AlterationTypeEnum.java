package org.epragati.constants;

public enum AlterationTypeEnum {

	VEHICLE("Vehicle"), FUEL("Fuel"), BODY("Body"), SEATING("Seating"),WEIGHT("Weight");

	private String type;

	AlterationTypeEnum(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
