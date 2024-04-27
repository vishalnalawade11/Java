package com.app.validations;

import java.time.LocalDate;
import java.util.List;

import com.app.employee.Employee;
import com.app.employee.FullTimeEmployee;
import com.app.employee.PartTimeEmployee;
import com.app.exception.EmployeeException;

public class EmpValidations {
	public static FullTimeEmployee validateInputs(String name, String doj, long phoneNo, long aadharNo,
			double monthlySalary, List<Employee> eList) throws EmployeeException {
		LocalDate dateOfJoining = LocalDate.parse(doj);

		if (phoneNo < 1000000000L || phoneNo > 9999999999L) {
			throw new EmployeeException("Invalid Phone number!");
		}

		if (aadharNo < 100000000000L || aadharNo > 999999999999L) {
			throw new EmployeeException("Invalid Aadhar number!");
		}

		// Check if Aadhar number is already registered
		if (eList.stream().anyMatch(e -> e.getAadharNo() == aadharNo)) {
			throw new EmployeeException("Aadhar number is already registered!");
		}

		// If all validations pass, return a new Employee object
		return new FullTimeEmployee(name, dateOfJoining, phoneNo, aadharNo, monthlySalary);
	}

	public static PartTimeEmployee validateInputsPartTime(String name, String doj, long phoneNo, long aadharNo,
			double hourlyPayment, List<Employee> eList) throws EmployeeException {
		LocalDate dateOfJoining = LocalDate.parse(doj);

		if (phoneNo < 1000000000L || phoneNo > 9999999999L) {
			throw new EmployeeException("Invalid Phone number!");
		}

		if (aadharNo < 100000000000L || aadharNo > 999999999999L) {
			throw new EmployeeException("Invalid Aadhar number!");
		}

		// Check if Aadhar number is already registered
		if (eList.stream().anyMatch(e -> e.getAadharNo() == aadharNo)) {
			throw new EmployeeException("Aadhar number is already registered!");
		}

		// If all validations pass, return a new Employee object
		return new PartTimeEmployee(name, dateOfJoining, phoneNo, aadharNo, hourlyPayment);
	}
}
