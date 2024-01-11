package Cyclos_TestCases;

import org.testng.annotations.Test;

import Cyclos_PageObjects.Registration;
@Test()
public class Registration_Test extends Registration_BaseClass{
	public void RegistrationTest() throws InterruptedException {
		Registration rs=new Registration(driver);
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
		
	}
	
	
	

}
