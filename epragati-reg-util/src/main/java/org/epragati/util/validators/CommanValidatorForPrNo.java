package org.epragati.util.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.epragati.exception.BadRequestException;
import org.epragati.util.CommanValidatorEnum;
import org.springframework.stereotype.Component;

/**
 * @author yugandhar
 *
 */
@Component
public class CommanValidatorForPrNo {

	public boolean prNumberValidator(String prNo) {
		String value = prNo.trim();
		if (value.length() < CommanValidatorEnum.PRNOMIN.getLength()
				|| value.length() > CommanValidatorEnum.PRNOMAX.getLength()) {
			throw new BadRequestException("Please pass valid prNo");
		}

		String substr = value.substring(value.length() - CommanValidatorEnum.PRNOSUBMIN.getLength(), value.length());

		if (!checkNummberOrNot(substr)) {
			throw new BadRequestException("Please pass valid prNo");
		}
		if (containWhitespace(value)) {
			throw new BadRequestException("Please pass valid prNo");
		}
		if (contaionSpealChar(value)) {
			throw new BadRequestException("Please pass valid prNo");
		}
		return true;

	}

	public static boolean checkNummberOrNot(String str) {
		if (StringUtils.isEmpty(str)) {
			return false;
		}
		try {
			Integer d = Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		} catch (Exception e) {
			return false;
		}

	}

	public static boolean containWhitespace(String value) {
		return value.contains(" ");
	}

	public static boolean contaionSpealChar(String value) {
		Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
		Matcher matcher = pattern.matcher(value);

		if (!matcher.matches()) {

			return true;
		} else {

			return false;
		}

	}

}
