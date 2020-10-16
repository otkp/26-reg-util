package org.epragati.constants;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public enum CovCategory {

	T("T","Transport"),
	N("N","Non Transport"),
	Z("Z","APSRTC"),
	P("P","POLICE"),
	TV("TV","TRANSPORT VEHICLE i.e CABS"),
	UN("UN","UN NAMED LIKE MILITORY etc");
	
	String code;
	String description;
	private CovCategory(String code, String description) {
		this.code = code;
		this.description = description;
	}
	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	public static CovCategory getCovCategory(String code){
		
		CovCategory covCategory = null;
		
		if (StringUtils.isBlank(code)) {
			return covCategory;
		}
		return Arrays.stream(CovCategory.values()).filter(c->c.getCode().equals(code)).findAny().orElse(null);
	}
	public static List<CovCategory> getNumbersRequiredCovs() {
		return Arrays.asList(T,N,Z,P);
	}
}
