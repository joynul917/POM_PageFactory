package com.test.automation.uiAutomation.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ITINERARY {
	
	
	public static final Logger log = Logger.getLogger(ITINERARY.class.getName());
	
	
	WebDriver driver;

	//constructor 
	public ITINERARY(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this); 
	}


		@FindBy(xpath= "//a[contains(text(),'ITINERARY')]")
		WebElement ITINERARY;
		@FindBy(xpath= "//area[@href='mercurywelcome.php']")
		WebElement CancelReservation;
		
		public void clickItinerary () {
			this.ITINERARY.click();
			this.CancelReservation.click();
			
		}

		
		
		
	}
	


