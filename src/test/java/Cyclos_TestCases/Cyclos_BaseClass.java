package Cyclos_TestCases;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import Cyclos_Utilities.Cyclos_ReadConfig;

public class Cyclos_BaseClass {
	public static WebDriver driver;
	public static Logger Log;
	Cyclos_ReadConfig rc=new Cyclos_ReadConfig();
	public String URL=rc.getApplicationURL();
	public String Username=rc.getUsername();
	public String Password=rc.getPassword();
	@BeforeClass
	public void OpenApplication()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(URL);
		driver.manage().window().maximize();
		Log=Logger.getLogger(this.getClass());
		PropertyConfigurator.configure(System.getProperty("user.dir")+"\\Log4j.properties");
	}
	@AfterClass
	public void CloseApplication()
	{
		driver.close();
	}

	



}
