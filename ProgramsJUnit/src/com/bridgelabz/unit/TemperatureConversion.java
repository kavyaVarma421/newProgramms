package com.bridgelabz.unit;

import java.util.Scanner;

public class TemperatureConversion 
{

 public static void  conversion(double f, double c)
 {
	 double celToFahrenhit = (c * 9/5) + 32;
	 double fahrenhitToCel = (f - 32) * 5/9;
	 
	System.out.println("changing the temperature celcius to fahrenhit is f = " +celToFahrenhit);
	System.out.println("changing the temperature fahrenhit to celcius is c = " +fahrenhitToCel);
	
 }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter fahrenhit value:");
		double f = sc.nextDouble();
		System.out.println("enter celcious value:");
		double c = sc.nextDouble();
		conversion(f, c);
		
	}
	
}
