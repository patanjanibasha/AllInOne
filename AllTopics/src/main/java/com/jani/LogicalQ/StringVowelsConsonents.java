package com.jani.LogicalQ;

public class StringVowelsConsonents {

	public static void main(String[] args) {
		
		String s = "jani basha";
		int len = s.length();
		
		int vow=0;
		int con=0;
		int space=0;
		int spl =0;
		
		
		for(int i=0; i<=len-1;i++)
		{
			char ch = s.charAt(i);
			 if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u')
			 {
				 vow++;
			 }
			 else if(ch==' ') 
			 {
				 space++;
			 }
			 else
			 {
				 con++;
			 }
		}
		
		System.out.println("no of vowels: "+vow);
		System.out.println("no of space: "+space);
		System.out.println("no of consonents: "+con);

	}

}
