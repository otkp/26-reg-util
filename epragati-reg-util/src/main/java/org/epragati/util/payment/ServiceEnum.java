package org.epragati.util.payment;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;

public enum ServiceEnum {

	ISSUEOFNOC(57, "IssueofNOC", Boolean.FALSE, "Issue of NOC", Boolean.TRUE),
	ALTERATIONOFVEHICLE(55, "AOV", Boolean.TRUE, "Alteration of Vehicle", Boolean.TRUE),
	RENEWAL(53, "RENEWAL", Boolean.TRUE, "Renewal", Boolean.TRUE),
	CHANGEOFADDRESS(54, "COA", Boolean.FALSE, "Change of Address", Boolean.TRUE),
	DUPLICATE(52, "DUPLICATE", Boolean.FALSE, "Duplicate", Boolean.TRUE),
	TRANSFEROFOWNERSHIP(50, "TRANSFEROFOWNERSHIP", Boolean.FALSE, "Transfer of Ownership", Boolean.TRUE),
	HIREPURCHASETERMINATION(49, "HPT", Boolean.FALSE, "Hire Purchase Termination", Boolean.TRUE),
	AADHARSEEDING(44, "AadharSeeding", Boolean.FALSE, "AadharSeeding", Boolean.TRUE),
	TEMPORARYREGISTRATION(43, "TemporaryRegistration", Boolean.FALSE, "TemporaryRegistration", Boolean.TRUE),
	FR(37, "Fr", Boolean.FALSE, "Fr", Boolean.TRUE), NEWFC(32, "NEWFC", Boolean.TRUE, "NEWFC", Boolean.TRUE),
	HPA(48, "HPA", Boolean.FALSE, "HPA", Boolean.TRUE),
	RCFORFINANCE(59, "RCFORFINANCE", Boolean.FALSE, "Fresh Rc for Finance", Boolean.TRUE),
	SPNR(51, "SPNR", Boolean.FALSE, "SPNR", Boolean.TRUE), SPNB(551, "SPNB", Boolean.FALSE, "SPNB", Boolean.TRUE),
	DATAENTRY(62, "DATAENTRY", Boolean.FALSE, "Data Entry", Boolean.TRUE),
	BODYBUILDER(10, "BODYBUILDER", Boolean.FALSE, "Body Builder", Boolean.TRUE),
	TRAILER(11, "TRAILER", Boolean.FALSE, "TRAILER", Boolean.TRUE),
	REASSIGNMENT(56, "REASSIGNMENT", Boolean.FALSE, "Reassignment of Vehicles", Boolean.TRUE),
	NEWREG(37, "NEW REGISTRATION", Boolean.FALSE, "NEW REGISTRATION", Boolean.TRUE),
	THEFTINTIMATION(61, "THEFTINTIMATION", Boolean.FALSE, "THEFT INTIMATION", Boolean.TRUE),
	THEFTREVOCATION(162, "THEFTREVOCATION", Boolean.FALSE, "THEFT REVOCATION", Boolean.TRUE),
	CANCELLATIONOFNOC(58, "CancellationofNOC", Boolean.FALSE, "Cancellation of NOC", Boolean.TRUE),
	OBJECTION(188, "OBJECTION", Boolean.FALSE, "OBJECTION", Boolean.FALSE),
	REVOCATION(288, "REVOCATION", Boolean.FALSE, "REVOCATION", Boolean.FALSE),
	TAXATION(87, "TAXATION", Boolean.FALSE, "TAXATION", Boolean.TRUE),
	NEWPERMIT(64, "NEWPERMIT", Boolean.FALSE, "New Permit", Boolean.TRUE),
	RENEWALOFPERMIT(65, "RENEWALOFPERMIT", Boolean.FALSE, "Renewal Of Permit", Boolean.TRUE),
	SURRENDEROFPERMIT(73, "SURRENDEROFPERMIT", Boolean.FALSE, "Surrender Of Permit", Boolean.FALSE),
	TRANSFEROFPERMIT(72, "TRANSFEROFPERMIT", Boolean.FALSE, "Transfer of Permit", Boolean.FALSE),
	VARIATIONOFPERMIT(69, "VARIATIONOFPERMIT", Boolean.FALSE, "Variation Of Permit", Boolean.FALSE),
	PERMITCOA(67, "PERMITCOA", Boolean.FALSE, "COA for Permit", Boolean.FALSE),
	RENEWALOFAUTHCARD(70, "RENEWALOFAUTHCARD", Boolean.FALSE, "Renewal Of Auth Card", Boolean.FALSE),
	CANCELOFPERMIT(300, "CANCELOFPERMIT", Boolean.FALSE, "cancel of permit", Boolean.FALSE),
	TOSELLER(100, "TOSELLER", Boolean.FALSE, "TOSELLER", Boolean.TRUE),
	FCLATEFEE(9001, "FCLATEFEE", Boolean.FALSE, "FCLATEFEE", Boolean.TRUE),
	ALTDIFFTAX(9002, "ALTDIFFTAX", Boolean.FALSE, "ALTDIFFTAX", Boolean.TRUE),
	RENEWALFC(34, "RENEWALFC", Boolean.FALSE, "RENEWALFC", Boolean.TRUE),
	OTHERSTATIONFC(179, "OTHERSTATIONFC", Boolean.FALSE, "OTHERSTATIONFC", Boolean.TRUE),
	EXTENSIONOFVALIDITY(94, "EXTENSIONOFVALIDITY", Boolean.FALSE, "extension of validity", Boolean.FALSE),
	REPLACEMENTOFVEHICLE(71, "REPLACEMENTOFVEHICLE", Boolean.FALSE, "Replacement Of Vehicle", Boolean.FALSE),
	VEHICLESTOPPAGE(101, "VEHICLESTOPPAGE", Boolean.TRUE, "Vehicle stoppage", Boolean.FALSE),
	VEHICLESTOPPAGEREVOKATION(9003, "VEHICLESTOPPAGEREVOKATION", Boolean.TRUE, "Vehicle stoppage revokation",
			Boolean.FALSE),
	RENEWALLATEFEE(9004, "RENEWALLATEFEE", Boolean.FALSE, "RENEWALLATEFEE", Boolean.TRUE),
	PERDATAENTRY(106, "PERDATAENTRY", Boolean.FALSE, "Permit Data Entry", Boolean.TRUE),
	BILLATERALTAX(9005, "BILLATERALTAX", Boolean.FALSE, "Bilateral Tax", Boolean.TRUE),
	ISSUEOFRECOMMENDATIONLETTER(76, "ISSUEOFRECOMMENDATIONLETTER", Boolean.FALSE, "Issue of Recommendation Letter",
			Boolean.TRUE),
	RENEWALOFRECOMMENDATIONLETTER(77, "RENEWALOFRECOMMENDATIONLETTER", Boolean.FALSE,
			"Renewal of Recommendation Letter", Boolean.TRUE),
	REPLACEMENTOFVEHICLEINRL(242, "REPLACEMENTOFVEHICLEINRL", Boolean.FALSE, "Replacement Of Vehicle", Boolean.TRUE),
	RCCANCELLATION(63, "RCCANCELLATION", Boolean.TRUE, "Suspension/Cancellation of RC", Boolean.TRUE),

