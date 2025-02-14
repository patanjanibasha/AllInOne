package com.jani.LogicalQ;

public class SwaptwoNumWith3rdVariable {

	public static void main(String[] args) {
		int a =10;
		int b=20;
		int temp =0;
		System.out.println("values of a, b before swapping....");
		System.out.println("a val :"+a +" b val :"+b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("values of a, b after swapping....");
		System.out.println("a val :"+a +" b val :"+b);
		

	}

}
