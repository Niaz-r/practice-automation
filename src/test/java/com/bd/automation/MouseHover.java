package com.bd.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class MouseHover extends BaseDriver {
	
	@Test
	public void mousehover() throws InterruptedException {
		
		Actions actions = new Actions(driver);
		
	
		
		driver.manage().window().maximize();
		driver.get("https://www.daraz.com.bd/");
		Thread.sleep(3000);
		
		WebElement hover = driver.findElement(By.xpath("//span[contains(text(),'Groceries')]"));
		
		
		actions.moveToElement(hover).perform();
		Thread.sleep(3000);
		
		
		
	}

}
