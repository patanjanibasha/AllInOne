package com.mystoreapp.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mystoreapp.base.BaseClass;
import com.mystoreapp.pageobjects.HomePage;
import com.mystoreapp.pageobjects.IndexPage;
import com.mystoreapp.pageobjects.LoginPage;

public class LoginPageTest extends BaseClass
{
	IndexPage indexpage = new IndexPage();
	
	
	LoginPage loginpage = new LoginPage();
	
	@BeforeMethod
	public void setUp()
	{
		launchApp() ;
	 //	indexpage = new IndexPage();
		System.err.println("@BeforeMethod ; launch app  test case called");
		//System.err.println("@BeforeMethod ; index page in launch  "+indexpage.signInClick());
	}
	
	@AfterMethod
	public void tearDown()
	{
		// driver.quit();
		System.err.println("@AfterMethod ; Browser Quited");
	}
	
	// HomePage homepage = new HomePage();
	
	@Test
	public void loginTest() throws Throwable
	{
	//	System.err.println("@BeforeMethod ; index page in login test "+indexpage.signInClick());
	//	indexpage = new IndexPage();
		indexpage.signInClick();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// homepage = loginpage.login();
		
		//String actualResult = homepage.getCurrURL();
		//System.out.println(actualResult);
		///String expectedResult = "";
		//Assert.assertEquals(actualResult,expectedResult);
	}
}
