package Work;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartAutosuggestion   {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.manage().deleteAllCookies();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("http://flipkart.com");
		 driver.findElement(By.name("q")).sendKeys("iphone");
		List<WebElement> ele =driver.findElements(By.tagName("ui"));
		Thread.sleep(5000);
System.err.println("size " + ele.size());
		// WebElement element = driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[2]/div[2]/form/ul"));

	        // Perform actions on the element
	      //  System.out.println("Element found: " + element.isDisplayed());

	        
		for(WebElement e:ele)
		{
			System.out.println(e);
		}
	}

}
