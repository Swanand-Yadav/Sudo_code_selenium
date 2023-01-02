package Sudo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Broken_Links 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://randomuser.me/");
		URL url = new URL("https://randomuser.me/");
        HttpURLConnection http = (HttpURLConnection)url.openConnection();
        int statusCode = http.getResponseCode();
       
        if(statusCode>200)
        {
        	System.out.println("This is broken link");
        }
        else
        {
        	System.out.println("Status code is: "+statusCode);
        }
        
        driver.quit();
	}

}
