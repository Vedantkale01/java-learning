package com.abstractClass;

public class AtmOperations {

	public static void main(String[] args) {
		ATM op1=new Withdraw();
		op1.process();
		ATM op2=new CheckBalance();
		op2.process();
	}

}

abstract class ATM{
	
	final public void process() {
		insertCard();
		enterPin();
		doTransaction();
		printReceit();
	}
	public void insertCard() {
		System.out.println("Card is inserted...");
	}
	public void enterPin() {
		System.out.println("PIN entered succefully");
	}
	public abstract void doTransaction();
	public void printReceit() {
		System.out.println("Receit si printed!!");
	}
	
}
class Withdraw extends ATM{
	public void doTransaction() {
		System.out.println("Amount is withdrawn..");
	}
}
class Deposit extends ATM{
	public void doTransaction() {
		System.out.println("Amount is Deposited..");
	}
}
class CheckBalance extends ATM{
	public void doTransaction() {
		System.out.println("Balance Checked successfully..");
	}
}
