package com.bridgelabz.datastructures.base;

import com.bridgelabz.datastructures.base.Queue.Node;

public class Deque<T>
{
 class Node<T>
 {
	 T data;
	 Node<T> next;
	 Node(T data)
	 {
		 this.data = data;
		 this.next = null;
	 }
 }
 Node<T> head;
 public void addFront(T item)
 {
	 Node<T> newnode = new Node<T>(item);
	 newnode.next = head;
	 head = newnode;
 }
 public void addRear(T item)
 {
	 Node<T> node = new Node<>(item);
	 if(head == null)
	 {
		 head = node;
	 }
	 else {
		 Node<T> temp = head;
		 while(temp.next != null)
		 {
			 temp = temp.next;
		 }
		 temp.next = node;
	 }
 }
 public T removeFront()
 {
		if(isEmpty())
		{
			return null;
		}
		else {
		Node<T> temp = head;
		
		head = temp.next;
		return temp.data;
		}
		
 }
 public T removeRear()
 {
		Node<T> temp = head;
		Node<T> prev = null;
		while (temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		if (prev != null) {
			prev.next = null;
		} else {
			head = null;
		}
		return temp.data;

 }
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		return false;
	}
	public int size() {
		Node<T> temp;
		int count = 0;
		if (head != null) {
			count++;
		}
		temp = head;
		while (temp.next != null) {
			count++;                
			temp = temp.next;
		}
		return count;
	}
	public String display() {
		Node<T> temp;
		String str = " ";
		if (head == null) {
			System.out.println("no data ");
		} else {
			temp = head;
			while (temp.next != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
			System.out.print(temp.data + " ");
		}
		return str;

	}
	
}
