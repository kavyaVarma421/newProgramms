package com.blz.dataStructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class OrderedList {
	public static void main(String[] args) throws IOException{
      LinkedList<Integer> ll = new LinkedList<>();
      Scanner sc = new Scanner(System.in);
      File f = new File("/home/admin1/listNum");
      BufferedReader br = new BufferedReader(new FileReader(f));
      String tmp =br.readLine();
      while(tmp!=null)
      {
    	  ll.add(Integer.parseInt(tmp));
    	  tmp =br.readLine();
      }
      ll.display();
      System.out.println();
      ll.sort();
      ll.display();
      System.out.println("\n remove one item ");
      int item = sc.nextInt();
      ll.remove(item);
      ll.display();
      System.out.println("\n enter the no to search ");
      int search = sc.nextInt();
      System.out.println(ll.search(search));
      System.out.println(ll.isEmpty());
      System.out.println("the size is "+ll.size());
      System.out.println("enter the no to know the position ");
      int item1 = sc.nextInt();
      System.out.println("the no found at "+ll.index(item1));
      System.out.println(ll.pop());
      ll.display();
      System.out.println("enter the pos u want to pop ");
      int pos1 = sc.nextInt();
      System.out.println(ll.popPos(pos1));
      ll.display();
	}
}
