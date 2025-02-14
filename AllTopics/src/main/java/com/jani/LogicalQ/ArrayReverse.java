package com.jani.LogicalQ;

public class ArrayReverse {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		int[] temp = new int[5];
		
		int l =a.length;
		
		System.out.println("input elements into array...");
		for(int i=0; i<=a.length-1;i++)
		{
			a[i]=i;
		}
		
		System.out.println("display elements in the array...");
		for(int i=0; i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("display elements in the array.in reverse order..");
		for(int i=0; i<=a.length-1;i++)
		{
			// temp[l-1-i]=a[i];
			temp[i]=a[l-1-i];
		}
		
		System.out.println("display elements in the array...temp");
		for(int i=0; i<=a.length-1;i++)
		{
			System.out.println(temp[i]);
		}
	}

}
