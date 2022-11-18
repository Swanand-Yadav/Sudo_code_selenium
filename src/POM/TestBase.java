package POM;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase 
{
	
	public static WebDriver driver = null;

	@BeforeClass
	public void initialize() {

		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v4/");
	}	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	public static String takeScreenShot() throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		String path=System.getProperty("user.dir")+"/ScreenShots/result.png";
		File f=ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(f, new File(path));
		return path;
	}
}

