package org.epragati.constants;

/**
 * 
 * @author pbattula
 *
 */
public enum  Flow { 
	
	REGISTRATION_TR(1L, "REGISTRATION_TR","Temporary Registration");
	
	Flow(Long id, String name, String description){
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	private Long id;
	private String name;
	private String description;

	/**
	 * @return the id
	*/
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	
}
