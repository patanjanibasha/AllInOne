package com.jani.JavaCheck;
public class Demo1_ClassB {
	
	void C()  
	{   
		System.out.println("class b method calls C");  
		Demo1_ClassA a1= new Demo1_ClassA();
		a1.B();
	}
	
	Demo1_ClassA a1= new Demo1_ClassA(); //classA cons called
	
	Demo1_ClassB b = new Demo1_ClassB();  // go class b and do all objects
	 
	public static void main(String[] args) 
	{
		Demo1_ClassA a2= new Demo1_ClassA(); //classA cons called
		a2.B();									// classA method called
	//	Demo1_ClassA a3= new Demo1_ClassA();  //classA cons called
		Demo1_ClassB b1 = new Demo1_ClassB(); // go to class b and check any objects 
	//	Demo1_ClassB b2 = new Demo1_ClassB(); // go to class b and check any objects 
		b1.C();
	}
}
