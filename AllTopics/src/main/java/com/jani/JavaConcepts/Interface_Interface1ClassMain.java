package com.jani.JavaConcepts;

public class Interface_Interface1ClassMain implements Interface_Interface1  {

	
	@Override
	public void m1() {
		System.out.println("m1 called");
	}

	@Override
	public void m2() {
		System.out.println("m2 called");
	}

	public static void main(String[] args) 
	{
		Interface_Interface1ClassMain obj = new Interface_Interface1ClassMain();
		obj.m1();
		obj.m2();
		Interface_Interface1.m3();
		obj.m4();
	}
}
