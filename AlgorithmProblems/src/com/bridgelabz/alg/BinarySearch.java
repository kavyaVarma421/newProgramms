package com.bridgelabz.alg;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch 
{
	public static int binarySearchString(String[] words, String search) {
		 int f = 0;
		 
		 int l = words.length;
		 while(f <= l) 
		 {
		   int mid = (f+l)/2;
		   if(search.equals(words[mid]))
		   {
			 return mid;
		   }
		   if(search.compareTo(words[mid]) < 0)
		   {
			   l=mid-1;
		   }
		   else
		   {
			  
			  
			  f = mid+1;
		   }
		   
		 }
		return -1;
}
	
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size of the words: ");
	int l = sc.nextInt();
	String[] words = new String[l];
	System.out.println("enter the names: ");
	for(int i = 0;i < words.length;i++)
	{
		words[i] = sc.nextLine();
	}
	System.out.println("enter the name you want to search ");
	String search = sc.nextLine();
	int str = binarySearchString(words, search);
	System.out.println("the searched name found at index "+str);
	
	}
}
