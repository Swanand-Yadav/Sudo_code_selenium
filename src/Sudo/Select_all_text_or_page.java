package Sudo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_all_text_or_page 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.paisabazaar.com/saving-schemes/uan-epf-mobile-register-change/");
		Thread.sleep(4000);
		WebElement ele=driver.findElement(By.xpath("//body"));

		ele.sendKeys(Keys.chord(Keys.CONTROL,"a")); // without action class
		
		//Actions act=new Actions(driver); // OR with action class also possible.
		//act.moveToElement(ele).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.UP).perform();
	}
}
