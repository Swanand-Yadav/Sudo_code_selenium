package Sudo;


import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * In hard assert if any test fail due to any single assertion then rest of statements will not 
 * execute and if all asset lines are passed then hole test be passed this is know as Hard assert.
 */

public class Hard_assert 
{
	@Test
	public void Test1()
	{
		int a=10;
		int s=10;
		boolean val=a==s;
		Assert.assertTrue(val);// It will return test pass
		Assert.assertEquals("Sharu", "sharu");//It will return test fail
		System.out.println("I am the bottom of Test1");
	}
	
	@Test
	public void Test2()
	{
		int a=10;
		int s=10;
		boolean val=a==s;
		Assert.assertTrue(val);// It will return test pass
		Assert.assertEquals("Sharu", "Sharu");//It will return test pass
		System.out.println("I am the bottom of Test2");
	}
}
