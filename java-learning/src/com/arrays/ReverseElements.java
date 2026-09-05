package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int [] arr=new int[size] ;
		System.out.println("Enter array elements:");
		for(int i=0; i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		// with extra array 
		int b [] =new int[size];
		for(int i=0 ;i<size ;i++) {
			b[size-1-i]=arr[i];
		}
		System.out.println(Arrays.toString(b));
		
		// without Extra Array
		int i=0;
		int j=size-1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
		System.out.println(Arrays.toString(arr));
	}
}
