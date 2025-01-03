package com.jani.JavaConcepts;

public class Interfaces_ShapeDemo_Triangle implements Interfaces_ShapeDemo{

	private double base;
	private double height;
	
	Interfaces_ShapeDemo_Triangle(double base, double height)
	{
		this.base=base;
		this.height=height;
	}
	
	@Override
	public double area() {
		return (1/2)*base*height;
	}

	@Override
	public void displayArea() {
	System.out.println("area of triangle is : "+area());
	}

}
