package com.project1.sample1;

import java.util.Scanner;

public class Armstrong 
{
	public static void main(String arg[])
	{
		int a,c                                  =0,temp;
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter any value");
		n=scanner.nextInt();
		temp=n;
		
		while(n>0)
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		if(temp==c)
			System.out.println("amstrong number");
		else
			System.out.println("not amstrong number");
		
	}
}
