package TestNG_parallel;
import org.testng.annotations.Test;

public class class3 
{
	@Test
	public void test_method6()
	{
		System.out.println("TestClass3>>testMethod6>>"+Thread.currentThread().getId());	
	}
	
	@Test
	public void test_method7()
	{
		System.out.println("TestClass3>>testMethod7>>"+Thread.currentThread().getId());	
	}
	
	@Test
	public void test_method8()
	{
		System.out.println("TestClass3>>testMethod8>>"+Thread.currentThread().getId());	
	}
}
