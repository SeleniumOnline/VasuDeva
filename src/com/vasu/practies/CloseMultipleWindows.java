package com.vasu.practies;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseMultipleWindows
{

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		String parent=driver.getWindowHandle();
		Set<String> allWindows=driver.getWindowHandles();
		for(String child:allWindows)
		{
			if (!child.equals(parent))
			{
				driver.switchTo().window(child);
				driver.close();
			}
		}
		
		

	}

}
