package Cyclos_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_LoginPage {
	public static WebDriver driver;
	public OrangeHRM_LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")
	WebElement username;
	@FindBy(name="password")
	WebElement password;
	@FindBy(xpath="//button[@type='submit']")
	WebElement login;
	public void Username(String Username)
	{
		username.sendKeys(Username);
	}
    public void Password(String Password)
    {
    	password.sendKeys(Password);
    }
    public void Login()
    {
    	login.click();
    }
}
