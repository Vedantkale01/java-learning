package com.arrays;

import java.util.Scanner;

public class MissingNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements one by one : ");

        for(int i = 0; i <= arr.length - 1; i++)
        {
            arr[i] = sc.nextInt();
        }
        int n=arr[size-1];
        int sum= (n*(n+1))/2;
        int sumArr=0;
        for(int el : arr) {
        	sumArr+=el;
        }
        if(sum==sumArr ) 
        	System.out.println("No missing element");
        else 
        System.out.println("Missing element:" +(sum-sumArr));
       
	}
}
