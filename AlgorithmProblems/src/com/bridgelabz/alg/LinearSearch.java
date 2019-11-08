package com.bridgelabz.alg;

import java.util.Scanner;

public class LinearSearch 
{
  public static void linearSearh(int[] arr, int search)
  {
	  int n = arr.length;
	  for(int i = 0;i < n;i++)
	  {
		 if(arr[i] == search)
		 {
			 System.out.println("the element found at index: " +"["+i+"]");
			 break;
		 }
		 if(arr[i] == n)
		 {
			 System.out.println("the element not found: ");
		 }
	  }
  }
  public static void main(String[] args)
  {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size of the elements: ");
	int num =sc.nextInt();
	int[] arr = new int[num];
	System.out.println("enter the elements: ");
	for(int i =0;i < arr.length;i++)
	{
		arr[i] = sc.nextInt();
	}
	System.out.println("enter the element you want to search: ");
	int search = sc.nextInt();
	linearSearh(arr, search);
  }
}
