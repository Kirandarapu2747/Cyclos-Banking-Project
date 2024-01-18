package Cyclos_TestCases;

import org.testng.annotations.Test;

import Cyclos_PageObjects.Cyclos_Registration;

public class Testcase_Register extends Register_BaseClass {
	@Test
	public void registertest() throws InterruptedException  {
		
		Cyclos_Registration rp=new Cyclos_Registration(driver);
		
		
		rp.setname(name);
		Thread.sleep(3000);
		log.info("name is entered");
		rp.setloginname(loginname);
		Thread.sleep(3000);
		log.info("login name is entered");
		rp.setemail(email)
;
		Thread.sleep(3000);
		log.info("email name is entered");
		rp.ClicknextBtn();
		Thread.sleep(3000);
		rp.setpassword(password);
		Thread.sleep(3000);
		rp.setconfirmpassword(confirmpassword);
		Thread.sleep(3000);
		rp.Clickagreement();
		Thread.sleep(3000);
		rp.EnterFrame();
		rp.Robot();
		rp.ClickSubmit();
				
	}

}
