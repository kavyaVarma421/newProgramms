package com.bridgelabz.core;

import java.util.Scanner;

public class Harmonic 
{
public static void main(String[] args)
{
	Scanner s = new Scanner(System.in);
	System.out.println("enter the no:");
	int n = s.nextInt();
	double sum = 0.0;
	for(int i = 1; i <= n; i++)
	{
		sum = sum+(double)1/i;
	}
	System.out.println(sum);
}
	
	
}
