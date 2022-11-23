package Sudo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CheckBox 
{
	@Test
	public void isSelected()
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement element= driver.findElement(By.cssSelector("div[id='checkbox-example']>fieldset>label>input[id='checkBoxOption2']"));
		element.click();
		boolean flag=element.isSelected();
		Assert.assertTrue(flag);
		
	    driver.quit();
	}
}
