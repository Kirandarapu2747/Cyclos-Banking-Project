package Cyclos_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cyclos_Registerpage {

	
public static WebDriver driver;
	
	//create constractor
	
	public Cyclos_Registerpage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement txtname;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement txtloginname;
	
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement txtemail;
	
	@FindBy(xpath="(//button[@type='button'])[9]")
	WebElement btnnext;
	

	//create corresponding methods
	
	public void setname(String nam) {
		txtname.sendKeys(nam);
		
	}
	
	public void setloginname(String lgnm) {
		txtloginname.sendKeys(lgnm);
	}
	
	public void setemail(String email) {
		txtemail.sendKeys(email);
	}
	
	
	public void ClicknextBtn() {
		btnnext.click();
		
	}
	
	
	
	
	
}
