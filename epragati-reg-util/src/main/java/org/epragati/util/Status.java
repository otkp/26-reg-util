package org.epragati.util;

import java.util.Arrays;

public enum Status {

	FOO; // This need to be fix
	
	public enum ActionStatus {
		SYSTEMGENERATED("SYSTEMGENERATED", "SystemGenerated"),UNLOCK("UNLOCK","unlock"), CITIZEN("CITIZEN", "Citizen");
		private String status;
		private String desc;

		private ActionStatus(String status, String desc) {
			this.status = status;
			this.desc = desc;
		}

		public String getStatus() {
			return this.status;
		}

		public String getDesc() {
			return this.desc;
		}

	};
	
	public enum RCActionStatus {
		SUSPEND("SUSPEND",3,"Suspend"), 
		CANCELED("CANCELED",SUSPEND.getCatogery(),"Canceled"), 
		REVOKED("REVOKED",SUSPEND.getCatogery(),"Revoked"),
		INITIATED("INITIATED",SUSPEND.getCatogery(),"initiated"),
		REJECTED("REJECTED",SUSPEND.getCatogery(),"Rejected");
		private String status;
		private String desc;
		private Integer catogery;
			
		private RCActionStatus(String status, Integer catogery, String desc) {
			this.status = status;
			this.desc = desc;
			this.catogery = catogery;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public Integer getCatogery() {
			return catogery;
		}
		public void setCatogery(Integer catogery) {
			this.catogery = catogery;
		}
		
		public static Boolean isSuspensionRelatedStatus(RCActionStatus dlAppStatus) {
			if (dlAppStatus != null && dlAppStatus.getCatogery() == SUSPEND.getCatogery()) {
				return true;
			}
			return false;
		}

	};
	
	public enum permitSuspCanRevStatus{
		
		SUSPEND("SUSPEND",3,"Suspend"), 
		CANCELED("CANCELED",SUSPEND.getCatogery(),"Canceled"), 
		REVOKED("REVOKED",SUSPEND.getCatogery(),"Revoked"),
		INITIATED("INITIATED",SUSPEND.getCatogery(),"initiated"),
		REJECTED("REJECTED",SUSPEND.getCatogery(),"Rejected");
		private String status;
		private String desc;
		private Integer catogery;
			
		private permitSuspCanRevStatus(String status, Integer catogery, String desc) {
			this.status = status;
			this.desc = desc;
			this.catogery = catogery;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getDesc() {
			return desc;
		}
		public void setDesc(String desc) {
			this.desc = desc;
		}
		public Integer getCatogery() {
			return catogery;
		}
		public void setCatogery(Integer catogery) {
			this.catogery = catogery;
		}
		
		public static Boolean isSuspensionRelatedStatus(permitSuspCanRevStatus permitSuspCanRevStatus) {
			if (permitSuspCanRevStatus != null && permitSuspCanRevStatus.getCatogery() == SUSPEND.getCatogery()) {
				return true;
			}
			return false;
		}

		
	}
	
	public enum AadhaarSeedStatus {
		AUTO_APPROVED("AUTO_APPROVED", "Auto Approved"), INITIATED("INITIATED",
				"Application Pending for AO approval."), REJECTED("REJECTED", "Rejected"), PENDING("PENDING",
						"Pending To Attach Documents"), APPROVED("APPROVED", "APPROVED"), AUTO_REJECTED("AUTO_REJECTED",
								"Pending To Attach Documents"), OPENED("OPENED",
										"Application Pending at AO (By Aadhaar Number). Please go to registered RTA office with valid proofs"), FAILED(
												"FAILED", "Aadhaar Seed Faild"), AOAPPROVED("AOAPPROVED",
														"AOAPPROVED"), AOREJECTED("AOREJECTED", "AOREJECTED"), CANCELEDBYSYSTEM("CANCELEDBYSYSTEM", "Application canceled by citizen");
		private String status;
		private String desc;

		private AadhaarSeedStatus(String status, String desc) {
			this.status = status;
			this.desc = desc;
		}

		/**
		 * @return the status
		 */
		public String getStatus() {
			return status;
		}

		/**
		 * @return the desc
		 */
		public String getDesc() {
			return desc;
		}

		public static Status.AadhaarSeedStatus getAadhaarSeedStatus(String status) {
			if (status == null) {
				return null;
			}
			return Arrays.stream(AadhaarSeedStatus.values()).filter(statusEnum -> statusEnum.getStatus().equals(status))
					.findAny().orElse(null);

		}

	};
	
	public enum SuccessFailStatus {
		 SUCCESS("success"), 
		 FAILURE("failure");
		
		private String status;

		private SuccessFailStatus(String status) {
			this.status = status;
		}

		/**
		 * @return the status
		 */
		public String getStatus() {
			return status;
		}

		

		public static Status.AadhaarSeedStatus getAadhaarSeedStatus(String status) {
			if (status == null) {
				return null;
			}
			return Arrays.stream(AadhaarSeedStatus.values()).filter(statusEnum -> statusEnum.getStatus().equals(status))
					.findAny().orElse(null);

		}

	};
	
	public enum ShowCauseStatus {
		CCOISSUED("CCOISSUED"),AOAPPROVED("AOAPPROVED"),RTOAPPROVED("RTOAPPROVED"),SHOWCAUSEISSUED("SHOWCAUSEISSUED");
		
		private ShowCauseStatus(String status) {
			this.setStatus(status);
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		private String status;
	};
	
	public enum ShowCauseIssueStage {
		FRESHSHOWCAUSE(0, "FRESH SHOW CAUSE"), ACKNOWLEDGEMENTSERVED(1, "ACKNOWLEDGEMENT SERVED"), ACKNOWLEDGEMENTEXPLANATION(2, "ACKNOWLEDGEMENT EXPLANATION"),
		DEMANDNOTICE(3, "DEMAND NOTICE"),DEMANDRECEIVED(4, "DEMAND RECEIVED"),DEMANDEXPLANATION(5, "DEMAND EXPLANATION"),FORM1(6, "FORM 1"),FORM2(7, "FORM 2");

		private ShowCauseIssueStage(int id, String stage) {
			this.id = id;
			this.stage = stage;
		}

		public int getId() {
			return id;
		}

		public String getStage() {
			return stage;
		}

		private int id;
		private String stage;
	};
	public enum ShowCauseEnum {

		UNDERSECTION55("UNDERSECTION55", "UNDER SECTION 55"),
		MORETHAN5QRTS("MORETHAN5QRTS","MORE THAN 5QRTS"),
		UNDERRULE12A("UNDERRULE12A","UNDER RULE 12A"),
		UNDERRULE6("UNDERRULE6","UNDER RULE 6"),
		UNDERSECTION7A("UNDERSECTION7A","UNDER SECTION 7A"),
		RCCANELLED("RCCANELLED","RC CANELLED")
		;

		private String sectionCode;
		private String description;

		public String getSectionCode() {
			return sectionCode;
		}

		public void setSectionCode(String sectionCode) {
			this.sectionCode = sectionCode;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		private ShowCauseEnum(String sectionCode, String description) {
			this.sectionCode = sectionCode;
			this.description = description;
		}

	};
	
	public enum financeSeedStatus {
		SUBMITTED("SUBMITTED"),AOAPPROVED("AOAPPROVED"),AOREJECTED("AOREJECTED");
		private String status;
		
		private financeSeedStatus(String status) {
			this.status = status;
		}

		/**
		 * @return the status
		 */
		public String getStatus() {
			return status;
		}

		/**
		 * @param status the status to set
		 */
		public void setStatus(String status) {
			this.status = status;
		}
	}	
	

	
}
