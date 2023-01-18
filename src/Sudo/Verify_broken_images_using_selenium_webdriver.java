package Sudo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_broken_images_using_selenium_webdriver
{
	public static void VerifyBrokenImagesUsingSelenium() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://the-internet.herokuapp.com/broken_images");
    	
    	List<WebElement> images=driver.findElements(By.tagName("img"));
    	System.out.println(images.size());
    	
    	String imageSrc;
    	for(WebElement image:images)
    	{
    		imageSrc=image.getAttribute("src");
    		try 
    		{
				URL url = new URL(imageSrc);
				URLConnection urlConnection = url.openConnection();
				HttpURLConnection httpURLConnection = (HttpURLConnection) urlConnection;
				httpURLConnection.setConnectTimeout(3000);// Applied some waits because might be take some time.
				httpURLConnection.connect();// It will send the request to server.
				
				if (httpURLConnection.getResponseCode() == 200) 
				{
					System.out.println(imageSrc + ">> " + httpURLConnection.getResponseCode() + " >>"
							+ httpURLConnection.getResponseMessage());
				} 
				else 
				{
					System.err.println(imageSrc + ">> " + httpURLConnection.getResponseCode() + " >>"
							+ httpURLConnection.getResponseMessage());
				}
				httpURLConnection.disconnect();
			} 
    		catch (Exception e) 
    		{
				System.err.println(imageSrc);
				// If except status code anything error occurred then it will be captured in this block.
			}
    	}
    	driver.close();
	}
	
	public static void main(String[] args) throws IOException 
	{
		VerifyBrokenImagesUsingSelenium();
	}
}
