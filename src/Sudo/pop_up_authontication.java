package Sudo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class pop_up_authontication 
{
	@Test
	public void withoutAuth()
	{
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/basic_auth");
	}
	
	@Test
	public void withAuth()
	{
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		/*
		 * In this we need to add username:password@ to the beginning of the URL of the website 
		 * after http://
		 * This is not the Java Script popup. So we cannot use alert and provide the user name 
		 * and password by using send_keys().
		 */
	}
}
