package com.bridgelabz.alg;

import java.util.Scanner;

public class GuessingGame 
{
public static void main(String[] args) 
{ 
	Scanner sc = new Scanner(System.in);
 System.out.println("enter the no: ");
 int n = sc.nextInt(); 
  int n1 =UtilClass.find(n);
  if(n1 == 0)
  {
	  System.out.println("enter the correct number: ");
	  
  }
  else {
	  System.out.println("guess number is: "+n1);
  }
}

}