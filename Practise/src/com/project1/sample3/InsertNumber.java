package com.project1.sample3;

import java.util.Scanner;

public class InsertNumber {

	public static void main(String[] args)
	{
		int n,pos,x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter nuber of elements");
		n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("enter elements");
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter "+(i+1)+"th element : ");
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the position of element you want to insert:");
		pos=sc.nextInt();
		System.out.println("Enter element you want to insert:");
		x=sc.nextInt();
		
		a[pos-1]=x;
			System.out.println("After inserting:");
			for(int i=0;i<n;i++)
			{
				System.out.println(a[i]+" ");
			}
	}
}
