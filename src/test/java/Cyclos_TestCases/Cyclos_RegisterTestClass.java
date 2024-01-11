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
		System.out.println("Register Clicked");
		Thread.sleep(2000);
		crp.Name(name);
		System.out.println("Name Enterted");
		Thread.sleep(2000);
		crp.LoginName(lname);
		System.out.println("Login Name Enterd");
		Thread.sleep(2000);
		crp.Email(email);
		System.out.println("Email Entered");
		Thread.sleep(2000);
		crp.ClickNext();
		System.out.println("Next Clicked");
		Thread.sleep(2000);
		crp.Password(Password);
		System.out.println("Password Entered");
		Thread.sleep(2000);
		crp.ConfirmPassword(ConfirmPassword);
		System.out.println("Password confirmed");
		Thread.sleep(2000);
		crp.Clickagreement();
		System.out.println("Argreement Clicked");
		Thread.sleep(2000);
		crp.Robot();
		System.out.println("Robot Clicked");
		Thread.sleep(2000);
		crp.ClickSubmit();
		System.out.println("Submit Clicked");
		Thread.sleep(2000);
	}
	
}
