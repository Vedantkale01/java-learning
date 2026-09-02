package com.abstraction;

import java.util.Scanner;


public class FoodOrderSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter choice : ");
		int choice=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Item :");
		String item=sc.nextLine();
		DeliveryPartner partner=DeliveryFactory.getDeliveryPartner(choice);
		OrderService obj=new OrderService();
		obj.placeOrder(partner, item);

	}

}
class OrderService{
	public void placeOrder(DeliveryPartner partner, String item) {
		if(partner.deliverOrder(item)) {
			System.out.println("Order Placed successfully!!");
		}else {
			System.out.println("Order failed!!");
		}
	}
}

class DeliveryFactory{
	public static DeliveryPartner getDeliveryPartner(int choice) {
		switch(choice) {
		case 1 -> {
			return new SwiggyDelivery();
		}
		case 2 -> {
			return new ZomatoDelivery();
		}
		case 3 -> {
			return new DunzoDelivery();
		}
		default -> {
			return null ;
		}
	}
}
}	
interface DeliveryPartner{
	boolean  deliverOrder(String item) ;
}

class SwiggyDelivery implements DeliveryPartner{

	public boolean deliverOrder(String item) {
		System.out.println("Delivery is done via swiggy");
		return true;
	}
	
}
class ZomatoDelivery implements DeliveryPartner{

	public boolean deliverOrder(String item) {
		System.out.println("Delivery is done via zomato");
		return true;
	}
	
}
class DunzoDelivery implements DeliveryPartner{

	public boolean deliverOrder(String item) {
		System.out.println("Delivery is done via dunzo");
		return true;
	}
	
}