package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToEnd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		int [] a = new int[size];
		System.out.println("Enter array elements one by one : ");
		for(int i = 0;i<=a.length-1;i++)
		{
		a[i] = sc.nextInt();
		}
		
		// solution 1 with extra array 
//		int [] b = new int[a.length];
//		int indexB = 0;
//		for(int i = 0;i<=a.length-1;i++)
//		{
//		if(a[i]!=0)
//		{
//			b[indexB] = a[i];
//		indexB++;
//		}
//		}
//		System.out.println("Result is : "+Arrays.toString(b));
		
        // solution 2 without array 
		
		int k=0;
		for(int e: a) {
			if(e!=0) {
				a[k]=e;
				k++;
			}
		}
		while(k<size) {
			a[k]=0;
			k++;
		}
		System.out.println("Result is : "+Arrays.toString(a));
	}

}
