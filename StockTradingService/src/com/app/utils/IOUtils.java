package com.app.utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;

import com.app.core.Stock;

public class IOUtils {
	public static void saveData(List<Stock> stockList, Scanner sc) throws FileNotFoundException, IOException {
		System.out.println("Enter filename to store the data");
		String fileName = sc.next();
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
			out.writeObject(stockList);
			System.out.println("Data stored successfully!");
		}
	}
}
