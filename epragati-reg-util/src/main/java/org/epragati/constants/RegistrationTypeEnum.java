package org.epragati.constants;

public enum RegistrationTypeEnum {
 TR("TR"),
PR("PR");
	
	private String type;
	
	RegistrationTypeEnum(String type)
	{
		this.type=type;
	}

	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	
}

	/**
	 * @return the type
	 */
	
