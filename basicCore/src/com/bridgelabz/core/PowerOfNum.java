package com.bridgelabz.core;

import java.util.Scanner;

public class PowerOfNum 
{
 public static void main(String[] args)
 {
	 Scanner s = new Scanner(System.in);
	 System.out.println(" enter a number:");
	 int n = s.nextInt();
	 int power = 1;
	 int i = 0;
	 while(i <=n )
	 {
		 System.out.println("2^"+i+" = " +power);
		 power = power*2;
		 i++;
	 }
	 
	 
 }
	
}
