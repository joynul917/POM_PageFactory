package com.test.automation.uiAutomation.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAticket {
	public static final Logger log = Logger.getLogger(BookAticket.class.getName());
	
	WebDriver driver;

	//constructor 
	public BookAticket(WebDriver driver) { 
		this.driver = driver;
		PageFactory.initElements(driver, this); 
	}

	@FindBy(xpath ="//input[@value='roundtrip']")
	WebElement Type;
	@FindBy(xpath="//select[@name='passCount']/option[2]")
	WebElement Passengers;
	@FindBy(xpath= "//select[@name='fromPort']//option/following::*[contains(text(),'New York')]")
	WebElement DepartingFrom;
	@FindBy(xpath= "//select[@name='fromMonth']/option[11]")
	WebElement LeavingMonth;
	@FindBy(xpath= "//select[@name='fromDay']/option[1]")
	WebElement LeavingDay;
	@FindBy(xpath= "//select[@name='toPort']/option//following::*[@value='London']")
	WebElement ArrivingIn;
	@FindBy(xpath ="//select[@name='toMonth']/option[11]")
	WebElement ArrivingMonth;
	@FindBy(xpath= "//select[@name='toDay']/option[1]")
	WebElement ArrivingDay;
	@FindBy(xpath= "//*[contains(text(),'Economy class')]")
	WebElement ServiceClass;
	@FindBy(xpath= "//select[@name='airline']/option//following::*[text()='Blue Skies Airlines']")
	WebElement Airplane;
	@FindBy(xpath ="//input[@name='findFlights']")
	WebElement	Continue;
	
	
	//####### Choosing Flight and rate################

	@FindBy(xpath= "//input[@name='outFlight']//following::*[contains(text(),'Blue Skies Airlines 360')]")
	WebElement DepartFlight;

	@FindBy(xpath="//input[@name='inFlight']//following::*[contains(text(),'Blue Skies Airlines 630')]")
	WebElement ReturnFlight;

	@FindBy (xpath="//input[@name='reserveFlights']")
	WebElement ReserveFlight;
	

	//######## Book A Flight###########

	@FindBy(xpath= "//input[@name='passFirst0']")
	WebElement	FirstName;
	@FindBy(xpath= "//input[@name='passLast0']")
	WebElement	LastName;
	@FindBy(xpath= "//select[@name='pass.0.meal']/option[9]")
	WebElement	Meal;
	//
	@FindBy(xpath= "//select[@name='creditCard']/option[1]")
	WebElement	CardType;
	@FindBy(xpath= "//input[@name='creditnumber']")
	WebElement	CardNumber;
	@FindBy(xpath= "//select[@name='cc_exp_dt_mn']/option[2]")
	WebElement	ExpMonth;
	@FindBy(xpath= "//select[@name='cc_exp_dt_yr']/option[2]")
	WebElement	ExpYear;
	@FindBy(xpath= "//input[@name='cc_frst_name']")
	WebElement	CardFname;
	@FindBy(xpath= "//input[@name='cc_mid_name']")
	WebElement	CardMname;
	@FindBy(xpath= "//input[@name='cc_last_name']")
	WebElement	CardLname;
	@FindBy(xpath= "//font[contains(text(),'Same as Billing Address')]")
	WebElement	SameAsBillingAddress;
	@FindBy(xpath= "//input[@name='buyFlights']")
	WebElement	SecurePurchass;
	
	//#######Confirm Page########
	@FindBy(xpath= " //*[@size='+1']")//"//*[contains(text(),'Flight Confirmation')]")
	WebElement	FlightConfirmation;
	
	//######ClickOnSignOFFbuttonAfterConfirmFlight#######
	@FindBy(xpath= "//*[contains(text(),'SIGN-OFF')]")
	WebElement	SignOff;



public void AllFlightFinder () {
	this.Type.click();
	log.info("Flight type Radio button is selected: " + Type.isSelected());
	this.Passengers.click();
	this.DepartingFrom.click();
	this.LeavingMonth.click();;
	this.LeavingDay.click();
	this.ArrivingIn.click();;
	this.ServiceClass.click();
	this.Airplane.click();;
	this.Continue.click();
}


public void AllSelectFlight() {
	this.DepartFlight.click();
	this.ReturnFlight.click();
	this.ReserveFlight.click();
}


public void AllBookAflight(String strFirstName, String strLastName, String strCardNumber,
		String strCardFname, String strCardMname, String strCardLname) {
	
this.FirstName.sendKeys(strFirstName);
log.info("First Name is: " + strFirstName);
this.LastName.sendKeys(strLastName);
log.info("Last Name is: " + strLastName);
this.Meal.click();
log.info("Card Name is: " + strCardNumber);

this.CardType.click();
log.info("Clicked on card type" +"and the Object is= " + CardType);
this.CardNumber.sendKeys(strCardNumber);
log.info("Entered card number: " + strCardNumber);
this.ExpMonth.click();
log.info("Clicked on Expire month: " +ExpMonth);
this.ExpYear.click();
log.info("Clicked on Expire year: " + ExpYear);
this.CardFname.sendKeys(strCardFname);
log.info("First Name on Card : " + strCardFname);
this.CardMname.sendKeys(strCardMname);
log.info("Middle Name on Card: " +strCardMname);
this.CardLname.sendKeys(strCardLname);
log.info("Last Name on Card: " + strCardLname);
this.SameAsBillingAddress.click();
log.info("Billing Address is: " + SameAsBillingAddress);
this.SecurePurchass.click();
log.info("Clicked on Secure Purchass " +"and the Object is= "+ SecurePurchass );

}
public String getFlightConfirmation() {
	return FlightConfirmation.getText();
}
public void ClickOnSignOff() {
	this.SignOff.click();

}
}
