package com.app.utils;

import static java.time.LocalDate.parse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import com.app.employee.Employee;
import com.app.employee.FullTimeEmployee;
import com.app.employee.PartTimeEmployee;
import com.app.exception.EmployeeException;
import com.app.validations.EmpValidations;

public class EmpUtils {
	public static List<Employee> populateList() {
		List<Employee> eList = new ArrayList<>();
		eList.add(new FullTimeEmployee("Vishal", parse("2022-05-30"), 9897456213L, 358878964123L, 30000));
		eList.add(new FullTimeEmployee("Mohit", parse("2020-11-20"), 8465986784L, 458778964148L, 55000));
		eList.add(new FullTimeEmployee("Akash", parse("2017-01-15"), 8297451234L, 747478964165L, 91000));
		eList.add(new PartTimeEmployee("Nishant", parse("2023-02-07"), 5665456232L, 50147896945L, 200));
		eList.add(new PartTimeEmployee("Mukul", parse("2022-08-11"), 7865456299L, 65447896989L, 300));
		return eList;
	}

	public static void addFullTimeEmployee(List<Employee> eList, Scanner sc) throws EmployeeException {
		System.out.println("Enter Name, Date of joining, Phone number, Aadhar number and Monthly salary");
		Employee emp = EmpValidations.validateInputs(sc.next(), sc.next(), sc.nextLong(), sc.nextLong(),
				sc.nextDouble(), eList);
		eList.add(emp);
		System.out.println("Full time Employee added successfully!");
	}

	public static void addPartTimeEmployee(List<Employee> eList, Scanner sc) throws EmployeeException {
		System.out.println("Enter Name, Date of joining, Phone number, Aadhar number and Hourly payment");
		Employee emp = EmpValidations.validateInputsPartTime(sc.next(), sc.next(), sc.nextLong(), sc.nextLong(),
				sc.nextDouble(), eList);
		eList.add(emp);
		System.out.println("Part time Employee added successfully!");
	}

	public static void deleteEmployee(List<Employee> eList, Scanner sc) {
		System.out.println("Enter the Employee Id to delete the employee");
		int deleteId = sc.nextInt();

		List<Employee> removeList = eList.stream().filter(e -> e.getEmpId() == deleteId).collect(Collectors.toList());
		eList.removeAll(removeList);
		System.out.println(removeList.size() + " Employee deleted");
	}

	public static void searchEmployee(List<Employee> eList, Scanner sc) {
		System.out.println("Enter the Aadhar number of employee");
		long Aadhar = sc.nextLong();
		List<Employee> searchList = eList.stream().filter(e -> e.getAadharNo() == Aadhar).collect(Collectors.toList());
		displayEmployee(searchList);
	}

	public static void sortByDateOfJoining(List<Employee> eList) {
		Comparator<Employee> dateComparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getDoj().compareTo(e2.getDoj());
			}
		};
		Collections.sort(eList, dateComparator);
		displayEmployee(eList);
	}

	public static void displayEmployee(List<Employee> eList) {
		System.out.println("\nAll Employee Details:");
		eList.forEach(e -> System.out.println(e));
	}
}
