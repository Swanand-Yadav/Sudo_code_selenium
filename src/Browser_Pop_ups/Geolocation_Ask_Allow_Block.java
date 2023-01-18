package Browser_Pop_ups;

import java.util.HashMap;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Geolocation_Ask_Allow_Block 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
    	
    	ChromeOptions options=new ChromeOptions();
    	HashMap<String, Object> Prefs=new HashMap<>();
    	HashMap<String, Object> Profile=new HashMap<>(); 
    	HashMap<String, Integer> contentSettings=new HashMap<>();
    	
    	contentSettings.put("geolocation", 2); 
    	Profile.put("managed_default_content_settings", contentSettings);
    	Prefs.put("profile", Profile);
    	options.setExperimentalOption("prefs", Prefs);
    	
    	WebDriver driver=new ChromeDriver(options); 
    	driver.manage().window().maximize();
    	driver.get("https://whatmylocation.com/");
	}
}
