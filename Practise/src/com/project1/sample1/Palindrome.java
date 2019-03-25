package com.project1.sample1;

import java.util.Scanner;

public class Palindrome
{
	public static void main(String arg[])
	{
		int r,sum=0,temp;
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any value:");
		n=scanner.nextInt();
		temp=n;
		while(n>0)
		{
		r=n%10;
		n=n/10;
		sum=(sum*10)+r;
		}
		if(temp==sum)
			System.out.println("palindrome number");
		else
			System.out.println("not palindrome number");
	}
}
