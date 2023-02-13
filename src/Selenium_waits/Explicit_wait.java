package Selenium_waits;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/*
public class Explicit_wait 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.cssSelector("input.gLFyf")).sendKeys("selenium",Keys.ENTER);
		
		By elementLocator=By.xpath("//h3[text()='Selenium']");
		waitForElementPresent( driver,elementLocator,3).click();// For multiple element you can just call this method.
		
	}
	public static WebElement waitForElementPresent(WebDriver driver,By locator,int timeout)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		return driver.findElement(locator);
	}
}
*/


  //For single method..............................
public class Explicit_wait 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(3));// This is element specific wait not a global
		
		driver.findElement(By.cssSelector("input.gLFyf")).sendKeys("selenium",Keys.ENTER);
		WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Selenium']")));// It will return boolean either element is able to locate or not 
		element.click();
		driver.close();
	}
}
