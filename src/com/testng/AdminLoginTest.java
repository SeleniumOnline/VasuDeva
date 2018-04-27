package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminLoginTest
{
@Test
public void appLaunch()
{
	
	
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("Http://PrimusBank.qedgetech.com");
	driver.manage().window().maximize();
	
	//validation
	Assert.assertTrue(driver.findElement(By.id("login")).isDisplayed());
	
}
}
