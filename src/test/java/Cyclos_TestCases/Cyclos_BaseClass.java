package Cyclos_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.testng.annotations.Parameters;

import Cyclos_Utilities.Cyclos_ReadConfig;

public class Cyclos_BaseClass {
	public static WebDriver driver;
	Cyclos_ReadConfig crc=new Cyclos_ReadConfig();
	public String url=crc.getapplicationurl();
	public String username=crc.getusername();
	public String password=crc.getpassword();
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
		
	}
	@AfterClass
	public void Closeapplication() {
		driver.quit();
	}

}
