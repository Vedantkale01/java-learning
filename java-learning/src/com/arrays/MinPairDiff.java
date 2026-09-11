package com.arrays;

import java.util.Scanner;

public class MinPairDiff {

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
        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i<size;i++) {
        	
        	for(int j=i+1;j<size;j++) {
        		if(Math.abs(arr[i]-arr[j])<minDiff)
        			minDiff=Math.abs(arr[i]-arr[j]);
        		//if(arr[i]>arr[j] && arr[i]-arr[j]<minDiff) minDiff=arr[i]-arr[j];
        	//	else if (arr[i]<arr[j] && arr[j]-arr[i]<minDiff) minDiff=arr[j]-arr[i];
        	}
        	
        }
        System.out.println("Minimum Difference is "+minDiff);
	}

}
