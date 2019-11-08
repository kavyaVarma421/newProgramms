package com.bridgelabz.alg;

import java.util.Scanner;

public class GenericBinary 
{
 public static <T extends Comparable<T>> int binarySearch(T[] array, T search)
 {
	 int low = 0;
	 int high = array.length;
	 while (low < high)
		{
 		int mid = (low + high) / 2;
 		if (search.compareTo(array[mid]) < 0)
 		{
    			 high = mid;
 		} else if (search.compareTo(array[mid]) > 0) {
     			low = mid + 1;
 		} else {
     			return mid;
 		}
		}		
		return low;
	 
 }
 public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size of the words: ");
	int high = sc.nextInt();
	String[] array = new String[high];
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
