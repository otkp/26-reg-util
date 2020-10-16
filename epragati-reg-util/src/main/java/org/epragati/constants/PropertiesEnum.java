package org.epragati.constants;

/**
 * @author sairam.cheruku
 *
 */
public enum PropertiesEnum {
	
	RTA_CREDIT_ACCOUNT("rtaCreditAccount"), 
	CESS_CREDIT_ACCOUNT("cessCreditAccount"),
	HSRP_CREDIT_ACCOUNT("hsrpCreditAccount"),
	IS_IN_TESTPAYMENT("isInTestPayment"),
	SBI_KEY_LOCATION("sbiKeyLocation"),
	CFST_SYNC_COUNT("cfstSyncCount"),
	SAVE_CFST_TOKEN("saveCfstToken");
	
	private String propertyKey;
	
	private PropertiesEnum(String propertyKey){
		this.propertyKey = propertyKey;
	}

	/**
	 * @return the propertyKey
	 */
	public String getPropertyKey() {
		return propertyKey;
	}

	/**
	 * @param propertyKey the propertyKey to set
	 */
	public void setPropertyKey(String propertyKey) {
		this.propertyKey = propertyKey;
	}
	

	
	
	

}
