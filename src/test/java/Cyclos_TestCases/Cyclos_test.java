package Cyclos_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Cyclos_PageObjects.Cyclos_LoginPage;

public class Cyclos_test extends Cyclos_BaseClass {
	/*@Test
	public void Cyclos_test() {
		Cyclos_LoginPage cl=new Cyclos_LoginPage(driver);
		cl.setusername(User);
		cl.setpassword(Pword);
		cl.clicksubmitbutton();
		
	}*/
	@Test
	public void LoginTest() throws InterruptedException
	{
		Cyclos_LoginPage login=new Cyclos_LoginPage(driver);
		Thread.sleep(2000);
		login.Login();
		System.out.println("Login is clicked");
		Thread.sleep(2000);
		login.Username(Username);
		System.out.println("Username is entered");
		Thread.sleep(2000);
		login.Password(Password);
		System.out.println("Password is entered");
		Thread.sleep(2000);
		login.Submit();
		System.out.println("Login is successfull");
	}

}
