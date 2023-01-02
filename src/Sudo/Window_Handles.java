package Sudo;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handles 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://randomuser.me/");
		String parent=driver.getWindowHandle();
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://opensource.saucelabs.com/");
		driver.switchTo().window(parent);// This is recent window, all operations will performed on recent window.
		
		String str=driver.getTitle();
		String str1=driver.getCurrentUrl();
		System.out.println(str+" === "+str1);// It will confirm that which recent window is considered.
		
		Set<String>  handle= driver.getWindowHandles();// We take Set because windows always unique.
		Iterator<String> itr = handle.iterator();
	
		while(itr.hasNext())
		{
			System.out.println(itr.next());// It return one single window name as a String.	 
		}
		//System.out.println(handle); // we can print only this Iterator is optional 
	}
}
