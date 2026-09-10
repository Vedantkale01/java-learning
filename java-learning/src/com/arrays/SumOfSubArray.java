package com.arrays;

import java.util.Scanner;

public class SumOfSubArray {

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
        int sum=0;
        for(int i=0; i<size;i++) {
        	for(int j=i;j<size;j++) {
        		for(int k=i; k<=j;k++) {
//        			System.out.print(arr[k]+" ");
        			sum+=arr[k];
        		}
//        		System.out.println();
        	}
        }
    
        
        System.out.println("Sum : "+sum);

	}

}