	/**
	 * For New FinancierCreation ServiceID 1001
	 */
	NEWFINANCIERREGN(1001, "NEWFINANCIERREGN", Boolean.FALSE, "New Financier Creation", Boolean.TRUE),
	FEECORRECTION(9006, "FEECORRECTION", Boolean.FALSE, "Fee Correction", Boolean.TRUE),
	VCR(9007, "VCR", Boolean.FALSE, "vcr", Boolean.TRUE),

	OTHERSTATETEMPORARYPERMIT(164, "OTHERSTATETEMPORARYPERMIT", Boolean.FALSE, "Other State Temporary Permit",
			Boolean.TRUE),
	OTHERSTATESPECIALPERMIT(165, "OTHERSTATESPECIALPERMIT", Boolean.FALSE, "Other State Temporary Permit",
			Boolean.TRUE),

	VOLUNTARYTAX(9008, "VOLUNTARYTAX", Boolean.TRUE, "Voluntary Tax", Boolean.TRUE),
	CHANGEOFADDRESSOFRECOMMENDATIONLETTER(254, "CHANGEOFADDRESSOFRECOMMENDATIONLETTER", Boolean.FALSE,
			"Recommendation Letter Change of address", Boolean.TRUE),
	TRANSFEROFRECOMMENDATIONLETTER(241, "TRANSFEROFRECOMMENDATIONLETTER", Boolean.FALSE,
			"Transfer of Recommendation Letter", Boolean.TRUE),
	EIBTREGISTRATION(9009, "EIBTREGISTRATION", Boolean.TRUE, "Eibt Registration", Boolean.TRUE),
	SHOWCAUSENO(9010, "SHOWCAUSENO", Boolean.FALSE, "SHOW CAUSE NO", Boolean.FALSE),
	MDSREGISTRATION(1000, "MDSREGISTRATION", Boolean.TRUE, "Mds Registration", Boolean.TRUE),
	CARDRETURN(9999, "CARDRETURN", Boolean.FALSE, "Card Dispach", Boolean.FALSE),
	CARDREDISPATCH(999, "CARDREDISPATCH", Boolean.FALSE, "Card Dispach", Boolean.FALSE),
	STAGECARRIAGERENEWALOFPERMIT(7000, "STAGECARRIAGERENEWALOFPERMIT", Boolean.FALSE,
			"Stage Carriage Renewals of permit", Boolean.FALSE),
	STAGECARRIAGEREPLACEMENTOFVEHICLE(7001, "STAGECARRIAGEREPLACEMENTOFVEHICLE", Boolean.FALSE,
			"Stage Carriage Replacement Of Vehicle", Boolean.FALSE),
	
