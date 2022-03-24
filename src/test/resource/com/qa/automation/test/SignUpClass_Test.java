	package com.qa.automation.test;

	import org.testng.annotations.Test;

	import com.qa.automation.test.BaseTest;

	public class SignUpClass_Test extends BaseTest { 

		@Test
		public void loginTest() {
			
			signUpClass_page.doLogin();
		}
	}

