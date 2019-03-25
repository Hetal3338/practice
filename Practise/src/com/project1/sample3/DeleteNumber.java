package com.project1.sample3;

import java.util.Scanner;

public class DeleteNumber 
{
	public static void main(String arg[])
	{
		int n,del,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of element:");
		n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter elements:");
		
		for(int i=0;i<n;i++)
		{
		System.out.println("enter "+(i+1)+" element:");
		a[i]=sc.nextInt();
		}
		System.out.println("Enter the element you want to delete");
		del=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i]==del)
			{
				for(int j=i;j<n-1;j++)
				{
					a[j]=a[j+1];
				}
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("element not found!!");
		}
		else
		{
			System.out.println("element delet suceessfully");
			System.out.println("the array is :");
			for(int i=0;i<n-1;i++)
			{
				System.out.println(a[i]+" ");
			}
		}
	
	}

}