package com.arrays;

import java.util.Scanner;

public class IntersectionOfTwoArray {

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
        
        System.out.println("Enter array2 size : ");
        int size2 = sc.nextInt();

        int[] arr2 = new int[size2];

        System.out.println("Enter array2 elements one by one : ");

        for(int i = 0; i <= arr2.length - 1; i++)
        {
            arr2[i] = sc.nextInt();
        }
        
        for(int i=0;i<size;i++) {
        	for(int j=0;j<size2;j++) {
        		if(arr[i]==arr2[j]) {
        			System.out.print(arr[i]+" ");
        			break;
        		}
        	}
        }
        
       

	}

}
