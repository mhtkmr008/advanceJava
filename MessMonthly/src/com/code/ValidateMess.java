package com.code;

import java.time.LocalDate;
import java.util.Map;

public class ValidateMess {

	private static void ValidateEmail(String email, Map<String, Customer> maps) throws InvalidInputException {
		if (maps.containsKey(email))
			throw new InvalidInputException("Email Id Aready Exists");
	}

	private static void ValidateEmailChar(String email) {
		if (email.matches("[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}"))
			System.out.println("Email Is Ok");
	}

	private static LocalDate ParseAndValidate(String registrationDate) throws InvalidInputException {
		LocalDate date = LocalDate.parse(registrationDate);
		if (date.isBefore(LocalDate.now()))
			throw new InvalidInputException("Date Must Be Either Today or Date After Today");
		return date;
	}

	private static void ValidatePhoneNumber(String phoneNumber) throws InvalidInputException {
		if (!phoneNumber.matches("[0-9){10}"))
			throw new InvalidInputException("Phone Number Must be 10 digits Only");
	}

	private static Plan ValidatePlan(String plan, double registrationAmount) throws InvalidInputException {
		for (Plan p : Plan.values())
			if (p.name().equalsIgnoreCase(plan) && p.getpPrice() == registrationAmount) {
				return p;
			}
		throw new InvalidInputException("InvalidPlan");
	}

	public static Customer ValidateAllDetails(String firstName, String lastName, String email, String password,
			String address, String phoneNumber, String registrationDate, String plan, double amount,
			Map<String, Customer> maps) throws InvalidInputException {
		ValidateEmail(email, maps);
		ValidateEmailChar(email);
		LocalDate lDate = ParseAndValidate(registrationDate);
		ValidatePhoneNumber(phoneNumber);
		Plan p = ValidatePlan(plan, amount);

		return new Customer(firstName, lastName, email, password, address, phoneNumber, lDate, p, amount);
	}

}
