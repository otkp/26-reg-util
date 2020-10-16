package org.epragati.util;

public enum ValidityEnum {

	FCVALIDITY(2,"Years"), 
	TRVALIDITY(30,"Days"),
	PR_NON_TRANSPORT_VALIDITY(15,"Days"),
	PR_TRANSPORT_VALIDITY(2,"Days"),
	GreenTax_NON_TRANSPORT_VALIDITY(15,"years"),
	GreenTax__TRANSPORT_VALIDITY(7,"years");
	

	ValidityEnum(){
		
	}
	
	ValidityEnum(Integer validity, String description){
		this.validity  = validity;
		this.description = description;
	}
	
	Integer validity;
	String description;
	
	public Integer getValidity() {
		return validity;
	}

	public void setValidity(Integer validity) {
		this.validity = validity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
