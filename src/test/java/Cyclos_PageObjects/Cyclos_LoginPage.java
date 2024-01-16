package Cyclos_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cyclos_LoginPage {
	public static WebDriver driver;
	public Cyclos_LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="login-link")
	WebElement login;
	@FindBy(xpath="//input[@type='text']")
	WebElement username;
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	@FindBy(xpath="//span[text()='Submit']")
	WebElement submit;
	public void Login()
	{
		login.click();
	}
	public void Username(String Username)
	{
		username.sendKeys(Username);
	}
	public void Password(String Password)
	{
		password.sendKeys(Password);
	}
	public void Submit()
	{
		submit.click();
	}
	

	
}
