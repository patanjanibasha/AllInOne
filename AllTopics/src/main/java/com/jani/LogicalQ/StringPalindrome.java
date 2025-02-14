package com.jani.LogicalQ;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		System.out.println("Enter a string....");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		int len = s.length();
		String rev ="";
	
		for (int i = len - 1; i >= 0; i--) {
			 rev = rev+ s.charAt(i);
		}
		if(rev.equals(s))
			
		{
			System.out.println("string is palindrome..");
		}
		else
		{
			System.err.println("string is not palindrome..");
		}
	}
}
