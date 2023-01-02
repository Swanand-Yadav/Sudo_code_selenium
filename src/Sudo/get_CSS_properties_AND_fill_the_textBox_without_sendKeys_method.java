package Sudo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class get_CSS_properties_AND_fill_the_textBox_without_sendKeys_method 
{
	
	@Test
	public void retriveCSSproperties()
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.onlinesbi.sbi/");
		driver.manage().window().maximize();
		
		String el= driver.findElement(By.xpath("//a[text()='Services ']")).getCssValue("font-size");
		System.out.println("element val: "+el);
	}
	
	@Test
	public void type_in_a_textbox_without_using_sendKeys()
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.onlinesbi.sbi/");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector(".corp_login")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('userName').value='swanandtyadav@gmail.com';");
	}
}
