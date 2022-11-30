package Selenium_waits;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_wait 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));// Global wait once in hole program
		
		driver.findElement(By.cssSelector("input.gLFyf")).sendKeys("selenium",Keys.ENTER);
		driver.findElement(By.xpath("//h3[text()='Selenium']")).click();
	}
}
