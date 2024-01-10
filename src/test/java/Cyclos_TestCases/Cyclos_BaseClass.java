package Cyclos_TestCases;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Cyclos_Utilities.Cyclos_ReadConfig;




public class Cyclos_BaseClass {
	 public static WebDriver driver;
	 Cyclos_ReadConfig rc=new Cyclos_ReadConfig();
		
		public String url=rc.getApplication();
		public String username=rc.getUsername();
		public String password=rc.getPassword();
		
	   

	   @BeforeClass
	   @Parameters({"browser","url"})
	   public void openapplication(String br,String url) {
	       
	       if(br.equals("chrome")) {
	           driver=new ChromeDriver();
	       }
	       else if(br.equals("edge")) {
	           driver=new EdgeDriver();
	       }
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	          
	       driver.get(url);
	       
	       driver.manage().window().maximize();
	       
	   }
	   
	   @AfterClass
	   public void closeApplication() {
	       driver.close();
	   }
	   
	}
	

