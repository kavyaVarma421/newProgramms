package com.bridgelabz.alg;

import java.util.Scanner;

public class MergeSort 
{
 int[] array;
 int length;
 int[] tempArr;

public  void sort(int[] inputArr)
{
	this.array = inputArr;
	this.length = inputArr.length;
	 this.tempArr = new int[length];
	divideArray(0, length-1);
}
public  void divideArray(int low, int high)
{
	if(low < high)
	{
		int mid = low + (high - low)/2;
		
		//it will sort the left side of an array
		divideArray(low, mid);
		// it will sort the right side of an array
		divideArray(mid+1, high);
		
		mergeArray(low, mid, high);
	}
}
public void mergeArray(int low, int mid, int high)
{
 int i = low;
 int j = mid + 1;
 int k = low;
 while(i <= mid && j <= high)
 {
	 if(tempArr[i] <= tempArr[j])
	 {
		 array[k] = tempArr[i];
		 i++;
	 
	 }
	 else
	 {
		 array[k] = tempArr[j];
		 j++;
		 
	 }
	 k++;
 }
 if(i>mid)
 {
	 while(j <= high)
	 {
		 array[k] = tempArr[j];
		 j++;
		 k++;
		
	 }
 }
 else
 {
   while(i <= mid)
   {
	   array[k] = tempArr[i];
	   i++;
	   k++;
	   
   }
 }
 for( k = low;k <= high; k++)
 {
	 tempArr[k] = array[k];
	
 }
}
public static void main(String[] args) 
{
    int[] inputArr = {48, 32, 53, 24, 16, 19, 65};
    MergeSort ms = new MergeSort();
           ms.sort(inputArr);
          System.out.println("the sorted order is ");
       for(int x:inputArr)
       {
            System.out.println(x+" ");
       }
}
	
}
