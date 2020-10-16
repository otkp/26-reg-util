package org.epragati.constants;

import org.apache.commons.lang3.StringUtils;

public enum EnclosureType {

	VehicleLeft("VehicleLeft"), VehicleRear("VehicleRear"), Vehicle("Vehicle"),Form20("Form20"), AddrBackView(
			"AddrBackView"), AddrFrontview("AddrFrontview"), HelmetInvoice(
					"HelmetInvoice"), Certificate("Certificate"), Representative("Representative"), Release("Release"),Insurance("Insurance"),RC("RC"),vehicleFrontDiagonalView("vehicleFrontDiagonalView"),
	vehicleRearDiagonalView("vehicleRearDiagonalView"),Form22A("Form22A"),AgricultureCertificate("AgricultureCertificate"),NONE("NONE"),
	PHC("PHC"),RC1("RC1"),RC2("RC2"),PUC("PUC"),ARAI("ARAI"),BodyBuilderSpeedDevice("BodyBuilderSpeedDevice"),BodyBuilderWeigingslip("BodyBuilderWeigingslip"),BodyBuilder22A("BodyBuilder22A")
	,BodyBuilderDesignApproval("BodyBuilderDesignApproval"),vehicleFrontDiagonalViewForMVI("vehicleFrontDiagonalViewForMVI"),vehicleRearDiagonalViewForMVI("vehicleRearDiagonalViewForMVI")
	,FINANCECOPY("FINANCECOPY"),FIR("FIR"), APROFILE("Aprofile"),DEATHCERTIFICATE("Death Certificate"),LEGALHEIRCERTIFICATE("Legal Heir Certificate"),AFFIDAVIT("Affidavit"),CONSENTLETTERFROMFAMILYMEMBERS("Consent Letter From Family Members"),
	Form35("Form35"),CONTRACTCOPY("Contractcopy"),COMPANYNOC("Company NOC"),COMPANYREPRESENTATAIVECOPY("Company Representative Authorization Copy"),FINANCIERNOC("FINANCIERNOC"),Loan("Loan"),
	COURTORDERCOPY("COURT ORDER COPY"),TRCOPY("TR COPY"),AUCTIONIMAGE("Auction image"),ChassisNumber("ChassisNumber"),EngineNumber("EngineNumber");


	private String value;

	private EnclosureType(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	// TODO:
	public String getDescription() {
		String enclosureType = "ERROR";

		switch (this.value) {
		case "Vehicle":
			enclosureType = "Vehicle Front View(With Owner standing next to vechile)";
			break;
		case "VehicleLeft":
			enclosureType = "Vehicle Left side View";
			break;
		case "VehicleRear":
			enclosureType = "Vehicle Rear side View";
			break;
		case "Form20":
			enclosureType = "Form20 OR DO";
			break;
		case "AddrBackView":
			enclosureType = "Present Address Proof of Owner(Back View)";
			break;
		case "AddrFrontview":
			enclosureType = "Present Address Proof of Owner(Front view)";
			break;
		case "Certificate":
			enclosureType = "Certificate of organization(comp/org)";
			break;
		case "Representative":
			enclosureType = "Representative Certificate";
			break;
		case "Release":
			enclosureType = "Release order";
			break;
		case "Insurance":
			enclosureType = "Insurance Policy Copy";
			break;
		case "RC":
			enclosureType = "Proof of RC";
			break;
		case "PHC":
			enclosureType = "Disability Percentage certificate";
			break;
		case "Form35":
			enclosureType = "Form35 OR DO";
			break;
		case "Loan":
			enclosureType = "Loan copy";
			break;	
		case "ChassisNumber":
			enclosureType = "Chassis Number";
			break;
		case "EngineNumber":
			enclosureType = "Engine Number";
			break;
	

		}

		return enclosureType;
	}

	public static EnclosureType getEnclosureType(String type) {

		EnclosureType enclosureType = NONE;

		if (StringUtils.isBlank(type)) {
			return enclosureType;
		}

		switch (type) {
		case "VehicleLeft":
			enclosureType = VehicleLeft;
			break;
		case "Form20":
			enclosureType = Form20;
			break;
		case "AddrBackView":
			enclosureType = AddrBackView;
			break;
		case "AddrFrontview":
			enclosureType = AddrFrontview;
			break;
		case "VehicleRear":
			enclosureType = VehicleRear;
			break;
		case "Certificate":
			enclosureType = Certificate;
			break;
		case "Representative":
			enclosureType = Representative;
			break;
		case "Release":
			enclosureType = Release;
			break;
		case "Insurance":
			enclosureType = Insurance;
			break;
		case "RC":
			enclosureType = RC;
			break;
		case "PHC":
			enclosureType = PHC;
			break;
		case "Form35":
			enclosureType = Form35;
			
		case "Auction image":
			enclosureType = AUCTIONIMAGE;
			break;
		case "ChassisNumber":
			enclosureType = ChassisNumber;
			break;
		case "EngineNumber":
			enclosureType = EngineNumber;
			break;
			
		case "BodyBuilderSpeedDevice":
			enclosureType = BodyBuilderSpeedDevice;
			break;
		case "vehicleFrontDiagonalView":
			enclosureType= vehicleFrontDiagonalView;
			break;
		case "vehicleRearDiagonalViewForMVI":
			enclosureType= vehicleRearDiagonalViewForMVI;
			break;
		}

		return enclosureType;
	}

	public boolean equals(EnclosureType enclosureType) {

		if (enclosureType == null) {
			return false;
		}

		return value.equalsIgnoreCase(enclosureType.value);

	}

	public boolean equals(String enclosureType) {

		if (enclosureType == null) {
			return false;
		}

		return value.equalsIgnoreCase(getEnclosureType(enclosureType).value);

	}

}
