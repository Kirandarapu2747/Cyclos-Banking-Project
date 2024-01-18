package Cyclos_TestCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
public static Logger log;
	
Register_ReadConfig crc=new Register_ReadConfig();
	
	public String URL=crc.getapplicationurl();
	public String name=crc.getname();
	public String loginname=crc.getlgnm();
	public String email=crc.getemail();
	public String password=crc.getpassword();
	public String confirmpassword=crc.getconfirmpassword();
	
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
		
		log=Logger.getLogger(this.getClass());
		PropertyConfigurator.configure(System.getProperty("user.dir") +"\\Log4j.properties");
		
		driver.get(URL);
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void closeapplication() {
		
		driver.close();
		System.out.println("close");
	}
	
	public void captureScreen(WebDriver driver,String name) throws IOException {
		
		//initlize the TakeScreenshot
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"./Screenshots/"+name+".png");
		
		FileUtils.copyFile(src, target);
	}
	
}
