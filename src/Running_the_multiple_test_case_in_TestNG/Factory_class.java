package Running_the_multiple_test_case_in_TestNG;

import org.testng.annotations.Factory;

public class Factory_class 
{
	@Factory
    public Object[] factoryMethod() 
	{
      return new Object[]{ new Student(1,"sharu"), new Employee() };
    }
}

/*
 * @Factory and @dataProvider both are used for implement Data Driven testing. But there is a 
 * small difference is that -> 
 *  
 * @Factory is apply to run all methods inside a test class with different sets of data.
 * 
 * @dataProvider is apply to specific methods inside a test class with different sets of data.
 * 
 * For info click on- https://www.linkedin.com/pulse/testng-using-dataprovider-factory-harshit-kohli/
 *
*/