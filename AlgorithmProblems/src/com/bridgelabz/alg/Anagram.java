package com.bridgelabz.alg;

import java.util.Scanner;

public class Anagram 
{
public static void main(String[] args) 
{
  String str1,str2;
  int found = 0, notFound = 0;
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the first string ");
  str1 = sc.nextLine();
  System.out.println("enter the second string ");
  str2 = sc.nextLine();
  
  int length1 = str1.length();
  int length2 = str2.length();
   if(length1 != length2)
   {
	   System.out.println("please check the two words size.....!");
   }
   else if(length1 == length2)
   {
	  int length = length1;
	  for(int i = 0;i < length;i++)
	  {
		   found = 0;
		  for(int j = 0;j < length;j++)
		  {
			  if(str1.charAt(i) == str2.charAt(j))
              {
                  found = 1;
                  break;
              }
		  }
		  if(found == 0)
          {
              notFound = 1;
             break;
          }
	  }
	  if(notFound == 1)
      {
          System.out.print("Strings are not Anagram to Each Other..!!");
      }
      else
      {
          System.out.print("Strings are Anagram");
      }
  }
  
   }
  
  
}
