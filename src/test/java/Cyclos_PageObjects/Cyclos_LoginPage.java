package Cyclos_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	   
	   public void setClickLoginBtn()  {
		 
		   btnLogin.click();
	   }
	   
	   public void setUsername(String username)  {
		
	       
	       txtusername.sendKeys(username);
	   }
	   
	   public void setPassword(String password)  {
		 
	       txtpassword.sendKeys(password);
	   }
	   
	   public void ClickSumit()  {

	       btnSubmit.click();
	   }
	   
	
}