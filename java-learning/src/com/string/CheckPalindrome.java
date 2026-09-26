package com.string;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		
		if(rev.equals(str)) {
			System.out.println("given string is palindrome");
		}else {
			System.out.println("Not a palindrome");
		}

	}

}
