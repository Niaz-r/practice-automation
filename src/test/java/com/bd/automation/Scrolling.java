package com.bd.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scrolling extends BaseDriver {
	
	@Test
	public void scrolling_test() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.dictionary.com/");
		Thread.sleep(3000);
		
		//to scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		
		//to scroll up
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(3000);
		
		//to a certain location
		WebElement location = driver.findElement(By.xpath("//h2[contains(text(),'Featured')]"));
		js.executeScript("arguments[0].scrollIntoView(true);",location);
		Thread.sleep(3000);
		
	}

}
