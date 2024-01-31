package Cyclos_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cyclos_PayUser 
{
	public static WebDriver driver;
	public Cyclos_PayUser(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="(//div[@class='quick-access-icon'])[1]")
	WebElement payuser ;
	@FindBy(xpath="(//button[@type='button'])[3]")
	WebElement to_user ;
	@FindBy(xpath="//div[@class='modal-content']//div/div[2]/a")
	WebElement select_user ;
	@FindBy(xpath="//input[@type='tel']")
	WebElement amount ;
	@FindBy(xpath="//div[@class='w-100']")
	WebElement scheduling;
	@FindBy(xpath="//div[@role='listbox']//a[1]")
	WebElement scheduling_method;
	@FindBy(xpath="//textarea[@rows='3']")
	WebElement  description;
	@FindBy(xpath="(//button[@type='button'])[4]")
	WebElement next;
	@FindBy(xpath="(//button[@type='button'])[2]//span")
	WebElement confirm ;
	@FindBy(xpath="(//button[@type='button'])[3]//div")
	WebElement print;

	public void clickpayuser()
	{
		payuser.click();
	}
	public void clickto_user()
	{
		to_user.click();
	}
	public void clickselect_user()
	{
		select_user.click();
	}
	public void setamount()
	{
		amount.sendKeys("2");
	}
	public void clickscheduling()
	{
		scheduling.click();
	}
	public void clickscheduling_method()
	{
		scheduling_method.click();
	}
	public void enterdescription()
	{
		description.sendKeys("I'm choosing Ann's cafe with payment of amount 2,00 and Scheduled the Pay now Payment method");
	}
	public void clicknext()
	{
		next.click();
	}
	public void clickconfirm()
	{
		confirm.click();
	}
	public void clickprint()
	{
		print.click();
	}
	
}
