package Cyclos_TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Cyclos_Utilities.Cyclos_ReadConfig1;


public class Cyclos_BaseClass1 {
	 public static WebDriver driver;
	 Cyclos_ReadConfig1 rc=new Cyclos_ReadConfig1();
		
		public String url=rc.getApplication();
		public String name=rc.getName();
		public String login=rc.getLogin();
		public String email=rc.getEmail();
		public String password=rc.getpassword();
		public String repassword=rc.getrepassword();
	
		
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
