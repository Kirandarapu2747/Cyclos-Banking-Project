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

}
