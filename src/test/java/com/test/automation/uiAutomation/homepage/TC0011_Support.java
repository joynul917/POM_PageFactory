package com.test.automation.uiAutomation.homepage;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.TestBase;
import com.test.automation.uiAutomation.uiActions.HomePage;
import com.test.automation.uiAutomation.uiActions.Support;

public class TC0011_Support extends TestBase {
	
public static final Logger log = Logger.getLogger( TC0011_Support.class.getName());
	
	
	HomePage homepage;

	Support support;
	

	@BeforeClass
	public void setUp() throws IOException{
     init();
	}
	
	@Test 
	public void testSupport () {
		homepage = new HomePage(driver);
		homepage.loginToApllication(Email, pass);
		
		support = new Support(driver);
		support.ClickSupport();
	
		log.info(">>>>>>>>>Clicked on Support<<<<<<<<<<");
		String verifyVersion = support.getVersion();
		
		Assert.assertTrue(verifyVersion.contains("(v."));
		log.info("Support succesfull: " + verifyVersion);

}
	
	@AfterClass
	public void endTest(){
		driver.close();
	}
}

