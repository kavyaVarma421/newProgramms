package com.bridgelabz.alg;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort 
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
	System.out.println(Arrays.toString(arr));
}
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter how many elements you want in array : ");
	int number=sc.nextInt();
	int[] arr=new int[number];
	System.out.println("Enter array elements : ");
	for(int i=0;i<arr.length;i++)
	{	
		arr[i]=sc.nextInt();
	}
	bubbleSort(arr);
}
}
