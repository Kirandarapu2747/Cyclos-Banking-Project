package Cyclos_TestCases;

import org.testng.annotations.Test;

import Cyclos_PageObjects.Cyclos_LoginPage;


public class Testcaselogin extends Login_BaseClass {

	@Test
	public void logintest() throws InterruptedException {
		
		Cyclos_LoginPage lp=new Cyclos_LoginPage(driver);
		
		lp.setUsername(Username);
		Thread.sleep(3000);
		System.out.println("username is entered");
		lp.setPassword(Password);
		Thread.sleep(3000);
		System.out.println("password is entered");
		lp.ClickloginBtn();
		System.out.println("clicked");
		
	}
	
}
