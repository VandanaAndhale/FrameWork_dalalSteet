package com.pageLayer;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.BaseTest;

public class LoginPage1 extends BaseTest {
	
	//------------- Obj repo -----------------
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email_txtbox;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password_txtbox;
	
	@FindBy(xpath="//button[text()='Log In']")
	private WebElement login_btn;
	
	public LoginPage1()
	{
		PageFactory.initElements(driver, this);
	}
	
	//--------------Action methods------------ 
	public void verifyLogin() throws IOException, InterruptedException 
	{
		
	Properties prop=new Properties(); 
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir") + "//dalalStreet");
	prop.load(fis);
	
	email_txtbox.sendKeys(prop.getProperty("email"));
	Thread.sleep(2000);
	password_txtbox.sendKeys(prop.getProperty("password"));
	login_btn.click();
	Thread.sleep(2000);
	
     }
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * public void enterEmailAddress() {
	 * email_txtbox.sendKeys("amarwaghmare573@gmail.com"); } public void
	 * enterPassword() { password_txtbox.sendKeys("Test@1234"); }
	 */
	/*
	 * public void clickOnLoginButton() { login_btn.click(); }
	 */
	

