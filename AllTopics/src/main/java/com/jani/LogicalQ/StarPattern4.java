package com.jani.LogicalQ;

public class StarPattern4 {

	/**
	 *           *
	 *         * * * 
	 *       * * * * *			
	 * 	   * * * * * * * 	  
	 *   * * * * * * * * * 	    
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++)
		{ 
			for(int k=1;k<=(2*i)+1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}


}
