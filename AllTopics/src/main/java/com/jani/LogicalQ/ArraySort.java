package com.jani.LogicalQ;

public class ArraySort {

	public static void main(String[] args) {
	
		int[] a = {31,3,4,10,19,2,6};
		int len = a.length;
		
		for(int i=0; i<=len-1;i++)
		{
			for(int j=i+1;j<=len-1;j++)
			{
				if(a[i]>a[j])         
				{
					 int temp = a[i];      
			            a[i] = a[j];     
			            a[j] = temp;       
				}
			}
		}
		
		for(int i=0; i<=len-1;i++)
		{
			System.err.println(a[i]);
		}
	}
}
