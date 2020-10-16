package org.epragati.util.payment;

public enum DynamicmenusEnum {
	NEWREG(1, "New Vehicle Registration"), TPENDING(2, "PENDING (TRANSPORT)"), NTPENDING(3,
			"PENDING (NON-TRANSPORT)"), NEWREGFINANCIER(4, "Financier Registration"), FINANCIERPENDING(5,
					"FINANCIER PENDING"), AADHARSEEDINGINITIATED(6,
							"AADHAR SEEDING INITIATED"), AADHARSEEDINGAOAPPROVED(7,
									"AADHAAR SEEDING APPROVED COUNT"), AADHARSEEDINGAOREJECTED(8,
											"AADHAR SEEDING AOREJECTED"), AADHARSEEDING(9,
													"Aadhaar Seeding Services"), REGISTRATIONSERVICES(10,
															"Registration Services"), FEECORRECTIONS(19,"FEE CORRECTIONS"),OTHERSTATENOCVERIFICATION(11,
																	"OTHER STATE NOC VERIFICATION"), NOCVERIFICATIONPENDING(
																			12, "NOC VERIFICATION PENDING"), OTHERS(13,
																					"OTHERS"), FRESHRCPENDING(13,
																							"FRESHRC PENDING"), MVIACTION(
																									14,
																									"MVI ACTION"), NOMVIACTION(
																											15,
																											"MVI NOT TAKEN ACTION"),
																					BILLATERALTAX(16, "BILLATERAL TAX"),RCCANCELLATION(17,"RC CANCELLATION"),
																					RCCANCELLATIONTOBEAPPROVED(18,"RC CANCELLATION (TO BE APPROVED)"),
																					DEALERSERVICES(19 , "DEALER SERVICES"),
																					NEWDEALERSHIP(20 , "NEW DEALERSHIP"),
																					RENEWALOFDEALERSHIP(21 , "RENEWAL OF DEALERSHIP"),
																					MVIRECOMMENDED(21 , "MVI RECOMMENDED NEW/RENEWAL"),
																					MVINOTRECOMMENDED(21 , "MVI NOT RECOMMENDED NEW/RENEWAL"),
																					REJECTED(24,"REJECTED"),FINANCIERSEEDING(26,"FINANCIER SEEDING"),FINANCIERSEEDINGINITIATED(27,"FINANCIER SEEDING INITIATED")
																					,FINANCIERSEEDINGAOAPPROVED(28,"FINANCIER SEEDING AOAPPROVED"),FINANCIERSEEDINGAOREJECTED(29,"FINANCIER SEEDING AOREJECTED")
																					,OTHERSTATESERVICES(30, "Other State Vehicles"), DATAENTRYNONTRANSPORT(31, "OTHERSTATE PENDING (NON-TRANSPORT)"),
																					DATAENTRYTRANSPORT(32, "OTHERSTATE PENDING (TRANSPORT)");

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
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
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	private int id;

	private String description;

	private DynamicmenusEnum(int id, String description) {
		this.id = id;
		this.description = description;
	}

}
