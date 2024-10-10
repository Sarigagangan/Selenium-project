package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	WebDriver driver;
	
	@FindBy(name="email")
	WebElement fbemail;
	
	@FindBy(name="pass")
	WebElement pswd;
	
	@FindBy(name="login")
	WebElement loginbutton;
	
	public Login_page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void setvalues(String username,String password) {
		fbemail.sendKeys(username);
		pswd.sendKeys(password);
	}
	public void loginclick() {
		loginbutton.click();
	}

}
