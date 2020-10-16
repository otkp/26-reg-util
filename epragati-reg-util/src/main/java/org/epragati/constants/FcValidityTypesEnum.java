package org.epragati.constants;

public enum FcValidityTypesEnum {

	ONEYEARFC("ONEYEARFC"),TWOYEARSFC("TWOYEARSFC"),GATIFC("GATIFC");
	
	private String name;

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

	private FcValidityTypesEnum(String name) {
		this.name = name;
	}
	
	
	public enum CfxType{
		
		ACCIDENT("ACCIDENT"),CFXENDORES("CFXENDORES");
		private String name;
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

		private CfxType(String name) {
			this.name = name;
		}
	}
}
