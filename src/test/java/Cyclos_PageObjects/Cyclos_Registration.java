package Cyclos_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cyclos_Registration {
public static WebDriver driver;
	
	//create constractor
	
	public Cyclos_Registration(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement txtname;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement txtloginname;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement txtemail;
	
	@FindBy(xpath="(//button[@type='button'])[9]")
	WebElement btnnext;
	
	@FindBy(xpath="(//input[@type='password'])[1]")
	WebElement txtpassword;

	@FindBy(xpath="(//input[@type='password'])[2]")
	WebElement txtconfirmpassword;
	
	@FindBy(xpath="//label[@class='custom-control-label']")
	WebElement agreement;
	
	@FindBy(xpath="//iframe[@title='reCAPTCHA']")
	WebElement frame;
	
	@FindBy(xpath="//div[@class='recaptcha-checkbox-border']")
	WebElement robot;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	WebElement submit;
	
	
	//create corresponding methods
	
	public void setname(String nam) {
		txtname.sendKeys(nam);
		
	}
	
	public void setloginname(String lgnm) {
		txtloginname.sendKeys(lgnm);
	}
	
	public void setemail(String email) {
		txtemail.sendKeys(email)
;
	}
	
	
	public void ClicknextBtn() {
		btnnext.click();
		
	}
	
	public void setpassword(String pswrd) {
		txtpassword.sendKeys(pswrd);
		
	}
	
	public void setconfirmpassword(String cpswrd) {
		txtconfirmpassword.sendKeys(cpswrd);
		
	}
	
	public void Clickagreement()
	{
		agreement.click();
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
	
	
	

}
