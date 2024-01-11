package Cyclos_TestCases;

import org.testng.annotations.Test;

import Cyclos_PageObjects.Cyclos_LoginPage;

public class Cyclos_TestCase extends Cyclos_BaseClass{
	@Test()
	public void LoginTest() throws InterruptedException {
	Cyclos_LoginPage lp=new Cyclos_LoginPage(driver);
	Thread.sleep(2000);
	lp.setUsername(User);
	System.out.println("Username Entered");
	Thread.sleep(2000);
	lp.setPassword(Pword);
	System.out.println("Password Entered");
	lp.ClickLoginBtn();
	System.out.println("Login clicked");

}
}
