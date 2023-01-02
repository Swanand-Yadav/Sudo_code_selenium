package Sudo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_window 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://randomuser.me/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(500,1000)"); 
	}
}
