package com.app.employee;

import java.time.LocalDate;

public class Employee {
	private int empId;
	private String name;
	private LocalDate doj;
	private long phoneNo;
	private long aadharNo;
	private static int count = 0;

	public Employee(String name, LocalDate doj, long phoneNo, long aadharNo) {
		super();
		this.empId = ++count;
		this.name = name;
		this.doj = doj;
		this.phoneNo = phoneNo;
		this.aadharNo = aadharNo;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", doj=" + doj + ", phoneNo=" + phoneNo + ", aadharNo="
				+ aadharNo + "]";
	}

	public long getAadharNo() {
		return aadharNo;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Employee.count = count;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

}
