package org.epragati.util.custom.validation;

public class ValidatorConstants {

	/**
	 * Regular Expressions
	 */
	public static final String PR_NO_REGX = "/^[a-zA-Z0-9() {} ]+$/";
	public static final String TR_NO_REGX = "/^[a-zA-Z0-9() {} ]+$/";
	public static final String MOBILE_REGX = "/^[6-9][0-9]{9}$/";
	public static final String EMAIL_REGX = "/^[A-Za-z0-9][_.A-Za-z0-9]+(\\.[_A-Za-z0-9]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,6})$/";
	public static final String DOOR_REGX = "/^[ A-Za-z0-9/:,#&-]*$/";
	public static final String NAME_REGX = "/^[a-zA-Z ]*$/";
	public static final String STREET_NAME = "/^[A-Za-z0-9 ]*$/";
	public static final String DATE_REGX = "/^(3[01]|[12][0-9]|0[1-9])-(1[0-2]|0[1-9])-[0-9]{4}$/";
	public static final String POLICY_NO_REGX = "/^[A-Za-z0-9/-]*$/";
	public static final String FIR_NO_REGX = "/^[A-Za-z0-9/-]*$/";
	public static final String FIR_YEAR_REGX = "/^[0-9]/";
	public static final String REMARKS_REGX = "/^[a-zA-Z ]*$/";

	/**
	 * Constant sizes
	 */
	public static final int PR_NO_SIZE = 12;
	public static final int TR_NO_SIZE = 12;
	public static final int MOBILE_NO_SIZE = 10;
	public static final int AADHAR_SIZE = 12;
	public static final int STRING_SIZE_STRING = 28;
	public static final int STRING_SIZE_NAME = 20;
	public static final int DOOR_MAX_LENGTH = 25;
	public static final int REMARKS_LENGTH = 25;

	/**
	 * Failure Messages
	 */

	public static final String INVALID_PRNO = "Invalid Pr No ";
	public static final String INVALID_TRNO = "Invalid Tr No ";
	public static final String INVALID_MOBILE = "Invalid Mobile No ";
	public static final String INVALID_EMAIL = "Invlaid Email";
	public static final String INVALID_ADDRESS = "Invalid Address";
	public static final String INVALID_COUNTRY = "Invalid Country Address";
	public static final String INVALID_DATE_FORMAT = "Invalid Date Formats";
	public static final String IVALID_AADHAAR_NO = "Invalid Aadhaar No";
	public static final String INVALID_DISPLAY_NAME = "Invalid Display Name";
	public static final String INVALID_FATHER_NAME = "Invalid Father Name";
	public static final String INVALID_FIRST_NAME = "Invalid First Name";
	public static final String INVALID_POLICY_NO = "Invalid Policy Number";
	public static final String INVALID_CHASSIS_NO = "Invalid Chassis No";
	public static final String INVALID_TENURE = "Invalid Tenure No";
	public static final String INVALID_FIR_NO = "Invalid Fir No";
	public static final String INVALID_FIR_YEAR = "Invalid Fir Year";
	public static final String INVALID_REMARKS = "Invalid Remarks";

}
