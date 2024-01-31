package Cyclos_TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Cyclos_PageObjects.Cyclos_LoginPage;

public class PayUser_TestCase_Unhappypath extends Cyclos_LoginBaseClass
{
	@Test()
	public void PayUser() throws InterruptedException, IOException
	{
		Cyclos_LoginPage  clp=new Cyclos_LoginPage (driver);
		Thread.sleep(2000);
		clp.setUsername(User);
		log.info("UserName Entered");
		Thread.sleep(2000);
		clp.setPassword(Pword);
	    log.info("Password Entered");
		Thread.sleep(2000);
		clp.ClickLogin();
		log.info("Login clicked");
		Thread.sleep(10000);
		
		String Exp_Result="Dashboard - Cyclos";
		String Act_Result=driver.getTitle();
		
		if(Act_Result.equals(Exp_Result))
		{
			
			log.info("Application Navigated to Dashboard page");
		}
		else
		{
			log.info("Application not Navigated to Dashboard page");
			CaptureScreen(driver,"PayUser");
			log.info("Screenshot is taken");
		}
		
		WebElement ele=driver.findElement(By.xpath("(//div[@class='quick-access-icon'])[1]"));
		ele.click();
		log.info("Pay User is Clicked");
		Thread.sleep(6000);
		
		WebElement to_user=driver.findElement(By.xpath("(//button[@type='button'])[3]"));
		to_user.click();
		log.info("to_user pick from contact list is clicked");
		Thread.sleep(6000);
		
		WebElement select_user=driver.findElement(By.xpath("//div[@class='modal-content']//div/div[2]/a"));//(//div[@class='mb-2'])[2]
		select_user.click();
		log.info("user is selected");
		Thread.sleep(6000);
		
        WebElement amount=driver.findElement(By.xpath("//input[@type='tel']"));
        amount.sendKeys("2");
        log.info("Amount is entered");
	    Thread.sleep(2000);
		
		WebElement scheduling=driver.findElement(By.xpath("//div[@class='w-100']"));
		scheduling.click();
		log.info("Scheduling is clicked");
		Thread.sleep(2000);
		
		WebElement scheduling_method=driver.findElement(By.xpath("//div[@role='listbox']//a[2]"));
		scheduling_method.click();
		log.info("Pay Now scheduling method is selected");
		Thread.sleep(6000);
		
		WebElement date=driver.findElement(By.xpath("//input[@type='date']"));
		date.click();
		date.sendKeys("07022024");
//		date.sendKeys(Keys.TAB);
//		date.sendKeys("02");
//		date.sendKeys("2024");
		log.info("date is selected");
		Thread.sleep(6000);
		
		WebElement description=driver.findElement(By.xpath("//textarea[@rows='3']"));
		description.sendKeys("I'm choosing Ann's cafe with payment of amount and Scheduled the Scheduled payment method with date");
		log.info("Description is entered");
		Thread.sleep(2000);
		
		WebElement next=driver.findElement(By.xpath("(//button[@type='button'])[4]"));
	    next.click();
		log.info("Next is Clicked");
		Thread.sleep(5000);
		
		WebElement previous=driver.findElement(By.xpath("(//button[@type='button'])[3]//span"));
		previous.click();
		log.info("previous is Clicked");
		Thread.sleep(5000);
		
		WebElement amount1=driver.findElement(By.xpath("//input[@type='tel']"));
		for(int i=0;i<5;i++)
		{
		amount1.sendKeys(Keys.BACK_SPACE);
		}
        amount1.sendKeys("3");
        log.info("Amount is changed");
	    Thread.sleep(2000);
	    
	    WebElement next1=driver.findElement(By.xpath("(//button[@type='button'])[4]"));
	    next1.click();
		log.info("Next is Clicked");
		Thread.sleep(5000);
		
		WebElement confirm=driver.findElement(By.xpath("(//button[@type='button'])[2]//span"));
	    confirm.click();
		log.info("confirm is Clicked");
		Thread.sleep(5000);
		
		WebElement print=driver.findElement(By.xpath("(//button[@type='button'])[3]//div"));
		print.click();
		log.info("Print is Clicked");
	    Thread.sleep(5000);		
	}
}
