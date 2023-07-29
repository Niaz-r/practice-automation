package com.bd.automation;

import org.testng.annotations.Test;

public class FirstAutomation extends BaseDriver {
	
	@Test
	
	public void firstTest() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		Thread.sleep(5000);  
	
		
		
	}

}
