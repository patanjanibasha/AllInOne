package com.jani.Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoScreenShot2 {

	public static void main(String[] args) throws IOException {
		
		 ChromeDriver driver= new ChromeDriver();
		 driver.get("http://www.facebook.com");
         File srcFile = ((ChromeDriver) driver).getScreenshotAs(OutputType.FILE);
         File destFile = new File("C:\\Users\\Janibasha\\Desktop\\GuruSelenium\\AllTopics\\screenshot.png");
         FileUtils.copyFile(srcFile, destFile);
	}

}
