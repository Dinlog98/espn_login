package com.qa.automtion.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.qa.Utils.ElementUtils;

public class login {
	
	private By profile = By.xpath("//a[@id='global-user-trigger']");
//	private By login = By.xpath("//div[@class='global-user-container']//ul/li[3]/a[1]");
	
	//private By email = By.xpath("//input[@placeholder='Username or Email Address']");
	//private By password = By.xpath("//input[@type='password']");
	//private By click = By.xpath("//button[@class='btn btn-primary btn-submit ng-isolate-scope']");
	//private By profile3 = By.xpath("//a[@id='global-user-trigger']");
	private By search = By.xpath("//a[text()='+Add favourites']");
	private By follow = By.xpath("//button[@class='Button Button--sm Button--alt']");
	
	
	private WebDriver driver;
	private ElementUtils elementutils;
	private JavascriptExecutor js;
	
	public login(WebDriver driver) {
		this.driver=driver;
		elementutils = new ElementUtils(this.driver);
	}
	public login doEnter(String eml, String pwd) {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		elementutils.doClick(profile);
		
		
		
		
		
		//driver.switchTo().frame("disneyid-iframe");
		
		elementutils.doClick(search);
		driver.switchTo().frame("favorites-manager-iframe");
		elementutils.doClick(follow);
	
		return this ;
	}
}
