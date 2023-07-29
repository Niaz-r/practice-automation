package com.bd.automation;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGExample {

	@BeforeSuite
	
	void  testbefore()
	{
		System.out.println("before");
	}
	
	@AfterSuite
	void testafter()
	{
		System.out.println("after");
		
	}
	
	
	
	@Test
	void firsttesr()
	{
		System.out.println("First test");
	}
	
	
}
