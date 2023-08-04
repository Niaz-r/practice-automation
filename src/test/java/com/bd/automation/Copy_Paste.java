package com.bd.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Copy_Paste extends BaseDriver {
	
	@Test
	public void copy_paste_test() throws InterruptedException {
		
String url="https://demoqa.com/automation-practice-form";
		
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		
		Actions action = new Actions(driver);
		
		WebElement firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstname.sendKeys("Niaz");
		Thread.sleep(3000);
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		Thread.sleep(3000);
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		
		WebElement lastname = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastname.click();
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
	}

}
