package com.amazon.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PDPage {
	
	public PDPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Oppo A17k (Navy Blue, 3GB RAM, 64GB Storage) with No Cost EMI/Additional Exchange Offers']")
	private WebElement oppoA17k_Phone;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	private WebElement addToCart_button;
	
	public void clickOnOppoA17KPhone()
	{
		oppoA17k_Phone.click();
	}
	
	public void clickOnAddToCartButton()
	{
		addToCart_button.click();
	}

}
