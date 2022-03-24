package com.qa.automtion.pages;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.Utils.ElementUtils;

public class signUpClass_page {
	private By profile = By.xpath("//a[@id='global-user-trigger']");
	private By login = By.xpath("(//a[text()='Log In'])[2]");
	private By signup = By.xpath("//a[text()='Sign Up']");
	
	private WebDriver driver;
	private ElementUtils elementutils;
	
	public signUpClass_page(WebDriver driver) {
		this.driver=driver;
		elementutils = new ElementUtils(this.driver);
	}
	
	public registrationClass_page doLogin() {
		elementutils.doClick(profile);
		elementutils.doClick(login);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.switchTo().frame("disneyid-iframe");
		elementutils.doClick(signup);
		return new registrationClass_page(driver);
		
	}
}