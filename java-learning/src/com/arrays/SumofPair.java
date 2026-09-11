package com.arrays;

import java.util.Scanner;

public class SumofPair {

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
        System.out.println("Enter the sum to check for pairs");
        int target=sc.nextInt();
        for(int i=0;i<size;i++) {
        	for(int j=i+1;j<size;j++) {
        		if((arr[i]+arr[j])==target)
        		{
        			System.out.println(arr[i]+" "+arr[j]);
        		}
        	}
        }
	}

}
