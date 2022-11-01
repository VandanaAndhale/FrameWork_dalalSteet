package com.pageLayer;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testBase.BaseTest;

public class PortFollioPage1 extends BaseTest{
    @FindBy(xpath="//*[@id='topnav-menu-content']/ul/li[4]/a")
     private WebElement portFolio;
    
    @FindBy(xpath="(//*[@class='btn btn-outline-dark btn-sm w-xs'])[2]")
    private WebElement tradeWipro;
    
    @FindBy(xpath="//*[@name='input-Qunatity']")
    private WebElement quantity;
    
    @FindBy(xpath = "//button[contains(text(),'Buy')]")
    private WebElement buy_button;
    
    @FindBy(xpath = "((//*[@class='Toastify'])//div)[1]")
    private WebElement order_created_successfully_txt;
    
    public PortFollioPage1 () {
    PageFactory.initElements(driver, this);
    }
    
    public void buyWiproTrade() throws InterruptedException {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
    	wait.until(ExpectedConditions.elementToBeClickable(portFolio));
    	portFolio.click();
    	Thread.sleep(2000);
    	tradeWipro.click();
    	Thread.sleep(2000);
    	quantity.click();
    	quantity.sendKeys("4");
    	Thread.sleep(2000);
    	JavascriptExecutor js=(JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,500)");
    	Thread.sleep(2000);
    	 buy_button.click();
    }
}
