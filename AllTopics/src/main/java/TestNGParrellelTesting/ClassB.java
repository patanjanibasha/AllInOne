package TestNGParrellelTesting;

import org.testng.annotations.Test;

public class ClassB 
{
	@Test
    public void testB1() {
        System.out.println("ClassB - testB1 - " + Thread.currentThread().getId());
    }

    @Test
    public void testB2() {
        System.out.println("ClassB - testB2 - " + Thread.currentThread().getId());
    }
}
