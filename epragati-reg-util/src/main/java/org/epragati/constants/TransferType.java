package org.epragati.constants;

public enum TransferType {

	SALE("SALE"), DEATH("DEATH"), AUCTION("AUCTION");

	private String type;

	private TransferType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public enum permitTranfer{
	  
		PERMITTRANSFER("PERMITTRANSFER"), PERMITCOA("PERMITCOA"), PERMITCANCEL("PERMITCANCEL"),PERMITSURRENDER("PERMITSURRENDER"), 
		RECOMMENDATIONLETTERTRANSFER("RECOMMENDATIONLETTERTRANSFER"), RECOMMENDATIONLETTERCOA("RECOMMENDATIONLETTERCOA"), 
		RECOMMENDATIONLETTERCANCEL("RECOMMENDATIONLETTERCANCEL"), RECOMMENDATIONLETTERSURRENDER("RECOMMENDATIONLETTERSURRENDER");

		private String type;
		/**
		 * @return the type
		 */
		public String getType() {
			return type;
		}
		/**
		 * @param type the type to set
		 */
		public void setType(String type) {
			this.type = type;
		}
		private permitTranfer(String type) {
			this.type = type;
		}

  }
	
	public enum vehicleCondition{
		
		SCRAP("SCRAP"),ROADWORTHY("ROADWORTHY");
		
		private String type;
		/**
		 * @return the type
		 */
		public String getType() {
			return type;
		}
		/**
		 * @param type the type to set
		 */
		public void setType(String type) {
			this.type = type;
		}
		private vehicleCondition(String type) {
			this.type = type;
		}
		
		
	}

	public enum genuiness{
		
		GENUINE("GENUINE"),FAKE("FAKE");
		
		private String type;
		/**
		 * @return the type
		 */
		public String getType() {
			return type;
		}
		/**
		 * @param type the type to set
		 */
		public void setType(String type) {
			this.type = type;
		}
		private genuiness(String type) {
			this.type = type;
		}
		
		
	}

}