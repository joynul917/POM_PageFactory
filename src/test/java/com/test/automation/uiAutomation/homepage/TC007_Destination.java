package com.test.automation.uiAutomation.homepage;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.TestBase;
import com.test.automation.uiAutomation.uiActions.Destinations;
import com.test.automation.uiAutomation.uiActions.HomePage;

public class TC007_Destination extends TestBase{
	
	public static final Logger log = Logger.getLogger(TC007_Destination.class.getName());
	
	HomePage homepage;
	
	Destinations destinations;

	
	@BeforeClass
	public void setUp() throws IOException{
     init();

	}
	@Test
	public void testDestinations () {
		
		homepage = new HomePage(driver);
		homepage.loginToApllication(Email,pass);
		
		
		
		destinations = new Destinations(driver);
		destinations.ClickDestinations();
		String verifyVersion = destinations.getVersion();
		
		Assert.assertTrue(verifyVersion.contains("(v."));

	log.info("Current web applicatin version is :" +verifyVersion );
	
	

}@AfterClass
public void endTest(){
	driver.close();
}
}

