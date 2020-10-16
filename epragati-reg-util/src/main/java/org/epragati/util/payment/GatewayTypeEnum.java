package org.epragati.util.payment;

public enum GatewayTypeEnum {
	SBI(1, "SBI"),
	PAYTM(2, "PAYTM"),
	PAYU(3,"PAYU"),
	CFMS(4, "CFMS"),
	CASH(5,"CASH"),
	CFMSWITHPAYU(6, "CFMSWITHPAYU");
	
	
	private Integer id;
	private String description;
	private GatewayTypeEnum(Integer id, String description) {
		this.id = id;
		this.description = description;
	}
	public int getId() {
		return this.id;
	}

	public String getDescription() {
		return this.description;
	}
	
	public static  GatewayTypeEnum getGatewayTypeEnumById(Integer id){
		if(id==SBI.id){
			return SBI;
		}else if(id==PAYTM.id){
			return PAYTM;
		}else if(id==PAYU.id){
			return PAYU;
		}else if(id == CFMS.id){
			return CFMS;
		}else if(id == CFMSWITHPAYU.id){
			return CFMSWITHPAYU;
		}
		return null;
	}

	public static  GatewayTypeEnum getGatewayTypeEnumByDesc(String description){
		if(description==null){
			return null;
		}
		if(description.equalsIgnoreCase(SBI.description)){
			return SBI;
		}else if(description.equalsIgnoreCase(PAYTM.description)){
			return PAYTM;
		}else if(description.equalsIgnoreCase(PAYU.description)){
			return PAYU;
		}else if(description.equalsIgnoreCase(CFMS.description)){
			return CFMS;
		}
		else if(description.equalsIgnoreCase(CASH.description)){
			return CASH;
		}else if(description.equalsIgnoreCase(CFMSWITHPAYU.description)){
			return CFMSWITHPAYU;
		}
		
		return null;
	}
	
	public Boolean equals(GatewayTypeEnum payGatewayTypeEnum){
		if(this.id==payGatewayTypeEnum.id){
			return true;
		}
		return false;
	}
	
	public enum SBIParams{
		DEPTCODE("deptCode"),
		DEPTNAME("deptName"),
		MODE_OF_TRANSACTION("mode_of_transaction"),
		REDIRECT_URL("redirect_url"),
		SBIVERIFICATIONURL("sbi_Verification_URL"),
		MARCHANTCODE("marchantCode"),
		SBI_PAYMENT_URL("sbiPaymentURL"),
		SUCESS_URL_UI("sucessUrlUI"),
		FAILURE_URL_UI("failureUrlUI"),
		BODY_BUILDER_REDIRECT_URL("body_builder_redirect_url"),
		ENCDATA("encdata"),
		CITIZEN_SUCESS_URL_UI("citizenPaymentServiceSucessUrlUI"),
		CITIZEN_FAILURE_URL_UI("citizenPaymentServiceFailureUrlUI"),
		PAYMENT_PENDING_URL("paymentServicePendingUrlUI");
		private String paramKey;

		
		private SBIParams(String paramKey) {
			this.paramKey = paramKey;
		}

		/**
		 * @return the paramKey
		 */
		public String getParamKey() {
			return paramKey;
		}

