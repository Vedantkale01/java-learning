package com.arrays;
import java.util.Scanner;
public class LinearSearch {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int [] arr=new int[size] ;
		System.out.println("Enter array elements:");
		for(int i=0; i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element to search");
		int target =sc.nextInt();
		boolean found=false;
		
		for(int el :arr ) {
			if(el==target) {
				found=true;
				break;
			}
		}
		if(found) {
			System.out.println("Array contains the given target");
		}else
			System.out.println("Array does not contains the given target");
		
	}
}
