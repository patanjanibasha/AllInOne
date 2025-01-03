package com.jani.JavaConcepts;

public class Interfaces_ShapeDemo_Circle implements Interfaces_ShapeDemo
{
	private double radius;

    public Interfaces_ShapeDemo_Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius; 
    }

    @Override
    public void displayArea() {
        System.out.println("The area of the circle is: " + area());
    }

}
