package com.test.automation.uiAutomation.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.automation.uiAutomation.testBase.TestBase;

public class HomePage  {
	
public static final Logger log = Logger.getLogger(HomePage.class.getName());


	
	WebDriver driver;
	
	
	
	@FindBy (name="userName")
	WebElement userName;
	@FindBy (name = "password")
	WebElement Password;
	@FindBy (xpath= "//input[contains(@name,'login')]")
	WebElement log_in;
	
	//for Logging verification
	@FindBy (xpath = " //a[contains(text(),'SIGN-OFF')]")
	WebElement VerifyLoggedIn;
	
	@FindBy (xpath = " //a[contains(text(),'SIGN-OFF')]")
	WebElement clickOnSignOFF;
	
	
	public HomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		

}
	public void loginToApllication(String Email,String pass){
	     
		this.userName.sendKeys(Email);
		log.info("Entered User Name: "+ Email +" and object is "+ Email.toString());
		
		this.Password.sendKeys(pass);
		log.info("Entered Password: "+ pass +" and object is "+ pass.toString());
		
		this.log_in.click();
		log.info("clicked on SUBMIT Button and object is " + log_in.toString());
	}
	public String getVerifyText(){
		
		return VerifyLoggedIn.getText();
		}
	public boolean verifyLogoutDisplay() {
		try {
			clickOnSignOFF.isDisplayed();
			log.info("logout is dispalyed and object is:-"+clickOnSignOFF.toString());
			
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	
	
	
	
}
