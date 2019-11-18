package com.blz.dataStructures;

import java.util.HashMap;

import com.blz.dataStructures.LinkedList.Node;

public class HashingFunction {

	HashMap<Integer, LinkedList<Integer>> mp = new HashMap<Integer, LinkedList<Integer>>();

	public void add(int key, int data) {
		LinkedList<Integer> temp = new LinkedList<>();
		if (mp.get(key) == null) {
			temp.add(data);
			mp.put(key, temp);
		} else {
			temp = mp.get(key);
			temp.add(data);
		}
	}

	public void display() {
		for (int index : mp.keySet()) {
			System.out.println("index: " + index + "value is ");
			if (mp.get(index) != null) {
				Node head = mp.get(index).head;
				while (head != null) {
					System.out.println(head.data + " ");
					head = head.next;
				}
				System.out.println();
			} else {
				System.out.println("No data");
			}
		}
	}

	public int search(int item) {
		for (int index : mp.keySet()) {
			if (mp.get(index) != null) {
				Node head = mp.get(index).head;
				while (head != null) {
					if (head.data.equals(item)) {
						return index;
					}
					head = head.next;
				}
			}
		}
		return -1;

	}

}
