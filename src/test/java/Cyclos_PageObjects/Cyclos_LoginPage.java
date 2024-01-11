package Cyclos_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cyclos_LoginPage {
	public static WebDriver driver;
	public Cyclos_LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//div[@class='ml-2'])[3]")
	WebElement clickonlogin;
	@FindBy(xpath="(//input[@class='form-control ng-pristine ng-valid ng-touched'])[1]")
	WebElement txtusername;
	@FindBy(xpath="//input[@type='password']")
    WebElement txtpassword;
	@FindBy(xpath="//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary btn-action-primary']")
	WebElement clickonsubmit;
	
	public void ClickonLogin() {
		clickonlogin.click();
	}
	public void Username(String uname) {
		txtusername.sendKeys(uname);
	}
	public void Password(String pwrd) {
		txtpassword.sendKeys(pwrd);
	}
	public void Submit() {
		clickonsubmit.click();
	}
	
	
	
}

