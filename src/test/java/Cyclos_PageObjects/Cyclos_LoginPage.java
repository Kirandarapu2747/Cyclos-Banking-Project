package Cyclos_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cyclos_LoginPage {
	
	public WebDriver driver;
	
	public Cyclos_LoginPage() {
		// TODO Auto-generated constructor stub
	}

	public Cyclos_LoginPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}

	public void Cyclos_LoginPage1(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	public void Loginpage(WebDriver driver) {
		
		this.driver= driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id="username")
	WebElement txtusername;
	
	@FindBy(id="password")
	WebElement txtpassword;
	
	@FindBy(id="login")
	WebElement btnLogin;
	
	//create corresponding methods
	
	public void setUsername() {
		txtusername.sendKeys("demo");
	}
	
	public void setPassword() {
		txtpassword.sendKeys("1234");
	}
	
	public void ClickLoginbtn() {
		btnLogin.click();
	}
	

}
