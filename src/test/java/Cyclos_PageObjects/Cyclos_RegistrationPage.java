package Cyclos_PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cyclos_RegistrationPage {
	public static WebDriver driver;
	  
	   public Cyclos_RegistrationPage( WebDriver driver) {
	       this.driver=driver;
	       PageFactory.initElements(driver, this);
	       
	       
	   }
	   @FindBy(id="register-link")
	   WebElement btnregister;
	   @FindBy(xpath="//input-field[@formcontrolname='name']/label-value/div/div/input")
	   WebElement txtname;
	   @FindBy(xpath="//input-field[@formcontrolname='username']/label-value/div/div/input")
	   WebElement txtlogin;
	   @FindBy(xpath="//input-field[@formcontrolname='email']/input")
	   WebElement txtemail;
	   @FindBy(xpath="//span[text()='Next']")
	   WebElement txtnext;
	   @FindBy(xpath="//input-field[@formcontrolname='value']/label-value/div/div/input")
	   WebElement txtpassword;
	   @FindBy(xpath="//input-field[@formcontrolname='confirmationValue']/label-value/div/div/input")
	   WebElement txtrepassword;
	   @FindBy(xpath="//label[@class='custom-control-label']")
	   WebElement txtconfirmation;
	   @FindBy(xpath="//iframe[@name='a-yw7zacrla8ho']")
	   WebElement frame;
	   @FindBy(xpath="//div[@class='recaptcha-checkbox-border']")
	   
	   WebElement txtverify;
	   @FindBy(xpath="//span[text()='Submit']")
	   WebElement txtsubmit;
	   
	   public void setRegisterlink() throws InterruptedException {
		   Thread.sleep(2000);
		   btnregister.click();
		   
	   }
	   public void setNamelink(String name) throws InterruptedException{
		   Thread.sleep(2000);
	   txtname.sendKeys(name);
	   }
	   public void setLoginlink(String login) throws InterruptedException {
		   Thread.sleep(2000);
		   txtlogin.sendKeys(login);
	   }
	   public void setEmail(String email) throws InterruptedException {
		   Thread.sleep(2000);
		   txtemail.sendKeys(email);
	   }
	   public void ClickNext() throws InterruptedException {
		   Thread.sleep(2000);
		   txtnext.click();
	   }
	   public void setPassword(String password) throws InterruptedException {
		   Thread.sleep(2000);
		   txtpassword.sendKeys(password);
	   }
	   public void setrepassword(String repassword) throws InterruptedException {
		   Thread.sleep(2000);
		   txtrepassword.sendKeys(repassword);
	   }
	   public void setConfirmation() throws InterruptedException{
		   Thread.sleep(2000);
		    txtconfirmation.click();
	   }
	   public void setFrame() {
	  driver.switchTo().frame(0);
		    }
	 
	   public void setVerify() throws InterruptedException   {
		   Thread.sleep(6000);
		  
		   	 txtverify.click();
		   	 driver.switchTo().defaultContent();
		   	 
		 }
	   
	   public void setSubmit() throws InterruptedException  {
		   Thread.sleep(2000);
		  
		   txtsubmit.click();
		   Thread.sleep(3000);
	   }
}
