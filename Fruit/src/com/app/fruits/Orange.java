package com.app.fruits;

public class Orange extends Fruit {
	public Orange(String color, double weight, String name, boolean fresh) {
		super(color, weight, name, fresh);

	}

	public String toString() {
		return "Orange: " + super.toString() + " Fresh= " + isFresh();
	}

	public String taste() {
		return " Sour";
	}

	public void juice() {
		System.out.println("Name= " + getName() + " Weight= " + getWeight() + " extracting juice");
	}
	
	@Override
	public void setFresh(boolean fresh) {
		super.setFresh(fresh);
	}

}
