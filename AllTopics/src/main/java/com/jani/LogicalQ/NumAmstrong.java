package com.jani.LogicalQ;

public class NumAmstrong {

	public static void main(String[] args) {
		int n=153;
		int num =n;
		int sum=0;
		
		while(num>0)
		{
			int rem = num%10;
			sum =(sum)+(rem*rem*rem);
			num=num/10;
		}
		
		if(n==sum)
		{
			System.out.println("given number is amstrong...");
		}
		else
		{
			System.out.println("given number is not  amstrong...");
		}
	}

}
