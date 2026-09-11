package com.sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array elements one by one : ");

        for(int i = 0; i <= arr.length - 1; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        for(int i=0;i<size;i++) {
        	int min=i;
        	for(int j=i+1;j<size;j++) {
        		if(arr[j]<arr[min]) min=j;
        	}
        	int temp=arr[min];
        	arr[min]=arr[i];
        	arr[i]=temp;       	
        }
        System.out.println(Arrays.toString(arr));
	}
}
