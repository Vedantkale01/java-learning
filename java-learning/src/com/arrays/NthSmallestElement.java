package com.arrays;

import java.util.Scanner;

public class NthSmallestElement {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array:");
	int size=sc.nextInt();
	int [] arr=new int[size] ;
	System.out.println("Enter array elements:");
	for(int i=0; i<size;i++) {
		arr[i]=sc.nextInt();
	}
	System.out.println("Enter n value to print nth largest");
	int n=sc.nextInt();
	for(int el : arr ) {
		int count=0;
		for(int j :arr) {
			if(j<el) count++;
		}
		if(count== (n-1)) {
			System.out.println(n+" Smallest element is "+el);
		}
	}
}
}
