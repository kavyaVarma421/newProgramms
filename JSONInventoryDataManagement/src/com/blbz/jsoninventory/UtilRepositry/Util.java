package com.blbz.jsoninventory.UtilRepositry;

import java.util.Scanner;

public class Util 
{
  static Scanner sc = new Scanner(System.in);
  
  public static String stringInput()
  {
	  try {
		  return sc.nextLine();
	  }catch(Exception e)
	  {
		  System.out.println("enter the correct value ");
	  }
	return " ";
	  
  }
  
  public static int integerInput() {
	  try {
		  return sc.nextInt();
	  }catch(Exception e)
	  {
		  System.out.println("enter the matching value ");
	  }
	return 0;
	  
  }
  
  public static double doublInput()
  {
	  try {
		  return sc.nextDouble();
	  }catch(Exception e)
	  {
		  System.out.println("enter the matching value ");
	  }
	return 0;
	  
  }
  
  public static boolean boolenInput()
  {
	  try {
		  return sc.nextBoolean();
	  }catch(Exception e)
	  {
		 System.out.println(e); 
	  }
	return false;
	  
  }
}
