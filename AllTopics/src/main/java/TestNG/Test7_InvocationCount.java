package TestNG;

import org.testng.annotations.Test;

public class Test7_InvocationCount {

	@Test(invocationCount = 3)
	public void multipleTimesRun()
	{
		System.out.println("example od : @test(use invocationcount=2)");
	}
}
