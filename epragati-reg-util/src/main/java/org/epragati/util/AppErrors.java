package org.epragati.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class AppErrors {

	@Autowired
	private Environment errorMessges;

	public String getResponseMessage(String key) {
		return errorMessges.getProperty("error."+key);
	}
	
	public String getLogMessage(String key) {
		return errorMessges.getProperty("error.log."+key);
	}
	
}