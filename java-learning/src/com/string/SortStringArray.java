package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class SortStringArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size=sc.nextInt();
		sc.nextLine();
		String arr[]=new String[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextLine();
		}
		
		for(int i=0;i<size;i++) {
			for(int j=0;j<size-1-i;j++) {
				if(arr[j].compareTo(arr[j+1])>0) {
					String temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
