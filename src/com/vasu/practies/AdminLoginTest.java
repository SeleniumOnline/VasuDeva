package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AdminLoginTest 
{
	public static void main(String[] args)
	{
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("Http://PrimusBank.qedgetech.com");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("txtuId")).sendKeys("Admin");
	
	driver.findElement(By.id("txtPword")).sendKeys("Admin");
	driver.findElement(By.id("login")).click();
	
	
	}

}
