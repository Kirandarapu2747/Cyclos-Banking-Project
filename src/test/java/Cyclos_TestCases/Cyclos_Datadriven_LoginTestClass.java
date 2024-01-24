package Cyclos_TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Cyclos_PageObjects.Cyclos_LoginPage;
import Cyclos_Utilities.DataDriven_XL;

public class Cyclos_Datadriven_LoginTestClass extends Cyclos_LoginBaseClass
{
	@Test(dataProvider="TestData")
	public void Datadriven_LoginTest(String User,String Pword) throws InterruptedException, IOException 
	{
	Cyclos_LoginPage  clp=new Cyclos_LoginPage (driver);
	Thread.sleep(2000);
	clp.setUsername(User);
	log.info("UserName Entered");
	Thread.sleep(2000);
	clp.setPassword(Pword);
    log.info("Password Entered");
	Thread.sleep(2000);
	clp.ClickLogin();
	log.info("Login clicked");
	Thread.sleep(10000);
	
	String Exp_Result="Dashboard - Cyclos";//Dashboard - CyclosLogin - Cyclos
	String Act_Result=driver.getTitle();
	
	if(Act_Result.equals(Exp_Result))
	{
		Assert.assertTrue(true);
		log.info("Test case passed");
	}
	else
	{
		log.info("Test case is failed");
		CaptureScreen(driver,"Datadriven_LoginTest");
		log.info("Screenshot is taken");
		driver.navigate().refresh();
		Assert.assertTrue(false);
	}
}
	
	@DataProvider(name="TestData")
	String [][] getData() throws IOException
	{
		String path=System.getProperty("user.dir")+"\\ExcelSheets\\TestData.xlsx";
		int rownum=DataDriven_XL.getRowCount(path, "Sheet1");
		int colcount=DataDriven_XL.getCellCount(path, "Sheet1", 1);
		
		String logindata[][]=new String [rownum][colcount];
		 
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++) 
			{
				logindata[i-1][j]=DataDriven_XL.getCellData(path,"Sheet1",i,j);//1 0
			}
		}
		return logindata;
	}

}
