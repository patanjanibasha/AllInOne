package com.jani.JavaConcepts;

public class Interfaces_ShapeDemo_Rectangle implements Interfaces_ShapeDemo{

	private double length;
    private double width;

    public Interfaces_ShapeDemo_Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length*width; 
    }

    @Override
    public void displayArea() {
        System.out.println("The area of the circle is: " + area());
    }
}

