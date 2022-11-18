package POM;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Listener extends TestListenerAdapter 
{
	//TestBase tb=new TestBase();
	public ExtentSparkReporter spark;
	public ExtentReports extent;
	public ExtentTest test;
	
	public void onStart(ITestContext testContext)
	{
		String timeStamp =new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		String repName="Test-Report-"+timeStamp+".html";
		spark=new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/"+repName);		
		extent=new ExtentReports();		
		extent.attachReporter(spark);
		
		extent.setSystemInfo("Host name", "localhost");
		extent.setSystemInfo("Environemnt", "QA");
		extent.setSystemInfo("OS", "Windows 10");
		extent.setSystemInfo("Tester Name", "Swanand Yadav");
	}
	
	/*
	 * The below all are predefined methods so don't change those names
	 * 		onStart
	 * 		onTestSuccess
	 * 		onTestFailure
	 * 		onTestSkipped
	 * 		onFinish
	 */
	
	public void onTestSuccess(ITestResult tr)
	{
		test=extent.createTest(tr.getName()); //Create new entry in the report
		test.log(Status.PASS, MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));		
	}
	
	public void onTestFailure(ITestResult tr) 
	{
		test=extent.createTest(tr.getName()); //Create new entry in the report
		test.log(Status.FAIL, MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));	
		test.log(Status.INFO, tr.getThrowable());
		String sc_path;
		try {
			sc_path = TestBase.takeScreenShot();
			test.addScreenCaptureFromPath(sc_path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void onTestSkipped(ITestResult tr)
	{
		test=extent.createTest(tr.getName());
		test.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));
	}
	
	public void onFinish(ITestContext testContext)
	{
		extent.flush();
	}
}
