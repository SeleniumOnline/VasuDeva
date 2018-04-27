package com.testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EmpListTest extends ORHRM
{
@Test
public void empList()
{
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Employee List")).click();
	//rows count
List<WebElement> rows=driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr"));
	System.out.println(rows.size());
	
	for (int i = 0; i < rows.size(); i++)
	{
		//column count
List<WebElement>   col=rows.get(i).findElements(By.tagName("td"));
//System.out.println(col.size());
//row wise column data
//for (int j = 0; j < col.size(); j++) 
//{
	System.out.println(col.get(2).getText());
//}
	}
	
}
}
