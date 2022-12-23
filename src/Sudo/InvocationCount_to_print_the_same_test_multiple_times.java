package Sudo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class InvocationCount_to_print_the_same_test_multiple_times 
{
	@Test(invocationCount=3,invocationTimeOut=30000)// We can take single parameter also or both
	public void m1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://randomuser.me/");// This website is generating random user data
		
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
 * invocationCount: It means we can run our test mentioned no. of times instead of we can use 
 * loop but in for loop any other loop if any error occurred in middle iteration then rest will 
 * not execute but in invocationCount not that type of case will happen.
 * 
 * invocationTimeOut: All iteration should complete within that mentioned timeOut if not then 
 * test will fail
 * 
 * But we can not put only invocationTimeOut we need invocationCount also should be as parameter
 * otherwise only invocationTimeOut will be useless but we can take only single invocationCount.
 * 
*/
