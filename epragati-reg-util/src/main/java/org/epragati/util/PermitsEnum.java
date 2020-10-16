package org.epragati.util;

import java.util.Arrays;
import java.util.List;

public enum PermitsEnum {

	ACTIVE("Active"), INACTIVE("Inactive");

	PermitsEnum(String desc) {
		this.description = desc;
	}

	String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public enum PermitType {
		PRIMARY("PRIMARY", "P"), TEMPORARY("TEMPORARY", "S"), COUNTER_SIGNATURE("COUNTER SIGNATURE", "CS");

		private String description;
		private String permitTypeCode;

		private PermitType(String description, String permitTypeCode) {
			this.description = description;
			this.permitTypeCode = permitTypeCode;

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

		/**
		 * @return the permitTypeCode
		 */
		public String getPermitTypeCode() {
			return permitTypeCode;
		}

		/**
		 * @param permitTypeCode
		 *            the permitTypeCode to set
		 */
		public void setPermitTypeCode(String permitTypeCode) {
			this.permitTypeCode = permitTypeCode;
		}

	}
	
	public enum PermitParams {
		PERMIT_VALIDITY("permitValidity"), 
		PERMIT_AUTHORIZATION_VALIDITY("permitAuthorizationValidity"),
		ALLOW_FOR_PERMITRENEWAL("allowForPermitRenewal");

		private String paramKey;

		private PermitParams(String paramKey) {
			this.paramKey = paramKey;
		}

		/**
		 * @return the paramKey
		 */
		public String getParamKey() {
			return paramKey;
		}

		/**
		 * @param paramKey
		 *            the paramKey to set
		 */
		public void setParamKey(String paramKey) {
			this.paramKey = paramKey;
		}

	}
	
	public enum PermitCodes {
		AITP("AITP"),
		AITC("AITC"),
		CCP("CCP");

		private String permitCode;

		/**
		 * @return the permitCode
		 */
		public String getPermitCode() {
			return permitCode;
		}

		/**
		 * @param permitCode the permitCode to set
		 */
		public void setPermitCode(String permitCode) {
			this.permitCode = permitCode;
		}

		private PermitCodes(String permitCode) {
			this.permitCode = permitCode;
		}

	}
	
	public static List<String> getAllIndiaPermitCode() {
		return Arrays.asList(PermitCodes.AITC.getPermitCode(), PermitCodes.AITP.getPermitCode());
	}
	
	public enum PermitRouteCodeEnum {

		ONEDISTRICT("O", "One District"), TWODISTRICT("T", "Two District"), STATE("S", "State"),
		ALLINDIA("A", "All India");

		private String code;
		private String description;

		private PermitRouteCodeEnum(String code, String description) {
			this.code = code;
			this.description = description;
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
	
	public enum RouteType{
		FORWARD("forward"),
		RETURN("return");
		
		private String route;

		private RouteType(String route) {
			this.route = route;
		}
		public String getRoute() {
			return route;
		}

		public void setRoute(String route) {
			this.route = route;
		}
		
		
	}
	
	public static String getRouteDesriptionWithCode(String description) {

		if (description.equalsIgnoreCase(PermitRouteCodeEnum.ONEDISTRICT.getCode())) {
			return PermitRouteCodeEnum.ONEDISTRICT.getDescription();
		} else if (description.equalsIgnoreCase(PermitRouteCodeEnum.TWODISTRICT.getCode())) {
			return PermitRouteCodeEnum.TWODISTRICT.getDescription();
		} else if (description.equalsIgnoreCase(PermitRouteCodeEnum.STATE.getCode())) {
			return PermitRouteCodeEnum.STATE.getDescription();
		} else if (description.equalsIgnoreCase(PermitRouteCodeEnum.ALLINDIA.getCode())) {
			return PermitRouteCodeEnum.ALLINDIA.getDescription();
		}
		return null;
	}
	
	public static List<String> getAllRouteCode() {

		return Arrays.asList(PermitRouteCodeEnum.ONEDISTRICT.getCode(), PermitRouteCodeEnum.TWODISTRICT.getCode(),
				PermitRouteCodeEnum.STATE.getCode(), PermitRouteCodeEnum.ALLINDIA.getCode());
	}
	
	public enum StageCarriageServiceType {

		ORDINARY("ORD", "ORDINARY"), EXPRESS("EXP", "EXPRESS");

		private String code;
		private String desc;

		private StageCarriageServiceType(String code, String desc) {
			this.code = code;
			this.desc = desc;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}

		public static String getStageCarriageServiceTypeByCode(String type) {
			if(type.equalsIgnoreCase(StageCarriageServiceType.ORDINARY.getCode())) {
				return StageCarriageServiceType.ORDINARY.getDesc();
			}else if(type.equalsIgnoreCase(StageCarriageServiceType.EXPRESS.getCode())) {
				return StageCarriageServiceType.EXPRESS.getDesc();
			}else {
				return null;
			}
		}
	}
}
