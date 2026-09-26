package com.string;

import java.util.Scanner;

public class ConvertToUpperCase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		String str2="";
		
//		for(int i=0;i<str.length();i++) {
//			char ch=str.charAt(i);
//			if(ch>'a'&&ch<'z') {
//				ch=(char)(ch-32);
//			}
//			str2+=ch;
//		}
		
		//======= to LowerCase====
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z') {
				ch=(char) (ch+32);
			}
			str2+=ch;
		}
		System.out.println(str2);
	}
}
