package XPatheDynamic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathDynamicClickTable {

	static WebDriver driver = new ChromeDriver();

	public String url = "https://testautomationpractice.blogspot.com/";
	int t = 20;
	String name = "Smartwatch";

	public void setup() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(t));
		driver.get(url);
	}
	
	public void memoy(String name)
	{
		WebElement table = driver.findElement(By.id("productTable"));

		WebElement memory = driver.findElement(By.xpath(String
				.format("//table[@id='taskTable']//tr/td[text()='%s']/following-sibling::td[last()-1]", name)));
		  
	}

	public static void main(String[] args) {
		
		xPatheDynamicPassPerametrs o = new xPatheDynamicPassPerametrs();
		o.setup();
		o.memoy(o.name);
	}
	}


