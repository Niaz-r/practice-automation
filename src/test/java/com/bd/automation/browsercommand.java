package com.bd.automation;

public class browsercommand extends BaseDriver {
	
	public void browsercomman() {
		
		
		driver.getTitle();//for title
		driver.getCurrentUrl(); //for url
		
		driver.quit(); //for closing all window;
		driver.close();//for a single windowl
		
	}

}