	NEWSTAGECARRIAGEPERMIT(7002, "NEWSTAGECARRIAGEPERMIT", Boolean.FALSE,
			"New Stage Carriage Permit", Boolean.FALSE),
	
	TRADECERTIFICATEDEALER(7011, "TRADECERTIFICATEDEALER", Boolean.FALSE, "Trade certificate Dealer", Boolean.FALSE),
	TRADECERTIFICATEDEALERDUPLICATE(7012, "TRADECERTIFICATEDEALERDUPLICATE", Boolean.FALSE, "Trade certificate Dealer",
			Boolean.FALSE),
	TRADECERTIFICATEDEALERRENEW(7013, "TRADECERTIFICATEDEALERRENEW", Boolean.FALSE, "Trade certificate Dealer",
			Boolean.FALSE),

	DEALERREGISTRATION(99, "DEALERREGISTRATION", Boolean.TRUE, "DEALER REGISTRATION", Boolean.TRUE),
	DEALERSHIPRENEWAL(199, "DEALERSHIPRENEWAL", Boolean.FALSE, "Renewal of Dealership", Boolean.FALSE),
	DEALERCOVVARIALTION(200, "DEALERCOVVARIALTION", Boolean.FALSE, "Class of Vehicle Variation", Boolean.TRUE),
	DEALERMAKERSVARIALTION(201, "DEALERMAKERSVARIALTION", Boolean.FALSE, "Makers Variation", Boolean.TRUE),
	DEALERREPRESENTATIVEVARIALTION(202, "DEALERCOVVARIALTION", Boolean.FALSE, "Representative Variation", Boolean.TRUE),
	FINANCIALASSISTANCE(1014,"FINANCIALASSISTANCE", Boolean.FALSE,"Financial Assistance",Boolean.TRUE);;

	private Integer id;
	private String code;
	private Boolean isMVIRequired;
	private String desc;
	private Boolean isEnclouserRequired;

	ServiceEnum(Integer id, String code, Boolean isMVIRequired, String description, Boolean isEnclouserRequired) {
		this.id = id;
		this.code = code;
		this.isMVIRequired = isMVIRequired;
		this.desc = description;
		this.isEnclouserRequired = isEnclouserRequired;
	}

	/*
	 * public String toString(){ return "[id= "+id+", description= "+code+"]"; }
	 */
	/**
	 * @return the idt
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return the description
	 */
	public String getCode() {
		return code;
	}

