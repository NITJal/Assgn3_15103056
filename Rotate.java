package packge;

import java.util.Scanner;

public class Rotate 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the string: ");
		String s=sc.nextLine();
		System.out.println("Output:");
		for(int i=0;i<s.length();i++)
		{
			String str1=s.substring(0, 1);
			String str2=s.substring(1, s.length());
			s=str2.concat(str1);
			System.out.println(s);
		}
	}
}
