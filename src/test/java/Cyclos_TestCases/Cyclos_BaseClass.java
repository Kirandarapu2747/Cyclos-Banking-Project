package Cyclos_TestCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Cyclos_PageObjects.Cyclos_LoginPage;

public class Cyclos_BaseClass {
	WebDriver d;
	Cyclos_LoginPage clp;
	@BeforeClass
	void setUP() throws Exception
	{
		d=new ChromeDriver();
		d.get("https://demo.cyclos.org/ui/login");
		d.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test
	void testLogin()
	{
		clp=new Cyclos_LoginPage(d);
		clp.setUsername("demo");
		clp.setPassword("1234");
		clp.clickLogin();
	}
	@AfterClass
	void teanDown()
	{
		d.close();
	}




import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
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



import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Cyclos_Utilities.Cyclos_ReadConfig;



public class Cyclos_BaseClass
{
	public  WebDriver driver;
	Cyclos_ReadConfig  rc=new Cyclos_ReadConfig ();
	
	public String URL=rc.OpenApplication();

 
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

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


	

import org.testng.annotations.BeforeClass;

import Cyclos_Utilities.Cyclos_ReadConfig;

public class Cyclos_BaseClass {
	public  WebDriver driver;
    Cyclos_ReadConfig rc=new Cyclos_ReadConfig();
	
	public String URL=rc.ApplicationURL();

	public String User=rc.Username();
	public String Pword=rc.Password();
	
	@BeforeClass()

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

 
