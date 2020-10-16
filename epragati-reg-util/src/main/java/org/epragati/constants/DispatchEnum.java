package org.epragati.constants;

public enum DispatchEnum {
	FETCH_ALL_DETAILS("ALL"),
	FETCH_BY_DATE("DATE"),
	FETCH_BY_PRNO("PRNO"),
	DISPATCH("DISPATCH"),
	RETURN("RETURN"),
	RETURNDATE("RETURNDATE"),
	DISPATCHDATE("DISPATCHDATE"),
	DISPATCHED("Dispatched"),
	CARDPRINTEDDATE("CARDPRINTEDDATE");
	
	
	String reqType;
	
	
	private DispatchEnum(String reqType) {
		this.reqType = reqType;
	}
	/**
	 * @return the number
	 */

	public String getReqType() {
		return reqType;
	}

	
	public enum DispatchCardReasonEnum {
		ADDRESSNOTTALLIED("Address Not Tallied"), DOORLOCKED("Door Locked"), RECEIVERNOTPRESENTATHOME("Receiver Not Present At Home");
		private String description;

		DispatchCardReasonEnum(String description) {
			this.description = description;
		}

		
		/**
		 * @return the description
		 */
		public String getDescription() {
			return description;
		}
	}
}
