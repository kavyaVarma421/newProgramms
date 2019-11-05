package com.bridgelabz.alg;

import java.util.Scanner;

public class PrimeNumbers 
{
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the starting number: ");
	int start = sc.nextInt();
	System.out.println("enter the end number: ");
	int end = sc.nextInt();
	System.out.println("the prime numbers between " +start +" and" +end+ " is:");
	
	for(int i = 1;i <= end;i++)
	{
		int count = 0;
		for(int j = i;j >= 1;j--)
		{
			if(i%j == 0)
			{
				count++;
				
			}
		}
		if(count == 2)
		{
			System.out.print(i+" ");
		}
	}
}
}