	/**
	 * display the idt
	 */

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * display the description
	 */
	public void setCode(String code) {
		this.code = code;
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

	public static ServiceEnum getServiceEnumById(Integer id) {

		if (id == null) {
			return null;
		}
		return Arrays.stream(ServiceEnum.values()).filter(serviceEnum -> serviceEnum.getId().equals(id)).findAny()
				.orElse(null);
	}

	public static ServiceEnum getServiceEnum(String code) {

		if (StringUtils.isEmpty(code)) {
			return null;
		}

		return Arrays.stream(ServiceEnum.values()).filter(serviceEnum -> serviceEnum.getCode().equalsIgnoreCase(code))
				.findAny().orElse(null);

	}

	public static Optional<ServiceEnum> getContainsMVIRequiredService(Set<Integer> serviceIds) {

		return Arrays.stream(ServiceEnum.values())
				.filter(s -> serviceIds.stream().anyMatch(id -> id.equals(s.id) && s.isMVIRequired)).findFirst();

	}

	public static ServiceEnum getServiceEnumByDesc(String desc) {

		if (StringUtils.isEmpty(desc)) {
			return null;
		}

		return Arrays.stream(ServiceEnum.values()).filter(serviceEnum -> serviceEnum.getDesc().equalsIgnoreCase(desc))
				.findAny().orElse(null);

	}

	public static boolean isFeesRequired(ServiceEnum serviceEnum) {

		return !Arrays.asList(THEFTINTIMATION, THEFTREVOCATION, OBJECTION, REVOCATION, VEHICLESTOPPAGE,
				VEHICLESTOPPAGEREVOKATION, PERDATAENTRY, RCFORFINANCE, RCCANCELLATION).contains(serviceEnum);

	}

	public static List<Integer> getDispatchedRegistrationServices() {
		return Arrays.asList(ISSUEOFNOC.getId(), ALTERATIONOFVEHICLE.getId(), RENEWAL.getId(), CHANGEOFADDRESS.getId(),
				DUPLICATE.getId(), TRANSFEROFOWNERSHIP.getId(), HIREPURCHASETERMINATION.getId(), HPA.getId(),
				THEFTINTIMATION.getId(), THEFTREVOCATION.getId(), REASSIGNMENT.getId(),
				VEHICLESTOPPAGEREVOKATION.getId(), VEHICLESTOPPAGE.getId(), DATAENTRY.getId(), RCCANCELLATION.getId(),
				CANCELLATIONOFNOC.getId());

	}

	public static boolean fcValidationRequired(Set<Integer> serviceIds) {
		return Stream.of(NEWFC, CANCELLATIONOFNOC, ALTERATIONOFVEHICLE, TAXATION,CANCELLATIONOFNOC,THEFTINTIMATION,THEFTREVOCATION,VEHICLESTOPPAGE,VEHICLESTOPPAGEREVOKATION)
				.anyMatch(val -> serviceIds.contains(val.id));
	}

	public static List<ServiceEnum> getTheftRelatedServices() {

		return Arrays.asList(THEFTINTIMATION, THEFTREVOCATION, OBJECTION, REVOCATION);

	}

	public static List<Integer> getPermitRelatedServiceIds() {

		return Arrays.asList(TRANSFEROFPERMIT.getId(), PERMITCOA.getId(), SURRENDEROFPERMIT.getId(),
				VARIATIONOFPERMIT.getId(), RENEWALOFAUTHCARD.getId(), NEWPERMIT.getId(), RENEWALOFPERMIT.getId(),
				REPLACEMENTOFVEHICLE.getId(), EXTENSIONOFVALIDITY.getId(), ISSUEOFRECOMMENDATIONLETTER.getId(),
				RENEWALOFRECOMMENDATIONLETTER.getId(), REPLACEMENTOFVEHICLEINRL.getId());

	}

	public static List<Integer> getRLServices() {

		return Arrays.asList(ISSUEOFRECOMMENDATIONLETTER.getId(), RENEWALOFRECOMMENDATIONLETTER.getId(),
				REPLACEMENTOFVEHICLEINRL.getId(), CHANGEOFADDRESSOFRECOMMENDATIONLETTER.getId(),
				TRANSFEROFRECOMMENDATIONLETTER.getId());

	}

	public static List<Integer> getPermitRelatedServiceIdsValidations() {

		return Arrays.asList(TRANSFEROFPERMIT.getId(), PERMITCOA.getId(), SURRENDEROFPERMIT.getId(),
				VARIATIONOFPERMIT.getId(), RENEWALOFAUTHCARD.getId());

	}

	public static List<Integer> getPermitServices() {

		return Arrays.asList(TRANSFEROFPERMIT.getId(), PERMITCOA.getId(), SURRENDEROFPERMIT.getId(),
				VARIATIONOFPERMIT.getId(), RENEWALOFAUTHCARD.getId(), NEWPERMIT.getId(), RENEWALOFPERMIT.getId(),
				REPLACEMENTOFVEHICLE.getId(), EXTENSIONOFVALIDITY.getId(), PERDATAENTRY.getId());
	}

	public static List<ServiceEnum> getCfstNotSyncEnums() {

		return Arrays.asList(THEFTINTIMATION, THEFTREVOCATION, OBJECTION, REVOCATION, DUPLICATE, CANCELLATIONOFNOC,
				ISSUEOFNOC);

	}

	public static List<Integer> getApprovalNotRequiredService() {
		return Arrays.asList(PERMITCOA.getId(), TRANSFEROFPERMIT.getId(), VARIATIONOFPERMIT.getId(),
				TRANSFEROFRECOMMENDATIONLETTER.getId(), CHANGEOFADDRESSOFRECOMMENDATIONLETTER.getId());
	}

	public static List<Integer> otherStatePermitServices() {

		return Arrays.asList(OTHERSTATETEMPORARYPERMIT.getId(), OTHERSTATESPECIALPERMIT.getId());
	}

	public enum Flow {

		TOWTODATAENTRY(-1, "TOWTODATAENTRY", 62), NEWFCWITHOTHER(-2, "NEWFCWITHOTHER", 179),
		COATODATAENTRY(-3, "COATODATAENTRY", 62), RCFORFINANCEMVIACTION(-4, "RCFORFINANCEMVIACTION", 59),
		RCFORFINANCEMVINOACTION(-5, "RCFORFINANCEMVINOACTION", 59), RCCANCELLATIONCCO(-6, "RCCANCELLATIONCCO", 63),
		RCCANCELLATIONEMVIACTION(-7, "RCCANCELLATIONEMVIACTION", 63);

		private Integer id;
		private String name;
		private Integer parentId;

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

		public Integer getParentId() {
			return parentId;
		}

		public void setParentId(Integer parentId) {
			this.parentId = parentId;
		}

		private Flow(Integer id, String name, Integer parentId) {
			this.id = id;
			this.name = name;
			this.parentId = parentId;
		}

	}

	public static Flow getBasedonParentId(Integer parentId) {
		if (parentId == null) {
			return null;
		}

		return Arrays.stream(Flow.values()).filter(f -> f.getParentId().equals(parentId)).findAny().orElse(null);

	}

	public static List<ServiceEnum> getPermitServicesStatusList() {

		return Arrays.asList(TRANSFEROFPERMIT, PERMITCOA, SURRENDEROFPERMIT, VARIATIONOFPERMIT, RENEWALOFAUTHCARD,
				NEWPERMIT, RENEWALOFPERMIT, REPLACEMENTOFVEHICLE, EXTENSIONOFVALIDITY, PERDATAENTRY);
	}
	
	public static List<ServiceEnum> getTradeCertificateRelatedSerivces() {

		return Arrays.asList(TRADECERTIFICATEDEALER, TRADECERTIFICATEDEALERDUPLICATE, TRADECERTIFICATEDEALERRENEW);
	}
	
	public static List<Integer> getTradeCertificateRelatedSerivcesIds() {

		return Arrays.asList(TRADECERTIFICATEDEALER.getId(), TRADECERTIFICATEDEALERDUPLICATE.getId(),
				TRADECERTIFICATEDEALERRENEW.getId());
	}

	public enum spRefundEnum {
		SPREFUNDAMOUNT("Sp Refund Amount");

		private String desc;

		private spRefundEnum(String desc) {
			this.desc = desc;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

	}
	
	public static List<Integer> getStageCarriagePermitServicesList() {

		return Arrays.asList(NEWSTAGECARRIAGEPERMIT.getId(), STAGECARRIAGERENEWALOFPERMIT.getId(),
				STAGECARRIAGEREPLACEMENTOFVEHICLE.getId());
	}

}
