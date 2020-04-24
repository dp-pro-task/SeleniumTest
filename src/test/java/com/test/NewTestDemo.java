package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;

public class NewTestDemo {
	private WebDriver driver;		
	@Test				
	public void testEasy() {	
		
			driver.get("http://demo.guru99.com/test/newtours/");  
	      String expectedTitle = "Welcome: Mercury Tours";
	      String actualTitle = driver.getTitle();
	      Assert.assertEquals(actualTitle, expectedTitle);
	}	
	@BeforeTest
	public void beforeTest() {	
    	System.setProperty("webdriver.chrome.driver","E:\\SeleniumSoftware\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();  
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}		
}