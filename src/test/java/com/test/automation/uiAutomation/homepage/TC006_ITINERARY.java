package com.test.automation.uiAutomation.homepage;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.TestBase;
import com.test.automation.uiAutomation.uiActions.HomePage;
import com.test.automation.uiAutomation.uiActions.ITINERARY;

public class TC006_ITINERARY extends TestBase {
	
	public static final Logger log = Logger.getLogger( TC006_ITINERARY.class.getName());
	
	HomePage homepage;
	
	ITINERARY Itinerary;
	

	
	@BeforeClass
	public void setUp() throws IOException{
     init();

	}
	@Test
public void itineraryCencel(){
	
	homepage = new HomePage(driver);
	homepage.loginToApllication(Email,pass);
	
	Itinerary = new ITINERARY(driver);
	Itinerary.clickItinerary();
	
}
@AfterClass
public void endTest(){
	driver.close();
}
}
