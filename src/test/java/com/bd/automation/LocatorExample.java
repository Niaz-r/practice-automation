package com.bd.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorExample extends BaseDriver {
	
	
	@Test
	public void locatorexample() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get("https://www.shohoz.com/contact-us/en");
		//Thread.sleep(5000);
		//By ID
//		WebElement bus = driver.findElement(By.id("purpose"));
//		bus.click();
		Thread.sleep(5000);
//		//xpath
//		// tagname[@attribute='value']
//		//tagname[contains(text(),'value')]
//		//*[contains(text(),'value')]
//		
		WebElement var = driver.findElement(By.className("simpleselect"));
		var.click();
		Thread.sleep(5000);
		
		WebElement var1 = driver.findElement(By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/p[1]"));
		
		String var2;
		var2=var1.getText();
		System.out.println(var2);
		
		
	}
	

}
