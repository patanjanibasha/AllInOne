package com.jani.Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Demo2_CheckedExceptions {
	
	/**
	* using throws keyword 
	* we have to make it as a method 
	**/
	
	public void readfile() throws FileNotFoundException
	{
		File file = new File("nonexistent.txt");
        FileReader reader = new FileReader(file); // May throw FileNotFoundException
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		Demo2_CheckedExceptions o = new Demo2_CheckedExceptions();
		o.readfile();
	}

}

