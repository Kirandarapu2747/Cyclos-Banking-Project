package Cyclos_TestCases;

import org.testng.annotations.Test;

import Cyclos_PageObjects.Cyclos_RegisterPage;
import jdk.internal.org.jline.utils.Log;

public class Cyclos_RegisterTest extends Cyclos_RegisterBaseClass{
	@Test
	public void RegisterTest() throws InterruptedException
	{
		Cyclos_RegisterPage Register=new Cyclos_RegisterPage(driver);
		Thread.sleep(4000);
		Register.Register();
		Log.info("Registration is clicked");
		Thread.sleep(8000);
		Register.Name(Name);
		Log.info("Name is entered");
		Thread.sleep(4000);
		Register.LoginName(LoginName);
		Log.info("LoginName is entered");
		Thread.sleep(4000);
		Register.Email(Email);
		Log.info("Email is entered");
		Thread.sleep(4000);
		Register.Next();
		Log.info("Next is clicked");
		Thread.sleep(4000);
		Register.Password(Password);
		Log.info("Password is entered");
		Thread.sleep(4000);
		Register.ConfirmPwd(ConfirmPassword);
		Log.info("Confirm Password is entered");
		Thread.sleep(4000);
		Register.CheckBox();
		Log.info("Checkbox is clicked");
		Register.Frame();
		Log.info("Entered into the frame");
		Thread.sleep(4000);
		Register.Captcha();
		Log.info("Captcha is clicked");
		Thread.sleep(4000);
		Register.Submit();
		Log.info("Submit is clicked");
	}

}
