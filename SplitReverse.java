package packge;

import java.util.Scanner;

public class SplitReverse 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String s=sc.nextLine();
		String arr[]=s.split("\\s");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=arr[i].length()-1;j>=0;j--)
			{
				System.out.print(arr[i].charAt(j));
			}
			System.out.print(" ");
		}
	}

}
