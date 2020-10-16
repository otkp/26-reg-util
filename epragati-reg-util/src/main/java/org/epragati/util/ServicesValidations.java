package org.epragati.util;

public enum ServicesValidations {

	INSURANCE("INSURANCE", "INSURANCE"), 
	PUC("PUC", "PUC"), 
	PRVALIDITY("PRVALIDITY","PRVALIDITY"), 
	SUSPENDORCANCEL("SUSPENDORCANCEL","SUSPENDORCANCEL"), 
	CCTNS("CCTNS","CCTNS"), 
	THEFT("THEFT", "THEFT"), 
	GREENTAX("GREENTAX", "GREENTAX"),
	VCR("VCR", "VCR"),
	TAX("TAX","TAX"),
	FC("FC","FC"),
	NOC("NOC","NOC"),
	CNOC("CNOC","CNOC"),
	PENDINGTRANSACTIONS("PENDINGTRANSACTIONS","PENDINGTRANSACTIONS"),
	PERMIT("PERMIT","PERMIT"),
	UNDERJUDICIAL("UNDERJUDICIAL","UNDERJUDICIAL"),
	RENEWALVALIDATION("RENEWALVALIDATION","RENEWALVALIDATION"),
	TOWVALIDATIONS("TOWVALIDATIONS","TOWVALIDATIONS"),
	REASSIGNMENTVALIDATION("REASSIGNMENTVALIDATION","REASSIGNMENTVALIDATION"),
	THEFTINTIMATION("THEFTINTIMATION","THEFTINTIMATION"),
	HPA("HPA","HPA"),
	HIREPURCHASETERMINATION("HIREPURCHASETERMINATION","HIREPURCHASETERMINATION"),
	THEFTREVOCATION("THEFTREVOCATION","THEFTREVOCATION"),
	FCVALIDATIONS("FCVALIDATIONS","FCVALIDATIONS"),
	TAXSTOPPAGE("TAXSTOPPAGE","TAXSTOPPAGE"),
	VEHICLESTOPPAGE("VEHICLESTOPPAGE","VEHICLESTOPPAGE"),
	ISVEHICLESTOPPED("ISVEHICLESTOPPED","ISVEHICLESTOPPED"),
	VEHICLESTOPPAGEREVOKED("VEHICLESTOPPAGEREVOKED","VEHICLESTOPPAGEREVOKED"),
	ISVEHICLESTOPPAGEREVOKED("ISVEHICLESTOPPAGEREVOKED","ISVEHICLESTOPPAGEREVOKED"),
	ISANYFEEPENDING("ISANYFEEPENDING","ISANYFEEPENDING"),
	RCFORFINANCE("RCFORFINANCE","RCFORFINANCE"),
	RCCANCELLATION("RCCANCELLATION","RCCANCELLATION"),
	SCRTRENEWALOFPERMIT("SCRTRENEWALOFPERMIT","SCRTRENEWALOFPERMIT"),
	SCRTREPLACEMENTOFVEHICLET("SCRTREPLACEMENTOFVEHICLET","SCRTREPLACEMENTOFVEHICLET");
	
	private String code;
	private String description;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	ServicesValidations(String code,  String description) {
		this.code = code;
		this.description = description;
	}

}
