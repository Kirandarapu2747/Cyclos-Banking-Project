package Cyclos_PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cyclos_RegistrationPage {
	
	public static WebDriver driver;
	public Cyclos_RegistrationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath="(//div[@class='ml-2'])[2]")
	WebElement clickregister;
	@FindBy(id="id_1")
	WebElement txtname;
	@FindBy(id="id_2")
	WebElement txtloginname;
	@FindBy(id="id_3")
	WebElement txtemailid;
	@FindBy(id="website")
	WebElement txtwebsite;
	@FindBy(xpath="//div[@class='w-100']/button")
	WebElement businesstype;
	@FindBy(id="id_4")
	WebElement mobilephone;
	@FindBy(id="id_5")
	WebElement Landline;
	@FindBy(xpath="//button[@class='btn d-flex justify-content-center align-items-center w-100 h-100 btn-primary']")
	WebElement btnnext;
	@FindBy(xpath="(//input[@type='password'])[1]")
	WebElement password;
	@FindBy(xpath="(//input[@type='password'])[2]")
	WebElement confirmpassword;
	@FindBy(xpath="//div[@class='d-flex mb-2']//div//div//label")
	WebElement checkbox;
	@FindBy(xpath="//div[@class='mt-3']//iframe[1]")
	WebElement Frame;
	@FindBy(xpath="//div[@class='recaptcha-checkbox-border']")
	WebElement checkboxrobot;
	@FindBy(xpath="(//button[@type='button'])[2]")
	WebElement btnsubmit;
	
	public void Clickregister() {
		clickregister.click();;
	}
	public void Username(String name) {
		txtname.sendKeys(name);
	}
	public void Loginname(String Lname) {
		txtloginname.sendKeys(Lname);
	}
	public void Email(String email) {
		txtemailid.sendKeys(email);	
	}
	public void Website(String website) {
		txtwebsite.sendKeys(website);
	}
	public void Gender() {
		List<WebElement> all=driver.findElements(By.xpath("//div[@class='w-100 d-flex flex-wrap align-items-center']/div"));
	    for(int i=0;i<all.size();i++) {
	    	String value=all.get(i).getText();
	    	if(value.equals("Male")) {
	    		all.get(i).click();
	    	}
	    }
	}
	public void Businesstype() {
		businesstype.click();
		List<WebElement> all1=driver.findElements(By.xpath("(//label-value[@class='label-on-side size-full label-value any-label-value field']//div)[5]/a"));
		for(int j=0;j<all1.size();j++) {
			String values=all1.get(j).getText();
			if(values.equals("Technical")) {
				all1.get(j).click();
			}
		}
	}
	public void getmobileno(String mobileno) {
		mobilephone.sendKeys(mobileno);
	}
	public void Landline(String landlineno) {
		Landline.sendKeys(landlineno);
	}
	public void Nextbtn() {
		btnnext.click();
	}
	public void getPassword(String pword) {
		password.sendKeys(pword);
	}
	public void getconfirmpassword(String confirmpword) {
		confirmpassword.sendKeys(confirmpword);
	}
	public void Checkbox() {
		checkbox.click();
	}
	public void Enteringframe() {
		driver.switchTo().frame(0);
	}
	public void Robot() {
		checkboxrobot.click();
	}
	public void Exitframe() {
		driver.switchTo().defaultContent();
	}
	public void Submitbtn() {
		JavascriptExecutor jse= (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", btnsubmit);
		
	}
	
}
