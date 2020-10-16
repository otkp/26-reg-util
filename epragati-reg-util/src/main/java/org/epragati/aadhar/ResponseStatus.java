package org.epragati.aadhar;

public enum ResponseStatus {
		SUCCESS(1, "SUCCESS"),
	    ERROR(2, "ERROR"),
		FAILD(3,"FAILD");

	    private int value;
	    private String label;

	    private ResponseStatus(int value, String label) {
	        this.value = value;
	        this.label = label;
	    }

	    public int getValue() {
	        return this.value;
	    }

	    public String getLabel() {
	        return this.label;
	    }
	  //------------Inner enums
		
	  //PayU
		public enum PayU{
			
		}
		//TCS aadhaar
		/**
		 * TCSAadhaarResponseType provides details for aadhaar response success or error
		 * 
		 * @author naga.pulaparthi
		 *
		 */
		public enum TCSAadhaarResponseType {

		    SUCCESS(1, "SUCCESS"),
		    ERROR(2, "ERROR"),
			FAILD(3,"FAILD");

		    private int value;
		    private String label;

		    private TCSAadhaarResponseType(int value, String label) {
		        this.value = value;
		        this.label = label;
		    }

		    public int getValue() {
		        return this.value;
		    }

		    public String getLabel() {
		        return this.label;
		    }

		}
}
