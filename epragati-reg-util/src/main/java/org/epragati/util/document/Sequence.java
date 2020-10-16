package org.epragati.util.document;

public enum Sequence {
	
	/* For Dealer*/
	REGISTRATIONAPPNO(1L, "RegApplicationNo"),
	
	//For Parent Financier Creation 
	FINANCIERAPPNO(12L, "FinancierAppNo"),
	MDSAPPNO(14L, "MDSApplicationNo"),
    DEALERAPPNO(20L, "DealerAppNo"),
	CHALLAN(5L, "ChallanSeries"),
	FC(6L, "FC"),
	DEALERCHASISNO(7L, "DealerChasisNo"),
	APPLICANT(4L, "ApplicantNo"),
	ALTRATION(8L, "ALTRATION"),
	PERMITNUMBER(9L, "PermitNumber"),
	USERID(10L, "UserId"),
	BILATERALTAX(9005L, "BilateralTax"),
	PAYMENTRECIEPT(11L,"PaymentReciept"),
	SHOWCAUSENO(63L,"ShowCauseNo"),
	DEALERID(21L,"DealerId"),
	DEALERRID(22L,"DealerRid"),
	DEALERTC(23L,"DealerTC"),
	VCR(9007L, "VCR"),
	DEALERTCCOMMAN(24L,"DealerTCComman"),
	SHOWCAUSENOFORVCR(64L,"ShowCauseNoForVcr"),
	FINANCIALASSISTANCE(25L,"FA");
	/*LLRAPPLICATIONFORMNO(1L, "LlrAppFormNo"),
	LLRRETEST(2L, "LLRRETEST"),
	PAYMENTS(3L, "PAYMENTS"),
	APPLICANT(4L, "ApplicantNo"),	
	
	LLRDETAILS(6L, "LLRDETAILS"),
	LLRIMAGES(7L, "LLRIMAGES"),
	LLRNO(8L, "LlrNo"),
	DLBADGE(12L, "DlBadge"),
	DLIDP(13L,"DlIdp"),*/
	/* For Citizen*/
	/*DLAPPLICATIONFORMNO(9L, "DlAppFormNo"),
	DLNUMBER(10L, "DlNo"),
	DLREF(11L, "DLREF")*/
	
	private String sequenceName;
	private Long sequenceId;
	
	private Sequence(Long sequenceId, String sequenceName){
		this.sequenceId = sequenceId;
		this.sequenceName = sequenceName;
	}
	
	public String getSequenceName() {
		return sequenceName;
	}

	public void setSequenceName(String sequenceName) {
		this.sequenceName = sequenceName;
	}

	public Long getSequenceId() {
		return sequenceId;
	}

	public void setSequenceId(Long sequenceId) {
		this.sequenceId = sequenceId;
	}

}
