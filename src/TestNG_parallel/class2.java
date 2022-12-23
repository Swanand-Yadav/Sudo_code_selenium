package TestNG_parallel;

import org.testng.annotations.Test;

public class class2 
{	
	@Test
	public void test_method3()
	{
		System.out.println("TestClass2>>testMethod3>>"+Thread.currentThread().getId());	
	}
	
	@Test
	public void test_method4()
	{
		System.out.println("TestClass2>>testMethod4>>"+Thread.currentThread().getId());	
	}
	
	@Test
	public void test_method5()
	{
		System.out.println("TestClass2>>testMethod5>>"+Thread.currentThread().getId());	
	}	
}
