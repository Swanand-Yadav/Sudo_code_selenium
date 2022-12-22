package Sudo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_timeOut_and_exceptedException 
{
	@Test(timeOut=7000) // Here we allowing test case to execute within 7 seconds if not then it will fail.
	public void class1_method()
	{
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testng.org/doc/documentation-main.html");
		driver.quit();
	}
	
	// Below we can add multiple exceptions followed by comma because it accepting array
	@Test(expectedExceptions= {org.openqa.selenium.NoSuchElementException.class}) // OR expectedExceptions= {NoSuchElementException.class,TimeoutException.class}
	public void class2_method()
	{
		System.setProperty("webdriver.chrome.driver","./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testng.org/doc/documentation-main.html");
		driver.findElement(By.id("its_not_real")).click();// Intentionally we wrote this line to achieve above excepted exception to pass the test
		driver.quit();
	}
}

/*
 * In above exceptedException, we are verifying that the mentioned exception is occurred or not 
 * thats way we are adding one line to find id which is not there but to pass the test we need 
 * to add and if we find the expected exception and current occurred exception is same then it 
 * will execute that test.
 * 
 * In real time we are not using in our project very rare case might be used this thing
 * but as interview purpose we need to learn this concept
*/