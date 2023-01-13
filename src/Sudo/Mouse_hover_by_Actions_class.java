package Sudo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Mouse_hover_by_Actions_class 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.onlinesbi.sbi/");
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Services ']"))).build().perform();
	}
}
