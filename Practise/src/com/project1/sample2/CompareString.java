package com.project1.sample2;

import java.util.Scanner;

public class CompareString 
{
	public static void main(String arg[])
	{
		String s1,s2;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter first string");
		s1=scanner.nextLine();
		
		System.out.println("Enter second string");
		s2=scanner.nextLine();
		
		if(s1.compareTo(s2) < 0)
			System.out.println("the first string is greater than second string.");
			
		else if(s1.compareTo(s2) > 0)
			System.out.println("the first string is smaller than second string.");
		
		else
			System.out.println("both are same");

	}
}
