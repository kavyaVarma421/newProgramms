package com.bridgelabz.alg;

import java.util.Scanner;

public class PrimeAnagram 
{
	public static void prime(int end)
	{
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
				palindrome(i);
			}
		}
	}
	public static void palindrome(int n)
	{
	    int remainder, reversedint=0, originalint;
	    originalint=n;
	 while(n!=0)
	 {
	      remainder=n%10;
	      reversedint=reversedint*10+remainder;
	      n=n/10;
	 }
	 if(originalint==reversedint)
	 {
	    System.out.print(originalint+" ");
	 }
	
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the starting number: ");
		int start = sc.nextInt();
		System.out.println("enter the end number: ");
		int end = sc.nextInt();
		
		System.out.println("the prime anagram numbers are: ");
		prime(end);
	}
	


}
