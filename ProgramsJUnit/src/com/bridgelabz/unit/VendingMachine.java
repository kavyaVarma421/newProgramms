package com.bridgelabz.unit;

import java.util.Scanner;

public class VendingMachine 
{
static int i = 0;
static int total = 0;
static int[] notes = {1000, 500,100, 50, 10, 5, 2, 1};
static int money;

public static int calculate(int money, int[] notes)
{
	int rem;
	if(money == 0)
	{
		return -1;
	}
	else
	{
		if(money >= notes[i])
		{
			int calNotes = money/notes[i];
			rem = money % notes[i];
			money = rem;
			System.out.println(notes[i]+ " notes is " +calNotes);
		}
		i++;
		return calculate(money, notes);
	}
}
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the amount:");
money = sc.nextInt();
calculate(money, notes);

}
	
}
