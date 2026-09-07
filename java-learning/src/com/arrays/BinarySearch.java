package com.arrays;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int [] arr=new int[size] ;
		System.out.println("Enter array elements:");
		for(int i=0; i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element to search ");
		int target=sc.nextInt();
		int start=0;
		int end=arr.length-1;
		boolean isPresent=false;
		while(start<=end) {
//			int mid=start+(end-start)/2;
			int mid=(start+end)/2;
			if(arr[mid]==target) { 
				isPresent=true;
				break;
			}
			else if(arr[mid]>target) end=mid-1;
			else start=mid+1;
		}
		if(isPresent) System.out.println("Found");
		else System.out.println("Not Found");
	}

}
