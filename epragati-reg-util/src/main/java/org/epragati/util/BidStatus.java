package org.epragati.util;

public enum BidStatus {
	OPEN(1, "OPEN",""), 
	SPPAYMENTDONE(2, "SPPAYMENTDONE","Your reservation confirmed for e-bidding for selected Number:  @@PRNO@@."),
	SPPAYMENTFAILURE(3, "SPPAYMENTFAILURE","Your reservation not confirmed as your payment failed."), 
	SPPAYMENTPENDING(4,"SPPAYMENTPENDING","Your reservation not confirmed as your payment pending. Please do verify payment in 'payment status'"),
	BIDSTART(5, "BIDSTART",""),
	FINALPAYMENTDONE(6, "FINALPAYMENTDONE","Your bid status will be notified after 6:00 PM"),
	FINALPAYMENTFAILURE(7, "FINALPAYMENTFAILURE","Please Go to 'payment Status' and re-pay"),
	FINALPAYMENTPENDING(8, "FINALPAYMENTPENDING","Please Go to 'payment Status' and verify payment"),
	BIDEND(9,"BIDEND",""), 
	BIDWIN(10, "BIDWIN","Congratulations You won the bid and number allotted @@PRNO@@."),
	BIDABSENT(11, "BIDABSENT","Oops.. You didn't participated in bidding hence your reservation amount will be forfeited."), 
	BIDTIE(12, "BIDTIE","Oops..You had tie with an other competetior. Please try again tomorrow, your deducted amount will be refunded soon."), 
	BIDLEFT(13, "BIDLEFT","Ohhh, You have asked to Generate Ordinary number."), 
	BIDLIMITEXCEED(14, "BIDLIMITEXCEED",""), 
	BIDLOOSE(15,"BIDLOOSE","Sorry, Unfortunately you lost the Bid. Please try again tommorrow. Your money will be refunded."), 
	REFUNDSTART(16, "REFUNDSTART",""), 
	REFUNDDONE(17, "REFUNDDONE",""),
	SPPAYMENTFAILED(18,"SPPAYMENTFAILED","You didn't make payment, Hence your reservation not confirmed"),
	SPREQUIRED(19,"SPREQUIRED","Special Number Required"),
	SPNOTREQUIRED(20,"SPNOTREQUIRED","Special Number not Required");
	/**
	 * 
	 */
	Integer code;
	String description;
	String  content;

	/**
	 * 
	 * @param code
	 * @param description
	 */
	private BidStatus(Integer code, String description,String  content) {
		this.code = code;
		this.description = description;
		this.content=content;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
