package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTest1
{

	public static void main(String[] args) 
	{
FirefoxDriver driver=new FirefoxDriver();
driver.get("Http://Google.co.in");
driver.manage().window().maximize();
//capture multiple links by tabName and stored into links 
List<WebElement> links=driver.findElements(By.tagName("a"));

System.out.println(links.size());
//capturing links which have text 
for (int i = 0; i < links.size(); i++)
{
	if(!links.get(i).getText().isEmpty())
	{
		
	System.out.println(links.get(i).getText());
	
	}
}


	}

}
