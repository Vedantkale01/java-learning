package com.encapsulation;

import java.util.*;

public class MessBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name,Number of Days Present and Cost Per Days : ");
        String name=sc.nextLine();
        int days=sc.nextInt();
        double cost=sc.nextDouble();

        Bill obj=new Bill(name,days,cost);
        System.out.println("Total Bill: "+obj.calBill());
        
    }
}

class  Bill{
   private String studentName;
  private  int daysPresent;
private    double costPerDay;

Bill(String studentName,int daysPresent,double costPerDay){
    if(daysPresent<=0){
        System.out.println("Invalid Days");
        System.exit(0);
    }else if(costPerDay<0){
        System.out.println("Invalid Cost");
        System.exit(0);
    }
    this.studentName=studentName;
    this.daysPresent=daysPresent;
    this.costPerDay=costPerDay;
}
public double calBill(){
    return daysPresent*costPerDay;
}
}