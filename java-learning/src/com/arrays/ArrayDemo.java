package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int [] arr=new int[size] ;
		System.out.println("Enter array elements:");
		for(int i=0; i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int firstmax=arr[0];
		int secondmax=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>firstmax) {
				secondmax=firstmax;
				firstmax=arr[i];
			}else if(arr[i]>secondmax && arr[i]!=firstmax) {
				secondmax=arr[i];
			}
			
		}
		System.out.println(secondmax);
	}

}
