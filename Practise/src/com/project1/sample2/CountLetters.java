package com.project1.sample2;
import java.util.Scanner;
public class CountLetters
{
	static final int max=256;
	static void getchar(String str)
	{
		int count[]=new int[max];
		int len=str.length();
		for(int i=0;i<len;i++)
		count[str.codePointAt(i)]++;
		
		char ch[]=new char[str.length()];
		for(int i=0;i<len;i++) 
		{
			ch[i]=str.charAt(i);
			int find=0;
			for(int j=0;j<=i;j++)
			{
				if(str.charAt(i)==ch[j])
						find++;
			}
			{
			if(find==1)
				System.out.println("number of occurrence of "+str.charAt(i)+" is: "+count[str.charAt(i)]);
			}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("enter a string:");
		str=sc.nextLine();
		getchar(str);
	}
}