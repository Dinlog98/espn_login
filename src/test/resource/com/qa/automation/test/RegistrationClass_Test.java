package com.qa.automation.test;

	import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.automtion.pages.registrationClass_page;
import com.qa.automation.test.BaseTest;

	public class RegistrationClass_Test extends BaseTest { 
		
		public registrationClass_page registrationClass_page;
		
		@BeforeClass
		public void initialsetup_registrationClass_Test() {
			
			registrationClass_page = signUpClass_page.doLogin();
			
		}
		@Test
		public void registrationClass_page_doEnter() {
		registrationClass_page.doEnter (prop.getProperty("firstname"), prop.getProperty("lastname"), prop.getProperty("email"), prop.getProperty("password"));
		}
	}