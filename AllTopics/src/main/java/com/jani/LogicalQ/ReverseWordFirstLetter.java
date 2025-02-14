package com.jani.LogicalQ;

public class ReverseWordFirstLetter {

	public static void main(String[] args)
	{
		String s = "Selenium is a tool";
		String rev = ""; 
		String word = ""; 
		int len = s.length();
		boolean firstWordReversed = false;

		for (int i = 0; i < len; i++) 
		{
		    if (s.charAt(i) != ' ') 
		    { 
		        word = s.charAt(i) + word;
		    } 
		    else 
		    {
		        if (!firstWordReversed) 
		        {
		            rev = rev + word + " "; 
		            firstWordReversed = true;
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
