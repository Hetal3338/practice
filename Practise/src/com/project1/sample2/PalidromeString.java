package com.project1.sample2;

import java.util.Scanner;

public class PalidromeString
{
	public static void main(String arg[])
	{
		String str,rev="";
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string:");
		str=scanner.nextLine();
		//int length=str.length();
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev= rev+str.charAt(i);
		}
			
			if(str.equalsIgnoreCase(rev))
			
				System.out.println(str+" is a polidrome");
			
			else
			
				System.out.println(str+" is not polidrome");
			
		
	}
}
