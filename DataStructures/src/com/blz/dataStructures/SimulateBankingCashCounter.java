package com.blz.dataStructures;

import java.util.Scanner;

public class SimulateBankingCashCounter 
{
public static void main(String[] args) 
{
	Queue<Integer> q = new Queue<>();
	Scanner sc = new Scanner(System.in);
	System.out.println("enter how many people u want to add ");
	int num = sc.nextInt();
	
	for(int i = 0;i < num;i++)
	{
		q.enque(i+1);
	}
	q.display();
	int total = 0;
	for(int i = 0;i < num;i++)
	{
		System.out.println("\nperson "+q.deque()+" enter 1 for diposit money or press 2 for withdraw money");
		int option = sc.nextInt();
		System.out.println("how much amount?");
		int amount = sc.nextInt();
		total = option == 1?total+amount:total-amount;
		
	}
	System.out.println(total);
	q.display();
}
}
