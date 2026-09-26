package com.string;


import java.util.Scanner;

public class CheckAnagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first string: ");
		String str=sc.nextLine();
		System.out.println("Enter second string: ");
		String str2=sc.nextLine();
		
		if(str.length()!=str2.length()) {
			System.out.println("Not Anagram");
			return;
		}
		
		str=str.toUpperCase();
		str2=str2.toUpperCase();
		
		//==============
		
//		char arr[]=str.toCharArray();
//		char arr2[]=str2.toCharArray();
//		Arrays.sort(arr);
//		Arrays.sort(arr2);
//		if(Arrays.equals(arr, arr2)) System.out.println("Anagram");
//  	else System.out.println("Not Anagram");
		
		//==============
		
		char arr[]=new char[str.length()];
		char arr2[]=new char[str2.length()];
		
		for(int i=0;i<arr.length;i++) arr[i]=str.charAt(i);
		for(int i=0;i<arr2.length;i++) arr2[i]=str2.charAt(i);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					char temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;	
				}
				if(arr2[j]>arr2[j+1]) {
					char temp=arr2[j];
					arr2[j]=arr2[j+1];
					arr2[j+1]=temp;
				}
			}
		}
		
		boolean isAnagram=true;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=arr2[i]) {
				isAnagram=false;
				break;
			}
		}
		
		System.out.println(isAnagram? "Anagram" : "Not Anagram");
		
		
	}
}
