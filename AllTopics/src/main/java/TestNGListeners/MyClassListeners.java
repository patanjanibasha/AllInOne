package TestNGListeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyClassListeners implements ITestListener,IRetryAnalyzer
{
	 public  void onTestStart(ITestResult result) {
		    System.out.println("test started from listener class");
		  }

		 
		  public  void onTestSuccess(ITestResult result) {
			    System.out.println("test success from listener class");
		  }

		  
		   public void onTestFailure(ITestResult result) {
			    System.out.println("test failed from listener class");
		  }

		  public  void onTestSkipped(ITestResult result) {
			    System.out.println("test skipped from listener class");
		  }

		  public  void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		    // not implemented
		  }

		 

		  public  void onStart(ITestContext context) {
			    System.out.println("test on start from listener class");
		  }

		  public  void onFinish(ITestContext context) {
			    System.out.println("test on finish from listener class");
		  }

		int count =0;
		int totolCount=3;
		@Override
		public boolean retry(ITestResult result) 
		{
			 //  System.out.println("test retry from listener class");
			
			while(count<=totolCount)
			{
				System.out.println("test retry from listener class");
				count++;
				return true;
			}
			return false;
		}
}
