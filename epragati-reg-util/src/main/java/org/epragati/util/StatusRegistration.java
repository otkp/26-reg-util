package org.epragati.util;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

/**
 * All Registration Related Status
 * 
 * @author pbattula
 *
 */

public enum StatusRegistration {

	/**
	 * <b>INITIATED</b> - Dealer Initiated Process It may be any stage like 1/2/3/4
	 * 
	 * <b>TRGENERATED</b> - Once Payment Success, TR Number Will be generated
	 * 
	 * <b>PRGENERATED</b> - Special/ Non Special Number case , once number generated
	 * It will be generated as PRGENERATED
	 * 
	 * <b>PAYMENTPENDING</b> - Payment Pending
	 * 
	 * <b>PAYMENTFAILED</b> - Payment Failed
	 * 
	 * <b>PAYMENTINITIATED</b> - Before Payment Process, it record will be marked as
	 * Initiated
	 * 
	 * <b>TOKENGENERATION</b> - Token Generation, these records will not be allowed
	 * at dealer side. Financier side it is allowed to generate token
	 * 
	 * <b>FINANCIERSANCTIONED</b> : Financier Sanctioned Citizen Request
	 * 
	 * <b>FINANCIERREJECTED</b> : Financier Rejected Citizen Request
	 * 
	 * <b>DEALERREJECTED</b> : Dealer Rejects Financier Request
	 * 
	 */

	INITIATED("INITIATED"), TRGENERATED("TRGENERATED"), PRGENERATED("PRGENERATED"), PAYMENTPENDING("PAYMENTPENDING"),
	PAYMENTFAILED("PAYMENTFAILED"), TOKENGENERATION("TOKENGENERATION"), PAYMENTINITIATED("PAYMENTINITIATED"),
	FINANCIERSANCTIONED("FINANCIERSANCTIONED"), FINANCIERREJECTED("FINANCIERREJECTED"),
	FINANCIERAPPROVED("FINANCIERAPPROVED"), DEALERTOKENAPPROVED("DEALERTOKENAPPROVED"),
	DEALERREJECTED("DEALERREJECTED"), DEALERRESUBMISSION("DEALERRESUBMISSION"), APPROVED("APPROVED"),
	REJECTED("REJECTED"), REUPLOAD("REUPLOAD"), REGISTRATION("REGISTRATION"),
	SECORINVALIDPENDING("SECORINVALIDPENDING"), SECORINVALIDFAILED("SECORINVALIDFAILED"), HPTINITIATED("HPTINITIATED"),
	SECORINVALIDDONE("SECORINVALIDDONE"), SECORINVALIDINITIATED("SECORINVALIDINITIATED"),
	SPECIALNOPENDING("SPECIALNOPENDING"), CHASSISTRGENERATED("CHASSISTRGENERATED"),
	CITIZENSUBMITTED("CITIZENSUBMITTED"), PAYMENTDONE("PAYMENTDONE"), ACTIVE("ACTIVE"), SUSPEND("SUSPEND"),
	FINANCE("FINANCE"), CHILD("child"), CANCELED("CANCELED"),
	// SELLERCOMPLETED("SELLERCOMPLETED"),
	PAYMENTSUCCESS("PAYMENTSUCCESS"), SLOTBOOKED("SLOTBOOKED"), ABSENT("ABSENT"), TAXPENDING("TAXPENDING"),
	OTHERSTATEPAYMENTPENDING("OTHERSTATEPAYMENTPENDING"), SELLERCOMPLETED("SELLERCOMPLETED"),
	// TRAILERTRGENERATED("TRAILERTRGENERATED"),
	CITIZENPAYMENTFAILED("CITIZENPAYMENTFAILED"), TAXPAID("TAXPAID"), MVIREJECTED("MVIREJECTED"),
	CITIZENPAYMENTPENDING("CITIZENPAYMENTPENDING"), FINANCIERTERMINATED("FINANCIERTERMINATED"),
	RTOAPPROVEDFORFC("RTOAPPROVEDFORFC"), TOWITHHPTINITIATED("TOWITHHPTINITIATED"), MVIAPPROVED("MVIAPPROVED"),
	RTOREJECTED("RTOREJECTED"), RTOAPPROVED("RTOAPPROVED"), CFRRISSUED("CFRRISSUED"), IVCNREJECTED("IVCNREJECTED"),
	IVCNPAYMENTPENDING("IVCNPAYMENTPENDING"), IVCNPAYMENTFAILED("IVCNPAYMENTFAILED"),
	IVCNPAYMENTSUCCESS("IVCNPAYMENTSUCCESS"), EDUCATIONALINSTITUTE("EDUCATIONALINSTITUTE"), NOCPENDING("NOCPENDING"),
	NOCVERIFICATIONPENDING("NOCVERIFICATIONPENDING"), AOREJECTED("AO REJECTED"), AOAPPROVED("AOAPPROVED"),
	RCCANCELLED("RCCANCELLED"), CCOISSUED("CCOISSUED"), FILEPENDINGATAO("FILEPENDINGATAO"),
	DRIVINGSCHOOL("DRIVINGSCHOOL"), PRNUMBERPENDING("PRNUMBERPENDING"), REVOKED("REVOKED"),
	THEFTINITIATED("THEFTINITIATED"), SYSTEMAUTOAPPROVED("SYSTEMAUTOAPPROVED"),
	SYSTEMAUTOREJECTED("SYSTEMAUTOREJECTED"),FAILED("FAILED"),INACTIVE("INACTIVE"),FRESHRCREJECTED("FRESHRCREJECTED"), PENDING("PENDING"),
	CCOAPPROVED("CCOAPPROVED"),SUBMITTED("SUBMITTED"),TRAILERREJECTED("TRAILERREJECTED");
	

