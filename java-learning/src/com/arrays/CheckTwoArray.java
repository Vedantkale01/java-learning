package com.arrays;

import java.util.Scanner;

public class CheckTwoArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int [] arr=new int[size] ;
		System.out.println("Enter array elements:");
		for(int i=0; i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the size of array:");
		int size2=sc.nextInt();
		int [] arr2=new int[size2] ;
		System.out.println("Enter array elements:");
		for(int i=0; i<size2;i++) {
			arr2[i]=sc.nextInt();
		}
		
		if(size!=size2) {
			System.out.println("Not Equal");
		}
		boolean isEqual=true;
		for(int i=0;i<size ;i++) {
			if(arr[i]!=arr2[i]) isEqual=false;
		}
		if(isEqual)System.out.println("Both the arrays are equal.");
		
	}

}
