package Sudo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_list 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		// In that we need to take select class and choose ui name start with select in DOM.
		Select select = new Select(driver.findElement(By.cssSelector("select[id='dropdown-class-example']")));
		select.selectByIndex(2); // Index starting from 0

		driver.quit();
	}
}
