package Cyclos_PageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cyclos_RegistrationPage 
{
	public static WebDriver driver;
	public Cyclos_RegistrationPage (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//a[@id='register-link']/div")
	WebElement Reg;
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement Name;
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement LoginName;
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement Email;
	@FindBy(xpath="(//button[@type='button'])[9]")
	WebElement Next;
	@FindBy(xpath="(//input[@type='password'])[1]")
	WebElement pword;
	@FindBy(xpath="(//input[@type='password'])[2]")
	WebElement cpword;
	@FindBy(xpath="//label[@class='custom-control-label']")
	WebElement agreement;
	@FindBy(xpath="//iframe[@title='reCAPTCHA']")
	WebElement frame;
	@FindBy(xpath="//div[@class='recaptcha-checkbox-border']")
	WebElement robot;
	@FindBy(xpath="(//button[@type='button'])[2]")
	WebElement submit;
	
	public void ClickRegister()
	{
		Reg.click();
	}
	public void Name(String name)
	{
		Name.sendKeys(name);
	}
	public void LoginName(String lname)
	{
		LoginName.sendKeys(lname);
	}
	public void Email(String email)
	{
		Email.sendKeys(email);
	}
	public void ClickNext()
	{
		Next.click();
	}
	public void Password(String pwd)
	{
		pword.sendKeys(pwd);
	}
	public void ConfirmPassword(String cpwd)
	{
		cpword.sendKeys(cpwd);
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
