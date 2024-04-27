package com.app.utils;

import static com.app.rating.Rating.FIVE;
import static com.app.rating.Rating.FOUR;
import static com.app.rating.Rating.ONE;
import static com.app.rating.Rating.THREE;
import static com.app.rating.Rating.TWO;
import static com.app.validations.CricketerValidations.validateInputs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.app.cricketer.Cricketer;
import com.app.exception.CricketerException;
import com.app.rating.Rating;

public class CricketerUtils {

	public static List<Cricketer> populateList() {
		List<Cricketer> cList = new ArrayList<>();
		cList.add(new Cricketer("Vishal", 24, "vishal@gmail.com", "9856745825", FOUR));
		cList.add(new Cricketer("Darshan", 29, "darshan@gmail.com", "1234567890", ONE));
		cList.add(new Cricketer("Mohit", 26, "mohit@gmail.com", "5469871330", FIVE));
		cList.add(new Cricketer("Shubham", 31, "shubham@gmail.com", "789456031", TWO));
		cList.add(new Cricketer("Deepak", 21, "deepak@gmail.com", "1237894560", THREE));
		return cList;
	}

	public static void addCricketer(List<Cricketer> cList) throws CricketerException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name, Age, Email Id, Phone Number and Rating of Cricket player:");
		Cricketer c = validateInputs(sc.next(), sc.nextInt(), sc.next(), sc.next(), sc.next());
		cList.add(c);
		System.out.println("Cricketer added successfully!");
	}

	public static void modifyRating(List<Cricketer> cList, Scanner sc) throws CricketerException {
		System.out.println("Enter the name of Cricketer who's rating has to update");
		String cName = sc.next();

		// Find the Cricketer by name
		Cricketer cricketerToUpdate = null;
		for (Cricketer cricketer : cList) {
			if (cricketer.getName().equals(cName)) {
				cricketerToUpdate = cricketer;
				break;
			}
		}
		if (cricketerToUpdate == null) {
			throw new CricketerException("Cricketer not found.");
		}

		System.out.println(
				"Existing rating for " + cricketerToUpdate.getName() + " is: " + cricketerToUpdate.getRating());

		System.out.println("Enter the new rating (ONE, TWO, THREE, FOUR, FIVE):");
		String ratingInput = sc.next().toUpperCase();

		// Parse the user input to enum value
		Rating newRating = Rating.valueOf(ratingInput);

		// Update the Cricketer's rating
		cricketerToUpdate.setRating(newRating);

		System.out.println("Rating updated successfully!");
	}

	public static void searchCricketer(List<Cricketer> cList, Scanner sc) throws CricketerException {
		System.out.println("Enter the name of Cricketer.");
		String cName = sc.next();

		// Find the Cricketer by name
		Cricketer cricketerToUpdate = null;
		for (Cricketer cricketer : cList) {
			if (cricketer.getName().equals(cName)) {
				cricketerToUpdate = cricketer;
				break;
			}
		}
		if (cricketerToUpdate == null) {
			throw new CricketerException("Cricketer not found.");
		}

		System.out.println(cricketerToUpdate);
	}

	public static void displayCricketers(List<Cricketer> cList) {
		cList.stream().forEach(c -> System.out.println(c));
	}

	public static void sortByRating(List<Cricketer> cList) {
		Comparator<Cricketer> ratingComparator = new Comparator<Cricketer>() {
			@Override
			public int compare(Cricketer c1, Cricketer c2) {
				return c1.getRating().compareTo(c2.getRating());
			}
		};

		Collections.sort(cList, ratingComparator);
		System.out.println("Cricketer's sorted by rating");
		cList.stream().forEach(c -> System.out.println(c));
	}
}
