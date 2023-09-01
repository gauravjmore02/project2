package com.amazon.testlayer;

import org.testng.annotations.Test;

import com.amazon.pagelayer.HomePage;
import com.amazon.pagelayer.SignInPage;
import com.amazon.testbase.TestBase;

public class LogOutAmazonAccount extends TestBase{

	@Test
	public void logOutFromAmazon()
	{
		SignInPage signin_obj=new SignInPage(driver);
		HomePage home_obj=new HomePage(driver);
		
		home_obj.clickOnSignInLink();
		signin_obj.enterPhoneNumber("phone no"); //enter phone no for SignIn in Amazon
		signin_obj.clickOnContinueButton();
		signin_obj.enterPassword("password"); //enter password for SignIn in Amazon
		signin_obj.clickOnSignInButton();
		
		home_obj.clickOnAllTabWebElement();
		home_obj.clickOnSignOutLink();
		
	}
}
