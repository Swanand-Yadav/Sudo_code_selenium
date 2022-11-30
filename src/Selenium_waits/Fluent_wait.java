package Selenium_waits;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class Fluent_wait 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//Declaration of fluent wait...
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(15))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(Exception.class);
		
		driver.get("https://www.google.com/");
		driver.findElement(By.cssSelector("input.gLFyf")).sendKeys("selenium",Keys.ENTER);
		
		// Implementation or usage of fluent wait
		WebElement element=wait.until(new Function<WebDriver, WebElement>() 
		{
			public WebElement apply(WebDriver driver) 
			{
				return driver.findElement(By.xpath("//h3[text()='Selenium']"));
			}
		});
		element.click();
	}
}
