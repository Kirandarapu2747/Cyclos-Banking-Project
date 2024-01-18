package Cyclos_TestCases;

import java.time.Duration;


import org.testng.annotations.Test;

import Cyclos_PageObjects.Cyclos_RegistrationPage;



public class Cyclos_LoginTest1 extends Cyclos_BaseClass1{
	
		 @Test
		   public void logintest() throws InterruptedException {
		       
			 Cyclos_RegistrationPage clp=new Cyclos_RegistrationPage(driver);
		       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		       clp.setRegisterlink();
		       System.out.println("register button is clicked");
		       clp.setNamelink(name);
		       System.out.println("name is entered");
		       clp.setLoginlink(login);
		       System.out.println("login is entered");
		       clp.setEmail(email);
		       System.out.println("email is entered");
		       clp.ClickNext();
		       System.out.println("click next button");
		       clp.setPassword(password);
		       System.out.println("password is emtered");
		       clp.setrepassword(repassword);
		       System.out.println("repassword is entered");
		       clp.setConfirmation();
		       System.out.println("confirmation");
		       clp.setFrame();
		       System.out.println("frame clicked");
		       clp.setVerify();
		       System.out.println("verify");
		       clp.setSubmit();
		       System.out.println("submit button is completed");
		       System.out.println("registration is completed");
	}
}
