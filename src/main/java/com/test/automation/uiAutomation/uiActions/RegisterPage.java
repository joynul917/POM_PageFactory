package com.test.automation.uiAutomation.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class RegisterPage {
	

	public static final Logger log =  Logger.getLogger(RegisterPage.class.getName());
	WebDriver driver;
	
	//Contact Information
	@FindBy (xpath="//a[contains(text(),'REGISTER')]")
	WebElement RegisterForm;
	@FindBy (xpath="//input[@name='firstName']")
	WebElement fName;
	@FindBy (xpath="//input[@name='lastName']")
	WebElement Lname;
	@FindBy (xpath="//input[@name='phone']")
	WebElement Phone;
	@FindBy (xpath="//input[@id='userName']")
	WebElement UserName;
	
	
    //Mailing Information
	@FindBy (xpath="//input[@name='address1']")
	WebElement Address1;
    @FindBy (xpath="//input[@name='address2']")
	WebElement Address2;
	@FindBy (xpath="//input[@name='city']")
	WebElement City;
	@FindBy (xpath="//input[@name='state']")
	WebElement State;
	@FindBy (xpath="//input[@name='postalCode']")
	WebElement postalCode;
	@FindBy (xpath="//select[@name='country']/option//following::*[contains(text(),'UNITED STATES')]")
	WebElement Country;
	
	//User Information
	@FindBy (xpath="//input[@id='email']")
	WebElement EmailId;
	@FindBy (xpath="//input[@name='password']")
	WebElement PasswordId;
	@FindBy (xpath="//input[@name='confirmPassword']")
	WebElement PasswordIdConfirm;
	
	//SUBMIT Button
	@FindBy (xpath="//input[@name='register']")
	WebElement RegisterSubmitBtn;	
     
	//Register verify Message
	@FindBy (xpath="//font[contains(text(),'Thank you')]")
	WebElement verifyConfirmRegistered;

	
	
	public RegisterPage (WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);

}
	
	
	public void AllRegisterApp(String strfname,String strlName, String strPhone,String strUserName, String strAddress1,String strAddress2, String strCity, String strState,String strPostalCode,String strCountry, String strEmailId,String strPasswordId,String strPasswordIdConfirm) {
		
		this.RegisterForm.click();
		log.info("Clicked on Register Button");
		this.fName.sendKeys(strfname);
		log.info("Entered First name");
		this.Lname.sendKeys(strlName);
		log.info("Entered Last name");
		this.Phone.sendKeys(strPhone);
		log.info("Entered Phone name");
		this.UserName.sendKeys(strUserName);
		log.info("Entered User name");
		this.Address1.sendKeys(strAddress1);
		log.info("Entered Address1 name");
		this.Address2.sendKeys(strAddress2);
		log.info("Entered Address2 name");
		this.City.sendKeys(strCity);
		log.info("Entered City name");
		this.State.sendKeys(strState);
		log.info("Entered State name");
		this.postalCode.sendKeys(strPostalCode);
		log.info("Entered postalCode");
		this.Country.sendKeys(strCountry);
		log.info("Entered Country name");
		this.EmailId.sendKeys(strEmailId);
		log.info("Entered EmailId name");
		this.PasswordId.sendKeys(strPasswordId);
		log.info("Entered PasswordId");
		this.PasswordIdConfirm.sendKeys(strPasswordIdConfirm);
		log.info("Entered PasswordIdConfirm");
		this.RegisterSubmitBtn.click();
		log.info("Clicked On SUBMIT  Btn");
		
}
	public String VerifyConfirmRegister () {
		
		return verifyConfirmRegistered.getText();
}

}

	
	


