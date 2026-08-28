package com.encapsulation;

import java.util.*;

public class InventoryStore {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Product Name, Price Per Unit ,Quantity: ");
       String name=sc.nextLine();
       double price=sc.nextDouble();
       int quantityInStock=sc.nextInt();
      
          InventoryItem obj=new InventoryItem(name,price,quantityInStock);
        obj.displayDetails();
        System.out.println("Select if want to update: 1 for YES ,2 for NO :");
         int updateChoice=sc.nextInt();
       if(updateChoice==1){
    	   System.out.println("What to Update: 1 for Price , 2 for quantity :");
        double secondChoice=sc.nextInt();
        
        if(secondChoice==1){
        	System.out.println("Enter new Price Per Unit");
                double newPrice=sc.nextDouble();
                obj.setPricePerUnit(newPrice);
        }else{
        	System.out.println("Enter New Quantity");
            int quantity=sc.nextInt();
            obj.setQuantityInStock(quantity);
        }
       }else{
        System.exit(0);
       }
    System.out.println("After Update:");
    obj.displayDetails();
        
    }
}

class InventoryItem{
    private String itemName;
    private double pricePerUnit;
    private int quantityInStock;

    InventoryItem(String itemName,double pricePerUnit,int quantityInStock){
        this.itemName=itemName;
        this.pricePerUnit=pricePerUnit;
        this.quantityInStock=quantityInStock;
    }
    public String getItemName(){
        return itemName;
    }
     public double getPricePerUnit(){
        return pricePerUnit;
    }
     public int getQuantityInStock(){
        return quantityInStock;
    }
    public void setPricePerUnit(double price){
        pricePerUnit=price;
    }
     public void setQuantityInStock(int quantity){
        quantityInStock=quantity;
    }

    public double calculateTotalValue(){
        return pricePerUnit*quantityInStock;
    }
    public void displayDetails(){
        System.out.println("Item Name      : "+itemName);
        System.out.println("Price Per Unit : "+pricePerUnit);
        System.out.println("Quantity       : "+quantityInStock);
        System.out.println("Total Value    : "+calculateTotalValue());
    }
}
