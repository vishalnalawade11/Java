package com.app.tester;

import java.util.List;
import java.util.Scanner;

import com.app.exception.CustomException;
import com.app.pen.Pen;
import com.app.utils.Utils;
import static com.app.utils.Utils.*;

public class Tester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int choice;
			List<Pen> pList = Utils.populateList();
			do {
				System.out.println("Menu:");
				System.out.println("1. Add a new Pen.");
				System.out.println("2. Update stock of Pen");
				System.out
						.println("3. Set discount of 20% for all the pens which are not at all sold in last 3 months");
				System.out.println("4. Remove Pens which are never sold once listed in 9 months");
				System.out.println("5. Display Pen list");
				System.out.println("0. Exit");
				System.out.println("Enter your choice");
				choice = sc.nextInt();

				switch (choice) {
				case 1:
					System.out.println("Enter Brand, Color, Ink Color, Material, Stock, Price, Discount");
					Pen pen1 = Utils.validateInputs(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt(),
							sc.nextDouble(), sc.nextDouble());
					pList.add(pen1);
					System.out.println("New Pen added successfully!");
					pList.forEach(p -> System.out.println(p));
					break;

				case 2:
					System.out.println("Enter Brand, Material, Color, Ink Color, new Stock");
					Pen p = updateStock(sc.next(), sc.next(), Utils.validateColor(sc.next()), sc.next(), sc.nextInt(),
							pList);
					System.out.println("Stock updated successfully");
					System.out.println(p);
					break;

				case 3:
					/*
					 * Set discount of 20% for all the pens which are not at all sold in last 3
					 * months In this you can set the discount value for all such pens OR apply
					 * discount n update price as well
					 */
					setDiscount(pList);
					pList.forEach(pe -> System.out.println(pe));
					break;

				case 4:
					removePens(pList);

				case 5:
					System.out.println("Pen List");
					for (Pen pen : pList) {
						System.out.println(pen);
					}
					break;

				case 0:
					System.out.println("Bye! See you again!");
					break;
				}
			} while (choice != 0);

		} catch (CustomException e) {
			System.out.println(e);
		}

	}

}
