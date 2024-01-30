package Cyclos_TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Cyclos_PageObjects.Cyclos_LoginPage;
import Cyclos_Utilities.DataDriven_XL;

public class Cyclos_LoginTestClass extends Cyclos_LoginBaseClass
{
	@Test()
	public void LoginTest1() throws InterruptedException, IOException 
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
	Thread.sleep(10000);
	
	String Exp_Result="Dashboard - Cyclos";
	String Act_Result=driver.getTitle();
	
	if(Act_Result.equals(Exp_Result))
	{
		Assert.assertTrue(true);
		log.info("Test case passed");
	}
	else
	{
		log.info("Test case is failed");
		CaptureScreen(driver,"LoginTest1");
		log.info("Screenshot is taken");
		Assert.assertTrue(false);
	}
	}
	
	
}
