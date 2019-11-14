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
 public int index(int item1)
 {
	 Node temp = head;
	 int index = 0;
	  do {
		  if(temp.data == item1)
		  {
			  return index;
		  }
		  index++;
		  temp = temp.next;
	  }while(temp.next != null);
	return index;
 }
 public void insert(int data1, int pos)
 {
	 Node n = new Node(data1);
	
	 Node temp = head;
	 Node prev = null;
	for(int i = 0;i < pos;i++)
	{
	    prev = temp;
		temp = temp.next;
	}
	if(prev == null)
	{
	n.next= temp;
    head = n;
	}else
	{
		prev.next = n;
		n.next = temp;
	}
	
 }
 public void remove(int element)
 {
	Node temp;
	Node prev = null;
	
	if(head.data == element)
	{
		head = head.next;
	}
	else {
		temp = head.next;
		prev = head;
		while (temp != null) {
			if (temp.data == element) 
			{
			   prev.next = temp.next;
				break;
			}
		    prev = temp;
			temp = temp.next;
		}
	}
	
 }
 public int pop()
 {
	 Node temp = head;
	 Node prev = null;
	 while(temp.next != null)
	 {
		 prev = temp;
		 temp = temp.next;
	 }
	 if(prev != null)
	 {
		 prev.next = null;
	 }else {
		 head = null;
	 }
	
	return temp.data;		 
 }
  public int popPos(int pos1)
  {
	 Node temp = head;
	 Node prev = null;
	 for(int i = 0;i < pos1;i++)
	 {
		 prev = temp;
		 temp = temp.next;
	 }
	 if(prev != null)
	 {
		 prev.next = null;
	 }else {
		 head = null;
	 }
	 return temp.data;
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
			 System.out.println(temp.data+" ");
			 temp = temp.next;
		 }
		System.out.println(temp.data+"");
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
 System.out.println("\n enter the no  ");
 int item1 = sc.nextInt();

 System.out.println("the no found at "+l.index(item1));
 
 System.out.println("enter the pos u want to add ");
 int pos = sc.nextInt();
 System.out.println("enter the element u want to add");
 int data1 = sc.nextInt();
 l.insert(data1, pos);
 l.display();

 System.out.println("\n the elemnt poped "+ l.pop());
 l.display();
 System.out.println("\n enter the pos ");
 int pos1 = sc.nextInt();
 System.out.println(" popped element "+l.popPos(pos1));
}
}
