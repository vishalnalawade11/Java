package com.app.validations;

import com.app.cricketer.Cricketer;
import com.app.exception.CricketerException;
import com.app.rating.Rating;

public class CricketerValidations {

	public static Cricketer validateInputs(String name, int age, String emailId, String phone, String rating)
			throws CricketerException {
		ageValidation(age);
		Rating rate = ratingValidation(rating);
		return new Cricketer(name, age, emailId, phone, rate);
	}

	public static void ageValidation(int age) throws CricketerException {
		if (age > 40)
			throw new CricketerException("Age is greater than 40.");
	}

	public static Rating ratingValidation(String rating) {
		return Rating.valueOf(rating.toUpperCase());
	}

}