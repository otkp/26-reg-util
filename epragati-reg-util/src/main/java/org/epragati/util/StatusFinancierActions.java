package org.epragati.util;

/**
 * 
 * @author pbattula
 *
 */
public enum StatusFinancierActions {

	/**
	 *  <b>SANCTIONED</b> : Financier Agrees to Sanction the Loan 
	 *  <b>REJECTED</b>   : Financier Rejects the Citizen Request
	 *  
	 */
	
	APPROVED("Approved"),
	SANCTIONED("Sanctioned"),
	REJECTED("Rejcted");
	
	StatusFinancierActions(){
		
	}
	
	StatusFinancierActions(String description){
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	String description;
}
