package Sudo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_browser_using_chromeOptions 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
 
    	ChromeOptions options=new ChromeOptions();
    	options.addArguments("headless");
    	
    	WebDriver driver=new ChromeDriver(options);
    	driver.get("https://www.google.com/");
    	String Title=driver.getTitle();
    	System.out.println(Title);
	}
}
