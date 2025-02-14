package XPatheDynamic;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPatheDynamicPassPerametrs {
	static WebDriver driver = new ChromeDriver();

	public String url = "https://testautomationpractice.blogspot.com/";
	int t = 20;
	String name = "Tablet";

	public void setup() {
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(t));
		driver.get(url);
	}

	public void memoy(String name) {
		WebElement table = driver.findElement(By.id("taskTable"));
		WebElement memory = driver.findElement(
				By.xpath(
				String.format("//table[@id='productTable']//tbody/tr/td[text()='Smartwatch']/following-sibling::td[last()]/input[@type='checkbox']",name)));
		memory.click();
		;
	}

	public static void main(String[] args) {

		xPatheDynamicPassPerametrs o = new xPatheDynamicPassPerametrs();
		o.setup();
		o.memoy(o.name);
	}

}
