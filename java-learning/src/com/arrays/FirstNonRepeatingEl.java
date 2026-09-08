package com.arrays;

import java.util.Scanner;

public class FirstNonRepeatingEl {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size=sc.nextInt();
		int [] arr=new int[size] ;
		System.out.println("Enter array elements:");
		for(int i=0; i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int index=-1;
		int count;
		for(int i=0;i<size;i++) {
			count=0;
			for(int j=0;j<size;j++) {
				if(arr[j]==arr[i]) {
					count++;
				}
			}
			if(count==1) {
				index=i;
				break;
			}
		}
		if(index==-1) {
			System.out.println("No non repeating element in the array");
		}else {
			System.out.println("First non repeating element is : "+arr[index]);
		}
	}

}
