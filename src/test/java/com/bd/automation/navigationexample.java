package com.bd.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class navigationexample extends BaseDriver{
	
	@Test
	public void nevigation() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get("https://www.daraz.com.bd/");
		
		Thread.sleep(300);
		
		WebElement signin = driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]"));
		signin.click();
		Thread.sleep(3000);
		
		driver.navigate().back();// baack
		driver.navigate().forward();//forword
		driver.navigate().refresh();//refresh
		
		
		
		
	}

}
