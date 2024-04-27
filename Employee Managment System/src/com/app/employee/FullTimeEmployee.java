package com.app.employee;

import java.time.LocalDate;

public class FullTimeEmployee extends Employee {
	private double monthlySalary;

	public FullTimeEmployee(String name, LocalDate doj, long phoneNo, long aadharNo, double monthlySalary) {
		super(name, doj, phoneNo, aadharNo);
		this.monthlySalary = monthlySalary;
	}

	@Override
	public String toString() {
		return super.toString() + "FullTimeEmployee [monthlySalary=" + monthlySalary + "]";
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

}
