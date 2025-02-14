package TestNGListeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(MyClassListeners.class) 
// i used listeners in xml file
@Test
public class MyClass {

	@Test
	public void passtest()
	{
		System.out.println("retry listener ");
		Assert.assertTrue(false);
	
	}
	/*
	@Test
	public void failtest()
	{
		Assert.assertFalse(false);
		//System.out.println("failtest");
	}
	*/
	}
