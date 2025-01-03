package com.jani.JavaConcepts;

public class E1_Inherce_Child {
	void m2()
	{
		System.out.println("child  m2 called");
	}

	public static void main(String[] args) {
		
		E1_Inherce_Parent p1 = new E1_Inherce_Parent(); 
	//	E1_Inherce_Parent p2 = new E1_Inherce_Child();   // Error
		
		E1_Inherce_Child c1 = new E1_Inherce_Child();
		E1_Inherce_Child c2 = new E1_Inherce_Child();
		
	}

}
