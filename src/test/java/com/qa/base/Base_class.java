package com.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Parameters;

public class Base_class {
	protected WebDriver driver;
	
	@BeforeMethod
	@Parameters({"browser"})
	public void setup(String browser) {
		if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/");
		}
		else if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			driver.get("https://www.facebook.com/");
		}
			
		
	
	}

}
