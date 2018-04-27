package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickTest {
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Google.co.in");
		driver.manage().window().maximize();
		//Gmail
		
		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		
		Actions right=new Actions(driver);
		
		right.contextClick(gmail).sendKeys("P").build().perform();

	}

}
