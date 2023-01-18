package Sudo;

import java.time.Duration;
import java.util.Arrays;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Blocking_popups 
{
	@Test
	public void Main() 
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
    	
    	ChromeOptions options=new ChromeOptions();
    	options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
    	
    	WebDriver driver=new ChromeDriver(options);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    	driver.manage().window().maximize();
    	driver.get("https://file-example.com/en");
    	
    	driver.findElement(By.xpath("//ul[@id='menu-menu-1']/li[3]/a")).click();
    	driver.findElement(By.xpath("//tbody/tr[1]/td[3]/a")).click();
    	
    	System.out.println(driver.getCurrentUrl());
    	driver.close();
	}
}
