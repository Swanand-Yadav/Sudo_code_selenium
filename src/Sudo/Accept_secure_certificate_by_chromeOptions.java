package Sudo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Accept_secure_certificate_by_chromeOptions 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
    	
    	ChromeOptions options=new ChromeOptions();
    	options.setAcceptInsecureCerts(true); // true will accept, false will reject the certificate.
    	
    	WebDriver driver=new ChromeDriver(options);
    	driver.manage().window().maximize();
    	driver.get("https://cacert.com/");
	}
}
