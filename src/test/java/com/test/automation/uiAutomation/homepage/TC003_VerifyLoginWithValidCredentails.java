package com.test.automation.uiAutomation.homepage;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.TestBase;
import com.test.automation.uiAutomation.uiActions.HomePage;

public class TC003_VerifyLoginWithValidCredentails extends TestBase{
	
	public static final Logger log = Logger.getLogger(TC003_VerifyLoginWithValidCredentails.class.getName());	
    HomePage homepage;
	//String AutoGeneratedEmail = System.currentTimeMillis()+ "@gmail.com";
	//String AutoPassword = System.currentTimeMillis()+"1";
	@BeforeClass
	public void setUp() throws IOException{
     init();

	}
	@Test
	public void verifyLoginWithInvalidCredentails(){
		log.info("=========== Starting verifyLoginWithValidCredentails Test=============");
		homepage = new HomePage(driver);
		homepage.loginToApllication(Email,pass);
		//homepage.loginToApllication(AutoGeneratedEmail, AutoPassword);
		Assert.assertEquals(homepage.getVerifyText(), "SIGN-OFF");
		log.info("verify Text is:- "+homepage.getVerifyText());
		log.info("=========== Finished verifyLoginWithValidCredentails Test=============");
	}
	
	@AfterClass
	public void endTest(){
		driver.close();
	}
	
	public void log(String data){
		log.info(data);
		Reporter.log(data);
		//test.log(LogStatus.INFO, data);

}
}

