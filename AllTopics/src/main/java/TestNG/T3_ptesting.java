package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class T3_ptesting {
	@Test
	public void test1()
	{
		System.out.println("test1 callled");
		WebDriver d= new ChromeDriver();
		d.get("https://www.google.com");
		d.close();
	}
	@Test
	public void test2()
	{
		System.out.println("test2 callled");
		WebDriver d= new ChromeDriver();
		d.get("https://www.facebook.com");
		d.close();
	}
	@Test
	public void test3()
	{
		System.out.println("test3 callled");
		WebDriver d= new ChromeDriver();
		d.get("https://www.linkedin.com");
		d.close();
	}
	@Test
	public void test4()
	{
		System.out.println("test4 callled");
		WebDriver d= new ChromeDriver();
		d.get("https://www.gmail.com");
		d.close();
	}
}
