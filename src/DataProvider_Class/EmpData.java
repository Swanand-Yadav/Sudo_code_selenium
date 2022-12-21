package DataProvider_Class;

import org.testng.annotations.Test;

public class EmpData // extends DPClass OR use dataProviderClass=DPClass.class in @Test parameter
{
	
	@Test(dataProvider="getData", dataProviderClass=DPClass.class)
	public void testCaseData(String Greeting, String Communication, String Id)
	{
		//Test will execute 3 times with 3 different sets ( as in getData() there is 3 data sets ).
		System.out.println(Greeting+Communication+Id);
	}
}
