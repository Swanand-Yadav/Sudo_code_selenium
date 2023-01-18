package Browser_Pop_ups;

import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_Ask_Allow_Block 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
    	
    	ChromeOptions options=new ChromeOptions();
    	HashMap<String, Object> Prefs=new HashMap<>(); // It going to store in ChromeOptions.
    	HashMap<String, Object> Profile=new HashMap<>(); // It going to store on prefs(preference)
    	HashMap<String, Integer> contentSettings=new HashMap<>();// It going to store on profile
    	
    	contentSettings.put("notifications", 0); // 0 is for "Ask", 1 is for "Allow", 2 is for "Block"
    	Profile.put("managed_default_content_settings", contentSettings);
    	Prefs.put("profile", Profile);
    	options.setExperimentalOption("prefs", Prefs);
   
    	WebDriver driver=new ChromeDriver(options); 
    	
    	driver.manage().window().maximize();
    	driver.get("https://web-push-book.gauntface.com/demos/notification-examples/");
    	driver.findElement(By.xpath("//input[@class='c-toggle js-example-toggle']")).click();
	}
}
/*
 * Steps: 
 * 			1) Create ChromeOptions object.
 * 			2) And Create HashMap object and pass parameter as Notification and 0 for Ask
 * 			3) pass the chromeOptions reference variable in chromeDriver constructor.
 * 
 * This type of pop up are from browser not from application so we need to use any of the following things:
 * 		1) Desired Capabilities <- Its coming from Selenium WebDriver.
 * 		2) Options <- This Coming from individual browser i.e. Chrome, Firfox, Edge....etc.
 * 
 * But this is from browser notification so we can use only Options i.e. ChromeOption. If it is from Application
 * then we can consider Desired Capabilities.
 * 
 * The keys like notifications, geolocation, media_stream are not user-defined they are fix and case sensitive.
 * The values are allowed only 0 to 2, For every key are allowed 0 to 2.
 * 
 * For more details click here: https://chromium.googlesource.com/chromium/src/+
 * /7e762c1f17514a29834506860961ba2f24e7e6e5/components/content_settings/core/c%20ommon/
 * pref_names.cc
 *
*/