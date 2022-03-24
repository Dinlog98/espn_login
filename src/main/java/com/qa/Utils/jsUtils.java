package com.qa.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class jsUtils {
	private WebDriver driver;
	private JavascriptExecutor js;
	
	public jsUtils(WebDriver driver) {
		this.driver=driver;
		js = (JavascriptExecutor) this.driver;
	}
	
	
}
	


