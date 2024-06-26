package com.app.fruits;

public class Mango extends Fruit {
	public Mango(String color, double weight, String name, boolean fresh) {
		super(color, weight, name, fresh);	
	}
	@Override
	public String toString()
	{
		return "Mango: "+super.toString() + " Fresh= " + isFresh();
	}
	
	public String taste()
	{
		return " Sweet";
	}
	
	public void pulp() {
		System.out.println("Name= " + getName() + " Color= " + getColor() + " creating pulp");
	}
		
	@Override
	public void setFresh(boolean fresh) {
		super.setFresh(fresh);
	}
	

}
