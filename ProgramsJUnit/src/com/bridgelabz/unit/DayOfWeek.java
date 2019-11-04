package com.bridgelabz.unit;

import java.util.Scanner;

public class DayOfWeek 
{
	public static String dayOfWeek(int m, int d, int y)
	{
		if(d <= 31 && m <= 12)
		{
			double y0 = y - ((14 - m) / 12);
			double x = y0 + (y0/4) - (y0/100) + (y0/400);
			double m0 = m + 12 *((14 -m) / 12)-2;
			double d0 = (d + x + 31*m0 / 12) % 7;
			int s = (int)Math.round(d0)-1;
			switch(s)
			{
			case 0:
			    return "sun";
			case 1:
				return "mon";
			case 2:
				return "tue";
			case 3:
				return "wed";
			case 4:
				return "thu";
			case 5:
				return "fri";
			case 6:
				return "sat";
			}
          
		}
		return " ";
		
	}
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter month: ");
	int m = sc.nextInt();
	System.out.println("enter day: ");
	int d = sc.nextInt();
	System.out.println("enter year: ");
	int y = sc.nextInt();
	System.out.println(dayOfWeek(m,d,y));
	}
	
}



	

