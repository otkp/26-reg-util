package org.epragati.util;

public enum MobileEnum {
	ACTIVE("Active"), INACTIVE("Inactive");
	MobileEnum(String desc) {
		this.description = desc;
	}
	
	String description;
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public enum Otp {
		
		
		CITIZENSINGUP("Citizensingup"), FORGOTPASSWORD("ForgotPassword");
		
		private String name;
		
		/**
		 * 
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		Otp(String name){
			this.name = name; 
		}
		
	}
}
