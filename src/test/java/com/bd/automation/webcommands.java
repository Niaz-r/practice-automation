package com.bd.automation;

import javax.print.DocFlavor.STRING;

import org.testng.annotations.Test;

public class webcommands extends BaseDriver {
	
	String url="https://demoqa.com/automation-practice-form";
	@Test
 public void getwebcommands() throws InterruptedException
	{
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		
	}

}
