/**
 * 
 */
package org.epragati.util;

/**
 * @author sprusty
 *
 */
public enum ResponseStatusEnum {
	FOO;
	public enum SERVICERESPONSE{

		SUCCESS("Success"),
		FAILLURE("Failed"),
		RECORDUNAVILABLE("Record Not Found."),
		TRYWITHVALIDDATA("Try Again with Valid Data."),
		ADHARAUTHENTICATIONFAILED("Adhar authentication failed."),
		ADHARARNOTFOUND("Adhar Details Not Found."),
		INVALIDUSERROLE("In valid user for this operation");

		private String label;

		public String getLabel() {
			return label;
		}

		public void setLabel(String label) {
			this.label = label;
		}


		SERVICERESPONSE(String label){
			this.label = label;
		}
	}
	public enum AADHAARRESPONSE{
		SUCCESS("SUCCESS"),
		FAILED("FAILED");
		private String label;

		public String getLabel() {
			return label;
		}


		public void setLabel(String label) {
			this.label = label;
		}

		AADHAARRESPONSE(String label){
			this.label = label;
		}
	}


}
