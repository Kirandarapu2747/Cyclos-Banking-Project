package Cyclos_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Cyclos_Utilities.Cyclos_ReadConfig;

public class Cyclos_BaseClass
{
	public  WebDriver driver;
	Cyclos_ReadConfig  rc=new Cyclos_ReadConfig ();
	
	public String URL=rc.OpenApplication();
	public String User=rc.Username();
	public String Pword=rc.Password();
	
	@BeforeClass()
	public void OpenApplication() 
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		driver.manage().window().maximize();
		System.out.println("Application Opened");
	}

	@AfterClass()
	public void CloseApplication()
	{
		driver.close();
		System.out.println("Application Closed");
	}

}
