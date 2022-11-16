package Sudo;

public class code1 {

	public static void main(String[] args) 
	{
		String str="i am boy"; // boy am i
		int counter=0,counter1=0;
		String arr[]=str.split(" ");
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+" ");
		}
	
	}

}

/*

public class code1 {

	public static void main(String[] args) 
	{
		String str="i am boy"; // y ob mai
		int counter=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				System.out.print(' ');
			}
			else
			{
				if((str.length()-1)-counter==' ')
				{
					counter++;
				}
				else {
					System.out.print(str.charAt((str.length()-1)-counter));
					counter++;
				}
			}
		}
	}

}

 */ 
