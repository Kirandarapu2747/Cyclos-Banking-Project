package Cyclos_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {
	public static WebDriver driver;
	//Constructor creating
	public Registration(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy(xpath="//a[@id='login-link']")
	//WebElement txtlogin;
	@FindBy(xpath="//a[@id='register-link']/div")
	WebElement txtnewregister;
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement txtname;
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement txtloginname;
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement txtemail;
	@FindBy(xpath="//span[text()='Next']")
	WebElement txtnext;
	@FindBy(xpath="(//input[@type='password'])[1]")
	WebElement txtpassword;
	@FindBy(xpath="(//input[@type='password'])[2]")
	WebElement txtconformpassword;
	@FindBy(xpath="//label[@class='custom-control-label']")
	WebElement txtcheckbox;
	@FindBy(xpath="//iframe[@title='reCAPTCHA']")
	WebElement iframe;
	@FindBy(xpath="//div[@class='recaptcha-checkbox-border']")
	WebElement robot;
	@FindBy(xpath="(//button[@type='button'])[2]")
	WebElement submit;
	

	//public void ClickLogin() throws InterruptedException {
		//Thread.sleep(2000);
		//txtlogin.click();
	//}
	public void NewUserRegister() {
		txtnewregister.click();
	}
	public void setName(String name) {
		txtname.sendKeys(name);
	}
	public void setLoinName(String loginname) {
		txtloginname.sendKeys(loginname);
	}
	public void setEMail(String email) {
		txtemail.sendKeys(email);
	}
	public void ClickNext() {
		txtnext.click();
		
	}
	public void Password(String Password) {
		txtpassword.sendKeys( Password);
	}
	public void ConformPassword(String ConformPassword) {
		txtconformpassword.sendKeys(ConformPassword);
	}
	public void Checkbox() {
		txtcheckbox.click();
		
	
	}
	public void EnterFrame()
	{
		driver.switchTo().frame(0);
	}
	public void Robot()
	{
		
		robot.click();
		driver.switchTo().defaultContent();
	}
	public void ClickSubmit()
	{
		submit.click();
	}
	
	
		// TODO Auto-generated method stub
		
	}
	


