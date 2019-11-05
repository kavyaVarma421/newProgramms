package com.bridgelabz.alg;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort 
{
    public static void insertionSort(String[] arr)
    {
    	String temp;
		for(int i=1;i<arr.length;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(arr[j].compareTo(arr[j-1])<0)
				{
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				else
					break;
			}
		}
	System.out.println("sorted words are: "+Arrays.toString(arr));
    
       
    }
    public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many words you want: ");
		int n = sc.nextInt();
		String[] arr = new String[n];
		System.out.println("enter words ");
		for(int i = 0;i < arr.length;i++)
		{
			arr[i] = sc.nextLine();
		}
	
		insertionSort(arr);
	}
}
