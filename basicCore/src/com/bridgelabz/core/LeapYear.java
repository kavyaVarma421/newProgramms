package com.bridgelabz.core;

import java.util.Scanner;

public class LeapYear 
{
public static void main(String[] args)
{
	
	Scanner s = new Scanner(System.in);
	System.out.println("enter the year:");
	int n = s.nextInt();
	if(((n % 4 == 0) && (n % 100 != 0)) || (n % 400 == 0))
	{
		System.out.println(" it is leap year ");
	}
	else
	{
	System.out.println(" not a leap year ");
	}
	
}
	
	
}
