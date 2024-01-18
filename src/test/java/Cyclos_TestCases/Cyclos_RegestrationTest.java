package Cyclos_TestCases;

import org.testng.annotations.Test;

import Cyclos_PageObjects.Cyclos_RegistrationPage;

public class Cyclos_RegestrationTest extends Cyclos_Reg_Baseclass {
	@Test
	public void RegistrationTest() throws InterruptedException {
		Cyclos_RegistrationPage crp=new Cyclos_RegistrationPage(driver);
		crp.Clickregister();
		log.info("Registration is clicked");
		crp.Username(Name);
		log.info("Name is Entered");
		Thread.sleep(2000);
		crp.Loginname(Loginname);
		log.info("LoginName is Entered");
		Thread.sleep(2000);
		crp.Email(E_mail);
		log.info("E-mail is Entered");
		Thread.sleep(2000);
		crp.Website(Website);
		log.info("Website is Entered");
		Thread.sleep(2000);
		crp.Gender();
		log.info("Gender radio button is clicked");
		Thread.sleep(2000);
		crp.Businesstype();
		log.info("Businesstype dropdown is Selected");
		Thread.sleep(2000);
		/*crp.getmobileno(Mobilephone);
		Thread.sleep(2000);
		crp.Landline(Land_linephone);
		Thread.sleep(2000);*/
		crp.Nextbtn();
		log.info("Next button is clicked");
		Thread.sleep(2000);
		crp.getPassword(Password);
		log.info("password is Entered");
		Thread.sleep(2000);
		crp.getconfirmpassword(Passwordconfirmation);
		log.info("confirmpassword is Entered");
		Thread.sleep(2000);
		crp.Checkbox();
		log.info("Checkbox is clicked");
		Thread.sleep(2000);
		crp.Enteringframe();
		log.info("Entered in the Farme");
		Thread.sleep(2000);
		crp.Robot();
		log.info("Robot checkbox is clicked");
		Thread.sleep(2000);
		crp.Exitframe();
		log.info("Exited from the Farme");
		Thread.sleep(2000);
		crp.Submitbtn();
		log.info("Submit button is clicked");
			
	}

}
