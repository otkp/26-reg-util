package org.epragati.aadhar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class StringConverter {
	
	private static final Logger logger = LoggerFactory.getLogger(StringConverter.class);
	
	/**
	 * 
	 * Function validate
	 * 
	 * @return
	 */
	public Integer validateAndFixDefault(String input) {

		// In case if any exception, return the 0 value;
		int result = 0;

		try {
			result = Integer.parseInt(input);
			if (result < 0) {
				throw new NumberFormatException();
			}
		} catch (Exception e) {
			logger.warn(" Unable to Parse [{}] & Considering default Value as [{}]", input, result);
		}

		return result;
	}
}

