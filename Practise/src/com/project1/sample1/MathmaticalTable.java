package com.project1.sample1;

import java.util.Scanner;

public class MathmaticalTable
{
	public static void main(String arg[])
	{
		int n=0;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any value:");
		n=scanner.nextInt();
		//for(n=1;n<=10;n++)
		//{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+" * "+i+" = "+n*i);
		}
		}
	}
//}
