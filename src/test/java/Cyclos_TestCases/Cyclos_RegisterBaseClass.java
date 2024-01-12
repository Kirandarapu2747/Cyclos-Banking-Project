package Cyclos_TestCases;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Cyclos_Utilities.Registration_ReadConfig;

public class Cyclos_RegisterBaseClass 
{
	public WebDriver driver;
	public static Logger log;
	Registration_ReadConfig rrc=new Registration_ReadConfig ();
	
	public String URL=rrc.OpenApplication();
	public String name=rrc.Name();
	public String lname=rrc.LoginName();
	public String email=rrc.Email();
	public String Password=rrc.Password();
	public String ConfirmPassword=rrc.ConfirmPassword();
	
	@BeforeClass()
	public void OpenApplication()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		driver.manage().window().maximize();
		System.out.println("Application Opened");
		
		log=Logger.getLogger(this.getClass());
		PropertyConfigurator.configure(System.getProperty("user.dir")+"\\Resources\\Log4j.properties");
	}
	@AfterClass()
	public void CloseApplication()
	{
		driver.close();
		System.out.println("Application Closed");
	}
	

}
