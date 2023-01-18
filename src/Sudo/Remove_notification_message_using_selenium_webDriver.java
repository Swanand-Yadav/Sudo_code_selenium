package Sudo;

import java.util.Collections;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Remove_notification_message_using_selenium_webDriver 
{
	public static void main(String[] args) 
	{
		// How to remove "Chrome is being controlled by automated test software" message ?
    	
    	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
    	ChromeOptions options=new ChromeOptions();
    	
    	//options.setExperimentalOption("excludeSwitches", new String[] {"enable-automation"}); 
    	//options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation")); 
    	options.setExperimentalOption("excludeSwitches", Collections.singleton("enable-automation")); 
    	
    	WebDriver driver=new ChromeDriver(options);
    	driver.manage().window().maximize();
    	driver.get("https://www.google.com/");
	}
}

/* new String[] {"enable-automation"}  <-- Whenever we dealing with values you have to use the hyphen for every word
 * 
 * You can use any approach to achieve this Array object, Collection class or collection object.
 * 
 * new String[] {"enable-automation"} <-- using Array Object
 * Arrays.asList("enable-automation") <-- using collection Object
 * Collections.singleton("enable-automation") <-- using utility Collection class
 * 
 */
