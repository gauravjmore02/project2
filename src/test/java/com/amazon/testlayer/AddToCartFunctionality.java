package com.amazon.testlayer;

import java.util.ArrayList;
import java.util.Set;

import org.testng.annotations.Test;

import com.amazon.pagelayer.HomePage;
import com.amazon.pagelayer.PDPage;
import com.amazon.pagelayer.SignInPage;
import com.amazon.testbase.TestBase;

public class AddToCartFunctionality extends TestBase{
	
	@Test
	public void addToCartFunctionality() throws InterruptedException
	{
		HomePage home_obj=new HomePage(driver);
		PDPage pdp_obj=new PDPage(driver);
		SignInPage signin_obj=new SignInPage(driver);
		
		home_obj.clickOnSignInLink();
		signin_obj.enterPhoneNumber("enter Phone No"); //enter phone no for SignIn in Amazon
		signin_obj.clickOnContinueButton();
		signin_obj.enterPassword("enter password"); //enter password for SignIn in Amazon
		signin_obj.clickOnSignInButton();
		
		home_obj.searchItem();
		pdp_obj.clickOnOppoA17KPhone();
		
Set<String>ids =driver.getWindowHandles();
		
		ArrayList a=new ArrayList(ids);
	
		System.out.println(driver.getTitle());
	
		 Thread.sleep(2000);
		 System.out.println(a.get(1));
		 driver.switchTo().window((String) a.get(1)); 
		 Thread.sleep(2000);
		 pdp_obj.clickOnAddToCartButton(); 
		 home_obj.clickOnCartFunctionLink();
	}

}
