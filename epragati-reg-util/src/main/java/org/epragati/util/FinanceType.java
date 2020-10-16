package org.epragati.util;

public enum FinanceType {

	HIREPURCHASE("HIREPURCHASE"), 
	HYPOTHICATION("HYPOTHICATION"),
	LEASE("LEASE");


	FinanceType(String financeType){
		this.financeType = financeType;
	}

	private String financeType;

}
