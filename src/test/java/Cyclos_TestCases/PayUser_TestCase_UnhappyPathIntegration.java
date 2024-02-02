package Cyclos_TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Cyclos_PageObjects.Cyclos_LoginPage;
import Cyclos_PageObjects.Cyclos_PayUser;

public class PayUser_TestCase_UnhappyPathIntegration extends Cyclos_LoginBaseClass
{
	@Test()
	public void PayUser() throws InterruptedException, IOException
	{
		Cyclos_LoginPage  clp=new Cyclos_LoginPage (driver);
		Thread.sleep(2000);
		
		clp.setUsername(User);
		log.info("UserName Entered");
		Thread.sleep(2000);
		clp.setPassword(Pword);
	    log.info("Password Entered");
		Thread.sleep(2000);
		clp.ClickLogin();
		log.info("Login clicked");
		Thread.sleep(10000);
		
		String Exp_Result="Dashboard - Cyclos";
		String Act_Result=driver.getTitle();
		
		if(Act_Result.equals(Exp_Result))
		{
			
			log.info("Application Navigated to Dashboard page");
		}
		else
		{
			log.info("Application not Navigated to Dashboard page");
			CaptureScreen(driver,"PayUser");
			log.info("Screenshot is taken");
		}
		
		Cyclos_PayUser cpu=new Cyclos_PayUser(driver);
		Thread.sleep(2000);
		
		cpu.clickpayuser();
		log.info("Pay User is Clicked");
		Thread.sleep(6000);
		cpu.clickto_user();
		log.info("to_user pick from contact list is clicked");
		Thread.sleep(6000);
		cpu.clickselect_user();
		log.info("user is selected");
		Thread.sleep(6000);
		cpu.setamount();
		log.info("Amount is entered");
	    Thread.sleep(2000);
	    cpu.clickscheduling();
	    log.info("Scheduling is clicked");
		Thread.sleep(2000);
		cpu.clickscheduling_method1();
		log.info("Scheduled scheduling method is selected");
		Thread.sleep(6000);
		cpu.setdate();
		log.info("date is selected");
		Thread.sleep(6000);
		cpu.enterdescription();
		log.info("Description is entered");
		Thread.sleep(2000);
		cpu.clicknext();
		log.info("Next is Clicked");
		Thread.sleep(5000);
		cpu.clickprevious();
		log.info("previous is Clicked");
		Thread.sleep(5000);
		cpu.setamount1();
		log.info("Amount is changed");
	    Thread.sleep(2000);
	    cpu.clicknext1();
	    log.info("Next is Clicked");
		Thread.sleep(5000);
		cpu.clickconfirm();
		log.info("confirm is Clicked");
		Thread.sleep(5000);
		cpu.clickprint();
		log.info("Print is Clicked");
	    Thread.sleep(5000);	
	}
}
