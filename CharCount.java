package packge;

import java.util.Scanner;

public class CharCount 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Input: ");
		String s=sc.nextLine();
		char arr[]=s.toCharArray();
		int j=0,count;
		while(j<arr.length)
		{
			count=0;
		for(int i=0;i<s.length();i++)
		{
			int in=s.indexOf(arr[j]);
			if(in==-1)
			{
				break;
			}
			String str1=s.substring(0, in);
			String str2=s.substring(in+1,s.length());
			s=str1.concat(str2);
			count++;
		}
		if(count!=0)
			System.out.println(arr[j]+"= "+count);
		j++;
		
		}
	}

}
