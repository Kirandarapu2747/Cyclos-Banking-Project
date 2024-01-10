package Cyclos_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cyclos_LoginPage {
	public static WebDriver driver;
	//Constructor creating
	public Cyclos_LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@type='text']")
	WebElement txtusername;
	@FindBy(xpath="//input[@type='password']")
	WebElement txtpassword;
	@FindBy(xpath="//button[@type='button']/span")  
	WebElement txtlogin;
	
	public void setUsername(String user) {
		txtusername.sendKeys(user);
	}
	public void setPassword(String pwd) {
		txtpassword.sendKeys(pwd);
	}
	public void ClickLoginBtn() {
		txtlogin.click();

}
}
