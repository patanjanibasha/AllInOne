package com.jani.JavaConcepts;

public interface Interface_Interface1 {

	  void m1();
	  void m2(); 
	  
	  public static void m3()
	  {
		  System.out.println("static");
	  }
	  
	  default void m4()
	  {
		  System.out.println("default");
	  }
}
/** Interface
 * ===============================
 * 1. Interface must be have interface  keyword, 
 * 	  abstract keyword is optional for interface un-implimented methods.
 * 
 * 2. interface must use inheritence concept i.e (implments)
 * 
 * 2. interface only have un-implimented methods.
 * 3. inteface methods  abstract  by default, no need to write abstract keyword.
 * 3. we cannot create object for a interface bcz we dont have atleast one un implimented methods 
 * 3. we use impliments key word to override/impliment un implimented methods of interface in child class
 *
 *
 *
**/     