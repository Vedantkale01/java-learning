package com.abstraction;
// Q1
public class PaymentProcessing {
	public static void main(String[] args) {
		int choice=1;
		double amount=10000;
		Payment payment=PaymentFactory.getPaymentObject(choice);
		LoanService obj=new LoanService();
		obj.clearLoan(payment, amount);
	}
}

class LoanService{
	void clearLoan(Payment payment,double amount) {
		if(payment.pay(amount)) {
			System.out.println("Loan cleared successfully");
			System.out.println("Loan clearance certificate generated");
		}else {
			System.out.println("Payment failed. Loan not cleared");
		}
	}
}

class PaymentFactory{
	static Payment getPaymentObject(int choice) {
		switch(choice) {
			case 1 -> {
				return new UPIPayment();
			}
			case 2 -> {
				return new CreditCardPayment();
			}
			case 3 -> {
				return new CryptoPayment();
			}
			default -> {
				return null ;
			}
	    }
	}
}

interface Payment{
	boolean pay(double amount);
}

class UPIPayment implements Payment{

	public boolean pay(double amount) {
		System.out.println("Payment of "+amount+" is done using UPI");
		return true;
	}
	
}

class CreditCardPayment implements Payment{

	public boolean pay(double amount) {
		System.out.println("Payment of "+amount+" is done using Credit Card");
		return true;
	}
	
}

class CryptoPayment implements Payment{

	public boolean pay(double amount) {
		System.out.println("Payment of "+amount+" is done using Crypto Currency");
		return true;
	}
	
}



