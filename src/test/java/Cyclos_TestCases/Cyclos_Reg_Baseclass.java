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

import Cyclos_Utilities.Cyclos_Registration_ReadConfig;

public class Cyclos_Reg_Baseclass {
	public static WebDriver driver;
	public static Logger log;
	Cyclos_Registration_ReadConfig crc=new Cyclos_Registration_ReadConfig();
	public String url=crc.Openapplication();
	public String Name=crc.getName();
	public String Loginname=crc.Loginname();
	public String E_mail=crc.E_mail();
	public String Website=crc.Website();
	public String Mobilephone=crc.Mobilephone();
	public String Land_linephone=crc.Land_linephone();
	public String Password=crc.Password();
	public String Passwordconfirmation=crc.Passwordconfirmation();
	@BeforeClass
	@Parameters({"Browser"})
	public void Openapplication(String br) {
		if(br.equals("Chrome")) {
			driver=new ChromeDriver();
		}
		if(br.equals("Edge")) {
			driver=new EdgeDriver();
		}
		if(br.equals("Firefox")) {
			driver=new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		log=Logger.getLogger(this.getClass());
		PropertyConfigurator.configure(System.getProperty("user.dir")+"\\Log4j.properties");
		
	}
	@AfterClass
	public void Closeapplication() {
		driver.quit();
	}

}
