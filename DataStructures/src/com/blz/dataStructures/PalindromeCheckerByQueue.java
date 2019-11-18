package com.blz.dataStructures;

import java.util.Scanner;

public class PalindromeCheckerByQueue {
	public static void main(String[] args) {

		Deque<Character> dq = new Deque<>();
		Scanner sc = new Scanner(System.in);
		String temp = "";
		System.out.println("enter the string ");
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		for(int i = 0;i < ch.length;i++)
		{
			dq.addRear(ch[i]);
		}
		dq.display();
		for(int i = 0;i<ch.length;i++)
		{
			temp = dq.removeFront()+temp;
		}
		System.out.println("\nreversed string is "+temp);
		if(str.equals(temp))
		{
			System.out.println("given string is palindrome ");
		}
		else
		{
			System.out.println("given string is not palindrome ");
		}
	}

}
