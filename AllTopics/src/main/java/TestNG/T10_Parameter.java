package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class T10_Parameter {

	@Test
	@Parameters("browser")
	public void test(String browser)
	{
		System.out.println("my parameter is :"+browser);
	}
}
