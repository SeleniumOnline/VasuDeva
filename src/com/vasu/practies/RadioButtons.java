package com.vasu.practies;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtons
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Shadi.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("rblGender_1")).click();

	}

}
