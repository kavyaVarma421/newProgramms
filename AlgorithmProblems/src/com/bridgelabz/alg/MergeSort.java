package com.bridgelabz.alg;

import java.util.Scanner;

public class MergeSort 
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
public static  void divideArray(int[] array, int low, int high)
{
	if(low < high)
	{
		int mid = low + (high - low)/2;
		
		//it will sort the left side of an array
		divideArray(array, low, mid);
		// it will sort the right side of an array
		divideArray(array, mid+1, high);
		
		mergeArray(array, low, mid, high);
	}
}
public static void mergeArray(int[] array, int low, int mid, int high)
{
 int i = low;
 int j = mid + 1;
 int k = low;
 int[] array1 = new int[array.length];
 while(i <= mid && j <= high)
 {
	 if(array[i] <= array[j])
	 {
		array1[k] = array[i];
		 i++;
	 
	 }
	 else
	 {
		 array1[k] = array[j];
		 j++;
		 
	 }
	 k++;
 }
 while(i <= mid)
 {
	 array1[k] = array[i];
	 k++;
	 i++;
 }
 while(j <= high)
 {
	 array1[k] = array[j];
	 j++;
	 k++;
 }
 for( k = low;k <= high; k++)
 {
	 array[k] = array1[k];
	
 }
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
	divideArray(array, 0, array.length-1);
	System.out.println("sorted array is: ");
	sort(array);
	
}
	
}
