package com.project1.sample3;

import java.util.Scanner;

public class CountOccurrence {

	public static void main(String[] args) 
	{	int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of element:");
		n=sc.nextInt();
		
		int[] num=new int[n];
		int[] count=new int[n];
		int i,temp=0;
		System.out.println("enter elements:");
		for( i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
			if(num[i]==0)
			{
				break;
			}
		}
		for( i=0;i<num.length;i++)
		{
			temp=num[i];
			count[temp]++;
		}
		for(i=1;i<count.length;i++)
		{
			if(count[i]>0 && count[i]==1)
			{
				System.out.printf("%d occurs %d time\n",i, count[i]);
			}
			else if(count[i]>=2)
			{
				System.out.printf("%d occurs %d time\n",i, count[i]);
			}
		}

	}

}
