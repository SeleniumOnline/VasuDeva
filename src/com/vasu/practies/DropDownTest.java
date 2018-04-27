package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropDownTest
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.shadi.com/");
		driver.manage().window().maximize();
		
	WebElement drop=driver.findElement(By.id("ddlReligion"));
	List<WebElement> dropList=driver.findElements(By.xpath(".//*[@id='ddlReligion']/optgroup/option"));
		
	System.out.println(dropList.size());	
	for(WebElement element:dropList)
	{
		System.out.println(element.getText());
	}
		

	}

}
