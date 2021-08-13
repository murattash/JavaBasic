package com.neotech.lesson23;

public class WebDriverTest {
	
	//Runtime Polymorphism
	//Method Overriding
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.Open();
		
		
		WebDriver driver2 = new FirefoxDriver();
		driver2.Open();
		
	}

}
