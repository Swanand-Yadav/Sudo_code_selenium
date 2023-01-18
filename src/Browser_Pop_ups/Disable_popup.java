package Browser_Pop_ups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Disable_popup 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
    	
    	ChromeOptions options=new ChromeOptions();
    	options.addArguments("disable-notifications"); // It will disable notification and not will ask
    	//options.addArguments("disable-geolocation");
    	//options.addArguments("disable-media_stream");
    	WebDriver driver=new ChromeDriver(options); 
    	
    	driver.manage().window().maximize();
    	//driver.get("https://letcode.in/dropdowns");
    	driver.get("https://web-push-book.gauntface.com/demos/notification-examples/");
    	driver.findElement(By.xpath("//input[@class='c-toggle js-example-toggle']")).click();
	}
}
