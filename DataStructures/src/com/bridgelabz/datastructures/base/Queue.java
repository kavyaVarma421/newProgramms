package com.bridgelabz.datastructures.base;

import com.bridgelabz.datastructures.base.LinkedList.Node;

public class Queue<T> 
{

	public class Node<T>{
		T data;
		Node<T> next;
		Node(T data)
		{
			this.data = data;
			this.next = null;
		}
	}
	Node<T> head;
	public void enque(T data) {
		Node<T> newnode = new Node<>(data);
		if(head == null)
		{
			head = newnode;
		}else {
		Node<T> temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		temp.next = newnode;
		}
	}
	
	public T deque() {
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
	public boolean isEmpty() {
		if (head == null) { // if head data present in the list it will return true
			return true;
		}
		return false;//if data is not there it will return false
	}
	public int size() {
		Node<T> temp;
		int count = 0;
		if (head != null) {
			count++;
		}
		temp = head;
		while (temp != null) {
			count++;                 //it will count the how many nodes present in the list
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
