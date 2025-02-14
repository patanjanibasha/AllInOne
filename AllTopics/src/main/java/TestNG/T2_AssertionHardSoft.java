package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class T2_AssertionHardSoft {

	@Test(enabled = false, priority=2)
	public void hardAssertion()
	{
		int a =10;
		int b = 20;
		int c= a+b;
		int res =30;
		System.out.println("before assertion passed");
		Assert.assertEquals(c, res);
		System.out.println("after assertion passed");
		System.out.println("before assertion passed");
		Assert.assertEquals(12, 11);
		System.out.println("after assertion passed");
		
		
	}
	
	@Test
	public void softAssertion()
	{
		int a =10;
		int b = 20;
		int c= a+b;
		int res =30;
		
		SoftAssert sa = new SoftAssert();
		
		System.out.println("before assertion passed");
		sa.assertEquals(c, res);
		System.out.println("after assertion passed");
		System.out.println("before assertion passed");
		sa.assertEquals(c+10, res);
		System.out.println("after assertion passed");
		sa.assertAll(); // if not write assert all, will pass all even wrong
	}
}
