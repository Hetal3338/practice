package com.project1.sample2;

import java.util.Scanner;

public class WordCount
{
	public static void main(String arg[])
	{
		String s;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string:");
		s=scanner.nextLine();
		
		int count=1;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==' ' && (s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("Nuber of word in given string:"+count);
	}
}
