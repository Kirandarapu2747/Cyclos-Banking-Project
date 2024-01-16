package Cyclos_TestCases;

import org.testng.annotations.Test;

import Cyclos_PageObjects.Cyclos_LoginPage;

public class Cyclos_TestCase extends Cyclos_BaseClass{
	@Test()
	public void LoginTest() throws InterruptedException {
	Cyclos_LoginPage lp=new Cyclos_LoginPage(driver);
	Thread.sleep(2000);
	lp.Username(Username);
	System.out.println("Username Entered");
	Thread.sleep(2000);
	lp.Password(Password);
	System.out.println("Password Entered");
	lp.Submit();
	System.out.println("Login clicked");

}
}
