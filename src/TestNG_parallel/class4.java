package TestNG_parallel;
import org.testng.annotations.Test;

public class class4 
{
	@Test
	public void test_method9()
	{
		System.out.println("TestClass4>>testMethod9>>"+Thread.currentThread().getId());	
	}
	
	@Test
	public void test_method10()
	{
		System.out.println("TestClass4>>testMethod10>>"+Thread.currentThread().getId());	
	}
}
