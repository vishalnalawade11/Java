package com.app.tester;

import static com.app.utils.CustomerValidations.validateInputs;

import java.util.List;
import java.util.Scanner;

import com.app.customer.Customer;
import com.app.exception.CustomerException;
import com.app.utils.CustomerUtils;

public class CustomerManagmentApp {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			List<Customer> customerList = CustomerUtils.populateList();
			boolean flag = false;
			while (!flag) {
				System.out.println("Options:");
				System.out.println("1. Sign Up - Customer registration");
				System.out.println("2. Sign In - Login");
				System.out.println("3. Change password");
				System.out.println("4. Unsubscribe customer");
				System.out.println("5. Display all Customers");
				System.out.println("0. Exit");
				System.out.println("\nEnter your choice");
				int choice = sc.nextInt();

				try {
					switch (choice) {
					case 1:
						System.out
								.println("Enter Customer's First Name, Last Name, Email, Password, Registration Amount,"
										+ "	Date of birth, Service Plan");
						Customer customer = validateInputs(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(),
								sc.next(), sc.next(), customerList);
						customerList.add(customer);
						System.out.println(customer);
						System.out.println("Customer registered successfully!");
						break;

					case 2:
						System.out.println("Enter Customer's Email Id and Password:");
						int index = customerList.indexOf(new Customer(sc.next()));
						if (index == -1) {
							throw new CustomerException("Account does not found.");
						}
						if ((customerList.get(index).getPassword()).equals(sc.next())) {
							System.out.println("login successful");
						} else {
							throw new CustomerException("Wrong password.");
						}
						break;

					case 3:
						System.out.println("Enter Customer's Email Id and Password:");
						int ind = customerList.indexOf(new Customer(sc.next()));
						if (ind == -1) {
							throw new CustomerException("Account does not found.");
						}
						if (!(customerList.get(ind).getPassword()).equals(sc.next())) {
							throw new CustomerException("Wrong password");
						}
						System.out.println("Enter new password");
						customerList.get(ind).setPassword(sc.next());
						System.out.println("Password changed");
						break;

					case 4:
						System.out.println("Enter Customer's Email Id");
						int in = customerList.indexOf(new Customer(sc.next()));
						if (in == -1) {
							throw new CustomerException("Account does not found.");
						}
						customerList.remove(in);
						System.out.println("Customer unsubscribed successfully!");
						break;

					case 5:
						System.out.println("Customer list:");
						for (Customer cust : customerList) {
							System.out.println(cust);
						}
						break;

					case 0:
						System.out.println("Bye! Visit again...");
						flag = true;
						break;

					}

				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}

	}

}
