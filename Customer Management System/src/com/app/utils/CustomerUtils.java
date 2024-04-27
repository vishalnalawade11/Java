package com.app.utils;

import static com.app.serviceplan.ServicePlan.*;
import static java.time.LocalDate.parse;

import java.util.ArrayList;
import java.util.List;

import com.app.customer.Customer;

public class CustomerUtils {
	// Method for generating sample data of customers.
	public static List<Customer> populateList() {
		List<Customer> customer = new ArrayList<>(); // Up-casting
		customer.add(new Customer("Vishal", "Nalawade", "vishal@gmail.com", "vishal", 2000, parse("2000-04-11"), GOLD));
		customer.add(new Customer("Mohit", "Gupta", "mohit@gmail.com", "mohit", 1000, parse("1999-04-12"), SILVER));
		customer.add(new Customer("Nishat", "Thosar", "nishant@gmail.com", "nishant", 5000, parse("1998-11-04"), DIAMOND));
		customer.add(new Customer("Akash", "Bhosale", "akash@gmail.com", "akash", 10000, parse("1995-05-20"), PLATINUM));
		return customer;
	}

}
