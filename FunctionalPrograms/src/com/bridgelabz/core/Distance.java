package com.bridgelabz.core;

import java.util.Scanner;

public class Distance 
{
	static void cal(int x, int y)
	{
		double z = Math.pow((x * x+y * y), 0.5);
		System.out.println("Distance is " +z);
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			System.out.println("enter number x: ");
			int x = sc.nextInt();
			System.out.println("enter number y: ");
			int y = sc.nextInt();
			cal(x,y);
			sc.close();
		}catch(Exception e)
		{
			System.out.println("enter correct input: ");
		}
	}

}
