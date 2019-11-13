package com.blz.dataStructures;

public class LinkedList<T> 
{
	int count = 0;
 static class Node<T>
{
	T data;
	Node next;
	Node(T data)
	{
		this.data = data;
		this.next = null;
	}
}
Node head;
public void add(T data)
{
	Node<T> node = new Node<T>(data);

	
	if(head == null)
	{
		Node head = node;
	    count++;
	}else {
		Node<T> temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = head;
	}	
}


}
