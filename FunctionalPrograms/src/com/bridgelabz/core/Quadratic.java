package com.bridgelabz.core;

import java.util.Scanner;

public class Quadratic 
{
	public static void roots(int a, int b, int c)
	{
		int delta = Math.abs(b*b - 4*a*c);
		double x1 = (-b + Math.pow(delta, 1/2))/(2*a);
		double x2 = (-b - Math.pow(delta, 1/2))/(2*a);
		System.out.println("first root is " +x1);
		System.out.println("second root is " +x2);
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("enter number a:");
			int a = sc.nextInt();
			System.out.println("enter number b:");
			int b = sc.nextInt();
			System.out.println("enter number c:");
			int c = sc.nextInt();
			roots(a,b,c);
		}catch(Exception e)
		{
			System.out.println("enter correct input:");
		}
		sc.close();
		
	}
	

}
