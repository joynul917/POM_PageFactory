package com.test.automation.uiAutomation.uiActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Destinations {
	
	WebDriver driver;

	//constructor 
	public Destinations(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this); 
	}
	
	@FindBy (xpath="//a[text()='Destinations']")
	WebElement Destinations;
	@FindBy (xpath= "//*[contains(text(),'(v.')]")
	WebElement version;
	
	public void ClickDestinations (){
		this.Destinations.click();
	}
	public String getVersion() {
	 return version.getText();
	 
	}
}
	
	
	
	


