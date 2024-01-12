package Cyclos_Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extent_Report implements ITestListener
{
	public ExtentHtmlReporter htmlreporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	public void onStart(ITestContext context)
	{
		String timestamp=new SimpleDateFormat("yyyy.mm.dd.hh.mm.ss").format(new Date());
		String ReportName="Test_Report -"+timestamp+".html";
		htmlreporter= new ExtentHtmlReporter(System.getProperty("user.dir")+"\\Reports\\"+ReportName);
		htmlreporter.loadXMLConfig(System.getProperty("user.dir")+"\\Extent_Config.xml");
		
		extent= new ExtentReports();
		extent.attachReporter(htmlreporter);
		extent.setSystemInfo("Host","Local Host");
		extent.setSystemInfo("Environment","QA");
		extent.setSystemInfo("Tester","Bhavana");
		extent.setSystemInfo("O.S.","windows 10");
	}
	
	public void onTestSuccess(ITestResult tr)
	{
		test=extent.createTest(tr.getName());
		test.log(Status.PASS,MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
	}
	
	public void onTestFailure(ITestResult tr)
	{
		test=extent.createTest(tr.getName());
		test.log(Status.FAIL,MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
	}
	
	public void onTestSkip(ITestResult tr)
	{
		test=extent.createTest(tr.getName());
		test.log(Status.SKIP,MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));
	}
	
	public void onTestFinish(ITestContext context)
	{
		extent.flush();
		
	}
}

