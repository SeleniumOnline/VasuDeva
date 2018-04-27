package com.vasu.practies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertTest 
{

	public static void main(String[] args)
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("searchBtn")).click();
		
		Alert alt=driver.switchTo().alert();
		//get the text present on alert
		System.out.println(alt.getText());
		alt.accept();//click on Ok
		
		//alt.dismiss();//click on Close
		//prompt Alert enter data
		//alt.sendKeys("Vasu");
		

	}

}
