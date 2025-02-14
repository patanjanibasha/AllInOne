package com.jani.LogicalQ;

public class NumPalindrom {

	public static void main(String[] args) {
		
		int n=122;
		int num =n;
		int rev=0;
		
		while(num>0)
		{
			int rem = num%10;
			rev = rem+ (rev*10);
			num=num/10;
		}
		
		if(n==rev)
		{
			System.out.println("given number is palindrom...");
		}
		else
		{
			System.out.println("given number is not  palindrom...");
		}

	}

}
