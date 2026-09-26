package com.twoDArray;

import java.util.Scanner;

public class ProductOfTwoMatrix {

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
		
		System.out.println("Enter number of rows:");
		int rows2=sc.nextInt();
		System.out.println("Enter number of columns:");
		int cols2=sc.nextInt();
		int arr2 [][] = new int[rows2][cols2];
		System.out.println("Enter Array elements");
		for(int i=0;i<rows2;i++) {		
			for(int j=0;j<cols2;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		int [][] productArr=new int[rows][cols2];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols2;j++) {
				int sum=0;
				for(int k=0;k<rows;k++) {
					sum+= arr[i][k]+arr2[k][j];
				}
				productArr[i][j]=sum;
			}
		}
		
		for(int[] num :productArr) {
			for(int el : num) {
				System.out.print(el+" ");
			}
			System.out.println();
		}

	}

}
