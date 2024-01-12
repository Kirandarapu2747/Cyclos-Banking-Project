package Cyclos_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Cyclos_Utilities.Cyclos_RegisterReadConfig;

public class Cyclos_RegisterBaseClass {
	public static WebDriver driver;
	Cyclos_RegisterReadConfig rc=new Cyclos_RegisterReadConfig();
	public String URL=rc.getApplicationURL();
	public String Name=rc.getName();
	public String LoginName=rc.getLoginName();
	public String Email=rc.getEmail();
	public String Password=rc.getPassword();
	public String ConfirmPassword=rc.getConfirmPassword();
	@BeforeClass
	public void OpenApplication()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(URL);
		driver.manage().window().maximize();
	}
	@AfterClass
	public void CloseApplication()
	{
		driver.close();
	}

}
