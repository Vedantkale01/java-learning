package com.inheritance;

public class StudentResultSystem {
    public static void main(String[] args) {
		SchoolStudent s1=new SchoolStudent("Vedant", 101, 80);
		s1.displayDetails();
		System.out.println("Grade : " +s1.calculateGrade());
		UniversityStudent s2=new UniversityStudent("Tanay", 102, 90, "CS");
		s2.displayDetails();
		System.out.println("Grade : "+s2.calculateGrade());
    }
}
class SchoolStudent{
	private String name;
	private int id;
	private int marks;
	public SchoolStudent(String name, int id, int marks) {
		this.name = name;
		this.id = id;
		this.marks = marks;
	}
	
	public void displayDetails() {
		System.out.println("Name : "+name);
		System.out.println("Id : "+id);
		System.out.println("Marks : "+marks);
	}
	
	public char calculateGrade() {
		if(marks>=80) return 'A' ;
		else if(marks>=60) return 'B';
		else return 'C' ;
	}
	
}

class UniversityStudent extends SchoolStudent{
    private String researchArea;
	public UniversityStudent(String name, int id, int marks,String researchArea) {
		super(name, id, marks);
		this.researchArea=researchArea;
	}
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Research Area : "+researchArea);
	}
	
}
