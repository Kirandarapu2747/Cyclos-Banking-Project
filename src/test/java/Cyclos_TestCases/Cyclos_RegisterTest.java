package Cyclos_TestCases;

import org.testng.annotations.Test;

import Cyclos_PageObjects.Cyclos_RegisterPage;



public class Cyclos_RegisterTest {
	@Test
	public void RegisterTest() throws InterruptedException
	{
		Cyclos_RegisterPage Register=new Cyclos_RegisterPage(driver);
		Thread.sleep(4000);
		Register.Register();
		System.out.println("Registration is clicked");
		Thread.sleep(8000);
		Register.Name(Name);
		System.out.println("Name is entered");
		Thread.sleep(4000);
		Register.LoginName(LoginName);
		System.out.println("LoginName is entered");
		Thread.sleep(4000);
		Register.Email(Email);
		System.out.println("Email is entered");
		Thread.sleep(4000);
		Register.Next();
		System.out.println("Next is clicked");
		Thread.sleep(4000);
		Register.Password(Password);
		System.out.println("Password is entered");
		Thread.sleep(4000);
		Register.ConfirmPwd(ConfirmPassword);
		System.out.println("ConfirmPassword is entered");
		Thread.sleep(4000);
		Register.CheckBox();
		System.out.println("Checkbox is clicked");
		Register.Frame();
		System.out.println("Entered into the frame");
		Thread.sleep(4000);
		Register.Captcha();
		System.out.println("Captcha is clicked");
		Thread.sleep(4000);
		Register.Submit();
		System.out.println("Submit is clicked");
	}

}
