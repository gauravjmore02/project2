package com.amazon.util;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.amazon.testbase.TestBase;

public class UtilClass extends TestBase{

	public static void screenShot() throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File des=new File("C:\\Users\\LENOVO-PC\\eclipse-workspace\\remo-sys-1\\FailedTestScreenShot"+System.currentTimeMillis()+".jpeg");
		
		FileHandler.copy(src, des);
	}

}
