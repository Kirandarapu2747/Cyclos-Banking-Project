package Cyclos_TestCases;

 Naveen

Bhavana

 varalasrijitha


 master
 master
 master
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 Naveen

 Bhavana
 master
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Cyclos_Utilities.Cyclos_ReadConfig;

 Naveen

public class Cyclos_BaseClass
{
	public  WebDriver driver;
	Cyclos_ReadConfig  rc=new Cyclos_ReadConfig ();
	
	public String URL=rc.OpenApplication();

 varalasrijitha
 varalasrijitha
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import Cyclos_Utilities.Cyclos_ReadConfig;



 master

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

PrabhavathiMallepally
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import Cyclos_Utilities.Cyclos_ReadConfig;

public class Cyclos_BaseClass {
	public static WebDriver driver;
	Cyclos_ReadConfig rc=new Cyclos_ReadConfig();
	public String URL=rc.getApplicationURL();
	public String Username=rc.getUsername();
	public String Password=rc.getPassword();
	@BeforeClass
	public void OpenApplication()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(URL);
		driver.manage().window().maximize();
	}
	@AfterClass
	public void CloseApplication()
	{
		driver.close();
	}

 master
	

import org.testng.annotations.BeforeClass;

import Cyclos_Utilities.Cyclos_ReadConfig;

public class Cyclos_BaseClass {
	public  WebDriver driver;
    Cyclos_ReadConfig rc=new Cyclos_ReadConfig();
	
	public String URL=rc.ApplicationURL();
master
	public String User=rc.Username();
	public String Pword=rc.Password();
	
	@BeforeClass()
Bhavana
	public void OpenApplication() 
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		driver.manage().window().maximize();
		System.out.println("Application Opened");
	}

	@AfterClass()
	public void CloseApplication()
	{
		driver.close();
		System.out.println("Application Closed");
	}

	public void OpenApplication() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(URL);
		driver.manage().window().maximize();
		}

		/*@AfterClass()
		public void CloseApplication(){
			driver.close();*/
master
master

 Naveen
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

 master
