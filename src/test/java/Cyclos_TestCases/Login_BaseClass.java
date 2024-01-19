package Cyclos_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import Cyclos_Utilities.Cyclos_ReadConfig;


public class Login_BaseClass {

	public static WebDriver driver;
	
	Cyclos_ReadConfig crc=new Cyclos_ReadConfig();
	
	public String URL=crc.getapplicationurl();
	public String Username=crc.getusername();
	public String Password=crc.getpassword();
	
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
