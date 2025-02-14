package com.jani.LogicalQ;

public class Factorial {

	public static int factorial(int n) 
	{
		if (n == 0 || n == 1) 
		{ 
            return 1;
        }
        return n * factorial(n - 1); 
    
    }
	public static void main(String[] args) {
		
		// using for loop
		int n=5;
		int fact=1;

		for(int i=1;i<=n;i++)
		{
			fact = fact*i;
		}
		System.out.println(" fact is using for loop : "+fact);
		
		System.err.println("using recursion :"+factorial(4));
	}

	
}
