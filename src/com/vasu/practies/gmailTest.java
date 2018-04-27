package com.vasu.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmailTest
{
	public static void main(String[] args)
	{
		String expTitle="Gmail";
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://Google.co.in");
		driver.manage().window().maximize();
		//className
		driver.findElement(By.className("gb_P")).click();
		
	String actTitle=driver.getTitle();
		if (expTitle.equals(actTitle)) 
		{
		System.out.println("Link is Working");	
		}else
		{
			System.out.println("Link is Not Working");
		}
		

	}

}
