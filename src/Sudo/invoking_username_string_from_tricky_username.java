package Sudo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class invoking_username_string_from_tricky_username 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		//Extracting user names
		WebElement ele=driver.findElement(By.xpath("//*[@id='login_credentials']"));
		String str=ele.getText();
		String arr[]=str.split("Accepted usernames are:");
		String arr_arr[]=arr[1].split("locked_out_user");		
		driver.findElement(By.id("user-name")).sendKeys(arr_arr[0]);
		
		//Extracting pwd
		WebElement el= driver.findElement(By.cssSelector(".login_password"));
		String str1=el.getText();
		String arr1[]=str1.split("Password for all users:");
		driver.findElement(By.id("password")).sendKeys(arr1[1]);
		
		//Click submit
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		String ass= driver.findElement(By.cssSelector(".title")).getText();
		
		//Confirming login is done or not
		System.out.println(ass);
		
		driver.quit();
	}
}
