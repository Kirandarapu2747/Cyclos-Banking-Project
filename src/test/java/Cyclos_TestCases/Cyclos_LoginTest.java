package Cyclos_TestCases;

import org.testng.annotations.Test;

import Cyclos_PageObjects.Cyclos_LoginPage;

public class Cyclos_LoginTest  extends Cyclos_BaseClass{
	
	@Test()
	public void LoginTest() throws InterruptedException {
	Cyclos_LoginPage lp= new Cyclos_LoginPage();
		Thread.sleep(3000);
		lp.setUsername();
        System.out.println("Username Entered");
        Thread.sleep(3000);
        lp.setPassword();
        System.out.println("Password Entered");
        lp.ClickLoginbtn();
        System.out.println("Login clicked");
        
        
}

}