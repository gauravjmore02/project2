package com.amazon.pagelayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

	public SignInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='ap_email']")
	private WebElement enterPhoneNo_txtbox;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continuebutton;
	
	@FindBy(xpath="//input[@id='ap_password']")
	private WebElement password_txtBox;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement signIn_button;
	
	public void enterPhoneNumber(String phoneNo)
	{
		enterPhoneNo_txtbox.sendKeys(phoneNo);
	}
	
	public void clickOnContinueButton()
	{
		continuebutton.click();
	}
	
	public void enterPassword(String password)
	{
		password_txtBox.sendKeys(password);
	}
	
	public void clickOnSignInButton()
	{
		signIn_button.click();
	}
}
