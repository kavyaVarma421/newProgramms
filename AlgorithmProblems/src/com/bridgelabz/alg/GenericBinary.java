package com.bridgelabz.alg;

import java.util.Scanner;

public class GenericBinary 
{
 public static <T extends Comparable<T>> int binarySearch(T[] array, T search)
 {
	 int n = array.length;
	 int low = 0;
	 int high = n;
	 while (low <= high)
		{
 		int mid = (low + high) / 2;
 		 if(search.equals(array[mid]))
		   {
			 return mid;
		   }
 		if (search.compareTo(array[mid]) < 0)
 		{
    			 high = mid-1;
 		} else  {
     			low = mid + 1;
 		} 
 		}
				
		return low;
	 
 }
 public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size of the words: ");
	int n = sc.nextInt();
	String[] array = new String[n];
	System.out.println("enter the names: ");
	for(int i = 0;i < array.length;i++)
	{
		array[i] = sc.nextLine();
	}
	System.out.println("enter the name you want to search ");
	String search = sc.nextLine();
	
	int str = binarySearch(array, search);
	System.out.println("the searched name found at index "+str);
	
	}
	
}
