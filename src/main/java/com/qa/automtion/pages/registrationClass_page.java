package com.qa.automtion.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.qa.Utils.ElementUtils;
public class registrationClass_page  {

	private By firstname = By.xpath("//input[@name='firstName']");
	private By lastname = By.xpath("//input[@name='lastName']");
	private By email = By.xpath("//input[@name='email']");
	private By password = By.xpath("//input[@name='newPassword']");
	private By Signup = By.xpath("//button[@type='submit']");
	
	private WebDriver driver;
	private ElementUtils elementutils;
	private JavascriptExecutor js;
	
	public registrationClass_page(WebDriver driver) {
		this.driver=driver;
		elementutils = new ElementUtils(this.driver);
	}

		public login doEnter(String frstname, String lstname, String eml, String pwd) {

			elementutils.doSendKeys(firstname, frstname);
			elementutils.doSendKeys(lastname, lstname);
			elementutils.doSendKeys(email, eml);
			elementutils.doSendKeys(password, pwd);
			//driver.switchTo().frame("disneyid-iframe");
			elementutils.doClick(Signup);
		
//     		
			return new login(driver);
		}
}
