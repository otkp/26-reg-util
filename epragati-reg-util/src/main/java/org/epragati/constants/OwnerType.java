package org.epragati.constants;

public enum OwnerType {

	SELLER("Seller"),BUYER("Buyer");
	
	private String type;

	
	private OwnerType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
}
