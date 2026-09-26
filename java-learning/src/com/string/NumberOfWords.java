package com.string;

import java.util.Scanner;

public class NumberOfWords {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') count++;
		}
		
		String [] strArr=str.split(" ");
		System.out.println("Number of words: "+strArr.length);
		System.out.println("Number os words: "+(count+1));
		
	}
}
