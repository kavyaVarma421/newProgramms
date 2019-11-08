package com.bridgelabz.unit;

import java.util.Scanner;

public class Binary 
{
	    public static int swapNibbles(int n)
	    {
	    	
			return ((n & 0x0F)<<4 | (n & 0xF0)>>4);
	    	
	    }
	    public static void main(String[] args) 
	    {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the number: ");
		 int n = sc.nextInt();
		 int s = swapNibbles(n);
		 System.out.println("after the swaping the no is: "+s);
		 
		 
		}
}
