package com.test.automation.uiAutomation.homepage;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.TestBase;
import com.test.automation.uiAutomation.uiActions.HomePage;
import com.test.automation.uiAutomation.uiActions.Hotels;

public class TC005_Hotels extends TestBase {
	
	public static final Logger log = Logger.getLogger(TC005_Hotels.class.getName());
	
	HomePage homepage;
	Hotels hotels;
	
	@BeforeClass
	public void setUp() throws IOException{
     init();

	}


	@Test
	public void testHotels () {
		
		
		homepage = new HomePage(driver);
		homepage.loginToApllication(Email,pass);
		

        hotels = new Hotels(driver);
		hotels.ClickOnHotelsButton();
		log.info(">>>>>>>>>>Clicked on Hotels Button>>>>>>>>");
		
		
		String verifyVersion = hotels.getVersion();
		Assert.assertTrue(verifyVersion.contains("(v."));
		log.info("Verify successfull: "+ verifyVersion);
		
		log.info(">>>>>>>>>>Hotels Selected Successfull<<<<<<<<<<<<");
		
	}
	
	@AfterClass
	public void endTest(){
		driver.close();
	}
}
