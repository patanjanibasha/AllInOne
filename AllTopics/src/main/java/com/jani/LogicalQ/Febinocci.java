package com.jani.LogicalQ;

public class Febinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1=0;
		int a2=1;
		int a3=0;
		
		int n=10;
		
		System.out.print(" "+a1);
		System.out.print(" "+a2);
		
		for(int i=3;i<=n;i++)
		{
			a3=a1+a2;
			a1=a2;
			a2=a3;
			System.out.print(" "+a3);
		}
	}

}
