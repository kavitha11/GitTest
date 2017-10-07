package com.Browserlogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class InvokeBrowser {

	@SuppressWarnings("deprecation")
	@Test
	public void ffbrowser()
	{
	
	
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.pluralsight.com/");
	String s1= driver.getCurrentUrl();
	System.out.println(s1);
	Assert.assertEquals("https://www.pluralsight.com/", s1);
	
	
}
}
