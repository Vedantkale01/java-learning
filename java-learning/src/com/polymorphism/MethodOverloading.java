package com.polymorphism;

public class MethodOverloading
{

	public static void main(String[] args) {
		SalaryCalculator sc = new SalaryCalculator();
		System.out.println(sc.calculateSalary(50000));
		System.out.println(sc.calculateSalary(20, 500.0));
		System.out.println(sc.calculateSalary(30000.0, 5000));
	}

}

class SalaryCalculator{
	public double calculateSalary(double monthlySal) {
		return monthlySal;
	}
	
	public double calculateSalary(int hours, double ratePerHour) {
		return hours*ratePerHour;
	}
	
	public double calculateSalary(double fixedAmount, int bonus) {
		return (fixedAmount+bonus);
	}
}
