package Work;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceboolLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.manage().deleteAllCookies();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com");
		
		           driver.findElement(By.linkText("Create new account")).click();

		            Thread.sleep(1000);

		            driver.findElement(By.name("firstname")).sendKeys("janibasha");;
		          
		            driver.findElement(By.name("lastname")).sendKeys("Patan");

		            driver.findElement(By.id("day")).sendKeys("12");

		            driver.findElement(By.id("month")).sendKeys("Dec");
		           
		            driver.findElement(By.id("year")).sendKeys("1995");
		            
		            driver.findElement(By.xpath("//input[@id = 'sex' and @value = '2']")).click();
		            
		            driver.findElement(By.name("reg_email__")).sendKeys("patanjanibasha1@gmail.com");
       
		            driver.findElement(By.name("reg_passwd__")).sendKeys("MyPassword@123");
		          
		            driver.findElement(By.name("websubmit")).click();
		          
	}
}
		        



