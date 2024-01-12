package Cyclos_TestCases;

import org.testng.annotations.Test;

import Cyclos_PageObjects.Cyclos_Registerpage;


public class Testcase_Register extends Register_BaseClass {


	@Test
	public void registertest() throws InterruptedException  {
		
		Cyclos_Registerpage rp=new Cyclos_Registerpage(driver);
		
		
		rp.setname(name);
		Thread.sleep(3000);
		log.info("name is entered");
		rp.setloginname(loginname);
		Thread.sleep(3000);
		log.info("login name is entered");
		rp.setemail(email);
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
