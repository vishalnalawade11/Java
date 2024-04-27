package com.app.tester;

import static com.app.utils.EmpUtils.addFullTimeEmployee;
import static com.app.utils.EmpUtils.addPartTimeEmployee;
import static com.app.utils.EmpUtils.deleteEmployee;
import static com.app.utils.EmpUtils.displayEmployee;
import static com.app.utils.EmpUtils.populateList;
import static com.app.utils.EmpUtils.searchEmployee;
import static com.app.utils.EmpUtils.sortByDateOfJoining;

import java.util.List;
import java.util.Scanner;

import com.app.employee.Employee;

public class EmployeeApp {

	public static void main(String[] args) {
		int choice = 0;
		List<Employee> empList = populateList();
		try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.println("Application Menu:\n");
				System.out.println("1. Add full time employee");
				System.out.println("2. Add part time employee");
				System.out.println("3. Delete an employee by Emp Id");
				System.out.println("4. Search employee details by Aadhaar number");
				System.out.println("5. Display all employee details");
				System.out.println("6. Display all employee details sorted by date of joining");
				System.out.println("0. Exit\n");
				System.out.println("Enter your choice:");
				choice = sc.nextInt();
				try {
					switch (choice) {
					case 1:
						addFullTimeEmployee(empList, sc);
						break;

					case 2:
						addPartTimeEmployee(empList, sc);
						break;

					case 3:
						deleteEmployee(empList, sc);
						break;

					case 4:
						searchEmployee(empList, sc);
						break;

					case 5:
						displayEmployee(empList);
						break;

					case 6:
						sortByDateOfJoining(empList);
						break;

					case 0:
						System.out.println("See you again! Bye!");
						break;
					}
				} catch (Exception e) {
					System.out.println(e);
				}

			} while (choice != 0);
		}
	}

}
