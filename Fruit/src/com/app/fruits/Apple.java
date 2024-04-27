package com.app.fruits;

public class Apple extends Fruit {
	public Apple(String color, double weight, String name, boolean fresh) {
		super(color, weight, name, fresh);
	}

	@Override
	public String toString() {
		return "Apple: " + super.toString() + " Fresh= " + isFresh();
	}

	public String taste() {
		return " Sweet and Sour";
	}

	public void jam() {
		System.out.println("Name= " + getName() + " making jam!");
	}
	
	@Override
	public void setFresh(boolean fresh) {
		super.setFresh(fresh);
	}

}
