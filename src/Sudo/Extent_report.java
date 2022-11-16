package Sudo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent_report 
{
	ExtentSparkReporter reporter;
	ExtentReports extent;
	ExtentTest test;
	
	WebDriver  driver;
	
	@BeforeTest //Stage - 1
	public void config()
	{
		reporter=new ExtentSparkReporter(System.getProperty("user.dir")+"\\reports\\index.html");
		reporter.config().setReportName("Web Automation Results");//Name of the report
		reporter.config().setDocumentTitle("Test Results"); //Title of report
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter); //It will attach above report with extent report 
		
		extent.setSystemInfo("Host name", "localhost");
		extent.setSystemInfo("Environemnt", "QA");
		extent.setSystemInfo("OS", "Windows 10");
		extent.setSystemInfo("Tester Name", "Swanand Yadav");
		
	}
	@BeforeMethod    //Stage - 2
	public void Setup()
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
	}
	
	//------------- All below are just created entry of all test Cases in Extent Test ----------------------
	
	@Test // All test on Stage - 3 
	public void TitleTest()
	{
		test=extent.createTest("nopCommerceTitleTest");
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "nopCommerce demo store");// Assert.assertEquals(actual, "expected");
	}
	
	@Test
	public void LogoTest()
	{
		test=extent.createTest("nopCommerceLogoTest");
		boolean status= driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img")).isDisplayed();
		Assert.assertTrue(status); // If status is true then assertTrue will be match and both are same so test will pass.
	}
	
	@Test
	public void LoginTest()
	{
		test=extent.createTest("nopCommerceLoginTest");
		Assert.assertTrue(true);// It will pass by default without any message
	}
	
	//------------- All below are created status of all test Cases it may pass,fail or skipped ----------------------
	
	@AfterMethod  // Stage - 4
	public void tearDown(ITestResult result) throws IOException // This ITestResult method variable have status of test case
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "TEST CASE FAILED IS"+result.getName()); // to add name is extent report
			test.log(Status.FAIL, "TEST CASE FAILED IS"+result.getThrowable()); // to add error/exception is extent report
			
			String screenShotPath =Extent_report.getScreenshot(driver, result.getName());
			test.addScreenCaptureFromPath(screenShotPath); // adding screen shot
		}
		else if(result.getStatus()==ITestResult.SKIP)		{
			test.log(Status.SKIP, "Test case skipped is"+result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "Test case Passed is"+result.getName());
		}
		driver.close();
	}
	
	public static String getScreenshot(WebDriver driver,String screenshotName) throws IOException
	{
		String dateName=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot sc=(TakesScreenshot) driver;
		File source=sc.getScreenshotAs(OutputType.FILE);
		
		String destination=System.getProperty("user.dir")+"/Screenshots/"+dateName+".png";
		File finalDestination =new File(destination);
		FileHandler.copy(source, finalDestination);
		return destination;
	}
	
	@AfterTest //Stage - 5
	public void endReport()
	{
		extent.flush();
	}

}
