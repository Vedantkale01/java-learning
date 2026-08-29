package com.inheritance;


public class HasADemo {
	public static void main(String[] args) {
		Engine eng=new Engine("Petrol", 160.0);
		Car c=new Car("Honda", "Black", 120, eng);
		c.displayDetails();				
	}
}
class Car{
	String campany;
	String color;
	double topSpeed;
	Engine engine;
	public Car(String campany, String color, double topSpeed, Engine engine) {
		this.campany = campany;
		this.color = color;
		this.topSpeed = topSpeed;
		this.engine = engine;
	}
	public void displayDetails() {
		System.out.println("Company Name : "+campany);
		System.out.println("Color : "+color);
		System.out.println("Top Speed : "+topSpeed);
		System.out.println("Engine Details : ");
		engine.displayDetails();
	}
	
}
class Engine{
	String fuelType;
	double cc;
	public Engine(String fuelType, double cc) {
		this.fuelType = fuelType;
		this.cc = cc;
	}
	public void displayDetails() {
		System.out.println("Fuel Type: "+fuelType);
		System.out.println("Engine Capacity: "+cc);
	}
}