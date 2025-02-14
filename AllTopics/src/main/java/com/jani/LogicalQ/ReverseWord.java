package com.jani.LogicalQ;

import org.testng.asserts.SoftAssert;

public class ReverseWord {

	public static void main(String[] args) {
	
		String s = "selenium is a automation tool";

		String word = "";
		String rev = "";
		int len = s.length();
		boolean firstWord = true; 

		for (int i = 0; i <= s.length() - 1; i++) 
		{
		    if (s.charAt(i) != ' ') 
		    {
		        word = s.charAt(i) + word;  
		    } 
		    
		    else {
		        if (firstWord) 
		        {
		            rev = rev + word + " "; 
		            firstWord = false;  
		        } 
		        
		        else 
		        {
		            rev = rev + word + " "; 
		        }
		        word = "";  
		    }
		}
		rev = rev + word;
		System.out.println(rev);
    }
}

