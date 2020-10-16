package org.epragati.util;

import java.util.Arrays;
import java.util.List;

public enum TowTokenStatus {


		INITIATED("INITIATED"),
		PAYMENTPENDING("PAYMENTPENDING"),
		PAYMENTFAILED("PAYMENTFAILED"),
		PAYMENTINITIATED("PAYMENTINITIATED"),
		CITIZENPAYMENTFAILED("CITIZENPAYMENTFAILED"),
		TOWITHHPTINITIATED("TOWITHHPTINITIATED"),
		SELLERCOMPLETED("SELLERCOMPLETED"),
		CITIZENPAYMENTPENDING("CITIZENPAYMENTPENDING");
		
	
	String type;

	
	TowTokenStatus(String type){
		this.type = type;
	}
	
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
	public static boolean validateStatus(String type) {
		if(type==null){
			return false;
		}
		   List<TowTokenStatus> list = Arrays.asList(TowTokenStatus.values());
		if(list.toString().contains(type)){
			return true;
		}
		return false;
	}
}
