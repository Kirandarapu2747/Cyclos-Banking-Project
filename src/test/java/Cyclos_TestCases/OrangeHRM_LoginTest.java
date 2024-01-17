package Cyclos_TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Cyclos_PageObjects.OrangeHRM_LoginPage;

public class OrangeHRM_LoginTest extends OrangeHRM_BaseClass {
	@Test
	public void LoginTest() throws InterruptedException, IOException
	{
		OrangeHRM_LoginPage login=new OrangeHRM_LoginPage(driver);
		Thread.sleep(2000);
		login.Username(Username);
		Log.info("Username is entered");
		Thread.sleep(2000);
		login.Password(Password);
		Log.info("Password is entered");
		Thread.sleep(2000);
		login.Login();
		Log.info("Login is successfull");
        String exp_result="OrangeHRM123";
		String Act_Result=driver.getTitle();
		if(Act_Result.equals(exp_result)) 
		{
			Assert.assertTrue(true);
			Log.info("Testcase is Passed");
		}
		else 
		{
		    captureScreen(driver,"OrangeHRMLoginScreenshot");
			Log.info("Screenshot is taken");
			Assert.assertTrue(false);
		}
		
	}

}
