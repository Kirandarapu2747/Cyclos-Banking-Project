package Cyclos_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 varalasrijitha

public class Cyclos_LoginPage {
	public static WebDriver driver;
	  
	   public Cyclos_LoginPage( WebDriver driver) {
	       this.driver=driver;
	       PageFactory.initElements(driver, this);
	       
	       
	   }
	   
	  @FindBy(id="login-link")
	  WebElement btnLogin;
	  
	   @FindBy(xpath="//input[@type='text']")
	   WebElement txtusername;
	   
	   @FindBy(xpath="//input[@type='password']")
	   WebElement txtpassword;
	   
	   @FindBy(xpath="//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary btn-action-primary'] ")
	   WebElement btnSubmit;
	   
	   public void setClickLoginBtn() throws InterruptedException {
		   Thread.sleep(2000);
		   btnLogin.click();
	   }
	   
	   public void setUsername(String username) throws InterruptedException {
		   Thread.sleep(2000);
	       
	       txtusername.sendKeys(username);
	   }
	   
	   public void setPassword(String password) throws InterruptedException {
		   Thread.sleep(2000);
	       txtpassword.sendKeys(password);
	   }
	   
	   public void ClickSumit() throws InterruptedException {
		   Thread.sleep(2000);
	       btnSubmit.click();
	   }
	
}


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
 master
