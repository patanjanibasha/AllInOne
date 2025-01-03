package com.jani.Selenium;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoScreenShot {

	public static void main(String[] args) throws IOException {
	
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.facebook.com");
		TakesScreenshot ss = (TakesScreenshot) driver;
		File srcFile =ss.getScreenshotAs(OutputType.FILE);
		File destFile = new File("C:\\Users\\Janibasha\\Desktop\\GuruSelenium\\AllTopics\\screenshot.png");
		
		org.openqa.selenium.io.FileHandler.copy(srcFile, destFile);
        //FileUtils.copyFile(srcFile, destFile);
	}
 
}
