package TestNGParrellelTesting;

import org.testng.annotations.Test;

public class ClassA {
	@Test
    public void testA1() {
        System.out.println("ClassA - testA1 - " + Thread.currentThread().getId());
    }

    @Test
    public void testA2() {
        System.out.println("ClassA - testA2 - " + Thread.currentThread().getId());
    }
}