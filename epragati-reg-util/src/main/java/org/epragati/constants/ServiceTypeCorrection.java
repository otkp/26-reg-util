package org.epragati.constants;

public enum ServiceTypeCorrection {
	REGDETAILS("REGISTRATION DETAILS"),
	REGSER("REGISTRATION SERVICES"),
	FC("FITNESS"),
	PERMITS("PERMITS"),
	TAX("TAX");
	private String name;
	ServiceTypeCorrection(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static ServiceTypeCorrection getType(String name) {
		
		if(name.equalsIgnoreCase(ServiceTypeCorrection.REGDETAILS.getName())) {
			return ServiceTypeCorrection.REGDETAILS;
		}
		if(name.equalsIgnoreCase(ServiceTypeCorrection.REGSER.getName())) {
			return ServiceTypeCorrection.REGSER;
		}
		if(name.equalsIgnoreCase(ServiceTypeCorrection.FC.getName())) {
			return ServiceTypeCorrection.FC;
		}
		if(name.equalsIgnoreCase(ServiceTypeCorrection.TAX.getName())) {
			return ServiceTypeCorrection.TAX;
		}
		if(name.equalsIgnoreCase(ServiceTypeCorrection.PERMITS.getName())) {
			return ServiceTypeCorrection.PERMITS;
		}
		return null;
		
	}


}
