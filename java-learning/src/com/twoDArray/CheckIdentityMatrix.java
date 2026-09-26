package com.twoDArray;

import java.util.Scanner;

public class CheckIdentityMatrix {

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
		boolean checkIdentity=true;
		outer:
		for(int i=0;i<rows;i++) {		
			for(int j=0;j<cols;j++) {
				if(i==j) {
					if(arr[i][j]!=1) {
						checkIdentity=false;
						break outer;
					}
					break outer;
				}else {
					if(arr[i][j]!=0) {
						checkIdentity=false;
						break outer;
					}
				}
			}
		}
		if(checkIdentity) {
			System.out.println("Given matrix is a identity matrix");
		}else {
			System.out.println("not a identity matrix");
		}
	}

}
