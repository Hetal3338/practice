package com.project1.sample2;

import java.util.Scanner;

public class ReverseString
{
	public static void main(String arg[])
	{
		String str;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a string you want to revarse:");
		str=scanner.nextLine();
		String reverse=" ";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
			
		}
		System.out.println("Reverse string is");
		System.out.println(reverse);
	}
}
