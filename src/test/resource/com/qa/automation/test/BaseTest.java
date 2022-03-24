package com.qa.automation.test;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.automation.factory.DriverFactory;
import com.qa.automtion.pages.signUpClass_page;
import com.qa.automtion.pages.registrationClass_page;
import com.qa.automtion.pages.login;

import com.qa.Utils.ElementUtils;
public class BaseTest {
	
	public DriverFactory driverfactory;
	public WebDriver driver;
	public Properties prop;
	public ElementUtils elementutils;
	public signUpClass_page signUpClass_page;
	public registrationClass_page registrationClass_page;
	public login login;

	
	@BeforeTest
	public void setup() {
		driverfactory = new DriverFactory();
		prop = driverfactory.init_prop();
		driver = driverfactory.init_driver(prop);
		elementutils = new ElementUtils(this.driver);
		signUpClass_page = new signUpClass_page(driver);
		registrationClass_page = new registrationClass_page(driver);
		login = new login(driver);
		
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.close();
		
		
	}
}