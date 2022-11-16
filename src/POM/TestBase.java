package POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
}

