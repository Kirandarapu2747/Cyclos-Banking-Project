package Cyclos_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Cyclos_Utilities.Cyclos_ReadConfig;


public class Cyclos_BaseClass {

	public static WebDriver driver;
	
	Cyclos_ReadConfig crc=new Cyclos_ReadConfig();
	
	public String URL=crc.getapplicationurl();
	public String Username=crc.getusername();
	public String Password=crc.getpassword();
	
	@BeforeClass
	public void openapplication() {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(URL);
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void closeapplication() {
		
		driver.close();
	}
}
