package Running_the_multiple_test_case_in_TestNG;

import java.util.ArrayList;
import java.util.List;
import org.testng.TestNG;

public class TestNGRunner 
{
	public static void main(String[] args) 
	{
		// Create an object of TestNG
		TestNG tstng=new TestNG();
		
		// Define list
		List<String> suites= new ArrayList<>();
		
		// Add the TestNG.xml file OR we can add multiple XML file also or Single
		suites.add("C:\\Users\\admin\\Selenium_sudo_code\\src\\Running_the_multiple_test_case_in_TestNG\\TestNG.xml");
		suites.add("C:\\Users\\admin\\Selenium_sudo_code\\src\\Running_the_multiple_test_case_in_TestNG\\TestNG2.xml");
		
		// Set the suites to run
		tstng.setTestSuites(suites);
		
		// Call the run method to run the test cases from XML file 
		tstng.run();	
	}
}
