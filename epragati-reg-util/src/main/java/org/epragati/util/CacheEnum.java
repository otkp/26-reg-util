package org.epragati.util;

public enum CacheEnum {

	MASTER_COV("MASTER_COV"), OWNERSHIP("OWNERSHIP"), QUALIFICATION("QUALIFICATION"), BLOODGROUP(
			"BLOODGROUP"), INSURANCECOMPANY("INSURANCECOMPANY"), GATEWAY("GATEWAY"), CATEGORY(
					"CATEGORY"), COUNTRY("COUNTRY"), INSURANCETYPE("INSURANCETYPE"), FINANCETYPE("FINANCETYPE");

	private CacheEnum(String key) {
		this.key = key;
	}

	private String key;

	/**
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * @param key
	 *            the key to set
	 */
	public void setKey(String key) {
		this.key = key;
	}

}
