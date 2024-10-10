package com.qa.test;

import org.testng.annotations.Test;

import com.qa.base.Base_class;
import com.qa.pages.Login_page;

public class Login_test extends Base_class {
	
	@Test
	public void testlogin() {
		Login_page lp= new Login_page(driver);
		lp.setvalues("amaya123@gmail.com", "amaya@143");
		lp.loginclick();
		
	}
	
	
	
	
	

}
