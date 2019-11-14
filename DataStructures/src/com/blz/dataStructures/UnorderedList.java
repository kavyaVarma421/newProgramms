package com.blz.dataStructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class UnorderedList 
{
public static void main(String[] args) throws IOException
{
	LinkedList<String> ll = new LinkedList<String>();
	Scanner sc = new Scanner(System.in);
	File f = new File("/home/admin1/listFile");
	BufferedReader br = new BufferedReader(new FileReader(f));
	String str;
	
	
	while((str = br.readLine()) != null)
	{
	
	 ll.add(str);
	
    }
	br.close();
    ll.display(); 
    System.out.println(ll.size());
    System.out.println("enter the element you want to remove ");
    String element = sc.nextLine();
    ll.remove(element);
    ll.display();
    System.out.println("enter the word u want to search ");
    String search = sc.nextLine();
    System.out.println(ll.search(search));
	
}
}
