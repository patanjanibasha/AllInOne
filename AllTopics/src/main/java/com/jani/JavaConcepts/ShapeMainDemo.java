package com.jani.JavaConcepts;

public class ShapeMainDemo {

	public static void main(String[] args) {
		
		Interfaces_ShapeDemo_Circle c = new Interfaces_ShapeDemo_Circle(10);
		Interfaces_ShapeDemo_Rectangle r = new Interfaces_ShapeDemo_Rectangle(10,2);
		Interfaces_ShapeDemo_Triangle t = new Interfaces_ShapeDemo_Triangle(10,2);
		
		c.displayArea(); 
		
		r.displayArea();
		
		t.displayArea();
	}
}
