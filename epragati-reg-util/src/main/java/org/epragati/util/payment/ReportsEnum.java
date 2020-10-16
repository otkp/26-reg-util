package org.epragati.util.payment;

public enum ReportsEnum {

	STATEREVENUEREPORT(1, "STATEREVENUEREPORT"), DISTRICTREVENUEREPORT(2, "DISTRICTREVENUEREPORT"),
	VEHICLESTRENGHTREPORT(3, "VEHICLESTRENGHTREPORT"), PERMITREPORT(4, "PERMITREPORT"), VCRREPORT(5, "VCRREPORT"),
	RCSUSPENSIONREPORT(6, "RCSUSPENSIONREPORT"), DEALERREPORT(7, "DEALERREPORT"), FINANCERREPORT(8,"FINANCERREPORT");

	private int id;

	private String description;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

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

	private ReportsEnum(int id, String description) {
		this.id = id;
		this.description = description;
	}

}
