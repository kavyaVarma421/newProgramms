package com.bridgelabz.alg;

import java.util.Scanner;

public class UtilClass 
{
 public static int find(int n)
 {
	 int low =0;
	 int high = 130;
	 int mid;
	 while(low != high)
	 {   
		
		 mid = (low + high)/2;
		 System.out.println("enter 1 if no is between "+low+"-"+mid+" enter 2 if no is between"+(mid+1)+"-"+high);
		 mid = (low+high)/2;
		 Scanner sc = new Scanner(System.in);
		 int c = sc.nextInt();
		 if(c == 1)
		 {
			 high = mid;
		 }
		 else
		 {
			 low = mid+1;
		 }
		 	 
	 }
	 return low;
	 
 }	
 
 
	 
 
}
