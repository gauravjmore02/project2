package com.amazon.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CartPage {
	
	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//span[@class='sc-offscreen-label'])[2]")
	private WebElement quantitydropdown;
	
	@FindBy(xpath="(//input[@class='a-color-link'])[1]")
	private WebElement delete_Link;
	
	public void updateProductQuantity()
	{
		Select s=new Select(quantitydropdown);
		s.selectByVisibleText("2");
	}
	
	public void deleteTheProduct()
	{
		delete_Link.click();
	}

}
