package com.bd.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Wait extends BaseDriver{

	@Test
	public void waitExample() throws InterruptedException {
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		//explicit
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		WebElement button =(WebElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Downloads')]")));
		button.click();
		Thread.sleep(3000);
		
		
	}
}
