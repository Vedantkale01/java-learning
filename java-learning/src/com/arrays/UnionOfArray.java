package com.arrays;

import java.util.Scanner;

public class UnionOfArray {
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
        System.out.println("Enter array size : ");
        int size2 = sc.nextInt();

        int[] arr2 = new int[size2];

        System.out.println("Enter array2 elements one by one : ");

        for(int i = 0; i <= arr2.length - 1; i++)
        {
            arr2[i] = sc.nextInt();
        }
        
        int count=0;
        
        for(int i=0;i<size2;i++) {
        	boolean isPresent=false;
        	for(int j=0;j<size;j++) {
        		if(arr2[i]==arr[j]) {
        			isPresent=true;
        			break;
        		}
        	}
        	if (!isPresent) {
				count++;
			}
        }
        int n=count+size;
        int finalArr[]=new int[n];
        
        for(int i=0;i<size;i++) {
        	finalArr[i]=arr[i];
        }
        int index=size;
        for(int i=0;i<size2;i++) {
        	boolean isPresent=false;
        	for(int j=0;j<size;j++) {
        		if(arr2[i]==arr[j]) {
        			isPresent=true;
        			break;
        		}
        	}
        	if (!isPresent) {
        		finalArr[index]=arr[i];
        		index++;
        	}			
        }
           
	}
}
