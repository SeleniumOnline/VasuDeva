package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMethods
{
	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("Http://amazon.in");
		driver.manage().window().maximize();
		//identify dropdown by using id and stored into webElement
	WebElement drop=driver.findElement(By.id("searchDropdownBox"));
	
	Select slt=new Select(drop);
	
	slt.selectByIndex(36);
	//slt.selectByVisibleText("Collectibles");
	//slt.selectByValue("search-alias=pantry");
	
	//System.out.println(slt.isMultiple());
	//System.out.println(slt.getFirstSelectedOption().getText());
List<WebElement> sel=slt.getAllSelectedOptions();
System.out.println(sel.size());
for(WebElement element:sel)
{
	System.out.println(element.getText());
}
	}

}
