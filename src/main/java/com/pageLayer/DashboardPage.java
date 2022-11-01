package com.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.BaseTest;

public class DashboardPage extends BaseTest{
	
	public DashboardPage() {
		
		PageFactory.initElements(driver,this);
	}
	private By searchBox = By.xpath("(//input[@class='form-control'])[1]");
	@FindBy(xpath="(//div[@class='m-2 card-title'])[2]")
	private WebElement companyOption;
	
     public String searchCompany(String CompanyName) {
	  
	  driver.findElement(searchBox).sendKeys(CompanyName);
	  return CompanyName;
  }
     public void clickCompanyOption() {
    	 companyOption.click(); 
    	 
     }
     //this is test comments
}
