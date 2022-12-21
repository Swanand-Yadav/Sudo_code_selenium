package DataProvider_Class;

import org.testng.annotations.DataProvider;

public class DPClass 
{
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data= {{"Hello","text","1"},{"bye","Message","32"},{"solo","call","678"}}; // We are taking superclass object bcoz data maybe string or numeric
		return data;
	}
}
