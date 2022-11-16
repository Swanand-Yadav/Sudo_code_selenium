package Sudo;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/*
 * In SoftAssert if any assert line having fail/pass result still rest of line will be executed 
 * But softAssert1.assertAll(); is mandatory at the end of every testCase line otherwise test case 
 * result will show pass. And for every testCase there should be a new object creation for every  
 * test if we use same then it will capture same object result for all testCase.
 */

public class Soft_assert 
{
	SoftAssert softAssert1=new SoftAssert();
	SoftAssert softAssert2=new SoftAssert();
	
	@Test
	public void Test1()
	{
		int a=11;
		int s=10;
		boolean val=a==s;
		softAssert1.assertTrue(val);//It will return fail
		softAssert1.assertFalse(true); // It will return fail
		System.out.println("I am the bottom of Test1");
		softAssert1.assertAll();// This statement is mandatory for throwing an exception or error 
	}
	
	@Test
	public void Test2()
	{
		int a=10;
		int s=10;
		boolean val=a==s;
		softAssert2.assertTrue(val);//It will return true
		System.out.println("I am the bottom of Test2");
		softAssert2.assertAll();
	}
}
