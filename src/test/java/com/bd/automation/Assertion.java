package com.bd.automation;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion extends BaseDriver {
	@Test
	public void assertionExample() {
		
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		
		
		String actualTitle,title;
		title = driver.getTitle();
		actualTitle ="Selenium1";
		
		//hard assertion
		
	//	assertEquals(title,actualTitle );
		// System.out.println("passed");
		 
		 SoftAssert soft = new SoftAssert();
		 
		 soft.assertEquals(title,actualTitle);
		 System.out.println("passed");
		 
		 soft.assertAll();
		 
		 
		 
		 
		
		
		
		
	}

}
