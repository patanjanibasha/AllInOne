package com.jani.JavaCheck;

public class ObjectsCompare {
	
	static String name ="Hello world" ;
	 String name2 ="Hello world" ;
	 
	ObjectsCompare(String  name)
	{
		
	}

	public static void main(String[] args) {
		ObjectsCompare s= new ObjectsCompare(name);
		
		
	//	ObjectsCompare s1= new ObjectsCompare(s1.name2);
		
	//	ObjectsCompare s2= new ObjectsCompare(s2.name2);
		
		ObjectsCompare s3= new ObjectsCompare("Hello world");
		
	//	System.out.println(s1.equals(s2));  // false 
		
		String s10= new String("Hello world");
		String s11= new String("Hello world");
		System.out.println(s10.equals(s11));  // true 
		
	}

}
