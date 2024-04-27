package com.app.tester;

import java.util.Scanner;

import com.app.fruits.*;

public class FruitBasket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the number of fruits: ");
		/*
		Fruit[] fruits = new Fruit[sc.nextInt()];
		int count = 0;
		int choice = 0;

		do {
			System.out.println("\nMenu: ");
			System.out.println("1. Add Mango.");
			System.out.println("2. Add Orange.");
			System.out.println("3. Add Apple.");
			System.out.println("4. Display names of all fruits in the basket.");
			System.out.println("5. Display Name, Color, Weight and Taste for all fresh fruits.");
			System.out.println("6. Mark a fruit in a basket as stale.");
			System.out.println("7. Mark all sour fruits as stale.");
			System.out.println("8. Invoke fruit specific functionality. (pulp/juice/jam)");
			System.out.println("9. Exit.");
			System.out.println("\nChoose from above option:");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				if (count >= 0 && count < fruits.length) {
					System.out.println("Enter color, weight, name and is it fresh or not");
					fruits[count] = new Mango(sc.next(), sc.nextDouble(), sc.next(), sc.nextBoolean());
					count++;
				} else
					System.out.println("Basket is full!");
				break;

			case 2:
				if (count >= 0 && count < fruits.length) {
					System.out.println("Enter color, weight, name and is it fresh or not");
					fruits[count] = new Orange(sc.next(), sc.nextDouble(), sc.next(), sc.nextBoolean());
					count++;
				} else
					System.out.println("Basket is full!");
				break;

			case 3:
				if (count >= 0 && count < fruits.length) {
					System.out.println("Enter color, weight, name and is it fresh or not");
					fruits[count] = new Apple(sc.next(), sc.nextDouble(), sc.next(), sc.nextBoolean());
					count++;
				} else
					System.out.println("Basket is full!");
				break;

			case 4:
				for (Fruit f : fruits) {
					System.out.println(f.getName());
				}
				break;

			case 5:
				for (Fruit f : fruits) {
					System.out.println(f.toString() + f.taste());
				}
				break;

			case 6:
				System.out.println("Enter a index of fruit to mark as stale:");
				int index = sc.nextInt() - 1;
				fruits[index].setFresh(false);
				break;

			case 7:
				for(Fruit fru : fruits) {
					if(fru instanceof Orange && " Sour".equals(fru.taste())) {
						fru.setFresh(false);
						System.out.println("Marked as stale");
					}
				}
				break;
				
			case 8:
				System.out.println("Enter a index of fruit:");
				int ind = sc.nextInt() - 1;
				Fruit f = fruits[ind];
				if (f instanceof Mango) {
					((Mango) f).pulp();
				} else if (f instanceof Orange) {
					((Orange) f).juice();
				} else {
					((Apple) f).jam();
				}
				break;

			case 9:
				choice = 9;
				System.out.println("See you again... Bye!");
				break;
			}

		} while (choice != 9);
		*/
	}

}
