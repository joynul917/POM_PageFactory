package com.test.automation.uiAutomation.homepage;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.TestBase;
import com.test.automation.uiAutomation.uiActions.CarRentals;
import com.test.automation.uiAutomation.uiActions.HomePage;

public class TC008_CarRentals extends TestBase{
	
	public static final Logger log = Logger.getLogger(TC008_CarRentals.class.getName());
	
	
	HomePage homepage;
	CarRentals carRentals;
	
	

	@BeforeClass
	public void setUp() throws IOException{
     init();
	}
	
	@Test 
	public void testCarRentals () {
		homepage = new HomePage(driver);
		homepage.loginToApllication(Email,pass);
		
		
		
		carRentals = new CarRentals(driver);
		carRentals.ClickCarRentals();
		log.info(">>>>>>>>>>>Clicked on Car Rentals <<<<<<<<<<");
		
		String verifyVersion = carRentals.getVersion();
		Assert.assertTrue(verifyVersion.contains("(v."));
		log.info("verify Success: "+ carRentals.getVersion() );
		
		log.info(">>>>>>>>>>>>>Car Rentals Succesfull>>>>>>>>>>>");
	}
	
	

@AfterClass
public void endTest(){
	driver.close();
}
}
