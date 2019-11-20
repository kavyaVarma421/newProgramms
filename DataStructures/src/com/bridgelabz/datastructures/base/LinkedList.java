package com.bridgelabz.datastructures.base;

public class LinkedList<T extends Comparable> {
    //Node class
	public static class Node<T> {
		public T data;
		public Node next;

		Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	public Node head;
  //function to add the data into linkedlist
	public void add(T data) {
		Node<T> node = new Node<T>(data);
       //keeping the first node as head
		if (head == null) {
			head = node;
        //adding and linking  the data one by one to head 
		} else {
			Node<T> temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	
 //function to remove the item from linked list
	public void remove(T item) {
		Node<T> temp;
		Node<T> prev = null;
		//if the item equals to head it will remove and  it will take next node as head
		if (head.data == item) {
			head = head.next;
		} else {
			temp = head.next;    
			prev = head;
			while (temp != null) {   // it will continue loop untill the last node        
				if (temp.data.equals(item)) {  //if item is euquals to in list of data it will remove data and link the next node data                              
					prev.next = temp.next;         
					break;
				}
				prev = temp;
				temp = temp.next; 
			}

		}
	}
	
  //function to serch the item from linkedlist and returns boolean value
	public boolean search(T search) {
		Node<T> temp;
		//if searching item is equals to head it will return true
		if (head.data.equals(search)) {
			return true;
		} else {
			temp = head.next;
			while (temp != null) {
				if (temp.data.equals(search)) { //if searching element is equals to data int the list it will return true
					return true;
				}
				temp = temp.next;
			}
		}
		return false;//if searching item is not there it will return false
	}
	
 //function to know the weather the list is empty or not and returns the boolean value
	public boolean isEmpty() {
		if (head == null) { // if head data present in the list it will return true
			return true;
		}
		return false;//if data is not there it will return false
	}
	
  //function to know the size
	public int size() {
		Node<T> temp;
		int count = 0;
		if (head != null) {
			count++;
		}
		temp = head;
		while (temp.next != null) {
			count++;                 //it will count the how many nodes present in the list
			temp = temp.next;
		}
		return count;
	}
	
  //function to add the item in list
	public void append(T item) {
		Node<T> node = new Node<T>(item); 
		node.data = item;
		node.next = null;
		if (head == null) {
			head = node;
		}
		Node<T> temp = head;
		while (temp.next != null) {
			temp = temp.next; //if last node is null it will add  the new data into last node
		}
		temp.next = node;
	}
	
  // function to know the particular item position
	public int index(T item1) {
		Node<T> temp = head;
		int index = 0;
		do {
			if (temp.data.equals(item1)) {  //it will check the item is matching with the data present in list
				return index;      //if item matches it will return the position
			}
			index++;
			temp = temp.next;
		} while (temp.next != null);
		return index;    
	}
	
   //function to add the item based on index
	public void insert(T item2, int index) {
		Node<T> n = new Node<T>(item2);
		Node<T> temp = head;
		Node<T> prev = null;
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
	
  //function to pop the last item and returns that item
	public T pop() {
		Node<T> temp = head;
		Node<T> prev = null;
		while (temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		if (prev != null) {
			prev.next = null; //it will pop the last element
		} else {
			head = null;
		}

		return temp.data; //it will return the popping item

	}
	
 //function to pop the item based on index
	public T popPos(int pos1) {
		Node<T> temp = head;
		Node<T> prev = null;
		Node<T> node = null;
		for (int i = 0; i < pos1; i++) {
			prev = temp;
			temp = temp.next;
		}
		if (prev != null) {
			prev.next = prev.next.next;
		} else {
			head = null;
		}
		return temp.data; 
	}
	
 //function to display the all the data present in the linkedlist
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
	
 //function to sort the data present in the list
	public void sort() {
		Node<T> prev = null, next = null;
		Node<T> current = head;

		next = current.next;
           //prev = current;
		while (next != null) {
			if (current.data.compareTo(next.data) > 0) {
				if (prev != null) {
					prev.next = next;
					current.next = next.next;
					next.next = current;
				} else {
					current.next = next.next;
					next.next = current;
					head = next;
				}
				prev = null;
				current = head;
				next = current.next;

			} else {
				prev = current;
				current = next;
				next = current.next;
			}

		}
	}

}
