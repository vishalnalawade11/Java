package com.app.employee;

import java.time.LocalDate;

public class PartTimeEmployee extends Employee {
	private double hourlyPayment;

	public PartTimeEmployee(String name, LocalDate doj, long phoneNo, long aadharNo, double hourlyPayment) {
		super(name, doj, phoneNo, aadharNo);
		this.hourlyPayment = hourlyPayment;
	}

	@Override
	public String toString() {
		return super.toString() + "PartTimeEmployee [hourlyPayment=" + hourlyPayment + "]";
	}

	public double getHourlyPayment() {
		return hourlyPayment;
	}

	public void setHourlyPayment(double hourlyPayment) {
		this.hourlyPayment = hourlyPayment;
	}

}
