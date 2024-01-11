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
	@FindBy(xpath="//div[text()=' Login ']")
	WebElement txtlogin;
	@FindBy(xpath="//a[@id='registerLink']")
	WebElement txtnewregister;
	@FindBy(xpath="//input[@id='id_10']")
	WebElement txtname;
	@FindBy(xpath="//input[@id='id_11']")
	WebElement txtloginname;
	@FindBy(xpath="//input[@id='id_12']")
	WebElement txtemail;
	@FindBy(xpath="//span[text()='Next']")
	WebElement txtnext;
	public void ClickLogin() {
		txtlogin.click();
	}
	public void NewUserRegister() {
		txtnewregister.click();
	}
	public void setName(String name) {
		txtname.sendKeys(name);
	}
	public void setLoinName(String loginname) {
		txtname.sendKeys(loginname);
	}
	public void setEMail(String email) {
		txtname.sendKeys(email);
	}
	public void ClickNext() {
		txtnext.click();
		
	}
	

}
