package TestNG_parallel;

import org.testng.annotations.Test;

public class class1 
{	
	@Test
	public void test_method1()
	{
		System.out.println("TestClass1>>testMethod1>>"+Thread.currentThread().getId());	
	}
	
	@Test
	public void test_method2()
	{
		System.out.println("TestClass1>>testMethod2>>"+Thread.currentThread().getId());	
	}
	
}
