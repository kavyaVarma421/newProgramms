package com.blz.dataStructures;

public class LinkedList<T> {

	static class Node<T> {
		T data;
		Node next;

		Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	Node head;

	public void add(T data) {
		Node<T> node = new Node<T>(data);

		if (head == null) {
			 head = node;

		} else {
			Node<T> temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}

	public void remove(T item) {
		Node<T> temp;
		Node<T> prev = null;
		if (head.data == item) {
			head = head.next;
		} else {
			temp = head.next;
			prev = head;
			while (temp != null) {
				if (temp.data.equals(item)) 
				{
				   prev.next = temp.next;
					break;
				}
			    prev = temp;
				temp = temp.next;
			}
		
		}
	}

	public boolean search(T search) {
		Node<T> temp;
		if (head.data.equals(search)) {
			return true;
		} else {
			temp = head.next;
			while (temp != null) {
				if (temp.data.equals(search)) {
					return true;
				}
				temp = temp.next;
			}
			
		}
		return false;

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

	public void append(T item) {
		Node<T> node = new Node<T>(item);
		node.data = item;
		node.next = null;
		if (head == null) {
			head = node;
		}
		Node<T> temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
	}

	public int index(T item) {
		Node<T> temp = head;
		int index = 0;
		do {
			if (temp.data == item) {
				return index;
			}
			index++;
			temp = temp.next;
		} while (temp.next != null);
		return -1;

	}

	public void insert(T item, int index) {
		Node<T> n = new Node<T>(item);
		Node temp = head;
		Node prev = null;
		for (int i = 0; i < index; i++) {
			prev = temp;
			temp = temp.next;
		}
		if (prev == null) {
			n.next = temp;
			head = n;
		} else {
			prev.next = n;
			n.next = temp;
		}
	}

	public T pop() {
		Node<T> temp = head;
		Node<T> prev = null;
		while (temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		if(prev != null)
		{
			prev.next = null;
		}else
		{
			head = null;
		}

		return temp.data;

	}
	public T popPos(int pos1)
	{
		Node<T> temp = head;
		Node<T> prev = null;
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

	public String display() {
		Node<T> temp;
		String str = " ";
		if (head == null) {
			System.out.println("no data ");
		} else {
			temp = head;
			while (temp.next != null) {
				System.out.println(temp.data + "");
				temp = temp.next;
			}
			System.out.println(temp.data + "");
		}
		return str;

	}

}
