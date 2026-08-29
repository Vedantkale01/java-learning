package com.inheritance;

public class AssciationExample {
	  public static void main(String[] args) {
		Pen pen=new Pen("Reynold", "Black", "Gel", 10);
		Student stud = new Student("Vedant", 21, 101, pen);
		stud.displayDetails();
	  }
}
class Student{
	String name;
	int age;
	int rollNo;
	Pen pen;
	public Student(String name, int age, int rollNo, Pen pen) {
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
		this.pen = pen;
	}
	public void displayDetails() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Roll Number :"+rollNo);
		System.out.println("Pen Details : ");
		pen.displayDetails();
	}
}
class Pen{
	
	String brand;
	String color;
	String type;
	double price;
	public Pen(String brand, String color, String type, double price) {
		this.brand = brand;
		this.color = color;
		this.type = type;
		this.price = price;
	}
	public void displayDetails() {
		System.out.println("Brand : "+brand);
		System.out.println("Color : "+color);
		System.out.println("Type : "+type);
		System.out.println("Prce : "+price);
	}
	
	
}