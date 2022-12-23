package Sudo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Thread_pool_with_invocation 
{
	@Test(invocationCount=4,threadPoolSize=2) // 4 test are divided in multithreading way.
	public void m1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://randomuser.me/");
		
		Thread.sleep(3000);
		
	    driver.findElement(By.xpath("//li[@data-label='name']")).click();
	    String name= driver.findElement(By.id("user_value")).getText();
		System.out.println("Username= "+name);
		
		driver.findElement(By.xpath("//li[@data-label='email']")).click();
		String email=driver.findElement(By.id("user_value")).getText();
		System.out.println("Mail id= "+email);
		
		driver.quit();
	}
}

/*
 * In that above for 4 test will be divided in 2 threads so there will be open two chromeBrowser
 * window separately and each having two tests like that
*/
