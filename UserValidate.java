package com.example.demo;

import java.util.regex.Pattern;

public class UserValidate {
	private static final String FIRST_NAME_PATTERN = "[A-Z]{1}[a-zA-Z]{2,}";
	private static final String LAST_NAME_PATTERN = "[A-Z]{1}[a-zA-Z]{2,}";
	private static final String EMAIL_ID_PATTERN = "^[a-zA-Z]+[-+.]{0,1}[a-zA-Z0-9]+@[A-Za-z0-9]+(.[A-Za-z]{2,4}){1,2}$";
	private static final String MOBILE_NUMBER_PATTERN = "[1-9]{1}[0-9]{1}( )[1-9]{1}[0-9]{9}";
	private static final String PASSWORD_PATTERN = "(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()])[a-zA].{8,}$";

	public boolean validFirstName(String firstName) throws UserValidateException {
		Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
		boolean result = pattern.matcher(firstName).matches();
		if (!result)
			throw new UserValidateException(UserValidateException.ExceptionType.ENTERED_INVALID_FIRST_NAME,
					"Plz Enter Valid First Name");
		return result;
	}

	public boolean validLastName(String lastName) throws UserValidateException {

		boolean result = Pattern.matches(LAST_NAME_PATTERN, lastName);

		if (!result)
			throw new UserValidateException(UserValidateException.ExceptionType.ENTERED_INVALID_LAST_NAME,
					"Plz Enter Valid Last Name");
		return result;
	}

	public boolean validEmailId(String emailId) throws UserValidateException {
		boolean result = Pattern.matches(EMAIL_ID_PATTERN, emailId);
		if (!result)
			throw new UserValidateException(UserValidateException.ExceptionType.ENTERED_INVALID_EMAIL_ID,
					"Plz Enter Valid EmailId");
		return result;

	}

	public boolean validMobileNumber(String mobileNumber) throws UserValidateException {
		boolean result = Pattern.matches(MOBILE_NUMBER_PATTERN, mobileNumber);
		if (!result)
			throw new UserValidateException(UserValidateException.ExceptionType.ENTERED_INVALID_MOBILE_NUMBER,
					"Plz Enter Valid MOBILE NUMBER");
		return result;
	}

	public boolean validPassword(String password) throws UserValidateException {
		boolean result = Pattern.matches(PASSWORD_PATTERN, password);
		if (!result)
			throw new UserValidateException(UserValidateException.ExceptionType.ENTERED_INVALID_PASSWORD,
					"Plz Enter Valid Password");
		return result;
	}
}
