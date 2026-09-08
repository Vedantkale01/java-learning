package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class RightRotate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int [] arr=new int[size] ;
		System.out.println("Enter array elements:");
		for(int i=0; i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter k value :");
		int k=sc.nextInt();
		for(int j=1;j<=k;j++) {
			int temp=arr[size-1];
			for(int i=size-2;i>=0;i--) {
				arr[i+1]=arr[i];
			}
			arr[0]=temp;
		}
		System.out.println(Arrays.toString(arr));	

	}

}
