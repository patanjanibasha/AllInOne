package com.jani.stepdefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.testng.Assert;  // If using TestNG


public class Login {
	
	 WebDriver driver;
	 
	 @Given("user open chrome browser")
	 public void user_open_chrome_browser()
	  {
		 driver = new ChromeDriver();
		 System.out.println("openchromebrowser");
	  }
	 @Given("user enter url {string}")
	 public void user_enter_url(String url) {
		 driver.get(url);
		 System.out.println("enter url");
	 }

	 @Then("user enter username {string}")
	 public void user_enter_username(String username) {
		 driver.findElement(By.id("username")).sendKeys(username);
		 System.out.println("enter username");
	 }

	 @Then("user enter pwd {string}")
	 public void user_enter_pwd(String password) {
		 System.out.println("enter password");
		 driver.findElement(By.id("password")).sendKeys(password);
	 }

	 @Then("user click on login")
	 public void user_click_on_login() {
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 System.out.println("login clicked");
	 }

	 @Then("user will redirect to home page")
	 public void user_will_redirect_to_home_page() {
		 System.out.println("redirect to home");
		 }
	 
	 @Then("user will see the title of the page")
	 public void user_will_see_the_title_of_the_page(String expected) {
		 System.out.println("see the title of the page");
		 String title =driver.getTitle();
		 Assert.assertEquals(title, expected); 
		 }
}

