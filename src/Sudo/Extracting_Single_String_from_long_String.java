package Sudo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// Extracting the single single string using the <List> collection  
public class Extracting_Single_String_from_long_String 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/v4/");
		driver.manage().window().maximize();
		List<WebElement> elements=driver.findElements(By.xpath("//body/div/div/div[2]/table/tbody/tr/td/a[2]"));
		
		
		// Extracting single String...
		for(int i=0;i<elements.size();i++)
		{
			if((elements.get(i).getText()).equals("Selenium"))
			{
				System.out.println("We extracted string-> "+elements.get(i).getText());
				break;
			}
		}
		
	}

}
