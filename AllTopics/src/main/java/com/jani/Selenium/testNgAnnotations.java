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
	    System.out.println("@BeforeSuite 1 : setup system properties like config files ...");
	}
	
	@BeforeSuite
	public void setUpSuite2() {
	    System.out.println("@BeforeSuite 2 : setup system properties like config files ...");
	}
	
	@BeforeSuite
	public void setUpSuite3() {
	    System.out.println("@BeforeSuite 3 : setup system properties like config files ...");
	}
	
	@BeforeSuite
	public void setUpSuite4() {
	    System.out.println("@BeforeSuite 4 : setup system properties like config files ...");
	}
	
	@BeforeTest
	public void setUpTest() {
	    System.out.println("@BeforeTest 1:Setting up test configurations...");
	}
	
	@BeforeTest
	public void setUpTest2() {
	    System.out.println("@BeforeTest 2:Setting up test configurations...");
	}
	@BeforeTest
	public void setUpTest3() {
	    System.out.println("@BeforeTest 3:Setting up test configurations...");
	}
	@BeforeTest
	public void setUpTest4() {
	    System.out.println("@BeforeTest 4:Setting up test configurations...");
	}

	

	@BeforeClass
	public void setUpClass() {
	    System.out.println("@BeforeClass 1:Initializing resources for this class...");
	}
	
	@BeforeMethod
	public void setUpMethod() {
	    System.out.println("@BeforeMethod 1:Setting up before each test method...");
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
	
	@AfterMethod
	public void tearDownMethod() {
	    System.out.println("@AfterMethod 1:Cleaning up after each test method...");
	}
	@AfterClass
	public void tearDownClass() {
	    System.out.println("@AfterClass 1 : Cleaning up resources for this class...");
	}
	@AfterTest
	public void tearDownTest() {
	    System.out.println("@AfterTest 1:Tearing down test configurations...");
	}
	@AfterSuite
	public void tearDownSuite() {
	    System.out.println("	@AfterSuite 1: Cleaning up after test suite execution...");
	}

}
