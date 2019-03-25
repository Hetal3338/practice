package com.project1.sample1;

import java.util.Scanner;

public class Factorial 
{
	public static void main(String arg[])
	{
		int num;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any value");
		num=scanner.nextInt();
		int result=factorial(num);
		System.out.println("Result:"+result);
	}
	public static int factorial(int num)
	{
		if(num==1 || num==0)
			return 1;
		return factorial(num-1)*num;
					
	}
}
