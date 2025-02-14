package XPatheDynamic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathTableDynamicLoop {
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

	public void memoy(String name) {
		WebElement table = driver.findElement(By.id("productTable"));
		
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		System.out.println("size: "+rows.size());
		for(int row=1; row<rows.size()-1;row++)
		{
		//  System.out.println(rows.get(row).getText());
			List<WebElement> cols = rows.get(row).findElements(By.tagName("td"));
			{
				for(int col=0; col<cols.size();col++)
				{
					// String t_pname= cols.get(1).getText();
					
					//WebElement ele = cols.get(3).findElement(By.t  agName("input")).click();
				}
			}
		}
	}

	public static void main(String[] args) {

		xpathTableDynamicLoop o = new xpathTableDynamicLoop();
		o.setup();
		o.memoy(o.name);
	}

}
