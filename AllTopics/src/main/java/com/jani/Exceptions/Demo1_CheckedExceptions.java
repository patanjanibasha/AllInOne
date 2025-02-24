package com.jani.Exceptions;

import java.io.File;
import java.io.FileReader;

public class Demo1_CheckedExceptions 
{

	public static void main(String[] args) 
	{
		/**
		* using try catch block
		* 
		**/
		try 
		{
            File file = new File("nonexistent.txt");
            FileReader reader = new FileReader(file); // FileNotFoundException
        } 
		catch (Exception e) 
		{
            System.out.println("Exception caught: " + e);
        }
	}

}
