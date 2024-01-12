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


 Naveen

Bhavana

public class Cyclos_LoginPage 
{
	public static WebDriver rdriver;
	public Cyclos_LoginPage(WebDriver ldriver) 
	{
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
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

 varalasrijitha
 master

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
 master


 Naveen
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
	
	
	
	
	
	
	

public class Cyclos_LoginPage {
	public static WebDriver driver;
PrabhavathiMallepally
	public Cyclos_LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="login-link")
	WebElement login;
	@FindBy(xpath="//input[@type='text']")
	WebElement username;
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	@FindBy(xpath="//span[text()='Submit']")
	WebElement submit;
	public void Login()
	{
		login.click();
	}
	public void Username(String Username)
	{
		username.sendKeys(Username);
	}
	public void Password(String Password)
	{
		password.sendKeys(Password);
	}
	public void Submit()
	{
		submit.click();
	}

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
master

}
 master
}
 master

