package com.project1.sample1;
import java.util.Scanner;
public class LargestNumber
{
	public static void main(String arg[])
	{
	int x,y,z;
	System.out.println("Enter three integers");
	Scanner scanner=new Scanner(System.in);
	
	x=scanner.nextInt();
	y=scanner.nextInt();
	z=scanner.nextInt();
	
	if(x>y && x>z)
		System.out.println("first is largest.");
	else if(y>x && y>z)
		System.out.println("second is largest");
	else if(z>x && z>y)
		System.out.println("third is largest");
	else
		System.out.println("All are equal");
	}
}