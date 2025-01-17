package com.bridgelabz.alg;

import java.util.Scanner;

public class QuickSort 
{
	public static void sort(int[] array)
	{ 
		int n = array.length; 
	     for (int i=0; i<n; ++i)
	     {
	      System.out.print(array[i] + " "); 
	     }
	     System.out.println(); 
		 
	}
  
	public static void quickSort(int[] array, int low, int high)
	{
		if(low < high)
		{	
		int loc = partition(array, low, high);
		quickSort(array, low, loc-1);
		quickSort(array, loc+1, high);
		}
	}
	public static int partition(int[] array,int low,int high)
	{
		int pivot = array[low];
		int start = low;
		int end = high;
		while(start < end)
		{
			while(array[start] <= pivot)
			{
				start++;
			}
			while(array[end] >= pivot)
			{
				end--;
			}
			if(start < end)
			{
				int swap = array[start];
				array[start] = array[end];
				array[end] = swap;
			}
		}
		int swap = array[low];
		array[low] = array[end];
		array[end] = swap;
		return end;
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of the array: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("enter the elements you want to sort: ");
		for(int i = 0;i < array.length;i++)
		{
			array[i] = sc.nextInt();
		}
		System.out.println("given array");
		sort(array);
	    partition(array, 0, n-1);
		System.out.println("sorted array is: ");
		sort(array);
		
	}
}
