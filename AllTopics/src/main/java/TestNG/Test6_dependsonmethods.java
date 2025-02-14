package TestNG;

import org.testng.annotations.Test;

public class Test6_dependsonmethods {

	@Test(invocationTimeOut = 1000)
	public void login()
	{
		try {
			Thread.sleep(3000);
			System.out.println("login called");// will be failed
		} catch (InterruptedException e) {
			System.out.println("login method not execued..");
			e.printStackTrace();
		}
	
	}
	
	@Test(dependsOnMethods = "login")
	public void logout()
	{
		System.out.println("logout called");
		// will be skipped
	}
}
