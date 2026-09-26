package com.string;

import java.util.Scanner;

public class CountVowelsConso {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=sc.nextLine();
		int vCount=0,cCount=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'
				||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vCount++;
			}else if(ch>='A'&&ch<='Z'|| ch>='a' && ch<='z') {
				cCount++;
			}
		}
		System.out.println(vCount+"----"+cCount);
		
		
	}

}
