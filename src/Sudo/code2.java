package Sudo;
/*
public class code2 {
	public boolean isAnagram(String s, String t) 
    {
		int count=0,i,j=0;
		if(s.length()!=t.length())
		{
			return false;
		}
		for( i=0;i<s.length();i++)
		{
			for( j=0;j<t.length();j++)
			{
				if(s.charAt(i)==t.charAt(j))
				{
					count=1;
				}
			}
			if(count!=1)
			{
				return false;
			}
			count=0;
		}
		if(i==s.length())
		{
			return true;
		}
		return false;
    }
	public static void main(String[] args) 
	{
		String a1="aacc";
		String a2="ccac";
		code2 c=new code2();
		System.out.println(c.isAnagram(a1, a2));
	}
}
*/


public class code2 {

	public static void main(String[] args) 
	{
		String a1="aacc";
		String a2="ccac";
		int count=0,i,j=0;
		for( i=0;i<a1.length();i++)
		{
			if(a1.length()!=a2.length())
			{
				System.out.println("no anagram due to length");
				break;
			}
			for( j=0;j<a2.length();j++)
			{
				if(a1.charAt(i)==a2.charAt(j))
				{
					count=1;
				}
			}
			if(count!=1)
			{
				System.out.println("no anagram due to different characters");
				break;
			}
			count=0;
		}
		if(i==a1.length())
		{
			System.out.println("It's anagram...!");
		}
	}
}
