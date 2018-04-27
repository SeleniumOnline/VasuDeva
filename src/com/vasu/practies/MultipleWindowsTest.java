package com.vasu.practies;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest
{
	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().window().maximize();
		
		String parent=driver.getWindowHandle();
		//System.out.println("Parent window id is:"+parent);
		driver.findElement(By.id("loginsubmit")).click();
		Set<String> allWindows=driver.getWindowHandles();
		/*for(String child:allWindows)
		{
			if (!child.equals(parent))
			{
				driver.switchTo().window(child);
				driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a")).click();
				//driver.close();
			}
		}*/
		ArrayList<String> tabs=new ArrayList<>(allWindows);
		
		driver.switchTo().window(tabs.get(1));
		
		driver.findElement(By.xpath("html/body/div[4]/div[2]/div[1]/a")).click();
		
		
		
		

	}

}