		/**
		 * @param paramKey the paramKey to set
		 */
		public void setParamKey(String paramKey) {
			this.paramKey = paramKey;
		}
		
		
	}
	public enum PayUParams{
		PAYU_KEY("payUKey"),
		PAYUSALT("payUSalt"),
		PAYUTREASUREMERCHANTID("payUTreasureMerchantId"),
		PAYUPOS("payUPos"),
		DEPTCODE("deptCode"),
		SUCESS_URL("paymentServiceSucessUrl"),
		SUCESS_URL_UI("paymentServiceSucessUrlUI"),
		FAILURE_URL("paymentServiceFailureUrl"),
		FAILURE_URL_UI("paymentServiceFailureUrlUI"),
		SERVICEPROVIDER("serviceProvider"),
		PAYU_AUTHROIZATION("payUAuthroization"),
		PAYU_VERIFYURL("payUVerifyUrl"),
		PAYU_REFUNDURL("payURefundUrl"),
		PAYUPAYMENTURL("payUpaymentUrl"),
		MERCHANT_ID("merchantId"),
		SPNo_SUCESS_URL("spNoPaymentServiceSucessUrl"),
		SPNo_FAILURE_URL("spNoPaymentServiceFailureUrl"),
		CITIZEN_FAILURE_URL("citizenPaymentServiceFailureUrl"),
		CITIZEN_SUCESS_URL("citizenPaymentServiceSucessUrl"),
		CITIZEN_SUCESS_URL_UI("citizenPaymentServiceSucessUrlUI"),
		CITIZEN_FAILURE_URL_UI("citizenPaymentServiceFailureUrlUI"),
		CITIZEN_PENDING_URL_UI("citizenPaymentServicePendingUrlUI"),
		SPNO_PAYU_SALT("spNopayUSalt"),
		SPNO_PAYU_KEY("spNopayUKey"),
		SPNO_PAYU_AUTHORIZATION("spNopayUAuthroization"),
		SPNO_MERCHANT_ID("spNomerchantId"),
		HSRP_MARCHENT_ID("hsrpMarchentId"),
		CESS_MARCHENT_ID("cessMarchentId"),
		CITIZEN_PAYU_KEY("citizenPayUKey"),
		CITIZEN_PAYU_SALT("citizenPayUSalt"),
		CITIZEN_PAYU_AUTHORIZATION("citizenPayUAuthorization"),
		CITIZEN_PAYU_MID("citizenPayUMid"),
		PAYMENT_PENDING_URL("paymentServicePendingUrlUI"),
		
		FINANCIER_SUCESS_URL_UI("financierPaymentServiceSucessUrlUI"),
		FINANCIER_FAILURE_URL_UI("financierPaymentServiceFailureUrlUI"),
		FINANCIER_PENDING_URL_UI("financierPaymentServicePendingUrlUI") 
		;
		
		
		private String paramKey;

		
		private PayUParams(String paramKey) {
			this.paramKey = paramKey;
		}

		/**
		 * @return the paramKey
		 */
		public String getParamKey() {
			return paramKey;
		}

		/**
		 * @param paramKey the paramKey to set
		 */
		public void setParamKey(String paramKey) {
			this.paramKey = paramKey;
		}
		
		
	}
	
	public enum CFMSParams {
		DC("dc"),
		DEPTCODE("deptCode"),
		RN("rn"),
		RID("rid"),
		PAYMENTURL("paymentUrl"),
		SUCESS_URL_UI("paymentServiceSucessUrlUI"),
		FAILURE_URL_UI("paymentServiceFailureUrlUI"),
		CITIZEN_SUCESS_URL_UI("citizenPaymentServiceSucessUrlUI"),
		CITIZEN_FAILURE_URL_UI("citizenPaymentServiceFailureUrlUI"),
		CITIZEN_PENDING_URL_UI("citizenPaymentServicePendingUrlUI"),
		VERIFY_URL("verifyUrl"),
		RECORDSET("recordSet"),
		ROW("row"),
		OTHERS("others"),
		CHALLAN("challan"),
		USERNAME("username"),
		PASSWORD("password"),
		REDIRECTURL("redirectUrl"),
		ENABLENULLCHALLAN("enableNullChallan"),
		PAYMENT_PENDING_URL("paymentServicePendingUrlUI"),
		
		
		EODREPORTUSERNAME("eodReportUsername"),
		EODREPORTPASSWORD("eodReportPassword"),
		EODREPORTURL("eodReportUrl"),
		
		CUSERNAME("cancelUsername"),
		CPASSWORD("cancelPassword"),
		CURL("cancelUrl"),
		FINANCIER_SUCESS_URL_UI("financierPaymentServiceSucessUrlUI"),
		FINANCIER_FAILURE_URL_UI("financierPaymentServiceFailureUrlUI"),
		FINANCIER_PENDING_URL_UI("financierPaymentServicePendingUrlUI"),
		OTHERSERVICES_SUCESS_URL_UI("otherServicesPaymentServiceSucessUrlUI"),
		OTHERSERVICES_FAILURE_URL_UI("otherServicesPaymentServiceFailureUrlUI"),
		OTHERSERVICES_PENDING_URL_UI("otherServicesPaymentServicePendingUrlUI"),
		;

		private String paramKey;

		private CFMSParams(String paramKey) {
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
	
}
