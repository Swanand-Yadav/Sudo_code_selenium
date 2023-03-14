package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll_page_until_element 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(co);
		
		driver.get("https://www.homeandlearn.co.uk/java/java_formatted_strings.html");
		WebElement element=driver.findElement(By.xpath("//h2[text()='Floating Point Number Formatting']"));
		
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		
	}
}
