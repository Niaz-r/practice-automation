package com.bd.automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Alert_Handle extends BaseDriver {
	

	@Test
	public void alert() throws InterruptedException {
		String url="https://demoqa.com/alerts";
		
		driver.manage().window().maximize();
		driver.get(url);
		
		Thread.sleep(4000);
		
		//WebElement button = driver.findElement(By.xpath("//button[@id='alertButton']"));
		
          //button.click();
	     // Thread.sleep(4000);
		
		//alert ok click
		//accept for ok, dismiss for cancel
		
	  //  Alert alert = driver.switchTo().alert();
//		alert.accept();
//		Thread.sleep(4000);
//		
		
//		WebElement alert3 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
//		alert3.click();
//		Thread.sleep(4000);
//		 Alert alert = driver.switchTo().alert();
//		 System.out.println("the text is"+alert.getText());
//		 
		 
		 WebElement alert3 = driver.findElement(By.xpath("//button[@id='promtButton']"));
			alert3.click();
			Thread.sleep(4000);
			 Alert alert = driver.switchTo().alert();
			alert.sendKeys("hello");
			alert.accept();
			 
		 
		 
		
		
	//	if(alert3.isDisplayed())
	//	{
	//		System.out.println("hello world");
		//	
	//		button.click();
	//		Thread.sleep(4000);
			//System.out.println("the text is"+alert.getText());
	//	}
	//	else
	//	{
	//		System.out.println("hello world error");
	//	}
	
//		
//		System.out.println("the text is"+alert3.getText());
//		
//		Alert ar;
	}
	

}
