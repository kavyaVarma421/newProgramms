package com.blz.dataStructures;

import java.util.Arrays;

public class PrimeAnagramArray {

	public static int palindrome(int n) {
		if (n == -1) {
			return 0;
		}
		int remainder, reversedint = 0, originalint;
		originalint = n;
		while (n != 0) {
			remainder = n % 10;
			reversedint = reversedint * 10 + remainder;
			n = n / 10;
		}
		if (originalint == reversedint) {
			System.out.print(originalint + " ");
			return originalint;
		}
		return 0;
	}

	public static void main(String[] args) {
		Prime2dArray agrm = new Prime2dArray();
		int[] anagram = new int[1000];
		int pos = 0;
		agrm.primeArray();
		for (int i = 0; i < agrm.primeNum.length; i++) {
			for (int j = 0; j < agrm.primeNum[i].length; j++) {
				int temp = palindrome(agrm.primeNum[i][j]);
				if (temp != 0) {
					anagram[pos] = temp;
					++pos;
				}

			}
		}
		anagram = Arrays.copyOf(anagram, pos);
		System.out.println(Arrays.toString(anagram));
	}
}
