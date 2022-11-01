package com.testLayer;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageLayer.DashboardPage;
import com.pageLayer.ExchangePage1;
import com.pageLayer.LoginPage1;
import com.testBase.BaseTest;

@Test
public class BySenario1 extends BaseTest{
	String ExpectedMsg="Order Created successfully";
	
       public void buyShare() throws IOException, InterruptedException {
		LoginPage1 	pg=new LoginPage1 ();
		pg.verifyLogin();
		Thread.sleep(2000);
		 DashboardPage dp=new  DashboardPage();
		 dp.searchCompany("wipro");
		 dp.clickCompanyOption();
		 Thread.sleep(2000);
		 ExchangePage1 ep=new ExchangePage1();
		 ep.clickBuyButton1();
		 ep.enterQuantity("3");
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,500)");
		 Thread.sleep(2000);
		 ep.clickBuyButton2();
		 Thread.sleep(2000);
		 Assert.assertEquals(ep.getStatus(), ExpectedMsg);
	}
}
