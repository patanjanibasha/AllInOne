package com.jani.LogicalQ;

public class Prime_CheckINGivenRange {

	public static void main(String[] args) {
	
		int start =10;
		int end =18;
		
		int count;
		
		int totalcount=0;
		
		for(int i=start; i<=end; i++ )
		{
			count =0;
			for(int j=1;j<=i;j++)
			{
				int res = i%j;
				if(res==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				totalcount++;
				System.out.println("given number "+ i +" is prime"+totalcount);
			}
		}

	}

}
