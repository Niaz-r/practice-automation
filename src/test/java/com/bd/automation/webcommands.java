package com.bd.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class webcommands extends BaseDriver {
	
	String url="https://demoqa.com/automation-practice-form";
	@Test
 public void getwebcommands() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		
	//send keys
	
	WebElement firstname = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstname.sendKeys("niaz");
	//	Thread.sleep(3000);
	
		// click
		
		WebElement submit = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		
		submit.click();
		//Thread.sleep(5000);
		
		//cleare
		
		WebElement lastname = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastname.clear();
		//Thread.sleep(5000);
		
		
		// attribute value
	
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		System.out.println(email.getAttribute("placeholder"));
		
		
		//gettext
		
		WebElement text = driver.findElement(By.xpath(url));
		
		System.out.println(text.getText());
		
		//check location
		
		if(email.isDisplayed())
		{
			email.sendKeys("niaz.ju.cse2.com");
			Thread.sleep(5000);
		}
		else {
			System.out.print("success");
		}
		
		
		email.isSelected(); //for checkbox
		
		
	}

}
