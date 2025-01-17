package com.bridgelabz.logic;

import java.util.Scanner;

public class Gambler 
{

	static void gamble(int noOfTimes, int $Stake, int $Goal)
	{
		int wins = 0;
		int bets = 0;
		
		for(int i = 0;i < noOfTimes;i++)
		{
			int cash = $Stake;
			
			while(cash > 0 && cash < $Goal)
			{
				bets++;
				if(Math.random() < 0.5)
				{
					cash++;
				}
				else
				{
					cash--;
				}
			}
			if(cash == $Goal)
			{
				wins++;
			} 
		}
		System.out.println();
		System.out.println(wins+ " wins out of " +noOfTimes);
		System.out.println("percentage of games won = " +100.0 * wins/noOfTimes);
		System.out.println("percentage of games loss = " +100.0 * (noOfTimes-wins)/noOfTimes);
		System.out.println("Total bets in " +noOfTimes +" games = " +bets);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter stake amount ");
		int $Stake = sc.nextInt();
		System.out.println("enter the Goal");
		int $Goal = sc.nextInt();
		System.out.println("enter no of times u want to gamble ");
		int noOfTimes = sc.nextInt();
		gamble(noOfTimes, $Stake, $Goal);
		
	}
	
}
