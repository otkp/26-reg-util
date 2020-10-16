package org.epragati.util.payment;

import java.util.Arrays;

import org.apache.commons.lang3.StringUtils;

public enum ModuleEnum {

	LLR(1, "llr"), DL(2, "dl"),REG(3,"Registration"), SPNR(4, "SPNR"), SPNB(5, "SPNB"), CITIZEN(6, "CITIZEN"),BODYBUILDER(7, "BODYBUILDER"), DATAENTRY(8, "DATAENTRY"),ALTERVEHICLE(7, "ALTERVEHICLE")
	,FC(7, "FC"), PAYMENTS(10, "PAYMENTS"), TAX(101,"TAX"), OTHERSERVICES(99, "OTHERSERVICES");

	private Integer id;
	private String code;

	private ModuleEnum(Integer id, String code) {
		this.id = id;
		this.code = code;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	public static ModuleEnum getModuleEnumById(Integer id) {

		if (id == null) {
			return null;
		}

		return Arrays.stream(ModuleEnum.values()).filter(moduleEnum -> moduleEnum.getId().equals(id)).findAny()
				.orElse(null);
	}

	public static ModuleEnum getModuleEnum(String code) {

		if (StringUtils.isNoneBlank(code)) {
			return null;
		}

		return Arrays.stream(ModuleEnum.values()).filter(moduleEnum -> moduleEnum.getCode().equalsIgnoreCase(code))
				.findAny().orElse(null);

	}
	
	public enum RegCombinationsModuleEnum{
		REG_SERVICES("Services"),
		REG_PERMITS("Permits"),
		RECOMMENDATION_LETTER("RecommendationLetter"),
		DEALER("Dealer");
		
		private String moduleCode;

		
		private RegCombinationsModuleEnum(String moduleCode) {
			this.moduleCode = moduleCode;
		}

		/**
		 * @return the paramKey
		 */
		public String getModuleCode() {
			return moduleCode;
		}

		/**
		 * @param paramKey the paramKey to set
		 */
		public void setModuleCode(String moduleCode) {
			this.moduleCode = moduleCode;
		}
		
		
	}
}
