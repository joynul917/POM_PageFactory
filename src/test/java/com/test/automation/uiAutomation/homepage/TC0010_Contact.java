package com.test.automation.uiAutomation.homepage;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.TestBase;
import com.test.automation.uiAutomation.uiActions.Contact;
import com.test.automation.uiAutomation.uiActions.HomePage;

public class TC0010_Contact  extends TestBase{
	
	
public static final Logger log = Logger.getLogger(TC0010_Contact.class.getName());
	
	HomePage homepage;
	Contact  contact;

@BeforeClass
public void setUp() throws IOException{
    init();
	}
@Test 
public void testContact () {
	homepage = new HomePage(driver);	
	homepage.loginToApllication(Email,pass);
	contact = new Contact(driver);
	contact.ClickContact();
	log.info(">>>>>>>>>>>Clicked on Contact<<<<<<<<<<");
	String verifyVersion = contact.getVersion();
	
	Assert.assertTrue(verifyVersion.contains("(v."));
	log.info("Contact verify Successful: "+ verifyVersion);
	
	log.info(">>>>>>>>>>>Contact Successful<<<<<<<<<<");
	

}@AfterClass
public void endTest(){
	driver.close();
}
}

