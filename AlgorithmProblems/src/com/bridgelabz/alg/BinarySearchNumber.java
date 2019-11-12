package com.bridgelabz.alg;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchNumber
{
	public static void bubbleSort(int[] arr)
	{
		int n = arr.length;
		int temp = 0;
		for(int i = 0;i < n;i++)
		{
			for(int j = i+1;j < n;j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
	}
 public static void binarySearch(int[] arr, int search)
 {   
	
	 int low = 0;
	 int high = arr.length-1;
	 int mid = low+(high-low)/2;
	 bubbleSort(arr); 
	 while(low <= high)
	 {
		  if ( arr[mid] < search ){  
		        low = mid + 1;     
		      }else if ( arr[mid] == search )
		      {  
		        System.out.println("Element is found at index: " + mid);  
		        break;  
		      }else
		      {  
		         high = mid - 1;  
		      }  
		      mid = (low + high)/2;  
		   }  
		   if ( low > high ){  
		      System.out.println("Element is not found!");  
		   }  
//		return -1;
		    
 }
 public static void main(String[] args) 
 {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size of the elements: ");
	int n = sc.nextInt();
	int[] arr = new int[n];
	System.out.println("enter the elements: ");
	for(int i = 0;i <=arr.length-1;i++)
	{
		arr[i] = sc.nextInt();
	}
	bubbleSort(arr);
	System.out.println("the sorted array is "+Arrays.toString(arr));
	 
	System.out.println("enter the number you want to search: ");
	int search = sc.nextInt();
	binarySearch( arr, search);
//    System.out.println("found at index: "+s);
 }
 
}
