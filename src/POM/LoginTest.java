package POM;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase 
{
		
	@Test
	public void textTest() 
	{
		boolean flag= driver.findElement(By.xpath("//td[contains(text(),'Manger Id : mngr451707')]")).isDisplayed();
		System.out.println(flag);
		Assert.assertTrue(flag);
	}
	
	@Test
	public void init() throws Exception 
	{
		LoginPage loginpage=new LoginPage(driver);
		loginpage.setEmail("mngr451707");
		loginpage.setPassword("zAmYseq");
		loginpage.Clickbtn();
	}
	
	@Test
	public void testValidText()   
	{
		String val=driver.findElement(By.xpath("//td[contains(text(),'Manger Id : mngr451707')]")).getText();
		System.out.println(val);
		Assert.assertEquals(val, "Manger Id : mngr451707----------");
	}
}

