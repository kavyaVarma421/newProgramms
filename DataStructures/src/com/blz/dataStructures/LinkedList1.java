package com.blz.dataStructures;

import java.util.Scanner;

import com.blz.dataStructures.LinkedList.Node;

public class LinkedList1 
{
	static int count = 0;
	Node head;
 class Node {
	int data;
	Node next;
	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}
 
 public void add(int item)
 {
	 Node node = new Node(item);
	 node.data = item;
	 node.next = null;
	 if(head == null)
	 {
		 head = node;
		 count++;
	 }else {
		 Node temp = head;
		 while(temp.next != null)
		 {
		temp = temp.next;
		
		 }
		temp.next = node;
		count++;
		
	 }
	 
 }
 public boolean search(int search)
 {
	 Node temp;
	 if(head.data == search)
	 {
		 return true;
	 }
	 else {
		 temp = head;
		 while(temp.next != null)
		 {
			 if(temp.next.data == search)
			 {
				return true;
			 }
			 temp = temp.next;
		 }
		
	 }
	return false;
 }
 public boolean isEmpty()
 {
	 if(head == null)
	 {
		 return true;
	 }
	return false;
	 
 }
 public int size()
	{
		Node temp;
		int count = 0;
		if(head != null)
		{
			count++;
		}
		temp = head;
		while(temp.next != null)
		{
			count++;
			temp = temp.next;
		}
		
		return count;
		
	}
 public void append(int item)
 {
	 Node node = new Node(item);
	 node.data = item;
	 node.next = null;
	 if(head == null)
	 {
		 head = node;
	 }
	 Node temp = head;
	 while(temp.next != null)
	 {
		 temp = temp.next;
	 }
	 temp.next = node;
 }
 public void index(int item, int index)
 {
	 index = 0;
	 Node node = new Node(item);
	 
 }
 public void insert(int data1)
 {
	 Node n = new Node(data1);
	 n.data = data1;
	 n.next = null;
	 if(head == null)
	 {
		 head = n;
	 }else
	 {
		 Node temp1 = head;
		 while(temp1.next != null)
		 {
			 temp1 = temp1.next;
		 }
		 temp1.next = n;
	 }
 }
 public void remove(int element)
 {
	Node temp;
	Node n1 = null;
	
	if(head.data == element)
	{
		head = head.next;
	}
	else {
		temp = head;
		while(temp.next.next != null)
		{
			if(temp.next.data == element)
			{
				n1 = temp.next;
				temp.next = n1.next;
				break;
			}
			temp = temp.next;
		}
		if(temp.next.data == element)
		{
			temp.next = null;
		}
	}
	
 }
 public String display()
 {
	 Node temp;
	 String str = " ";
	 if(head == null)
	 {
		 System.out.println("there no data present in the list");
	 }else {
		 temp = head;
		 while(temp.next != null)
		 {
			 System.out.print(temp.data+" ");
			 temp = temp.next;
		 }
		System.out.print(temp.data+"");
	 }
	return str;
	 
 }
 public static void main(String[] args) 
 {
	 Scanner sc = new Scanner(System.in);
  LinkedList1 l = new LinkedList1();
  l.add(10);
  l.add(11);
  l.add(12);
  l.add(13);
  l.add(14);
  l.add(15);
  l.display();
  
  System.out.println("\n enter the element to remove");
  int element = sc.nextInt();
  l.remove(element);
  l.display();
  System.out.println("\n enter the element you want to search ");
  int search = sc.nextInt();
  
 if(l.search(search))
 {
	 l.remove(search);
	 
 }else
 {
	 l.add(search);
 }
 l.display();
 System.out.println();
 System.out.println(l.isEmpty());
 l.display();
 
 System.out.println("\n"+l.size());
 System.out.println("enter the last element you want to add ");
 int item = sc.nextInt();
 l.append(item);
 l.display();
}
}
