package org.epragati.util.payment;

public enum TOServiceEnum {
	TODEATH(88,"TODEATH",Boolean.FALSE,"TO DEATH",Boolean.TRUE),
	TOFINANCIER(80,"TOFINANCIER",Boolean.FALSE,"TO FINANCIER",Boolean.TRUE);
	
	private Integer id;
	private String code;
	private Boolean isMVIRequired;
	private String desc;
	private Boolean isEnclouserRequired;
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the isMVIRequired
	 */
	public Boolean getIsMVIRequired() {
		return isMVIRequired;
	}

	/**
	 * @param isMVIRequired the isMVIRequired to set
	 */
	public void setIsMVIRequired(Boolean isMVIRequired) {
		this.isMVIRequired = isMVIRequired;
	}

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

	/**
	 * @return the isEnclouserRequired
	 */
	public Boolean getIsEnclouserRequired() {
		return isEnclouserRequired;
	}

	/**
	 * @param isEnclouserRequired the isEnclouserRequired to set
	 */
	public void setIsEnclouserRequired(Boolean isEnclouserRequired) {
		this.isEnclouserRequired = isEnclouserRequired;
	}

	private TOServiceEnum(Integer id, String code, Boolean isMVIRequired, String desc, Boolean isEnclouserRequired) {
		this.id = id;
		this.code = code;
		this.isMVIRequired = isMVIRequired;
		this.desc = desc;
		this.isEnclouserRequired = isEnclouserRequired;
	}

	
}
