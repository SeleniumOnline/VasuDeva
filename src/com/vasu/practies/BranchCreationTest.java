package com.vasu.practies;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BranchCreationTest {

	public static void main(String[] args) throws Exception
	{
		//appLaunch
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		//appLogin
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.id("login")).click();
		//BranchCreation
		driver.findElement(By.xpath(".//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr[2]/td/a/img")).click();
		driver.findElement(By.xpath(".//*[@id='BtnNewBR']")).click();
		driver.findElement(By.id("txtbName")).sendKeys("VasuDeva1234");
		driver.findElement(By.id("txtAdd1")).sendKeys("Ameerpet");
		driver.findElement(By.id("txtZip")).sendKeys("12345");
		
		Select country=new Select(driver.findElement(By.id("lst_counrtyU")));
		country.selectByVisibleText("INDIA");
		//wait
		Thread.sleep(2000);
		Select state=new Select(driver.findElement(By.id("lst_stateI")));
		state.selectByVisibleText("Andhra Pradesh");
		Thread.sleep(2000);
		Select city=new Select(driver.findElement(By.id("lst_cityI")));
		city.selectByVisibleText("Hyderabad");
		
		driver.findElement(By.id("btn_insert")).click();
		
		Alert alt=driver.switchTo().alert();
		String msg=alt.getText();
		alt.accept();
		//validation
		if(msg.contains("created Sucessfully"))
		{
			System.out.println("Branch Created Sucessfully");
		}else
			if(msg.contains("already Exist"))
			{
				System.out.println("Branch Creation Fail");
			}
			else
				if(msg.contains("Please fill in"))
				{
					System.out.println("Warning Message");
				}
		

	}

}
