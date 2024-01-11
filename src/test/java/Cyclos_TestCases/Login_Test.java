package Cyclos_TestCases;

import org.testng.annotations.Test;

import Cyclos_PageObjects.Cyclos_LoginPage;

public class Login_Test extends Cyclos_BaseClass{
	@Test
	public void LoginTest() throws InterruptedException {
	Cyclos_LoginPage lp=new Cyclos_LoginPage(driver);
	lp.ClickonLogin();
	Thread.sleep(2000);
	lp.Username(username);
	Thread.sleep(2000);
	lp.Password(password);
	Thread.sleep(2000);
	lp.Submit();
	
	}
	
}
