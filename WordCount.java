package packge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCount 
{
	public static void main(String[] args) 
	{
		TreeMap<String, Integer> map=new TreeMap<>();
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Input: ");
		String s=sc.nextLine();
		String arr[]=s.split(" ");
	
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				int c=map.get(arr[i]);
				map.put(arr[i], ++c);
			}
			else
				map.put(arr[i], 1);	
		}
		Comparator<String> comp=new Comparator<String>() 
		{
			public int compare(String o1, String o2) 
			{
				if(map.get(o2).compareTo(map.get(o1))==0)
					return map.get(o2);
				else
					return map.get(o2).compareTo(map.get(o1));
			}	
		};
		TreeMap<String, Integer> map1=new TreeMap<>(comp);
		map1.putAll(map);
		for(Map.Entry<String, Integer> entry:map1.entrySet())
		{
			System.out.println(entry.getKey()+"= "+entry.getValue());
		}
	
	}
}
