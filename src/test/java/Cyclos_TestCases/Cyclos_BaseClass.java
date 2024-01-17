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
	public  WebDriver driver;
	public static Logger log;
    Cyclos_ReadConfig rc=new Cyclos_ReadConfig();
	
	public String URL=rc.ApplicationURL();
	public String User=rc.Username();
	public String Pword=rc.Password();
	
	@BeforeClass()
	public void OpenApplication() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(URL);
		driver.manage().window().maximize();
		log=Logger.getLogger(this.getClass());
		PropertyConfigurator.configure(System.getProperty("user.dir")+"\\Resources\\log4j.properties");
		}

		@AfterClass()
		public void CloseApplication(){
			driver.close();

}
}
