package com.project1.sample3;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args)
	{
	int nov,search;
	int[] num=new int[100];
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of elements: ");
	nov=sc.nextInt();
	
	for(int i=0;i<nov;i++)
		{
		System.out.println("Enter "+(i+1)+" elements:");
		num[i]=sc.nextInt();
		}
		System.out.println("Enter value to find:");
		search=sc.nextInt();
	
	for(int i=0;i<nov;i++)
	{
	
		 
		if(num[i]==search)
		{
			System.out.println(search+ "is present at location " +(i+1));
			break;
		}
		if(num[i]==nov)
		{
			System.out.println(search+ "isnt present in array.");
		}
		
	}
}

}
