package Cyclos_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cyclos_RegisterPage {
	public static WebDriver driver;
	public Cyclos_RegisterPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="register-link")
	WebElement register;
	@FindBy(xpath="//input-field[@formcontrolname='name']/label-value/div/div/input")
	WebElement name;
	@FindBy(xpath="//input-field[@formcontrolname='username']/label-value/div/div/input")
	WebElement login_name;
	@FindBy(xpath="//input-field[@formcontrolname='email']/input")
	WebElement email;
	@FindBy(xpath="//span[text()='Next']")
	WebElement next;
	@FindBy(xpath="//input-field[@formcontrolname='value']/label-value/div/div/input")
	WebElement password;
	@FindBy(xpath="//input-field[@formcontrolname='confirmationValue']/label-value/div/div/input")
	WebElement cpwd;
	@FindBy(xpath="//label[@class='custom-control-label']")
	WebElement checkbox;
	@FindBy(xpath="//iframe[@name='a-yw7zacrla8ho']")
	WebElement frame;
	@FindBy(xpath="//div[@class='recaptcha-checkbox-border']")
	WebElement captcha;
	@FindBy(xpath="//span[text()='Submit']")
	WebElement submit;
	public void Register()
	{
		register.click();
	}
	public void Name(String Name)
	{
		name.sendKeys(Name);
	}
	public void LoginName(String LoginName)
	{
		login_name.sendKeys(LoginName);
	}
	public void Email(String Email)
	{
		email.sendKeys(Email);
	}
	public void Next()
	{
		next.click();
	}
	public void Password(String Password)
	{
		password.sendKeys(Password);
	}
	public void ConfirmPwd(String ConfirmPassword)
	{
		cpwd.sendKeys(ConfirmPassword);
	}
	public void CheckBox()
	{
		checkbox.click();
	}
	public void Frame()
	{
	   driver.switchTo().frame(0);
	}
	public void Captcha() throws InterruptedException
	{
		captcha.click();
		
		driver.switchTo().defaultContent();
	}
	public void Submit()
	{
		submit.click();
	}

}
