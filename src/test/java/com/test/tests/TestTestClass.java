package com.test.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestTestClass {
	WebDriver driver;

	@BeforeTest
	public void launchUrl() {
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();

	}
	
	
	@Test
	public void sendData () {
		
		
	}
	
	
	
	

	@AfterTest
	public void closeBrowser() {
		driver.quit();

	}

}
