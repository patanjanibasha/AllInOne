package com.jani.LogicalQ;

import java.util.Iterator;

public class StarPattern1 {
	
	/**
	 * 					* 
	 * 					* *
	 *   				* * *
	 *   				* * * *
	 *   				* * * * *
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.err.print("*");
			}
			System.out.println();
		}
	}
}
