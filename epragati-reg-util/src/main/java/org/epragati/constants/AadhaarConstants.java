package org.epragati.constants;

public enum AadhaarConstants {
	SERVICETYPE;

	public enum RequestType {

		EKYC("EKYC"), OPT("OTP");
		private String content;

		private RequestType(String content) {
			this.content = content;
		}

		/**
		 * @return the content
		 */
		public String getContent() {
			return content;
		}

		/**
		 * @param content the content to set
		 */
		public void setContent(String content) {
			this.content = content;
		}
	}

	// Source type for AAdhaar
	public enum SourceType {
		REG("REGISTRATION");

		private String source;

		/**
		 * @return the source
		 */
		public String getSource() {
			return source;
		}

		/**
		 * @param source the source to set
		 */
		public void setSource(String source) {
			this.source = source;
		}

		private SourceType(String source) {
			this.source = source;
		}

		
	}
}