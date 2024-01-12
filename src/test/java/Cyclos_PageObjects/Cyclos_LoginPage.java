package Cyclos_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cyclos_LoginPage {
	WebDriver d;
	public Cyclos_LoginPage(WebDriver d)
	{
		this.d=d;
		PageFactory.initElements(d, this);
	}
	@FindBy(xpath="//input[@placeholder='User']")
	WebElement username;
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement password;
	@FindBy(xpath="//span[text()='Submit']")
	WebElement button;
   @FindBy(xpath="//a[@id='forgotPasswordLink']")
   WebElement forgetpwd;
   @FindBy(xpath="//a[@id='registerLink']")
   WebElement reglink;
   public void setUsername(String name)
   {
	   username.sendKeys(name); 
   }
   public void setPassword(String pwd)
   {
	   password.sendKeys(pwd); 
   }
   public void clickLogin()
   {
	   button.click();
   }
}
