package com.utility;

import org.openqa.selenium.support.PageFactory;

import com.testBase.BaseTest;

public class Utility extends BaseTest {
	public Utility()
	{
		PageFactory.initElements(driver, this);
	}

	//url get 
	public String getUrl()
	{
		String current_url = driver.getCurrentUrl();
		return current_url;
	}
}
