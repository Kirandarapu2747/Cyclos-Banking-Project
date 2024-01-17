package Cyclos_TestCases;

import org.testng.annotations.Test;

import Cyclos_PageObjects.Cyclos_LoginPage;
import jdk.internal.org.jline.utils.Log;

public class Cyclos_TestCase extends Cyclos_BaseClass{
	@Test()
	public void LoginTest() throws InterruptedException {
	Cyclos_LoginPage lp=new Cyclos_LoginPage(driver);
	Thread.sleep(2000);
	lp.setUsername(User);
	log.info("Username Entered");
	Thread.sleep(2000);
	lp.setPassword(Pword);
	log.info("Password Entered");
	lp.ClickLoginBtn();
	log.info("Login clicked");

}
}
