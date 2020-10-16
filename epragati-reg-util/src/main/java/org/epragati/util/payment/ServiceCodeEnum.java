package org.epragati.util.payment;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum ServiceCodeEnum {
	COMPOUNDING_FEE("CF", "Compounding Fee"), LICENSE_FEE("LF", "License Fee"),
	REGISTRATION("Application", "Application"), FITNESS_FEE("FIT", "Fitness Fee"),
	FITNESS_SERVICE_FEE("FitnessServiceFee", "Fitness Service Fee"), PERMIT_FEE("PE", "Permit Fee"),
	PERMIT_SERVICE_FEE("PermitServiceFee", "Permit Service Fee"), OTHER_RECEIPTS("OF", "Other Fee"),
	QLY_TAX("QuarterlyTax", "Qly Fee"), HALF_TAX("HalfyearlyTax", "Qly Fee"), YEAR_TAX("YearlyTax", "Qly Fee"),
	LIFE_TAX("LifeTax", "Life Tax"), GREEN_TAX("GreenTax", "Green Tax Fee"), SERVICE_FEE("Service Fee", "Service Fee"),
	SP_APPLICATION_FEE("SP Application Fee", "Application Fee"), POSTAL_FEE("Postal", "Postal"),
	TEST_FEE("TF", "Test Fee"), CARD("Card", "Card"), LATE_FEE("LTF", "Late Fee"), HSRP_FEE("HSRP FEE", "HSRP FEE"),
	CESS_FEE("CessFee", "Cess fee"), PENALTY("penalty", "penalty"), TAXARREARS("TaxArrears ", "Tax Arrears"),
	PENALTYARREARS("penaltyArrears", "penalty Arrears"), AUTHORIZATION("Authorization", "Authorization"),
	FC_LATE_FEE("FCLTF", "Fc Late Fee"), TAXSERVICEFEE("TSFEE", "Tax service fee"),
	SPNB_REFUND("SPNB REFUND", "SPNB REFUND"), SPNR_REFUND("SPNR REFUND", "SPNR REFUND"),
	RELEASE_ORDER("RO", "Release order fee"), SevenDays("SevenDaysTax", "7 Days"),
	FifteenDays("FifteenDaysTax", "15 Days"), ThirtyDays("ThirtyDaysTax", "30 Days"),
	BorderTax("BorderTax", "Border Tax"), DEDUCTIONAX("DEDUCTIONTAX", "DEDUCTIONTAX");

	public enum ReportEnum {
		TAXAMOUNTS("Tax Amounts", "Tax Amounts"), TOTAL("total", "total");

		private ReportEnum(String code, String description) {
			this.code = code;
			this.description = description;
		}

		private String code;
		private String description;

		/**
		 * @return the code
		 */
		public String getCode() {
			return code;
		}

		/**
		 * @param code the code to set
		 */
		public void setCode(String code) {
			this.code = code;
		}

		/**
		 * @return the description
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * @param description the description to set
		 */
		public void setDescription(String description) {
			this.description = description;
		}
	}

	String code;
	String typeDesc;

	ServiceCodeEnum(String description, String typeDesc) {
		this.code = description;
		this.typeDesc = typeDesc;
	}

	public String getCode() {
		return this.code;
	}

	public String getTypeDesc() {
		return this.typeDesc;
	}

	public static ServiceCodeEnum getSubHeadCodeEnum(String code) {
		if (code == null) {
			return null;
		}
		return Arrays.stream(ServiceCodeEnum.values()).filter(statusEnum -> statusEnum.getCode().equalsIgnoreCase(code))
				.findAny().orElse(null);
	}

	public static ServiceCodeEnum getSubHeadCodeEnumByDesc(String desc) {
		if (desc == null) {
			return null;
		}
		return Arrays.stream(ServiceCodeEnum.values())
				.filter(statusEnum -> statusEnum.getTypeDesc().equalsIgnoreCase(desc)).findAny().orElse(null);
	}

	public static List<String> getServiceTypeFee() {
		return Arrays.asList(ServiceCodeEnum.SERVICE_FEE.getCode(), ServiceCodeEnum.FITNESS_SERVICE_FEE.getTypeDesc(),
				ServiceCodeEnum.TAXSERVICEFEE.getTypeDesc(), ServiceCodeEnum.TAXSERVICEFEE.getCode(),
				ServiceCodeEnum.deductionModeService.ServiceFeeDeduction.getDesc(),
				ServiceCodeEnum.deductionModeService.TaxservicefeeDeduction.getDesc(),
				ServiceCodeEnum.POSTAL_FEE.getCode(), ServiceCodeEnum.PERMIT_SERVICE_FEE.getTypeDesc());
	}

	public static List<String> getApplicationFee() {
		return Arrays.asList(ServiceCodeEnum.REGISTRATION.getCode(), ServiceCodeEnum.CARD.getCode(),
				ServiceCodeEnum.FC_LATE_FEE.getTypeDesc(), ServiceCodeEnum.FITNESS_FEE.getTypeDesc(),
				ServiceCodeEnum.LATE_FEE.getTypeDesc(), ServiceCodeEnum.PERMIT_FEE.getTypeDesc(),
				ServiceCodeEnum.AUTHORIZATION.getTypeDesc());
	}

	public static List<String> getTaxAmounts() {
		return Arrays.asList(ServiceCodeEnum.QLY_TAX.getCode(), ServiceCodeEnum.HALF_TAX.getCode(),
				ServiceCodeEnum.YEAR_TAX.getCode(), ServiceCodeEnum.PENALTY.getCode(),
				ServiceCodeEnum.PENALTYARREARS.getTypeDesc(), ServiceCodeEnum.TAXARREARS.getTypeDesc(),
				ServiceCodeEnum.GREEN_TAX.getTypeDesc(), ServiceCodeEnum.GREEN_TAX.getCode(), "SevenDaysTax",
				"ThirtyDaysTax", "FifteenDaysTax", ServiceCodeEnum.BorderTax.getCode());
	}

	public static List<String> deductionHead() {
		return Arrays.asList(ServiceCodeEnum.COMPOUNDING_FEE.getTypeDesc(), ServiceCodeEnum.RELEASE_ORDER.getTypeDesc())
				.stream().collect(Collectors.toList());

	}

	public static List<String> getIndiviualFees() {
		return Arrays.asList(ServiceCodeEnum.POSTAL_FEE.getCode(), ServiceCodeEnum.GREEN_TAX.getTypeDesc());
	}

	public static List<String> getLFee() {
		return Arrays.asList(ServiceCodeEnum.LIFE_TAX.getCode(), ServiceCodeEnum.LIFE_TAX.getTypeDesc());
	}

	public static List<String> getCessFee() {
		return Arrays.asList(ServiceCodeEnum.CESS_FEE.getCode(), ServiceCodeEnum.CESS_FEE.getTypeDesc());
	}

	public static List<String> permitFeeList() {

		return Arrays.asList(ServiceCodeEnum.PERMIT_FEE.getTypeDesc(),
				ServiceCodeEnum.PERMIT_SERVICE_FEE.getTypeDesc());
	}

	public static List<String> permitTaxList() {

		return Arrays.asList("SevenDaysTax", "ThirtyDaysTax", "FifteenDaysTax");
	}

	public enum revenueReportHeads {

		QUARTERLYTAX("QUARTERLYTAX"), LIFETAX("LIFETAX"), FEES("FEES"), SERVICECHARGE("SERVICECHARGE"),
		DEDUCTION("DEDUCTION");
		private String desc;

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		private revenueReportHeads(String desc) {
			this.desc = desc;
		}

	}

	public static List<String> getserviceFee() {
		return Arrays.asList(ServiceCodeEnum.SERVICE_FEE.getCode(), ServiceCodeEnum.FITNESS_SERVICE_FEE.getTypeDesc(),
				ServiceCodeEnum.TAXSERVICEFEE.getTypeDesc(), ServiceCodeEnum.TAXSERVICEFEE.getCode(),
				ServiceCodeEnum.POSTAL_FEE.getCode(), ServiceCodeEnum.PERMIT_SERVICE_FEE.getTypeDesc());
	}

	public static List<String> revenueHeadDefaults() {
		return Arrays.asList(ServiceCodeEnum.revenueReportHeads.QUARTERLYTAX.getDesc(),
				ServiceCodeEnum.revenueReportHeads.LIFETAX.getDesc(), ServiceCodeEnum.revenueReportHeads.FEES.getDesc(),
				ServiceCodeEnum.revenueReportHeads.SERVICECHARGE.getDesc(),
				ServiceCodeEnum.revenueReportHeads.DEDUCTION.getDesc());
	}

	public enum deductionModeEnum {
		QuarterlyTaxDeduction("QuarterlyTax Deduction"), TaxArrearsDeduction("Tax Arrears Deduction"),
		LifeTaxDeduction("Life Tax Deduction"), penaltyArrearsDeduction("penalty Arrears Deduction"),
		penaltyDeduction("penalty Deduction");

		private String desc;

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		private deductionModeEnum(String desc) {
			this.desc = desc;
		}

	}

	public enum deductionModeFc {
		ReleaseorderfeeDeduction("Release order fee Deduction"), CompoundingFeeDeduction("Compounding Fee Deduction");

		private String desc;

		private deductionModeFc(String desc) {
			this.desc = desc;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}
	}

	public enum deductionModeService {
		TaxservicefeeDeduction("Tax service fee Deduction"), ServiceFeeDeduction("Service Fee Deduction");
		private String desc;

		public String getDesc() {
			return desc;
		}

		private deductionModeService(String desc) {
			this.desc = desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

	}

	public static List<String> cfHeadList() {
		return Arrays
				.asList(ServiceCodeEnum.COMPOUNDING_FEE.getTypeDesc(), ServiceCodeEnum.RELEASE_ORDER.getTypeDesc(),
						ServiceCodeEnum.deductionModeFc.CompoundingFeeDeduction.getDesc(),
						ServiceCodeEnum.deductionModeFc.ReleaseorderfeeDeduction.getDesc())
				.stream().collect(Collectors.toList());

	}

	public static List<String> deductionList() {
		List<String> list = Arrays.asList(ServiceCodeEnum.deductionModeEnum.values()).stream().map(d -> d.getDesc())
				.collect(Collectors.toList());
		list.addAll(cfHeadList());
		return list;
	}

	public enum lateFeeEnum {

		PERMITRENEWALLATEFEE("Permit Renewal LateFee"), RENEWALLATEFEE("Renewal LateFee");

		private lateFeeEnum(String desc) {
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

	public static List<String> permitFeeHead() {
		return Arrays.asList(ServiceCodeEnum.PERMIT_FEE.getTypeDesc(), ServiceCodeEnum.AUTHORIZATION.getTypeDesc(),
				lateFeeEnum.PERMITRENEWALLATEFEE.getDesc()).stream().collect(Collectors.toList());
	}

	public static List<String> permitServiceFeeHead() {
		return Arrays.asList(ServiceCodeEnum.PERMIT_SERVICE_FEE.getTypeDesc(),
				ServiceCodeEnum.AUTHORIZATION.getTypeDesc(), lateFeeEnum.PERMITRENEWALLATEFEE.getDesc()).stream()
				.collect(Collectors.toList());
	}

	/*
	 * public static List<String> getFeeTypeas() { return
	 * Arrays.asList(ServiceCodeEnum.SERVICE_FEE.getCode(),
	 * ServiceCodeEnum.FITNESS_SERVICE_FEE.getTypeDesc(),
	 * ServiceCodeEnum.TAXSERVICEFEE.getTypeDesc(),
	 * ServiceCodeEnum.REGISTRATION.getCode(), ServiceCodeEnum.CARD.getCode(),
	 * ServiceCodeEnum.FITNESS_FEE.getTypeDesc(),
	 * ServiceCodeEnum.FC_LATE_FEE.getTypeDesc(), ServiceCodeEnum.QLY_TAX.getCode(),
	 * ServiceCodeEnum.HALF_TAX.getCode(), ServiceCodeEnum.YEAR_TAX.getCode(),
	 * ServiceCodeEnum.PENALTY.getCode(),
	 * ServiceCodeEnum.PENALTYARREARS.getTypeDesc(),
	 * ServiceCodeEnum.TAXARREARS.getTypeDesc(),
	 * ServiceCodeEnum.POSTAL_FEE.getCode(),
	 * ServiceCodeEnum.GREEN_TAX.getTypeDesc(), ServiceCodeEnum.CESS_FEE.getCode(),
	 * ServiceCodeEnum.LIFE_TAX.getCode(), ServiceCodeEnum.LATE_FEE.getTypeDesc(),
	 * ServiceCodeEnum.AUTHORIZATION.getCode(),ServiceCodeEnum.HSRP_FEE.getCode());
	 * }
	 */

	public static List<String> getFeeTypes() {
		return Arrays.asList(ServiceCodeEnum.QLY_TAX.getCode(), ServiceCodeEnum.HALF_TAX.getCode(),
				ServiceCodeEnum.YEAR_TAX.getCode(), ServiceCodeEnum.TAXARREARS.getTypeDesc(),
				ServiceCodeEnum.PENALTY.getCode(), ServiceCodeEnum.PENALTYARREARS.getTypeDesc(),
				ServiceCodeEnum.GREEN_TAX.getTypeDesc(), ServiceCodeEnum.LIFE_TAX.getCode(),
				ServiceCodeEnum.REGISTRATION.getCode(), ServiceCodeEnum.LATE_FEE.getTypeDesc(),
				ServiceCodeEnum.FITNESS_FEE.getTypeDesc(), ServiceCodeEnum.FC_LATE_FEE.getTypeDesc(),
				ServiceCodeEnum.CARD.getCode(), ServiceCodeEnum.AUTHORIZATION.getCode(),
				ServiceCodeEnum.SERVICE_FEE.getCode(), ServiceCodeEnum.FITNESS_SERVICE_FEE.getTypeDesc(),
				ServiceCodeEnum.TAXSERVICEFEE.getTypeDesc(), ServiceCodeEnum.POSTAL_FEE.getCode(),
				ServiceCodeEnum.HSRP_FEE.getCode(), ServiceCodeEnum.CESS_FEE.getCode(),
				ServiceCodeEnum.SPNB_REFUND.getTypeDesc(), ServiceCodeEnum.SPNR_REFUND.getTypeDesc());
	}

	public static List<String> districtDefaults() {
		return Arrays.asList(ServiceCodeEnum.SERVICE_FEE.getCode(), ServiceCodeEnum.REGISTRATION.getCode(),
				ServiceCodeEnum.ReportEnum.TAXAMOUNTS.getCode(), ServiceCodeEnum.LIFE_TAX.getCode(),
				ServiceCodeEnum.DEDUCTIONAX.getCode());
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @param typeDesc the typeDesc to set
	 */
	public void setTypeDesc(String typeDesc) {
		this.typeDesc = typeDesc;
	}
	public enum PaymentTaxType {

		QLY("QLY", "QuarterlyTax"), HLY("HLY", "HalfyearlyTax"), ANN("ANN", "YearlyTax"), LTT("LTT", "Life Tax"),
		CESS("CESS", "CESSFEE"), GreenTax("GreenTax", "GreenTax");
		private String code;
		private String desc;

		PaymentTaxType(String code, String description) {
			this.code = code;
			this.desc = description;
		}

		/**
		 * @return the code
		 */
		public String getCode() {
			return code;
		}

		/**
		 * @param code the code to set
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
		public static String getdesc(String code) {
			if (code.equalsIgnoreCase(PaymentTaxType.LTT.getCode())) {
				return PaymentTaxType.LTT.getDesc();
			} else if (code.equalsIgnoreCase(PaymentTaxType.QLY.getCode())) {
				return PaymentTaxType.QLY.getDesc();
			} else if (code.equalsIgnoreCase(PaymentTaxType.HLY.getCode())) {
				return PaymentTaxType.HLY.getDesc();
			} else if (code.equalsIgnoreCase(PaymentTaxType.ANN.getCode())) {
				return PaymentTaxType.ANN.getDesc();
			} else if (code.equalsIgnoreCase(PaymentTaxType.CESS.getCode())) {
				return PaymentTaxType.CESS.getDesc();
			} else if (code.equalsIgnoreCase(PaymentTaxType.GreenTax.getCode())) {
				return PaymentTaxType.GreenTax.getDesc();
			}
			return "";
		}

		public static PaymentTaxType getTaxTypeEnumByCode(String code) {
			if (code == null) {
				return null;
			}
			return Arrays.stream(PaymentTaxType.values()).filter(statusEnum -> statusEnum.getCode().equals(code)).findAny()
					.orElse(null);

		}
	}
}