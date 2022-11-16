package Sudo;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takes_SC {

	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/v4/");
		
		// ScreenShot taken....
		TakesScreenshot  ts=(TakesScreenshot) driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("./ScreenShots\\screenshot.png")); // This need external maven dependency common.io
		     //OR
		
		//FileHandler.copy(file, new File("./ScreenShots\\screenshot.png")); // Here no need any dependency its bydefault available in Selenium 
		
		System.out.println("The Screenshot is captured.");
	}

}
