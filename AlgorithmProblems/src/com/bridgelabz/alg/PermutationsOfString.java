package com.bridgelabz.alg;

import java.util.Scanner;

public class PermutationsOfString 
{
 public static void permute(String s, int i, int j)
 {
	 if(i == j)
	 {
		 System.out.println(s);
	 }
	 else
	 {
		 for(int k = i;k <= j;k++)
		 {
			 s = swap(s, i, k);
			 permute(s, i+1, j);
			s = swap(s,i, k);
		 }
		 
	 }
 }
 public static String swap(String s, int i, int j)
 {
	 char temp;
	 char[] ch = s.toCharArray();
	 temp = ch[i];
	 ch[i] = ch[j];
	 ch[j] = temp;
	return String.valueOf(ch);
	 
 }
 public static void main(String[] args) 
 {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the String: ");
	String s = sc.nextLine();
	int length = s.length();
	System.out.println("the permutations of string are: ");
	permute(s, 0, length-1);
	
}
}
