package Sudo;

import java.time.Duration;
import java.util.HashMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Download_file_by_chrome 
{
	public static void main(String[] args) 
	{
		String fileType="DOC"; // You can change file type from here as the we make dynamic xpath.
    	System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
    	
    	ChromeOptions options=new ChromeOptions();
    	HashMap<String, Object> Prefs=new HashMap<>();
    	Prefs.put("plugins.always_open_pdf_externally", true); 
    	//Prefs.put("download.default_directory", "C:\\Users\\admin\\Documents\\tempDownload");
    	options.setExperimentalOption("prefs", Prefs);
    	
    	WebDriver driver=new ChromeDriver(options); 
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    	
    	driver.get("https://file-example.com/en/sample-documents-files"); 
    	driver.findElement(By.xpath("//td[text()='"+fileType+"']/parent::tr/td[3]/a")).click();
    	driver.findElement(By.xpath("//a[text()='Download']")).click();
	}
}


/*
 * prefs.put("plugins.always_open_pdf_externally", true); <- Here true means it will download in computer local
 * system and if it is false then it will just open in browser but not download.
 * 
 * Prefs.put("download.default_directory", "C:\\Users\\admin\\Documents"); <- I can set my download path
 */
