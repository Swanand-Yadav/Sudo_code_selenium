package Running_the_multiple_test_case_in_TestNG;

public class Student 
{
	int rollNo;
	String name;
	
	Student(int rollNo,String name)
	{
		this.rollNo=rollNo;
		this.name=name;
		System.out.println(rollNo+"="+name);
	}
}
