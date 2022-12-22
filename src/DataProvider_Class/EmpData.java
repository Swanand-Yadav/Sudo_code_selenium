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

/* In above we can use dataProvider using extends class DPClass also if not then use parameter 
 * dataProviderClass=DPClass.class in @Test annotation or without parameter with extending class.
 * 
 * But we can not extend even it gives correct answer because if our class is already extended by
 * another class then that we can extend our DPClass as java doesn't support multiple inheritance
 */
