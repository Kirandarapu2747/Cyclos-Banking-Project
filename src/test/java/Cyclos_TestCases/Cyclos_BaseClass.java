package Cyclos_TestCases;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Cyclos_Utilities.Cyclos_ReadConfig;

public class Cyclos_BaseClass
{
	public  WebDriver driver;
	public static Logger log;
	Cyclos_ReadConfig  rc=new Cyclos_ReadConfig ();
	
	public String URL=rc.OpenApplication();
	public String User=rc.Username();
	public String Pword=rc.Password();
	
	@BeforeClass()
	@Parameters("browser")
	public void OpenApplication(String br)
	{
		if(br.equals("chrome")) 
		{
			driver=new ChromeDriver();
	    }
		else if(br.equals("edge")) 
		{
			driver=new EdgeDriver();
		}
		else if(br.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
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
