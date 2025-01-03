/**
 * 
 */
package com.mystoreapp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mystoreapp.actiondriver.Action;
import com.mystoreapp.base.BaseClass;



/**
 * 
 */
public class SearchResultPage extends BaseClass {
	
	Action action= new Action();
	
	@FindBy(xpath="//img[@alt='Picture of Custom T-Shirt']")
	private WebElement productResult;
	
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean isProductAvailable() throws Throwable {
		return action.isDisplayed(driver, productResult);
	}
	
	public AddToCartPage clickOnProduct() throws Throwable {
		action.click(driver, productResult);
		return new AddToCartPage();
	}
}
