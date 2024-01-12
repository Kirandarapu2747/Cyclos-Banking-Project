package Cyclos_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Cyclos_PageObjects.Cyclos_LoginPage;





public class Cyclos_LoginTest extends Cyclos_BaseClass{
	 @Test
	   public void logintest() throws InterruptedException {
	       
		 Cyclos_LoginPage clp=new Cyclos_LoginPage(driver);
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       clp.setClickLoginBtn();
	       System.out.println("login button is clicked");
	       clp.setUsername(username);
	       System.out.println("username is entered");
	       clp.setPassword(password);
	       System.out.println("password is entered");
	       clp.ClickSumit();
	       System.out.println("submit button is completed");
	       
}
}