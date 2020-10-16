package org.epragati.constants;

public enum ExceptionDescEnum {
	NULL_EMPTY_GATEWAY_COV_SERVICE("Gate Way Type , Servcie enum/service enum List and class of vehicle are should not be empty or null"),
	FAILD_SAVE_PAYMENT_REQUEST("Opps.. There is problem with save payment request, Please try again..."),
	NOTFOUND_APP_REF_NUMBER("Applicant form  number not found  for payment responce save"),
	NULL_APP_REF_NUMBER("Applicant form  number should not be null"),
	NOTFOUNF_TRAN_NUMBER("Transaction Details not found"),
	ACTIONBY("Program");
	private String description;

	private ExceptionDescEnum(String description) {
		this.description = description;
	}
	
	public String getDesciption(){
		return this.description;
	}
	

}
