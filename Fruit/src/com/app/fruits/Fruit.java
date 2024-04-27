package com.app.fruits;

public abstract class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean fresh;

	public Fruit(String color, double weight, String name, boolean fresh) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.fresh = fresh;
	}

	public abstract String taste();

	@Override
	public String toString() {
		return "Name=" + name + " Color=" + color + " Weight=" + weight;
	}

	public boolean isFresh() {
		return fresh;
	}

	public String getColor() {
		return color;
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}
	
	

}
