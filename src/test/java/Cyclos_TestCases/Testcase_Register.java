package Cyclos_TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Cyclos_PageObjects.Cyclos_Registerpage;
import junit.framework.Assert;


public class Testcase_Register extends Register_BaseClass {


	@Test
	public void registertest() throws InterruptedException, IOException  {
		
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
		
		String exp_res="Registration successful - Cyclos123";
		String Act_res=driver.getTitle();
		
		if(Act_res.equals(exp_res)) {
			
			Assert.assertTrue(true);
			log.info("test case passed");
		}
		else {
			
			captureScreen(driver,"registertest");
			log.info("screenshot is taken");
			Assert.assertTrue(false);
		}
			
			
				
	}
	
	
}
