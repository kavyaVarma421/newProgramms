package com.blz.dataStructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class HashingFunMain {
	public static void main(String[] args) throws IOException {

		HashingFunction h = new HashingFunction();
		Scanner sc = new Scanner(System.in);
		File f = new File("/home/admin1/listHash");
		BufferedReader br = new BufferedReader(new FileReader(f));
		String tmp = br.readLine();
		while (tmp != null) {
			int temp = Integer.parseInt(tmp);
			h.add(temp % 11, temp);
            tmp = br.readLine();
		}
		h.display();
		System.out.println("enter the no u want to search");
		int n = sc.nextInt();
		System.out.println("the given num "+n+"is"+(h.search(n) != -1) != null ? ("found at"+h.search(n)):"not found");
	}
}
