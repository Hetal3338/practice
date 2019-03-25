package com.project1.sample3;

import java.util.Scanner;

public class DuplicateCount 
{
	public static void main(String arg[])
	{
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number of element:");
	n=sc.nextInt();
	
	int a[]=new int[n];
	System.out.println("enter element:");
	for(int i=0;i<n;i++) 
	{
	System.out.println("enter "+(i+1)+" element:");	
	a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
			if((a[i]==a[j]) && i!=j)
			{
				System.out.println("Duplicate element:"+a[j]);
			}
		}
	}
	
	}
}




