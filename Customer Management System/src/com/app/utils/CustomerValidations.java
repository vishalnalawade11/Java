package com.app.utils;

import java.time.LocalDate;
import java.util.List;

import com.app.customer.Customer;
import com.app.exception.CustomerException;
import com.app.serviceplan.ServicePlan;

//Method to validate the inputs provided by user.
public class CustomerValidations {
	public static Customer validateInputs(String firstName, String lastName, String email, String password,
			double registrationAmount, String dob, String plan, List<Customer> customerList) throws CustomerException {
		ServicePlan sPlan = validateServicePlan(plan);
		validateServicePlanBalance(sPlan, registrationAmount);
		validateEmail(email, customerList);
		return new Customer(firstName, lastName, email, password, registrationAmount, LocalDate.parse(dob), sPlan);
	}

	private static void validateServicePlanBalance(ServicePlan sPlan, double registrationAmount)
			throws CustomerException {
		if (registrationAmount < sPlan.getPlanCharge())
			throw new CustomerException("Registration amount is less than the required plan charge.");

	}

	private static ServicePlan validateServicePlan(String plan) {
		return ServicePlan.valueOf(plan.toUpperCase());
	}

	private static void validateEmail(String email, List<Customer> customerList) throws CustomerException {
//		int index = customerList.indexOf(email);
//		System.out.println(index);
		//if (!customerList.get(index).getEmail().equals(email))
		if(customerList.contains(new Customer(email)))
		{
			throw new CustomerException("Email Id is already registered. Please try with different Id.");
		}
		if(email.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$") )
		{
			System.out.println("valid email");
		}
		else {
			throw new CustomerException("Envalid email");
		}
	}
}
