package com.amazon.util;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;


public class Litsners implements ITestListener{

	public void onTestStart(ITestResult result) {
	    System.out.println("Test Starts"+result.getName());
	  }

	  public void onTestSuccess(ITestResult result) {
		  System.out.println("Test Success"+result.getName());
	  }
	  
	  public void onTestFailure(ITestResult result) {
		  System.out.println("Test Fails"+result.getName());
		  try {
			UtilClass.screenShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }

	 
	  public void onTestSkipped(ITestResult result) {
	   
		  System.out.println("Test Skipped"+result.getName());
	  }

}
