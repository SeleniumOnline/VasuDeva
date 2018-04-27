package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethod1 {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://amazon.in");
		driver.manage().window().maximize();
		//identify dropdown by using id and stored into webElement
//	WebElement drop=driver.findElement(By.id("searchDropdownBox"));
	
	Select slt=new Select(driver.findElement(By.id("searchDropdownBox")));
List<WebElement> dropList=slt.getOptions();
System.out.println(dropList.size());
for(WebElement element:dropList)
{
	System.out.println(element.getText());
}

	}

}
