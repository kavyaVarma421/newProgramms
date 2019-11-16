package com.bridgelabz.unit;

import java.util.Scanner;

public class ToBinary 
{
	
static String decToBinary(int n)
{

		String out = "";
		
	while(n != 0)
	{
		int rem = n % 2;
		
		out = rem+out;
		n = n/2;
	}
     
	return out;
	
}

public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the dec num: ");
	int n = sc.nextInt();
	
		
		  System.out.println("the binary no  is -->" +decToBinary(n)); String str =
		  decToBinary(n);
		 
		 
	
	
}
}
