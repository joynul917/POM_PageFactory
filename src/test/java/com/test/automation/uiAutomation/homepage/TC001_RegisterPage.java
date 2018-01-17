package com.test.automation.uiAutomation.homepage;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.test.automation.uiAutomation.testBase.TestBase;
import com.test.automation.uiAutomation.uiActions.RegisterPage;

public class TC001_RegisterPage extends TestBase {
	
	public static final Logger log = Logger.getLogger(TC001_RegisterPage.class.getName());
	
	
	RegisterPage registerForm;
	
	@BeforeClass
	public void setUp() throws IOException{
		init();
	}
	@Test
	public void registerPage(){
		registerForm = new RegisterPage(driver);
		registerForm.AllRegisterApp("joynul", "bhuiyan", "9174029173", "abc123@bd.com", "1 Ave a", "Apt 3", "Brooklyn","New York","11218","UNITED STATES","abc123", "Password1", "Password1");
		
		
	    String VerifyRegisterForm = registerForm.VerifyConfirmRegister();
		Assert.assertTrue(registerForm.VerifyConfirmRegister().contains("Thank you for registering."));
		log.info("Register verify successful Message is: " + registerForm.VerifyConfirmRegister());
	}
	@AfterClass
	public void endTest(){
		driver.close();
	}
	}



