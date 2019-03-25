package com.project1.sample3;

import java.util.Scanner;

public class NnumDisplay 
{
	public static void main(String arg[])
	{
		int[] array=new int[100];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of element:");
		int n=sc.nextInt();
		
		
		for(int i=0;i<n;i++)
		{
			System.out.println("enter "+(i+1)+" numbers:");
			array[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			System.out.println("given numeber are " +array[i]);
		}
	}
}
