package org.epragati.util;

import org.epragati.exception.BadRequestException;

public class Validator {

	
	public static void validateText(String data, int length) {
		if (data == null || data.isEmpty() || data.length() > length) {
			throw new BadRequestException("Invalid Input");
		}
	}
	
	public static void validateText(String data) {
		validateText(data, 150);
	}

	public static void validateLength(String data, int length) {
		if(data != null && data.length() > length) {
			throw new BadRequestException("Invalid Input");
		}
	}
	
	public static void validateLength(String data) {
		validateLength(data, 150);
	}
}
