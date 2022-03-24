package com.qa.automation.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.automtion.pages.login;
import com.qa.automtion.pages.registrationClass_page;
import com.qa.automation.test.BaseTest;

public class loginTest extends BaseTest { 
	
	public registrationClass_page registrationClass_page;
	
	@BeforeClass
	public void initialsetup_registrationClass_Test() {
		
		registrationClass_page = signUpClass_page.doLogin();
		registrationClass_page.doEnter (prop.getProperty("firstname"),
				prop.getProperty("lastname"), prop.getProperty("email"), 
				prop.getProperty("password"));
		
	}
	@Test
	public void logindoEnter() {
		
		login login = new login(driver);
		login.doEnter(prop.getProperty("email"), prop.getProperty("password"));
		

		
	
	}
}