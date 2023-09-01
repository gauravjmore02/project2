package com.amazon.pagelayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Hello, sign in']")
	private WebElement signin_Link;
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement search_txtbox;
	
	@FindBy(xpath="//span[@id='nav-cart-count']")
	private WebElement cart_link;
	
	@FindBy(xpath="//a[@id='nav-hamburger-menu']")
	private WebElement allTab_Link;
	
	@FindBy(xpath="//a[text()='Sign Out']")
	private WebElement signOut_Link;
	
	public void clickOnSignInLink()
	{
		signin_Link.click();
	}
	
	public void searchItem()
	{
		search_txtbox.sendKeys("oppo phone" + Keys.ENTER);
	}
	
	public void clickOnCartFunctionLink()
	{
		cart_link.click();
	}

	public void clickOnAllTabWebElement()
	{
		allTab_Link.click();
	}
	
	public void clickOnSignOutLink()
	{
		signOut_Link.click();
	}
	
}
