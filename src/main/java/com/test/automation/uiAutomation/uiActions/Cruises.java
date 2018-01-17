package com.test.automation.uiAutomation.uiActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cruises {
	
	
	WebDriver driver;

	//constructor 
	public Cruises(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this); 
	}

	@FindBy (xpath="//a[text()='Cruises']")
	WebElement Cruises;
	@FindBy(xpath= "//*[@alt='Reservations Open']")
	WebElement CruisesReservation;
	@FindBy(xpath= "//span[contains(text(),'Cruise Itinerary')]")
	WebElement CruisesReservationVerify;

	@FindBy(xpath= "//a[@href='mercuryitinerary.php']")
	WebElement Itinerary;

	

	







	public void AllCruises() {
		this.Cruises.click();
	}
   public void ClickOnCruisesReservation()	{	
		this.CruisesReservation.click();
		
	}
	public String getVerifyCruisesReservation(){
		return CruisesReservationVerify.getText();
		
	}

	

	
	}
	
	


