package com.arrays;

import java.util.Scanner;

public class FrequencyOfElement {

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
        
        for(int i =0 ;i< size ;i++) {
        	boolean isPreviousPresent=false;
        	for(int j=0 ; j < i ;j ++ ) {
        		if(arr[j]==arr[i]) {
        			isPreviousPresent=true;
        			break;
        		}
        	}
        	
        	if(!isPreviousPresent) {
        		int count=0;
        		for(int j=0;j<size ;j++) {
        			if(arr[j]==arr[i])count++;
        		}
        		System.out.println(arr[i]+" is repeated "+count+" times");
        	}
        }
	}

}
