package com.jani.Exceptions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExceptionLocatoerNotInteractable {

	public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://www.microsoft.com/en-us/microsoft-365/outlook/log-in");
			
			
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			
			//WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='wf-menu']/following::a[1]")));
		   //	WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-bi-cn='SignIn']")));
			
	 WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Sign in']")));
	 ele.click();
		//	WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(\"//a[text()='Sign in']\")));")));
		//	c-shellmenu_custom_outline_newtab_signin_bhvr100_right
		//	System.err.println("button clicked :"+ele.getTagName());
			//driver.quit();
			
	// driver.findElement(By.xpath("//a[contains(@id,'100_')]")).click();
	// driver.findElement(By.xpath("//a[@class='c-uhf-nav-link' and text()='Sign in']")).click();
		}
}
	