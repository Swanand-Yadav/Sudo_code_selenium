package Sudo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadow_DOM 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://books-pwakit.appspot.com/");
		
		//In that case first find the shadow Host.
		WebElement root=driver.findElement(By.tagName("book-app")); //Shadow Host
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		/*
		 * JavascriptExecutor js=(JavascriptExecutor)driver;
		 * 
		 * In above line JavascriptExecutor and WebDriver both are different interfaces so we can not
		 * access JavascriptExecutor methods in WebDriver so we need to downCast so we make 
		 * Implementation like that But if you take ChromeDriver reference variable then you need not 
		 * to any casting
		 */
		SearchContext shadowDOM1= (SearchContext) js.executeScript("return arguments[0].shadowRoot", root);
		
		WebElement shadowDOM2=shadowDOM1.findElement(By.cssSelector("app-header[effects='waterfall']"));
		WebElement shadowDOM3=shadowDOM2.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));
		WebElement shadowDOM4=shadowDOM3.findElement(By.tagName("book-input-decorator"));
		shadowDOM4.findElement(By.cssSelector("input#input")).sendKeys("AutomationBook");
		
	}

}
