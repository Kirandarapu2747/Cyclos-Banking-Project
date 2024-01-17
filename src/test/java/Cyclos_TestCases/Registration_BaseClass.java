package Cyclos_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Cyclos_Utilities.Registration_ReadConfig;

public class Registration_BaseClass {
	public WebDriver driver;
	Registration_ReadConfig rc=new Registration_ReadConfig();
	
	public String URL=rc.ApplicationURL();
	public String Name=rc.Name();
	public String LoginName=rc.LoginName();
	public String EMail=rc.EMail();
	public String Password=rc.Password();
	public String ConformPassword=rc.ConformPassword();
	
	@BeforeClass()
	public void OpenApplication() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(URL);
		driver.manage().window().maximize();
		}

		//@AfterClass()
		//public void CloseApplication(){
			//driver.close();

}

