package com.vasu.practies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderTest {

	public static void main(String[] args) throws Exception 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/slider/");
		driver.manage().window().maximize();
		//frames size
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		System.out.println(frames.size());
		//giving focus to particular frame
		
		driver.switchTo().frame(0);
		
		WebElement slider=driver.findElement(By.xpath(".//*[@id='slider']/span"));
		
		Actions sl=new Actions(driver);
		
		sl.clickAndHold(slider).moveByOffset(100,0).release(slider).build().perform();
		Thread.sleep(2000);
		sl.clickAndHold(slider).moveByOffset(-100,0).release(slider).build().perform();
	}

}
