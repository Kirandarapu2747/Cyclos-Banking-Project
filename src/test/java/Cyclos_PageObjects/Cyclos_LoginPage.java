package Cyclos_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cyclos_LoginPage {

public static WebDriver driver;
	
	//create constractor
	
	public Cyclos_LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@autocomplete='username']")
	WebElement txtusername;
	
	@FindBy(xpath="//input[@autocomplete='password']")
	WebElement txtpassword;
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	WebElement btnlogin;
	
	//create corresponding methods
	
	public void setUsername(String uname) {
		txtusername.sendKeys(uname);
		
	}
	
	public void setPassword(String pwrd) {
		txtpassword.sendKeys(pwrd);
	}
	
	public void ClickloginBtn() {
		btnlogin.click();
		
	}
	
	
	
	
	
	
	
}
