package com.vasu.practies;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxBrowserTest
{

	public static void main(String[] args) 
	{
		//Launching FF Browser
		FirefoxDriver  driver=new FirefoxDriver();
		//Navigate to Gmail
		driver.get("Http://Gmail.com");
		

	}

}
