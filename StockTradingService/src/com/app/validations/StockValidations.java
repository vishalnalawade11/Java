package com.app.validations;

import static java.time.LocalDate.now;
import static java.time.LocalDate.parse;

import java.time.LocalDate;
import java.util.List;

import com.app.core.Stock;
import com.app.exception.StockException;

public class StockValidations {
	// For validating all the inputs entered by user and returning Stock.
	public static Stock validateInputs(String stockId, String stockName, String companyName, double price,
			String closingDate, int quantity, List<Stock> stockList) throws StockException {
		validateStockId(stockId, stockList);
		LocalDate closeDate = validateClosingDate(closingDate);
		return new Stock(stockId, stockName, companyName, price, closeDate, quantity);
	}

	// To check the duplicate Stock Id.
	public static void validateStockId(String stockId, List<Stock> stockList) throws StockException {
		boolean isMatch = stockList.stream().anyMatch(s -> s.getStockId().equals(stockId));
		if (isMatch) {
			throw new StockException("Stock Id already exists!");
		}
	}

	// To check the closing date should be future date from today.
	public static LocalDate validateClosingDate(String closingDate) throws StockException {
		LocalDate closeDate = parse(closingDate);
		if (closeDate.isBefore(now())) {
			throw new StockException("Stock closing date should be future date.");
		}
		return closeDate;
	}
}
