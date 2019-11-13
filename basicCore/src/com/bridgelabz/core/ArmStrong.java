package com.bridgelabz.core;

import java.util.Scanner;

public class ArmStrong {
	static int x;

	public static void armStrong(int n, int x) {
		
		String s = String.valueOf(n);
		x = s.length();
		int sum = 0;
		int num = n;
		while (n != 0) {
			int temp = n % 10;
			sum = (int) (sum + Math.pow(temp, x));
			n = n / 10;
		}
		System.out.println(sum);
		if (num == sum) {
			System.out.println("armstrong");
		} else {
			System.out.println("not armstrong");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no: ");
		int n = sc.nextInt();

		armStrong(n, x);
	}
}
