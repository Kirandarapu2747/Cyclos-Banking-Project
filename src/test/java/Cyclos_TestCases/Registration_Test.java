package Cyclos_TestCases;

import org.testng.annotations.Test;

import Cyclos_PageObjects.Registration;
@Test()
public class Registration_Test extends Registration_BaseClass{
	public void RegistrationTest() throws InterruptedException {
		Registration rs=new Registration(driver);
		Thread.sleep(2000);
		rs.NewUserRegister();
		log.info("Register clicked");
		Thread.sleep(2000);
		rs.setName(Name);
		log.info("Name entered");
		Thread.sleep(2000);
		rs.setLoinName(LoginName);
		log.info("Login name entered");
		Thread.sleep(2000);
		rs.setEMail(EMail);
		log.info("Email entered");
		Thread.sleep(2000);
		rs.ClickNext();
		log.info("next button clicked");
		Thread.sleep(2000);
		rs.Password(Password);
		log.info("Password entered");
		Thread.sleep(2000);
		rs.ConformPassword(ConformPassword);
		log.info("Conform password entered");
		Thread.sleep(2000);
		rs.Checkbox();
		log.info("Check box clicked");
		Thread.sleep(2000);
		rs.EnterFrame();
		log.info("Entered into the frame");
		Thread.sleep(2000);
		rs.Robot();
		log.info("Robot clicked");
		Thread.sleep(2000);
		rs.ClickSubmit();
		log.info("submit button clicked");
		
		
		
		
		
	
		
	}
	
	
	

}
