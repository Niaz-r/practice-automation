package com.bd.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class selectmanage extends BaseDriver {
	
	@Test
	public void selectmanage_test() throws InterruptedException {
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		
		WebElement option = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Select select = new Select(option);
		select.selectByIndex(5);
		Thread.sleep(5000);
		
		select.selectByValue("search-alias=baby-products-intl-ship");
		Thread.sleep(3000);
		
		select.selectByVisibleText("Deals");
		
		
	}

}
