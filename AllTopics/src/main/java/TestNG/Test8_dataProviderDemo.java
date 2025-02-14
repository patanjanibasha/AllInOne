package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test8_dataProviderDemo {

	@Test(dataProvider="loginData")
	public void test1(String user,String pass)
	{
		System.out.println(user+" "+pass);
	}
	
	@DataProvider
	public String[][] loginData()
	{
		String[][] arr = 
			{
					
			{"u1","p1"},
			{"u2","p2"},
			{"u3","p3"}
	
			};
		return arr;
	}
}
