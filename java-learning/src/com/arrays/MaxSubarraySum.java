package com.arrays;

import java.util.Scanner;

public class MaxSubarraySum {
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
        
        int Maxsum=Integer.MIN_VALUE;
        for(int i=0; i<size;i++) {
        	for(int j=i;j<size;j++) {
        		int s=0;
        		for(int k=i; k<=j;k++) {
//        			System.out.print(arr[k]+" ");
        			s+=arr[k];
        		}
        		if(s>Maxsum) Maxsum=s;
//        		System.out.println();
        	}
        }
    // kadanes Algo 
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];

            // Update the maximum sum found so far
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            // If the running sum becomes negative, discard it
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        
        System.out.println("Sum : "+maxSum);
	}
}
