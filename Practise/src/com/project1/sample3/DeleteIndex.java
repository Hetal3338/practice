package com.project1.sample3;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class DeleteIndex {
public static void main(String[] args) 
	{
		int n,delIndex;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number of elements: ");
		n=sc.nextInt();
			int a[]=new int[n];
		System.out.println("enter elements:");
		
		for(int i=0;i<n;i++)
		{
			System.out.println("enter "+(i+1)+" element:");
			a[i]=sc.nextInt();
		}
		System.out.println("Enter a index number you want to delete:");
		delIndex=sc.nextInt();
		
		for(int i=delIndex;i<(n-1);i++)
		{
			a[i]=a[i+1];
		}
		System.out.println("element:"+Arrays.toString(a));
	}
}