package Cyclos_TestCases;

import org.testng.annotations.Test;

import Cyclos_PageObjects.Cyclos_Registerpage;


public class Testcase_Register extends Register_BaseClass {


	@Test
	public void registertest() throws InterruptedException  {
		
		Cyclos_Registerpage rp=new Cyclos_Registerpage(driver);
		
		
		rp.setname(name);
		Thread.sleep(3000);
		rp.setloginname(loginname);
		Thread.sleep(3000);
		rp.setemail(email);
		Thread.sleep(3000);
		rp.ClicknextBtn();
		
		
		
	}
	
	
}
