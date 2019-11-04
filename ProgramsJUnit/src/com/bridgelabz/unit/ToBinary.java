package com.bridgelabz.unit;

import java.util.Scanner;

public class ToBinary 
{
	
static String decToBinary(int n)
{
		String out = " ";
	while(n > 0)
	{
		int rem = n % 2;
		out = out + rem;
		n = n/2;
	}
     
	return out;
	
}
static int binaryToDec(int num)
{
	
	int out1 = 0, a = 0;
	while(num > 0)
	{
		int rem = num % 10;
		out1 = (int) (out1 + rem * Math.pow(2, a++));
		num = num/10;
	}
	
	return out1;
	
}
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the dec num: ");
	int n = sc.nextInt();
	
	System.out.println("the binary no  is -->" +decToBinary(n));
	String str = decToBinary(n);
	int s = Integer.parseInt(str);
	int num = binaryToDec(s);
	System.out.println("value is "+binaryToDec(num));
	
}
}