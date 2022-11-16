package POM;

import org.testng.annotations.Test;

public class LoginTest extends TestBase {
	
	@Test
	public void init() throws Exception 
	{
		LoginPage loginpage=new LoginPage(driver);
		loginpage.setEmail("mngr451707");
		loginpage.setPassword("zAmYseq");
		loginpage.Clickbtn();
	}
}

