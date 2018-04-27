package com.testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EmpAddTest extends ORHRM
{
	@Test
	public void empAdd() throws Exception
	{
	driver.findElement(By.linkText("PIM")).click();
	driver.findElement(By.linkText("Add Employee")).click();
	driver.findElement(By.id("firstName")).sendKeys("savi123");
	driver.findElement(By.id("lastName")).sendKeys("selenium23");
	
	//driver.findElement(By.xpath(".//*[@id='photofile']")).sendKeys("D:\\Chrysanthemum.jpg");
	//driver.findElement(By.xpath(".//*[@id='photofile']")).click();
	
	//Runtime.getRuntime().exec("C:\\Users\\vasu\\Desktop\\fup.exe");
	Thread.sleep(2000);
	
	driver.findElement(By.id("btnSave")).click();
	}
	
}
