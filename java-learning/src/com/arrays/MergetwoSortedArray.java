package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergetwoSortedArray {
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
		
		int finalArr[]=new int [size+size2];
		int index=0;
		int x=0;
		int y=0;
		while(x<size && y<size2) {
			if(arr[x]<arr2[y]) {
				finalArr[index]=arr[x++];
			}else finalArr[index]=arr2[y++];
			index++;
		}
		while(x<size) {
			finalArr[index++]=arr[x++];
		}
		while(y<size2) {
			finalArr[index++]=arr2[y++];
		}
		System.out.println(Arrays.toString(finalArr));
		
	}
}
