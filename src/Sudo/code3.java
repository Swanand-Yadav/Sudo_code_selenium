package Sudo;
import java.util.ArrayList;

// add two largest num which we can not save in int or long
public class code3 {

	public static void main(String[] args) 
	{
		String num1="2198";
		String num2="429";
		String val1,val2;
		int add=0,count=0,flag=0;
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		if(num1.length()>=num2.length())
		{
			val1=num1;
		}else {
			val1=num2;
		}
		
		if(val1!=num2)
		{
			val2=num2;
		}else
		{
			val2=num1;
		}
		
		for(int i=val1.length()-1;i>=0;i--)
		{
			if(i>(val2.length()-1))
			{
				add=val1.charAt(i)+flag;
				flag=0;
			}
			else
			{
				
				add=val1.charAt(i)+val2.charAt((val2.length()-1)+count)+flag;
				count++;
				
				if(add>9)
				{
					String t=Integer.toString(add);
					flag=t.charAt(0);
					al.add((int) t.charAt(1));
				}
			}
		}
		
		Object[] obj = al.toArray();
		for(int k=obj.length-1;k>=0;k--)
		{
			System.out.println(obj[k]);
		}
	}

}
