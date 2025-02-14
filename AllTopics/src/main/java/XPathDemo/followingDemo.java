package XPathDemo;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class followingDemo {
	static WebDriver driver = new ChromeDriver();
	public static void setup()
	{
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	public static void main(String[] args) {
		
		 
	    File file = new File("C:\\Users\\Janibasha\\Desktop\\xpath pages\\AllExample.html");
     //   String localURL = "file://" + file.getAbsolutePath();
        String url ="https://testautomationpractice.blogspot.com/";
      //driver.get(localURL);
        setup();
        driver.get(url);
        String name="System";
        
        WebElement table = driver.findElement(By.id("taskTable"));
        
        WebElement memory =driver.findElement(By.xpath(
        		String.format("//table[@id='taskTable']//tr/td[text()='System']/following-sibling::td[last()]", "System")));
        System.err.println("ddddddddddddddd"+memory.getText());;
	}
}
