package com.app.tester;

import static com.app.utils.CricketerUtils.addCricketer;
import static com.app.utils.CricketerUtils.displayCricketers;
import static com.app.utils.CricketerUtils.modifyRating;
import static com.app.utils.CricketerUtils.populateList;
import static com.app.utils.CricketerUtils.searchCricketer;
import static com.app.utils.CricketerUtils.sortByRating;

import java.util.List;
import java.util.Scanner;

import com.app.cricketer.Cricketer;

public class CricketerTest {

	public static void main(String[] args) {
		List<Cricketer> cricketerList = populateList();

		int choice = 0;
		try (Scanner sc = new Scanner(System.in)) {

			do {
				System.out.println("Menu:");
				System.out.println("1. Add Crickter.");
				System.out.println("2. Modify Cricketer's rating.");
				System.out.println("3. Search Cricketer by name.");
				System.out.println("4. Display all Cricketer's.");
				System.out.println("5. Display all Cricketer's in sorted form by rating.");
				System.out.println("0. Exit\n");
				System.out.println("Enter your choice:");
				choice = sc.nextInt();

				switch (choice) {
				case 1:
					addCricketer(cricketerList);
					break;

				case 2:
					modifyRating(cricketerList, sc);
					break;

				case 3:
					searchCricketer(cricketerList, sc);
					break;

				case 4:
					displayCricketers(cricketerList);
					break;

				case 5:
					sortByRating(cricketerList);
					break;

				case 0:
					System.out.println("See you again! Bye!");
					break;
				}
			} while (choice != 0);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
