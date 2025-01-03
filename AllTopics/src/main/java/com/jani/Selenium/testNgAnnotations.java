package com.jani.Selenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNgAnnotations {
	
	@BeforeSuite
	public void setUpSuite() {
	    System.out.println("@BeforeSuite: Initializing test suite...");
	}
	
	@BeforeTest
	public void setUpTest() {
	    System.out.println("@BeforeTest :Setting up test configurations...");
	}

	
	@Test
	public void logout()
	{
		 System.out.println("@Test : logout called...");
	}
	
	@Test
	public void login()
	{
		 System.out.println("@Test : login called...");
	}
	
	@Test
	public void m1()
	{
		 System.out.println("@Test : m1");
	}
	@Test
	public void m2()
	{
		 System.out.println("@Test : m2");
	}
	@AfterTest
	public void tearDownTest() {
	    System.out.println("@AfterTest :Tearing down test configurations...");
	}

	@AfterSuite
	public void tearDownSuite() {
	    System.out.println("	@AfterSuite : Cleaning up after test suite execution...");
	}

	
	@BeforeClass
	public void setUpClass() {
	    System.out.println("@BeforeClass :Initializing resources for this class...");
	}
	
	@AfterClass
	public void tearDownClass() {
	    System.out.println("@AfterClass  : Cleaning up resources for this class...");
	}

	@BeforeMethod
	public void setUpMethod() {
	    System.out.println("@BeforeMethod :Setting up before each test method...");
	}
	@AfterMethod
	public void tearDownMethod() {
	    System.out.println("@AfterMethod :Cleaning up after each test method...");
	}

}
