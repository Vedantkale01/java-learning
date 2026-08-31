package com.abstractClass;

public class Main {
   public static void main(String[] args) {
	Drink d1=new Tea();
	d1.makeDrink();
	Drink d2=new Tea();
	d2.makeDrink();
   }
}

abstract class Drink{
	final void makeDrink() {
		boilWater();
		addMainItem();
		pourIntoCup();
		addExtra();
	}
	public abstract void boilWater();
	public abstract void addMainItem();
	public abstract void pourIntoCup();
	public abstract void addExtra();
}

class Tea extends Drink{
	public void boilWater() {	
		System.out.println("Start boiling the water");
	}
	public void addMainItem() {	
		System.out.println("Adding Tea Powder ");
	}
	public void pourIntoCup() {	
		System.out.println("Drink is poured into cup");
	}
	public void addExtra() {	
		System.out.println("Adding Sugar");
	}
}
class Coffee extends Drink{
	public void boilWater() {	
		System.out.println("Start boiling the water");
	}
	public void addMainItem() {	
		System.out.println("Adding Coffee Powder");
	}
	public void pourIntoCup() {	
		System.out.println("Poured into the cup");
	}
	public void addExtra() {	
		System.out.println("Adding Sugar");
	}
}
