package com.amazon.testlayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.amazon.pagelayer.HomePage;
import com.amazon.testbase.TestBase;

public class PrintAllProduct extends TestBase {
	
	@Test
	public void printAllProductFrom1stPage()
	{
		HomePage home_obj=new HomePage(driver);
		home_obj.searchItem();
		
		List<WebElement> productElements=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for(WebElement productElement : productElements)
		{
			System.out.println(productElement.getText());
		}
	}

}
