package com.app.utils;

import static com.app.validations.StockValidations.validateInputs;
import static java.time.LocalDate.parse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.app.core.Stock;
import com.app.exception.StockException;

public class CollectionUtils {
	public static List<Stock> populateList() {
		List<Stock> stockList = new ArrayList<>();
		stockList.add(new Stock("A1", "Adani Power", "Adani Group", 2000, parse("2024-12-06"), 100));
		stockList.add(new Stock("R1", "Reliance Jio", "Reliance Group", 5000, parse("2025-08-12"), 700));
		stockList.add(new Stock("T1", "TCS", "TATA Group", 4500, parse("2026-01-08"), 1100));
		stockList.add(new Stock("W1", "Wipro", "Wipro Limited", 550, parse("2025-10-06"), 1200));
		stockList.add(new Stock("I1", "Infosys", "Infosys Technologies", 7000, parse("2026-03-01"), 4400));
		return stockList;
	}

	public static void addNewStock(List<Stock> stockList, Scanner sc) throws StockException {
		System.out.println(
				"Enter Stock Id, Stock name, Company name, Price, Closing date(YYYY-MM-DD) and Quantity of the stock.");
		Stock stock = validateInputs(sc.next(), sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.next(), sc.nextInt(),
				stockList);
		stockList.add(stock);
		System.out.println("Stock added successfully!");
		System.out.println(stock);
	}

	public static void viewStocks(List<Stock> stockList, Scanner sc) {
		sc.nextLine();
		System.out.println("Enter the company name");
		String companyName = sc.nextLine();
		stockList.stream().filter(s -> s.getCompanyName().equals(companyName)).forEach(s -> System.out.println(s));
	}

	public static void displayStocks(List<Stock> stockList) {
		stockList.forEach(s -> System.out.println(s));
	}

	public static void sellStocks(List<Stock> stockList, Scanner sc) throws StockException {
		System.out.println("Enter Stock Id and quantity of stocks to Sell the stock.");
		String findStockId = sc.next();
		int quantity = sc.nextInt();
		for (Stock s : stockList) {
			if (s.getStockId().equals(findStockId)) {
				if (s.getQuantity() > quantity) {
					s.setQuantity(s.getQuantity() - quantity);
					System.out.println(quantity + " stocks selled.");
					System.out.println(s);
					return;
				} else
					throw new StockException("Insufficient stock quantity!");
			}
		}
		throw new StockException("Invalid Stock Id");
	}

	public static void purchaseStocks(List<Stock> stockList, Scanner sc) throws StockException {
		System.out.println("Enter Stock Id and quantity of stocks to Purchase the stock.");
		String findStockId = sc.next();
		int quantity = sc.nextInt();
		for (Stock s : stockList) {
			if (s.getStockId().equals(findStockId)) {
				if (quantity > 0) {
					s.setQuantity(s.getQuantity() + quantity);
					System.out.println(quantity + " stocks purchased.");
					System.out.println(s);
					return;
				} else
					throw new StockException("Quantity cannot be zero or less.");
			}
		}
		throw new StockException("Invalid Stock Id");
	}
}
