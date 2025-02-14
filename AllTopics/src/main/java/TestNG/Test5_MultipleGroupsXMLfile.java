package TestNG;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Test5_MultipleGroupsXMLfile {

    @BeforeGroups("group1")
    public void beforeGroup() {
        System.out.println("This will run before any tests in group1.");
    }

    @Test(groups = "group1")
    public void testMethod1() {
        System.out.println("Test Method 1 in group1");
    }

    @Test(groups = "group1")
    public void testMethod2() {
        System.out.println("Test Method 2 in group1");
    }

    @Test(groups = "group2")
    public void testMethod3() {
        System.out.println("Test Method 3 in group2");
    }
}
