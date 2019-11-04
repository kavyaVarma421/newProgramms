package com.bridgelabz.unit;

import java.util.Scanner;

public class SquareRoot 
{
	public static double sqrt(double c)
	{
		double t = 0;
		t = c;
		double epsilon = 1e-15;
		do {
			t = (c/t + t)/2.0;
		}while (Math.abs(t - c/t) > epsilon*t);
		
		return t;
		
	}
	  public static void main(String[] args) { 

	      Scanner sc = new Scanner(System.in);
	      System.out.println("enter the t value: ");
	      double c = sc.nextDouble();
	       double k = sqrt(c);
	    System.out.println("the result is: " +k);
		
		  
	    }

}
