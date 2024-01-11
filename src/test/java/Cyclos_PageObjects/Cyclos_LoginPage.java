package Cyclos_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cyclos_LoginPage 
{
	public static WebDriver driver;
	public Cyclos_LoginPage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='text']")
	WebElement username;
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	@FindBy(xpath="//button[@type='button']/span")  
	WebElement login;
	
	public void setUsername(String user)
	{
		username.sendKeys(user);
	}
	public void setPassword(String pwd) 
	{
		password.sendKeys(pwd);
	}
	public void ClickLogin() 
	{
		login.click();
	}

}
