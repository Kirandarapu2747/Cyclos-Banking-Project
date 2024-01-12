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
	
	@FindBy(id="id_16")
	WebElement txtname;
	
	@FindBy(id="id_17")
	WebElement txtloginname;
	
	@FindBy(id="id_18")
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
