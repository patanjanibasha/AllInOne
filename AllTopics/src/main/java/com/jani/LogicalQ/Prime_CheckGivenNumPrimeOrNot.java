package com.jani.LogicalQ;

public class Prime_CheckGivenNumPrimeOrNot {

	public static void main(String[] args) {
		
		int num =3;
		 int count=0;
		
		for(int i=1;i<=num;i++)
		{
			
			int res= (num % i);
			
			if(res==0)
			{
				count++;
			}
			
			if(count==2)
			{
				System.out.println("given number "+ num +" is prime");
			}
		}
	}

}
