package Cyclos_Utilities;


	import java.io.File;
	import java.io.IOException;
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
	import com.aventstack.extentreports.reporter.ExtentSparkReporter;

	public class Reporting implements ITestListener{
		public ExtentSparkReporter htmlreporter;  //UI
		public ExtentReports extent;  ///basic information about user
		public ExtentTest test;  // add the status about test (pass/fail/skip)
		
		public void onStart(ITestContext context) {
			//time stamp
			String timestamp=new SimpleDateFormat("yyyy.MM.dd.mm.ss").format(new Date());
			//to create report name
			String repName="Test-Report - "+timestamp+ " .html";
			//to specify the location
			htmlreporter= new ExtentSparkReporter(System.getProperty("user.dir") +"\\Reports\\" +repName);
			//configurate the extent-config .xml file
			try {
				htmlreporter.loadXMLConfig(System.getProperty("user.dir")+"\\extent-config.xml");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//provide the basic information about user
			extent=new ExtentReports();
			extent.attachReporter(htmlreporter);
			extent.setSystemInfo("Host", "LocalHost");
			extent.setSystemInfo("Environment", "QA");
			extent.setSystemInfo("Tester", "Sai Nath");
			extent.setSystemInfo("OS", "Windows 10");
			
		}
		public void onTestSuccess(ITestResult tr) {
			test=extent.createTest(tr.getName());
			test.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
		}
		public void onTestFailure(ITestResult tr) {
			test=extent.createTest(tr.getName());
			test.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(),ExtentColor.RED));
			/*String screenshotpath=System.getProperty("user.dir") +"\\ScreenShots"+tr.getName()+".png";
			File f=new File(screenshotpath);
			if(f.exists()) {
				try {
					test.fail("Screenshot is taken " +test.addScreenCaptureFromPath(screenshotpath));
				}catch(Exception e){
					e.printStackTrace(); //show the classname and line number
				}
			}*/
		}
		public void onTestSkipped(ITestResult tr) {
			test=extent.createTest(tr.getName());
			test.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));
			
		}
		public void onFinish(ITestContext context) {
			extent.flush();
		}
		
}
