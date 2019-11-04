package com.bridgelabz.core;

import java.util.Scanner;

public class FlipCoin 
{
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter how many flips you want:");
		int flip = sc.nextInt();
		int head = 0;
		int tail = 0;
		int count = 1;
		double randumNum = 0.0;
		
		while(count <= flip)
		{
			randumNum = Math.random();
			System.out.println(count+ "\t" +randumNum);
			
			if(randumNum <= 0.5)
			{
				head++;
				System.out.println("\t head");
			}
			else
			{
				tail++;
				System.out.println("\t tail");
			}
			count++;
		}
		System.out.println();
		System.out.println("no of heads = " +head);
		System.out.println("no of tails = " +tail);
		
	}

}
