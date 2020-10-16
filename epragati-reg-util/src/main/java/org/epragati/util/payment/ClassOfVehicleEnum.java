package org.epragati.util.payment;

public enum ClassOfVehicleEnum {
	
	CHST("CHST"),
	CHSN("CHSN"),
	MCYN("MCYN"),
	MMCN("MMCN"),
	IVCN("IVCN"),
	ARVT("ARVT"),
	ATCHN("ATCHN"),
	OBPN("OBPN"),
	OBT("OBT"),
	STCHN("STCHN"),
	TTTT("TTTT"),
	TTRN("TTRN"),
	GCRT("GCRT"),
	SPHN("SPHN"),
	EIBT("EIBT"),
	ARKT("ARKT"),
	MCPT("MCPT"),
	COCT("COCT"),
	TOVT("TOVT"),
	MCRN("MCRN"),
	TGVT("TGVT"),
	ERKT("ERKT"),
	ECRT("ECRT"),
	MTLT("MTLT"),
	LTCT("LTCT"),
	STCT("STCT"),
	TRCN("TRCN"),
	MAXT("MAXT"),
	PSVT("PSVT"),
	SCRT("SCRT"),
	CEHHN("CEHHN"),
	TRTT("TRTT"),
	TMRN("TMRN");


	private String covCode;
	
	ClassOfVehicleEnum(String covCode) {
		this.covCode = covCode;
	}

	/**
	 * @return the covCode
	 */
	public String getCovCode() {
		return covCode;
	}

	/**
	 * @param covCode the covCode to set
	 */
	public void setCovCode(String covCode) {
		this.covCode = covCode;
	}
	
	

}
