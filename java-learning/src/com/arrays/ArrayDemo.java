package com.arrays;

import java.util.Scanner;

public class ArrayDemo {
	static Employee arr[];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Employee");
		int n=sc.nextInt();
		arr=new Employee[n];
		System.out.println("Enter Employee details");
		for(int i=0;i<n;i++) {
			System.out.println("enter employee "+(i+1)+" id, name, department, salary:");
			int id=sc.nextInt();
			sc.nextLine();
			String name=sc.nextLine();
			String dept=sc.nextLine();
			double sal=sc.nextDouble();
			arr[i]=new Employee(id, name, dept, sal);
		}
		
		System.out.println("================================");
		System.out.println("Enter 1 for printing the details of employees belongs to given dept");
		System.out.println("Enter 2 for printing the details of employees who are having greter sal than the given salary");
		System.out.println("Enter 3 for Avg Sal");
		System.out.println("================================");
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		switch(choice) {
			case 1-> {
				sc.nextLine();
				System.out.println("Enter dept name:");
				String dept=sc.nextLine();
				deparmentWise(dept);
			}
			case 2-> {
				System.out.println("Enter target sal:");
				double sal=sc.nextDouble();
				SalaryWise(sal);
			}
			case 3-> avgSalary();
			default -> System.out.println("Enter valid choice");
		}
		
	}
	public static void deparmentWise(String dept) {
		for(Employee emp:arr) {
			if(emp.deptName.equalsIgnoreCase(dept)) emp.displayDetails();
		}
	}
	public static void SalaryWise(double sal) {
		for(Employee emp:arr) {
			if(emp.sal>sal) emp.displayDetails();
		}
	}
	public static void avgSalary() {
		double sum=0;
		for(Employee emp:arr) {
			sum+=emp.sal;
		}
		System.out.println("Average Salary: "+sum/arr.length);
	}
	
	
	
}
class Employee{
	int empId;
	String eName;
	String deptName;
	double sal;
	public Employee(int empId, String eName, String deptName, double sal) {
		this.empId = empId;
		this.eName = eName;
		this.deptName = deptName;
		this.sal = sal;
	}
	public void displayDetails() {
		System.out.println("Employee Id : "+empId);
		System.out.println("Employee Name : "+eName);
		System.out.println("Employee Department : "+deptName);
		System.out.println("Employee Salary : "+sal);
	}
}