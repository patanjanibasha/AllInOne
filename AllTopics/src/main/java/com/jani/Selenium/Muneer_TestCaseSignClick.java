package com.jani.Selenium;

import org.testng.annotations.Test;

import com.jani.JavaConcepts.Muneer_Index;

public class Muneer_TestCaseSignClick {
Muneer_Index id = new Muneer_Index();

@Test
public void checksignclick()
{
	id.signInLink();
	System.out.println("check login link  called in test case ");
}
}
