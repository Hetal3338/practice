package com.project1.sample2;

import java.util.Scanner;

public class CapitalString 
{
	public static void main(String arg[])
	{
		String str;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string:");
		str=scanner.nextLine();
		
		StringBuilder result=new StringBuilder(str.length());
		String words[]=str.split("\\ ");
		
		for(int i=0;i<words.length;i++)
		{
			result.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1)).append(" ");
		}
		System.out.println(result);
	}
}
