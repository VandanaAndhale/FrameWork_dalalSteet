package com.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.testBase.BaseTest;

public class ExchangePage1 extends BaseTest {
   public ExchangePage1(){
	   
	   PageFactory.initElements(driver,this);
}
   //-------------------obj repo------------
   private By Buy_btn1 = By.xpath("//a[contains(text(),'Buy')]");
   private By Quantity = By.xpath("//input[@id='quantity']");
   private By Buy_btn2 = By.xpath("//button[contains(text(),'Buy')]");
   private By status = By.xpath("//div[text()='Order Created successfully']");
   private By Sell_btn = By.xpath("//*[@class='nav-link']");
   private By clickIntraDay=By.xpath("//*[@for='btnradio6']");
   private By clickCustomLimit=By.xpath("//*@for='btnradio8']");
   private By clickSellButton=By.xpath("//*[@class='w-md btn btn-danger']");
   //-------------actions-----------------------
   public void clickBuyButton1() {
	   
	   driver.findElement(Buy_btn1).click();
   }
   public void enterQuantity(String count) {
	   
	  WebElement qty = driver.findElement(Quantity);
	  qty.click();
	  qty.sendKeys(count);
	  
   }
 
 public void clickBuyButton2() {
	   
	   driver.findElement(Buy_btn2).click();
 }
	public String getStatus() {
	String msg=	driver.findElement(status).getText();
		return msg;
	}
	
	public void clickSellButton() throws InterruptedException {
		driver.findElement(Sell_btn).click();
		Thread.sleep(5000);
		driver.findElement(clickIntraDay).click();
		 Thread.sleep(5000);
			
			/*
			 * driver.findElement(clickCustomLimit).click(); Thread.sleep(8000);
			 */
			
		 
	}
	public void clickSellButton2() {
		
		driver.findElement(clickSellButton).click();
	}
}
