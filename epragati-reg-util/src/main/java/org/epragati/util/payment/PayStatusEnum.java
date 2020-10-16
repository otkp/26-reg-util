package org.epragati.util.payment;

public enum PayStatusEnum {
	SUCCESS(1, "success"), FAILURE(3, "failure"), PENDING(2, "pending"), PENDINGFROMBANK(4, "pending_from_bank");

	private String description;
	private Integer id;

	PayStatusEnum(int id, String description) {
		this.description = description;
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	public static PayStatusEnum getPayStatusEnumByPayU(String description) {
		if (description == null) {
			return null;
		}
		if (description.equalsIgnoreCase(PayStatusEnum.PayU.SUCCSESS.getDescription())) {
			return PayStatusEnum.SUCCESS;
		} else if (description.equalsIgnoreCase(PayStatusEnum.PayU.FAILD.getDescription())) {
			return PayStatusEnum.FAILURE;
		} else if (description.equalsIgnoreCase(PayStatusEnum.PayU.PENDING.getDescription())) {
			return PayStatusEnum.PENDINGFROMBANK;
		}
		return null;
	}

	// ------------Inner enums

	public enum PayU {
		SUCCSESS(1, "success"), FAILD(3, "failure"), PENDING(2, "pending");
		private String description;
		private Integer id;

		PayU(int id, String description) {
			this.description = description;
			this.id = id;
		}

		public Integer getId() {
			return id;
		}

		/**
		 * @return the description
		 */
		public String getDescription() {
			return description;
		}
	}

	public enum CFMSGateWay {
		SUCCESS(1, "Success"), FAILURE(3, "Failure"), PENDING(2, "Pending");
		private String description;
		private Integer id;

		CFMSGateWay(int id, String description) {
			this.description = description;
			this.id = id;
		}

		public Integer getId() {
			return id;
		}

		/**
		 * @return the description
		 */
		public String getDescription() {
			return description;
		}
	}

	public static PayStatusEnum getPayStatusEnumByCFMS(String description) {
		if (description == null) {
			return null;
		}
		if (description.equalsIgnoreCase(CFMSGateWay.SUCCESS.getDescription())) {
			return PayStatusEnum.SUCCESS;
		} else if (description.equalsIgnoreCase(CFMSGateWay.FAILURE.getDescription())) {
			return PayStatusEnum.FAILURE;
		} else if (description.equalsIgnoreCase(CFMSGateWay.PENDING.getDescription())) {
			return PayStatusEnum.PENDINGFROMBANK;
		}
		return null;
	}

	public enum CFMSGateWayVerifyPayEnum {
		SUCCESS(1, "S"), FAILURE(3, "F"), PENDING(2, "P"), OTHER_STATUS(4, "Invalid Department ID"), ABORTED_STATUS(5,
				"Payment was aborted!"), ABORTED_STATUS_1(6, "D");
		private String description;
		private Integer id;

		CFMSGateWayVerifyPayEnum(int id, String description) {
			this.description = description;
			this.id = id;
		}

		public Integer getId() {
			return id;
		}

		/**
		 * @return the description
		 */
		public String getDescription() {
			return description;
		}
	}

	public static PayStatusEnum getPayStatusEnumByCFMSVerifyPay(String description) {
		if (description == null) {
			return null;
		}
		if (description.equalsIgnoreCase(CFMSGateWayVerifyPayEnum.SUCCESS.getDescription())) {
			return PayStatusEnum.SUCCESS;
		} else if (description.equalsIgnoreCase(CFMSGateWayVerifyPayEnum.FAILURE.getDescription())) {
			return PayStatusEnum.FAILURE;
		} else if (description.equalsIgnoreCase(CFMSGateWayVerifyPayEnum.PENDING.getDescription())) {
			return PayStatusEnum.PENDINGFROMBANK;
		} else if (description.equalsIgnoreCase(CFMSGateWayVerifyPayEnum.OTHER_STATUS.getDescription())) {
			return PayStatusEnum.FAILURE;
		} else if (description.equalsIgnoreCase(CFMSGateWayVerifyPayEnum.ABORTED_STATUS.getDescription())) {
			return PayStatusEnum.FAILURE;
		} else if (description.equalsIgnoreCase(CFMSGateWayVerifyPayEnum.ABORTED_STATUS_1.getDescription())) {
			return PayStatusEnum.FAILURE;
		}
		return null;
	}

	public static PayStatusEnum getPayStatusEnumByDescription(String description) {
		if (description == null) {
			return null;
		}
		if (description.equalsIgnoreCase(PayStatusEnum.SUCCESS.getDescription())) {
			return PayStatusEnum.SUCCESS;
		} else if (description.equalsIgnoreCase(PayStatusEnum.PENDING.getDescription())) {
			return PayStatusEnum.PENDING;
		} else if (description.equalsIgnoreCase(PayStatusEnum.PENDINGFROMBANK.getDescription())) {
			return PayStatusEnum.PENDINGFROMBANK;
		} else if (description.equalsIgnoreCase(PayStatusEnum.FAILURE.getDescription())) {
			return PayStatusEnum.FAILURE;
		} else if (description.equalsIgnoreCase(CFMSGateWayVerifyPayEnum.ABORTED_STATUS.getDescription())) {
			return PayStatusEnum.FAILURE;
		} else if (description.equalsIgnoreCase(CFMSGateWayVerifyPayEnum.ABORTED_STATUS_1.getDescription())) {
			return PayStatusEnum.FAILURE;
		}
		return null;
	}
	
	public static PayStatusEnum getCancelStatusEnumByCFMS(String description) {
		if (description == null) {
			return null;
		}
		if (description.equalsIgnoreCase(CFMSGateWayVerifyPayEnum.SUCCESS.getDescription())) {
			return PayStatusEnum.FAILURE;
		} else if (description.equalsIgnoreCase(CFMSGateWayVerifyPayEnum.FAILURE.getDescription())) {
			return PayStatusEnum.PENDINGFROMBANK;
		} else{
			return PayStatusEnum.PENDING;
		}
		//return null;
	}

}