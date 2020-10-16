package org.epragati.util;

public enum NumberPoolStatus {
	OPEN(1, "OPEN"), LOCKED(2, "LOCKED"), RESERVED(3, "RESERVED"), ASSIGNED(4, "ASSIGNED"), BLOCKED(5, "BLOCKED"),LEFTOVER(6,"LEFTOVER"),DUPLICATE(7,"DUPLICATE"),REOPEN(8, "REOPEN");

	Integer code;
	String description;

	/**
	 * 
	 * @param code
	 * @param description
	 */
	private NumberPoolStatus(Integer code, String description) {
		this.code = code;
		this.description = description;
	}

	/**
	 * 
	 * @return
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * 
	 * @param code
	 */
	public void setCode(Integer code) {
		this.code = code;
	}

	/**
	 * 
	 * @return
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	public enum BidProcessStatus {

		/**
		 * Open/Assigned/Canceled
		 */

		OPEN(1, "OPEN"), DONE(2, "DONE"), CANCELED(3, "CANCELED");

		Integer code;
		String description;

		/**
		 * 
		 * @param code
		 * @param description
		 */
		private BidProcessStatus(Integer code, String description) {
			this.code = code;
			this.description = description;
		}

		/**
		 * 
		 * @return
		 */
		public Integer getCode() {
			return code;
		}

		/**
		 * 
		 * @param code
		 */
		public void setCode(Integer code) {
			this.code = code;
		}

		/**
		 * 
		 * @return
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * 
		 * @param description
		 */
		public void setDescription(String description) {
			this.description = description;
		}

	}
	
	public enum NumberConfigLevel {
		
		STATE("STATE"),OFFICE("OFFICE");
		
		private String label;
		

		private NumberConfigLevel(String label) {
			this.label = label;
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
		
		
	}
	
	public enum NumberAssignType{
		ONAPPROVALS,SCHEDULER;
	} 

}
