package com.project1.sample1;
import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String arg[])
	{
		int j,x,flag=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any number:");
		x=scanner.nextInt();
		for(j=2;j<x;j++)
		{
			if(x%j==0)
			{
				flag=0;
				break;
			}
			else
			{
				flag=1;
			}
		}
		if(flag==1)
		{
			System.out.println("The "+x+" is a prime number.");
		}
		{
			System.out.println("The "+x+" is not a prime number.");
		}
	}
}
