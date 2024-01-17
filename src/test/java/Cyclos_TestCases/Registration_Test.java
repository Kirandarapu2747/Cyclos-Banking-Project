package Cyclos_TestCases;

import org.testng.annotations.Test;

import Cyclos_PageObjects.Registration;
@Test()
public class Registration_Test extends Registration_BaseClass{
	public void RegistrationTest() throws InterruptedException {
		Registration rs=new Registration(driver);
		Thread.sleep(2000);
		rs.NewUserRegister();
		System.out.println("Register clicked");
		Thread.sleep(2000);
		rs.setName(Name);
		System.out.println("Name entered");
		Thread.sleep(2000);
		rs.setLoinName(LoginName);
		System.out.println("Login name entered");
		Thread.sleep(2000);
		rs.setEMail(EMail);
		System.out.println("Email entered");
		Thread.sleep(2000);
		rs.ClickNext();
		System.out.println("next button clicked");
		Thread.sleep(2000);
		rs.Password(Password);
		System.out.println("Password entered");
		Thread.sleep(2000);
		rs.ConformPassword(ConformPassword);
		System.out.println("Conform password entered");
		Thread.sleep(2000);
		rs.Checkbox();
		System.out.println("Check box clicked");
		Thread.sleep(2000);
		rs.EnterFrame();
		System.out.println("Entered into the frame");
		Thread.sleep(2000);
		rs.Robot();
		System.out.println("Robot clicked");
		Thread.sleep(2000);
		rs.ClickSubmit();
		System.out.println("submit button clicked");
		
		
		
		
		
	
		
	}
	
	
	

}
