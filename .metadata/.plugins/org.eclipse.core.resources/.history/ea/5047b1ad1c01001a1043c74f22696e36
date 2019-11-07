package com.bridgelabz.logic;

import java.util.Scanner;

public class StopWatch 
{
 
	static double start = 0, end = 0;
	
	static void startTime()
	{
		start = System.currentTimeMillis();
		System.out.println("time started at " +start);
	}
	
	static void stopTime()
	{
		end = System.currentTimeMillis();
		System.out.println("time stopped at " +end);
	}
	
	static void elapseTime()
	{
		System.out.println("elapsed times is " +(end - start)/1000);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1 to start ");
		sc.hasNext();
		startTime();
		System.out.println("enter to stop ");
        sc.hasNext();
        stopTime();
        elapseTime();
	}
}
