package org.epragati.constants;

public enum DisposalType {

	COURTORDER("COURTORDER"),
	PROSECUTION("PROSECUTION"),
	ACTIONAGAINSTPERMIT("ACTIONAGAINSTPERMIT"),
	ACTIONAGAINSTDL("ACTIONAGAINSTDL"),
	ACTIONAGAINSTREGISTRATION("ACTIONAGAINSTREGISTRATION"),
	DEPARTMENTALAUCTION("DEPARTMENTALAUCTION"),
	SIZEDRELEASETYPE("SIZEDRELEASETYPE");
	
	private String name;
	DisposalType(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
