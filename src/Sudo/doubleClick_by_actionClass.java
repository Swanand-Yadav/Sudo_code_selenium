package Sudo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class doubleClick_by_actionClass 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.paisabazaar.com/saving-schemes/uan-epf-mobile-register-change/");
		Thread.sleep(4000);
		WebElement ele=driver.findElement(By.xpath("//h1[text()='How to Register/Change Mobile Number in EPF Account']"));
		
		Actions act=new Actions(driver); 
		act.doubleClick(ele).perform(); // OR act.moveToElement(ele).doubleClick().perform();
	}
}
