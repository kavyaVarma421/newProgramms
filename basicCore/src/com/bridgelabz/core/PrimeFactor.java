package com.bridgelabz.core;

import java.util.Scanner;

public class PrimeFactor 
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number:");
		int n = s.nextInt();
		
		for(int i = 2;i <=n;i++)
		{
			while(n % i == 0)
			{
				System.out.print(i+" ");
				n = n/i;
			}
		}
			if(n>2)
			{
				System.out.println(n);
			}
		}
		
		
		
	

}
