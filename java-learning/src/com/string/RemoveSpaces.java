package com.string;

import java.util.Scanner;

public class RemoveSpaces {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		String str2="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				str2+=str.charAt(i);
			}
		}
		System.out.println("Removed spaces "+str2);
	}

}
