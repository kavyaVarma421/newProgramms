package com.bridgelabz.datastructures.base;

import com.bridgelabz.datastructures.base.LinkedList.Node;

public class Stack<T> {
	// Node class
	static class Node<T> {
		T data;
		Node next;

		Node(T data) {
			this.data = data;
			this.next = null;
		}
	}

	Node<T> head;

	public void push(T data) {
		Node<T> node = new Node<T>(data);
		// keeping the first node as head
		if (head == null) {
			head = node;
			// adding and linking the data one by one to head
		} else {
			Node<T> temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}

	}

	public T pop() {
		Node<T> temp = head;
		Node<T> prev = null;
		while (temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		if (prev != null) {
			prev.next = null; // it will pop the last element
		} else {
			head = null;
		}
		return temp.data;

	}

	public T peek() {
		if (head == null) {
			System.out.println("no data present");
		}
		T temp = head.data;
		return temp;
	}

	public boolean isEmpty() {
		if (head == null) { // if head data present in the list it will return true
			return true;
		}
		return false;// if data is not there it will return false
	}

	public int size() {
		Node<T> temp;
		int count = 0;
		if (head != null) {
			count++;
		}
		temp = head;
		while (temp != null) {
			count++; // it will count the how many nodes present in the list
			temp = temp.next;
		}
		return count;
	}

	public static boolean balancedParentheses(String str) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < str.length(); i++) {
			char bracket = str.charAt(i);
			if (bracket == '(') {
				stack.push(bracket);
			} else if (bracket == ')') {
				stack.pop();
			}
			if (bracket == '{') {
				stack.push(bracket);
			} else if (bracket == '}') {
				stack.pop();
			}
			if (bracket == '[') {
				stack.push(bracket);
			} else if (bracket == ']') {
				stack.pop();
			}
		}
		 
		return stack.isEmpty();

	}

}
