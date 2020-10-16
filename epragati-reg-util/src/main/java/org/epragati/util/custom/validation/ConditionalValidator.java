package org.epragati.util.custom.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ConditionalValidator implements ConstraintValidator<Conditional, Object> {

	private String selected;
	private String[] required;
	private String message;
	private String[] values;

	@Override
	public void initialize(Conditional requiredIfChecked) {
		selected = requiredIfChecked.selected();
		message = requiredIfChecked.message();
		values = requiredIfChecked.values();
	}

	@Override
	public boolean isValid(Object objectToValidate, ConstraintValidatorContext context) {
		if (selected != null) {

			switch (selected) {
			case "mobile":
				return regExpressionChk(ValidatorConstants.MOBILE_REGX, objectToValidate);
			case "emailId":
				return regExpressionChk(ValidatorConstants.EMAIL_REGX, objectToValidate);
			case "email":
				return regExpressionChk(ValidatorConstants.EMAIL_REGX, objectToValidate);
			case "doorNo":
				return regExpressionChk(ValidatorConstants.DOOR_REGX, objectToValidate);
			case "displayName":
				return regExpressionChk(ValidatorConstants.NAME_REGX, objectToValidate);
			case "trNo":
				return regExpressionChk(ValidatorConstants.TR_NO_REGX, objectToValidate);
			case "prNo":
				return regExpressionChk(ValidatorConstants.PR_NO_REGX, objectToValidate);
			case "streetName":
				return regExpressionChk(ValidatorConstants.STREET_NAME, objectToValidate);
			case "policyNumber":
				return regExpressionChk(ValidatorConstants.POLICY_NO_REGX, objectToValidate);
			case "date":
				return regExpressionChk(ValidatorConstants.DATE_REGX, objectToValidate);
			case "firNo":
				return regExpressionChk(ValidatorConstants.FIR_NO_REGX, objectToValidate);
			case "firYear":
				return regExpressionChk(ValidatorConstants.FIR_YEAR_REGX, objectToValidate);
			case "remarks":
				return regExpressionChk(ValidatorConstants.REMARKS_REGX, objectToValidate);
				
				
				
				
			default:
				return true;
			}

		}
		return true;

	}

	public boolean regExpressionChk(String expression, Object field) {
		if (field == null)
			return true;
		Pattern p = Pattern.compile(sliceString(expression));
		Matcher m = p.matcher(field.toString());
		return (m.find() && m.group().equals(field));
	}

	public boolean createResponseBody(boolean status, ConstraintValidatorContext context) {
		if (!status) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(message).addPropertyNode(selected).addConstraintViolation();
			return false;
		}
		return status;

	}

	public String sliceString(String regX) {
		StringBuilder builder = new StringBuilder(regX);
		builder = builder.delete(0, 2);
		builder = builder.delete(builder.length() - 2, builder.length());
		return builder.toString();
	}
}
