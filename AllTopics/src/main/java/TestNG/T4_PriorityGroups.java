package TestNG;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class T4_PriorityGroups {
	
//	@BeforeGroups({"smoke", "regression"})
 //   public void setupTests() {
 //       System.out.println("BeforeGroups: Setting up SMOKE & REGRESSION tests");
 //   }
	
	   @BeforeGroups("smoke")
	    public void setupSmokeTests() {
	        System.out.println("BeforeGroups: Setting up SMOKE tests");
	    }

	    @Test(groups = "smoke")
	    public void test1() {
	        System.out.println("Executing SMOKE Test 1");
	    }

	    @Test(groups = "smoke")
	    public void test2() {
	        System.out.println("Executing SMOKE Test 2");
	    }

	    @Test(groups = "regression")
	    public void test3() {
	        System.out.println("Executing REGRESSION Test 3");
	    }

	    @Test(groups = "regression")
	    public void test4() {
	        System.out.println("Executing REGRESSION Test 4");
	    }
}
