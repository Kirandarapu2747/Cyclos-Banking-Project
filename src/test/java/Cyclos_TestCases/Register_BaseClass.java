package Cyclos_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


import Cyclos_Utilities.Register_ReadConfig;

public class Register_BaseClass {

	
public static WebDriver driver;
	
Register_ReadConfig crc=new Register_ReadConfig();
	
	public String URL=crc.getapplicationurl();
	public String name=crc.getname();
	public String loginname=crc.getlgnm();
	public String email=crc.getemail();
	
	@BeforeClass
	@Parameters("browser")
	public void openapplication(String br) {
		if(br.equals("chrome")) {
			driver=new ChromeDriver();
		}
		else if(br.equals("edge")) {
			
			driver=new EdgeDriver();
		}else if(br.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(URL);
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void closeapplication() {
		
		System.out.println("close");
	}
}
