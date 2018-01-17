package com.test.automation.uiAutomation.uiActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.automation.uiAutomation.testBase.TestBase;

public class Hotels {
	
	
	
WebDriver driver;
	
	public Hotels(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this); 
	}
	
	@FindBy (xpath= "//a[text()='Hotels']")
	WebElement Hotels;
	@FindBy (xpath= "//*[contains(text(),'(v.')]")
	WebElement version;
	
	public void ClickOnHotelsButton (){
		this.Hotels.click();
	}
	public String getVersion() {
	 return version.getText();
	 
	}
}
	
	



	


