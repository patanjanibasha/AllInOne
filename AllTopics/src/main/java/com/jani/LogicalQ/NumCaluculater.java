package com.jani.LogicalQ;

import java.util.Scanner;

public class NumCaluculater {
	
	Scanner sc = new Scanner(System.in);
	
//	public int enterInput(String enter)
	{
	//	System.out.println(enter);
	//	int d = sc.nextInt();
	//	retutn d;
	}
	public void  add()
	{
		System.err.println("Enter first input..");
		 int a = sc.nextInt();
		System.err.println("Enter second input..");
		 int b = sc.nextInt();
		int c =a+b;
		System.out.println("Addition is :"+c); 
	}
	
	public void  sub()
	{
		System.err.println("Enter first input..");
		 int a = sc.nextInt();
		System.err.println("Enter second input..");
		 int b = sc.nextInt();
		int c =a-b;
		System.out.println("subtraction is :"+c); 
	}
	
	public void  mul()
	{
		System.err.println("Enter first input..");
		 int a = sc.nextInt();
		System.err.println("Enter second input..");
		 int b = sc.nextInt();
		int c =a*b;
		System.out.println("multiplication is :"+c); 
	}
	public void  div()
	{
		System.err.println("Enter first input..");
		 int a = sc.nextInt();
		System.err.println("Enter second input..");
		 int b = sc.nextInt();
		int c =a/b;
		System.out.println("Division is :"+c); 
	}

	public static void main(String[] args) 
	{
		NumCaluculater obj = new NumCaluculater();
		while(true)
		{
		System.err.println("Enter your choice......");
		System.out.println("1. Addition...");
		System.out.println("2. Subtraction...");
		System.out.println("3. Multiplication...");
		System.out.println("4. Division...");

		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		
		if (choice == 0) 
		{
            System.out.println("Exiting the program...");
            break;
        }
		 switch (choice) 
		 {
         case 1:
             obj.add();
             break;
         case 2:
             obj.sub();
             break;
         case 3:
             obj.mul();
             break;
         case 4:
             obj.div();
             break;
         default:
             System.err.println("Invalid choice. Please enter a valid number.");
             break;
		 }
		}
	}
}

