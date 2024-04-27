package com.app.utils;

import static com.app.color.Color.*;
import static java.time.LocalDate.parse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.app.color.Color;
import com.app.exception.CustomException;
import com.app.pen.Pen;

public class Utils {
	public static Pen validateInputs(String brand, String color, String inkColor, String material, int stock,
			double price, double discount) throws CustomException {
		Color col = validateColor(color);
		return new Pen(brand, col, inkColor, material, stock, LocalDate.now(), LocalDate.now(), price, discount);
	}

	public static Color validateColor(String color) {
		return Color.valueOf(color.toUpperCase());
	}

	public static List<Pen> populateList() {
		List<Pen> penList = new ArrayList<>();
		penList.add(
				new Pen("Reynolds", BLACK, "Red", "Plastic", 10, parse("2012-04-04"), parse("2023-10-10"), 100, 10));
		penList.add(new Pen("Parker", BLUE, "Black", "Plastic", 20, parse("2017-07-04"), parse("2024-01-01"), 10, 2));
		penList.add(new Pen("Link", RED, "Blue", "Metal", 50, parse("2018-10-04"), parse("2023-03-01"), 75, 3));
		penList.add(new Pen("Rorito", BLUE, "Brown", "Plastic", 30, parse("2024-04-05"), parse("2024-04-05"), 85, 4));
		penList.add(new Pen("Montex", RED, "Blue", "Metal", 40, parse("2024-03-03"), parse("2024-01-02"), 45, 1));
		return penList;
	}

	/*
	 * 2. Update stock of a Pen i/p : brand | material | color | Ink color and new
	 * quantity
	 */
	public static Pen updateStock(String brand, String material, Color color, String inkColor, int newQuantity,
			List<Pen> list) throws CustomException {
		for (Pen p : list) {
			if (p.getBrand().equals(brand) && p.getMaterial().equals(material) && p.getColor().equals(color)
					&& p.getInkColor().equals(inkColor)) {
				p.setStock(newQuantity);
				p.setStockUpdateDate(LocalDate.now());
				return p; // Return the updated pen
			}
		}
		throw new CustomException("Pen not found");
	}

	public static void setDiscount(List<Pen> pList) {
		for (Pen pen : pList) {
			if (pen.getStockUpdateDate().isBefore(LocalDate.now().minusMonths(3))) {
				pen.setDiscount(20);
				pen.setPrice(pen.getPrice() * 0.2);
			}
		}
	}

	public static void removePens(List<Pen> pList) {
		LocalDate nineMonthsAgo = LocalDate.now().minusMonths(9);
		List<Pen> removePens = pList.stream().filter(p -> p.getStockUpdateDate().isBefore(nineMonthsAgo))
				.collect(Collectors.toList());
		pList.removeAll(removePens);
		System.out.println(removePens.size() + " Unsold pens removed successfully");

	}
}
