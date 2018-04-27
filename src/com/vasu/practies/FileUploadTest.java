package com.vasu.practies;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadTest {

	public static void main(String[] args) throws Exception
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://opensource.demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		driver.findElement(By.id("firstName")).sendKeys("sangeetha");
		driver.findElement(By.id("lastName")).sendKeys("selenium");
		
		//driver.findElement(By.xpath(".//*[@id='photofile']")).sendKeys("D:\\Chrysanthemum.jpg");
		driver.findElement(By.xpath(".//*[@id='photofile']")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\vasu\\Desktop\\fup.exe");
		Thread.sleep(2000);
		
		driver.findElement(By.id("btnSave")).click();
		

	}

}
