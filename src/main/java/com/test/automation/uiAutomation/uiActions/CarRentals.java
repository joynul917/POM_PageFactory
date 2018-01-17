package com.test.automation.uiAutomation.uiActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarRentals {
	
WebDriver driver;
	
	//constructor 
	public CarRentals(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this); 
	}

	@FindBy (xpath= "//a[text()='Car Rentals']")
	WebElement CarRentals;
	@FindBy (xpath= "//*[contains(text(),'(v.')]")
	WebElement version;
	
	public void ClickCarRentals (){
		this.CarRentals.click();
	}
	public String getVersion() {
	 return version.getText();
	 
	}
}
	
	
	
	


