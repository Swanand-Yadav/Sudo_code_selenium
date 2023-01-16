package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver ldriver;// Local driver

	public LoginPage(WebDriver rdriver)// Remote driver
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this); 
	}

	@FindBy(how = How.XPATH, using ="//input[@name='uid']")
	WebElement UserIDTextBox;
	
	@FindBy(how = How.XPATH, using ="//input[@name='password']")
	WebElement passwordTextBox;

	@FindBy(how = How.XPATH, using ="//input[@name='btnLogin']")
	WebElement btnClick;
	
	public void setEmail(String uid) 
	{
		UserIDTextBox.sendKeys(uid);
	}

	public void setPassword(String strPassword) 
	{
		passwordTextBox.sendKeys(strPassword);
	}
	
	public void Clickbtn() 
	{
		btnClick.click();
	}
}

