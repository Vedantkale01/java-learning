package com.arrays;

import java.util.Scanner;

public class MajarityElement {
	// number of occrunce of element should be  > n/2
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
        int index=-1;
        for(int i=0; i<size;i++) {
        	int count=0;
        	for(int j =0 ;j<size ;j++) {
        		if(arr[i]==arr[j]) count++;
        	}
        	if(count>(size/2)) {
        		index=i;
        		break;
        	}
        }
        if(index==-1) System.out.println("No majarity element present");
        else System.out.println("Majority element: "+arr[index]);
	}
}