	StatusRegistration() {

	}

	StatusRegistration(String desc) {
		this.description = desc;
	}

	String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public static StatusRegistration getStatusCode(String code) {
		if (StringUtils.isEmpty(code)) {
			return null;
		}
		return Arrays.stream(StatusRegistration.values())
				.filter(serviceEnum -> serviceEnum.getDescription().equals(code)).findAny().orElse(null);

	}

	public enum TheftState {
		INTIMATIATED, REVOKED, OBJECTION;
	}

	public static List<String> statusCheck() {
		return Arrays.asList(APPROVED.getDescription(), REJECTED.getDescription());
	}

	public enum FinancierCreateReqStatus {

		INITIATED(0, "INITIATED"), CCO_APPROVED(1, "CCO APPROVED"), CCO_REJECTED(2, "CCO REJECTED"),
		AO_APPROVED(3, "AO APPROVED"), AO_REJECTED(4, "AO REJECTED"), REUPLOAD(5, "REUPLOAD");

		private String label;
		private int status;

		private FinancierCreateReqStatus(int status, String label) {
			this.label = label;
			this.status = status;
		}

		/**
		 * @return the label
		 */
		public String getLabel() {
			return label;
		}

		/**
		 * @param label the label to set
		 */
		public void setLabel(String label) {
			this.label = label;
		}

		public int getStatus() {
			return status;
		}

		public void setStatus(int status) {
			this.status = status;
		}

	}

	public enum VcrEnum {
		PAID("PAID"), UNPAID("UNPAID");

		private VcrEnum(String desc) {
			this.desc = desc;
		}

		private String desc;

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}
	}

	public enum VcrStatusEnum {
		OPEN("OPEN"), CLOSED("CLOSED");

		private VcrStatusEnum(String desc) {
			this.desc = desc;
		}

		private String desc;

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}
	}
	public enum DispatchStatusEnum {
		APPROVED("PENDING AT DEPARTMENT APPROVALS"), FINANCIER("PENDING AT FINANCIER"),
		PAYMENT("PAYMENT NOT YET COMPLETED"),CARDPRINTED("CARD PRINTED"),DISPATCHED("CARD DISPATCHED"),NOCARDPRINTED("CARD NOT YET PRINTED")
		,BUYER("PENDING AT BUYER SIDE"),CANCELLED("APPLICATION CANCELLED"),CARDPRINTED_NODISPATCHED("CARD PRINTED YET TO BE DISPATCHED");
         
		private DispatchStatusEnum(String desc) {
			this.desc = desc;
		}

		private String desc;

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}
	}
	public static List<String> PendingStatus(){
		
		
		return Arrays.asList(INITIATED.getDescription(),PAYMENTFAILED.getDescription(),REJECTED.getDescription(),CITIZENPAYMENTFAILED.getDescription()
				,CITIZENPAYMENTPENDING.getDescription(),SELLERCOMPLETED.getDescription(),ABSENT.getDescription(),PAYMENTDONE.getDescription(),OTHERSTATEPAYMENTPENDING.getDescription()
				,SLOTBOOKED.getDescription(),MVIAPPROVED.getDescription(),REUPLOAD.getDescription(),
				CITIZENSUBMITTED.getDescription(),TAXPENDING.getDescription(), HPTINITIATED.getDescription(),PAYMENTPENDING.getDescription(),THEFTINITIATED.getDescription()
				);
		
		}
	public static List<String> vehicleInactiveStatus(){
	 return Arrays.asList(CANCELED.getDescription(),
			SUSPEND.getDescription(), TheftState.INTIMATIATED.toString(),
			TheftState.OBJECTION.toString(), TheftState.REVOKED.toString());
	}
}
