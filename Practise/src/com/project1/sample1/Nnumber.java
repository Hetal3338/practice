package com.project1.sample1;

import java.util.Scanner;

public class Nnumber
{
	public static void main(String arg[])
	{
		int nov;
		int[] num=new int[100];
		int biggest,smallest;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter how much value you want to entered");
		nov=scanner.nextInt();
		
		for(int i=0;i<nov;i++)
		{
			System.out.println("Enter "+(i+1)+"th value");
			num[i]=scanner.nextInt();
		}
		smallest=num[0];
		biggest=num[0];
		
		for(int j=0;j<nov;j++)
		{
			if(smallest>num[j])
			{
				smallest=num[j];
			}
		}
		for(int j=0;j<nov;j++)
		{
			if(biggest<num[j])
			{
				biggest=num[j];
			}
		}
		System.out.println("smallest:"+smallest);
		System.out.println("biggest:"+biggest);
	}
}