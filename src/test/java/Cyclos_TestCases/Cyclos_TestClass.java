package Cyclos_TestCases;

import org.testng.annotations.Test;

import Cyclos_PageObjects.Cyclos_LoginPage;

public class Cyclos_TestClass extends Cyclos_BaseClass
{
	@Test()
	public void LoginTest() throws InterruptedException 
	{
	Cyclos_LoginPage  clp=new Cyclos_LoginPage (driver);
	Thread.sleep(2000);
	clp.setUsername(User);
	log.info("UserName Entered");
	Thread.sleep(2000);
	clp.setPassword(Pword);
    log.info("Password Entered");
	Thread.sleep(2000);
	clp.ClickLogin();
	log.info("Login clicked");
	Thread.sleep(2000);
	}

}
