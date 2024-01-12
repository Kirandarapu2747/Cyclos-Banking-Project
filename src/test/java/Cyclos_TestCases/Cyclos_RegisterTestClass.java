package Cyclos_TestCases;

import org.testng.annotations.Test;

import Cyclos_PageObjects.Cyclos_RegistrationPage;

public class Cyclos_RegisterTestClass extends Cyclos_RegisterBaseClass 
{
	@Test()
	public void RegisterTest() throws InterruptedException
	{
		Cyclos_RegistrationPage crp=new Cyclos_RegistrationPage (driver);
		Thread.sleep(2000);
		crp.ClickRegister();
		log.info("Register Clicked");
		Thread.sleep(2000);
		crp.Name(name);
		log.info("Name Entered");
		Thread.sleep(2000);
		crp.LoginName(lname);
		log.info("Login Name Entered");
		Thread.sleep(2000);
		crp.Email(email);
		log.info("Email Entered");
		Thread.sleep(2000);
		crp.ClickNext();
		log.info("Next Clicked");
		Thread.sleep(2000);
		crp.Password(Password);
		log.info("Password Entered");
		Thread.sleep(2000);
		crp.ConfirmPassword(ConfirmPassword);
		log.info("Password confirmed");
		Thread.sleep(2000);
		crp.Clickagreement();
		log.info("Agreement Clicked");
		Thread.sleep(2000);
		crp.EnterFrame();
		log.info("Entered into Frame");
		Thread.sleep(2000);
		crp.Robot();
		log.info("Robot Clicked");
		Thread.sleep(2000);
		crp.ClickSubmit();
		log.info("Submit Clicked");
		Thread.sleep(2000);
	}
	
}
