package com.bridgelabz.core;

import java.util.Scanner;

public class WindChill 
{
static void windChil(int t, int v)
{
	double w = 35.7 + 0.6215 * t + (0.425 * t - 35.75) * Math.pow(v, 0.16);
	System.out.println("solution is " +w);
}
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	
	try {
		System.out.println("enter the  Fahrenheit value ");
		int t = sc.nextInt();
		System.out.println("enter the wind speed ");
		int v = sc.nextInt();
		if(Math.abs(t) > 50 || v > 120 || v < 3 )
		{
			System.out.println("enter correct values: ");
		}else
		{
			windChil(t, v);
		}
		
		sc.close();
	}catch(Exception e)
	{
		System.out.println("enter the correct value ");
	}
	
}
}
