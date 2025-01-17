package com.bridgelabz.alg;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSorting 
{
	public static int[] doInsertionSort(int[] arr)
	{
        int temp;
        for (int i = 1; i < arr.length; i++)
        {
            for(int j = i ; j > 0 ; j--)
            {
                if(arr[j] < arr[j-1])
                {
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
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
		int[] a = doInsertionSort(arr);
		System.out.println("the sorted order is: "+Arrays.toString(a));
	}
}
