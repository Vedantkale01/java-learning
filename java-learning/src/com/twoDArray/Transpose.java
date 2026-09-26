package com.twoDArray;

import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int rows=sc.nextInt();
		System.out.println("Enter number of columns:");
		int cols=sc.nextInt();
		int arr [][] = new int[rows][cols];
		System.out.println("Enter Array elements");
		for(int i=0;i<rows;i++) {		
			for(int j=0;j<cols;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++) {		
			for(int j=0;j<cols;j++) {
				if(i>j) {
					int temp=arr[i][j];
					arr[i][j]=arr[j][i];
					arr[j][i]=temp;
				}
			}
		}
		
		for(int i=0;i<rows;i++) {		
			for(int j=0;j<cols;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
