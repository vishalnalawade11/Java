package com.app.tester;

import static com.app.utils.CollectionUtils.addNewStock;
import static com.app.utils.CollectionUtils.displayStocks;
import static com.app.utils.CollectionUtils.populateList;
import static com.app.utils.CollectionUtils.purchaseStocks;
import static com.app.utils.CollectionUtils.sellStocks;
import static com.app.utils.CollectionUtils.viewStocks;
import static com.app.utils.IOUtils.saveData;

import java.util.List;
import java.util.Scanner;

import com.app.core.Stock;

public class StockTradingServiceApp {

	public static void main(String[] args) {
		List<Stock> stockList = populateList();
		int choice = 0;
		try (Scanner sc = new Scanner(System.in)) {
			do {
				System.out.println("Stock Menu:");
				System.out.println("1. Add New stock in the market.");
				System.out.println("2. View Available stocks by Company.");
				System.out.println("3. Purchase stocks.");
				System.out.println("4. Sell Stocks.");
				System.out.println("5. Display all stocks.");
				System.out.println("6. Save and Exit");
				System.out.println("\nEnter your choice:");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					addNewStock(stockList, sc);
					break;

				case 2:
					viewStocks(stockList, sc);
					break;

				case 3:
					purchaseStocks(stockList, sc);
					break;

				case 4:
					sellStocks(stockList, sc);
					break;

				case 5:
					displayStocks(stockList);
					break;
					
				case 6:
					saveData(stockList, sc);
					break;
				}
			} while (choice != 6);
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
