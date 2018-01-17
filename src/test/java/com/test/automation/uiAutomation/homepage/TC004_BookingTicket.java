package com.test.automation.uiAutomation.homepage;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.TestBase;
import com.test.automation.uiAutomation.uiActions.BookAticket;
import com.test.automation.uiAutomation.uiActions.HomePage;

public class TC004_BookingTicket extends TestBase {
	public static final Logger log = Logger.getLogger(TC004_BookingTicket.class.getName());
	
	HomePage homepage;
	BookAticket bookAticket ;
	
	
	
	
	@BeforeClass
	public void setUp() throws IOException{
     init();

	}
   
	

	

	@Test(priority=2)
public void TestBookAflight(){
		
	
	homepage = new HomePage(driver);
	homepage.loginToApllication(Email,pass);
	
	log.info(">>>>>>>>>>>Booking Flight with Personal info>>>>>>>>>>>");
	bookAticket = new BookAticket(driver);
	bookAticket.AllFlightFinder();
	bookAticket.AllSelectFlight();
    bookAticket.AllBookAflight("joynul", "bhuiyan", "123456789123456", "joynul", "j", "bhuiyan");


	
	String verifyFlightConfirmation = bookAticket.getFlightConfirmation();
	Assert.assertTrue(verifyFlightConfirmation.contains("Your itinerary"));
	log.info("verify Text is:- "+bookAticket.getFlightConfirmation());
	bookAticket.ClickOnSignOff();
	log.info(">>>>>>>>>Booking Succesfull>>>>>>>>>>>>");
}
	
	@AfterClass
	public void endTest(){
		driver.close();
	}
}