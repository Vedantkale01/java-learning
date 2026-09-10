package com.arrays;

import java.util.Scanner;

public class FindSubArrayGivenSum {
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
        System.out.println("Enter Target sum:");
        int target=sc.nextInt();
        int minIndex=0;
        int maxIndex=0;
        boolean result=false;
        
        outer:
        for(int i=0; i<size;i++) {
        	for(int j=i;j<size;j++) {
        		int sum=0;
        		for(int k=i; k<=j;k++) {

        			sum+=arr[k];
        		}
        		if(sum==target) {
        			minIndex=i;
        			maxIndex=j;
        			result=true;
        			break outer;
        		}

        	}
        }
        if(result) {
        	for(int i=minIndex;i<=maxIndex;i++) {
        		System.out.print(arr[i]+" ");
        	}
        }else {
        	System.out.println("No subarray");
        }
        
	}
}
