package com.blz.dataStructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.datastructures.base.LinkedList;

public class UnorderedList {
	public static void main(String[] args) throws IOException {
		LinkedList<String> ll = new LinkedList<String>();
		Scanner sc = new Scanner(System.in);
		File f = new File("/home/admin1/listFile");
		BufferedReader br = new BufferedReader(new FileReader(f));
		String str;

		while ((str = br.readLine()) != null) {

			ll.add(str);

		}
		br.close();
		ll.display();
		System.out.println(ll.size());
		System.out.println("enter the element you want to remove ");
		String element = sc.nextLine();
		ll.remove(element);
		ll.display();
		System.out.println("enter the word u want to search ");
		String search = sc.nextLine();
		while (ll.search(search)) {

			ll.remove(search);

		}

		if (ll.search(search)) {
			ll.remove(search);
		} else {
			ll.add(search);
		}

		ll.display();

		System.out.println("enter the word u want to add ");
		String item = sc.nextLine();
		ll.append(item);
		ll.display();
		System.out.println("enter the no to find index ");
		String item1 = sc.nextLine();

		System.out.println("the index found at is " + ll.index(item1));
		System.out.println("enter the pos u want to add ");

		int index = sc.nextInt();
		sc.nextLine();
		System.out.println("enter the word to add ");

		String item2 = sc.nextLine();
		ll.insert(item2, index);
		ll.display();
		System.out.println(ll.pop());
		ll.display();
		System.out.println("enter the pos u want to pop ");
		int pos1 = sc.nextInt();
		System.out.println(ll.popPos(pos1));
		ll.display();

	}
}
