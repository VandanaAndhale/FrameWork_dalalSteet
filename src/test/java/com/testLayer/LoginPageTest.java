package com.testLayer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageLayer.LoginPage1;
import com.testBase.BaseTest;
import com.utility.Utility;

public class LoginPageTest {
	public class LoginpageTest extends BaseTest {

		String expected_url = "https://www.apps.dalalstreet.ai/dashboard";
		@Test(priority = 1)
		public void verifyLoginTest() throws InterruptedException, IOException
		{
			LoginPage1 login = new LoginPage1();
			login.verifyLogin();
			Thread.sleep(3000);
			Utility util = new Utility();
			String actual_url = util.getUrl();
			Assert.assertEquals(actual_url, expected_url);
		}
}
}