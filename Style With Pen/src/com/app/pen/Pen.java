package com.app.pen;

import java.time.LocalDate;

import com.app.color.Color;

public class Pen {
	private int id;
	private String brand;
	private Color color;
	private String inkColor;
	private String material;
	private int stock;
	private LocalDate stockUpdateDate;
	private LocalDate stockListingDate;
	private double price;
	private double discount;
	private static int count = 0;

	public Pen(String brand, Color color, String inkColor, String material, int stock, LocalDate stockUpdateDate,
			LocalDate stockListingDate, double price, double discount) {
		super();
		this.id = ++count;
		this.brand = brand;
		this.color = color;
		this.inkColor = inkColor;
		this.material = material;
		this.stock = stock;
		this.stockUpdateDate = stockUpdateDate;
		this.stockListingDate = stockListingDate;
		this.price = price;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public String getInkColor() {
		return inkColor;
	}

	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public LocalDate getStockUpdateDate() {
		return stockUpdateDate;
	}

	public void setStockUpdateDate(LocalDate stockUpdateDate) {
		this.stockUpdateDate = stockUpdateDate;
	}

	public LocalDate getStockListingDate() {
		return stockListingDate;
	}

	public void setStockListingDate(LocalDate stockListingDate) {
		this.stockListingDate = stockListingDate;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Pen.count = count;
	}

	@Override
	public String toString() {
		return "Pen [id=" + id + ", brand=" + brand + ", color=" + color + ", inkColor=" + inkColor + ", material="
				+ material + ", stock=" + stock + ", stockUpdateDate=" + stockUpdateDate + ", stockListingDate="
				+ stockListingDate + ", price=" + price + ", discount=" + discount + "]";
	}

}
