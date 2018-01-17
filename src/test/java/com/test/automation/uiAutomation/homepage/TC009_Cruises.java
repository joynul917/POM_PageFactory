package com.test.automation.uiAutomation.homepage;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.TestBase;
import com.test.automation.uiAutomation.uiActions.Cruises;
import com.test.automation.uiAutomation.uiActions.HomePage;

public class TC009_Cruises extends TestBase {
	
	
	public static final Logger log = Logger.getLogger(TC009_Cruises.class.getName());
	
	HomePage homepage;
	Cruises cruises;

	
	@BeforeClass
	public void setUp() throws IOException{
     init();
	}
	
	
	
	@Test (priority=9)
	public void testCruises () {
		
		homepage = new HomePage(driver);
		homepage.loginToApllication(Email,pass);
		
		
		
		
		cruises = new Cruises(driver);
		cruises.AllCruises();
		log.info(">>>>>>>>>>>>Clicked On Cruises<<<<<<<<");
		
		
       String verifyCruises = cruises.getVerifyCruisesReservation();
		Assert.assertTrue(verifyCruises.contains("Cruise Itinerary"));
		
		log.info("Cruises Verify succesful: " + verifyCruises );
		
		cruises.ClickOnCruisesReservation();
		log.info(">>>>>>Clicked on Cruises Reservation<<<<<<<<<<<<<,");
}
	@AfterClass
	public void endTest(){
		driver.close();
	}
	}