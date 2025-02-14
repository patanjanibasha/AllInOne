package com.jani.LogicalQ;

public class StringCountDuplicateLetters {

	public static void main(String[] args) {
		 String s = "selenium";
		 
		 int count =1;
		 
		 for(int i=0;i<=s.length()-1;i++)
		 {
			 count=1;
			 for(int j=i+1;j<=s.length()-1;j++)
			 {
				 char x = s.charAt(i);
				 char y =s.charAt(j);
				 if(x==y)
				 {
					 count++;
				 }
			 }
			 System.out.println(s.charAt(i) + " "+ count);
		 }
	}

}
