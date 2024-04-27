package com.app.customer;

import java.time.LocalDate;

import com.app.serviceplan.ServicePlan;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private double registrationAmount;
	private LocalDate dob;
	private ServicePlan plan;
	private static int count = 0;

	public Customer(String firstName, String lastName, String email, String password, double registrationAmount,
			LocalDate dob, ServicePlan plan) {
		super();
		this.id = ++count;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.plan = plan;
	}

	public Customer(String email) {
		super();
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ServicePlan getPlan() {
		return plan;
	}

	public void setPlan(ServicePlan plan) {
		this.plan = plan;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", registrationAmount=" + registrationAmount + ", dob=" + dob + ", plan="
				+ plan + ", count=" + count + "]";
	}

	@Override
	public boolean equals(Object o) {
		System.out.println("in customer equals method");
		if (o instanceof Customer) {
			Customer customer = (Customer) o;
			return this.email.equals(customer.email);
		}
		return false;
	}
}
