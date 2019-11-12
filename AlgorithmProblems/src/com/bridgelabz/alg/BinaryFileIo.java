package com.bridgelabz.alg;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class BinaryFileIo 
{
	public static String[] words;
	public static int i = 0;
	public static String search;
 public static int  binarySearchFile(String[] words, String search)
 {
	 int f = 0;
	 
	 int l = words.length;
	 while(f <= l) 
	 {
	   int mid = (f+l)/2;
	   if(search.equals(words[mid]))
	   {
		 return mid;
	   }
	   if(search.compareTo(words[mid]) < 0)
	   {
		   l=mid-1;
	   }
	   else
	   {
		  
		  
		  f = mid+1;
	   }
	   
	 }
	return -1;
	 
 }
 public static void main(String[] args) throws IOException 
 {
	 
	Scanner sc = new Scanner(System.in);
	File f = new File("/home/admin1/testFile");
	BufferedReader br = new BufferedReader(new FileReader(f));
	
	String st = br.readLine();
	if(st != null)
	{
	String[] words = st.split(",");
	
	System.out.println("the words is "+Arrays.toString(words));
	br.close();
	System.out.println("enter the String:");
	String search = sc.next();

	int x = binarySearchFile(words, search); 
	if(x >= 0)
	{
	System.out.println("the word is found "+x);
	}else
	{
		System.out.println("not found");
	}
	}
}
}
