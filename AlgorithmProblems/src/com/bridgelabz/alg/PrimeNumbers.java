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
	
	for(int i = 2;i < end;i++)
	{
		int count = 0;
		for(int j = 2;j < i;j++)
		{
			if(i%j == 0)
			{
				count++;
				break;
			}
		}
		if(count == 0)
		{
			System.out.print(i+" ");
		}
	}
}
}
