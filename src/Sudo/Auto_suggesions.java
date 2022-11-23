package Sudo;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_suggesions 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.getProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("autocomplete")).sendKeys("ind");
		Thread.sleep(3000);
	    List<WebElement> list = driver.findElements(By.xpath("//ul[@id='ui-id-1']/child::li/child::div"));
	    System.out.println("Auto Suggest List ::" + list.size());

	    for(int i = 1 ;i< list.size();i++)
	    {
	        System.out.println(list.get(i).getText());

	        if(list.get(i).getText().equals("India"))
	        {
	            list.get(i).click();
	            System.out.println(list.get(i).getText());
	            break;
	        }  
	    }
	    driver.quit();
	}
}
