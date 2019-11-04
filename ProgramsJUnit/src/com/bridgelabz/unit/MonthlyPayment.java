package com.bridgelabz.unit;

import java.util.Scanner;

public class MonthlyPayment 
{
	static double calculationOfPayment(double P, int Y, double R)
	{
		double n = 12 * Y;
		double r = R/(12 * 100);
		
		double payment = (P * r)/(1-Math.pow(1+r, -n));
		
		
		return payment;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter principle amount p: ");
		double P = sc.nextDouble();
		System.out.println("enter how many years to pay ");
		int Y = sc.nextInt();
		System.out.println("enter the rate of interest: ");
		double R = sc.nextDouble();
		
		double payment = calculationOfPayment(P, Y, R);
		System.out.println("monthly payment is: " +payment);
		
		
	}
}
