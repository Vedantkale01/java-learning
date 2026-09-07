package com.arrays;

import java.util.Scanner;

public class CheckSorted {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int [] arr=new int[size] ;
		System.out.println("Enter array elements:");
		for(int i=0; i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		boolean checkSort=true;
		
		for(int i=0; i <arr.length-1 ;i++) {
			if(arr[i+1]<arr[i]) {
				checkSort=false;
				break;
			}
		}
		if(checkSort) {
			System.out.println("Sorted in ascending order");
		}else {
			System.out.println("Not sorted");
		}
	}
}
