package Cyclos_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Cyclos_PageObjects.Cyclos_LoginPage;
import jdk.internal.org.jline.utils.Log;





public class Cyclos_LoginTest extends Cyclos_BaseClass{
	 @Test
	   public void logintest() throws InterruptedException {
	       
		 Cyclos_LoginPage clp=new Cyclos_LoginPage(driver);
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       clp.setClickLoginBtn();
	       log.info("click button is completed");
	       Thread.sleep(2000);
	       clp.setUsername(username);
	        log.info("username is entered");
	       Thread.sleep(4000);
	       clp.setPassword(password);
	       Thread.sleep(4000);
	       log.info("password is entered");
	       clp.ClickSumit();
	       log.info("submit button is clicked");
	       
}
}