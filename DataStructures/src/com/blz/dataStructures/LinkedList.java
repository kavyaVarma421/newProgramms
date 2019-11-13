package com.blz.dataStructures;

public class LinkedList<T>
{

	static class Node<T>
	{
		T data;
		Node next;

		Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head;

	public void add(T data)
	{
		Node<T> node = new Node<T>(data);

		if (head == null) 
		{
			Node head = node;

		} else 
		{
			Node<T> temp = head;
			while (temp.next != null) 
			{
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	public void remove(T item)
	{
		Node<T> temp;
		Node<T> n1;
		if(head.data == item)
		{
			head = head.next;
		}
		else
		{
			temp = head;
			while(temp.next.next != null)
			{
				if(temp.next.data == item)
				{
					n1 = temp.next;
					temp.next = n1.next;
					break;
				}
				temp = temp.next;
			}
			if(temp.next.data == item)
			{
				temp.next = null;
			}
		}
	}
	public boolean search(T search)
	{
		Node<T> temp;
		if(head.data == search)
		{
			return true;
		}else
		{
			temp = head;
			while(temp.next != null)
			{
				if(temp.next.data == search)
				{
					return true;
				}
				temp = temp.next;
			}
			if(temp.next.data == search)
			{
				return true;
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
		Node<T> temp;
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
	public void append(T item)
	{
		Node<T> node = new Node<T>(item);
		node.data = item;
		node.next = null;
		if(head == null)
		{
			Node head = node;
		}
		Node<T> temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = node;
	}
	
	
	public String display(T data)
	{
		Node temp;
		String str = " ";
		if(head == null)
		{
			System.out.println("no data ");
		}
		else {
			temp = head;
			while(temp.next != null)
			{
				System.out.print(temp.data+"");
				temp = temp.next;
			}
			System.out.println(temp.data+"");
		}
		return str;
		
	}


}
