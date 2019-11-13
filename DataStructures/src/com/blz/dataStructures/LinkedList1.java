package com.blz.dataStructures;

import java.util.Scanner;

public class LinkedList1 
{
	int count = 0;
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
	 temp = head;
	if(temp.data == element)
	{
		temp = temp.next;
	}else {
		while(temp.next != null)
		{
			if(temp.data == element)
			{
				temp = temp.next;
				break;
			}else {
				temp = temp.next;
			}
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
  System.out.println("enter the element to remove");
  int element = sc.nextInt();
  l.remove(element);
  l.display();
 
}
}
