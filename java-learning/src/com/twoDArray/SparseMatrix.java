package com.twoDArray;

import java.util.Scanner;

public class SparseMatrix {
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
		
		int count=0;
		for(int[] num :arr) {
			for(int el : num) {
				if(el==0) count++;
			}
		}
		
		if(count>(rows*cols)/2) {
			System.out.println("Given matrix is Sparse");
		}else {
			System.out.println("Not a Sparse matrix");
		}
	}
}
