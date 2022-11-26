package Sudo;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Select_last_5_checkbox 
{	
	public static void main(String[] args)  
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("C:\\Users\\admin\\Selenium_sudo_code\\Checkboxes.html");
		
		List<WebElement> element= driver.findElements(By.xpath("//input[position()>last()-5]"));
		
		for(int i=0;i<5;i++)
		{
			element.get(i).click();
		}				
	}

}
