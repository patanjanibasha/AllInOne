package com.jani.LogicalQ;

public class SwaptwoNumWithout3rdVariable {

	public static void main(String[] args) {
	
		
		int a =20;
		int b =10;
		
		System.out.println("values of a, b before swapping....");
		System.out.println("a val :"+a +" b val :"+b);
		
		a=a+b ;  // a= 20+10 = 30
		b=a-b;  //  b= 30-10 = 20
		a= a-b;  // a= 30-20 = 10
		
		System.out.println("values of a, b before swapping....");
		System.out.println("a val :"+a +" b val :"+b);
	}

}
