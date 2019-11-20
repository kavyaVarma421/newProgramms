package com.blz.dataStructures;

import java.util.Arrays;

public class PrimeAnagramArray {
	public static boolean anagram(int val, int[][] ary) {
		String str2,str1;
		str1=String.valueOf(val);
		for (int[] k : ary) {
			for (int l : k) {
				str2 = String.valueOf(l);
				if (str1.length() == str2.length() && !str1.equals(str2)) {

					char[] ch1 = str1.toCharArray();
					Arrays.sort(ch1);
					char[] ch2 = str2.toCharArray();
					Arrays.sort(ch2);
					if (String.valueOf(ch1).equals(String.valueOf(ch2))) {
						return true;
					}

				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Prime2dArray agrm = new Prime2dArray();
		int[] anagramAry = new int[1000];
		int pos = 0;
		agrm.primeArray();
		for (int i = 0; i < agrm.primeNum.length; i++) {
			for (int j = 0; j < agrm.primeNum[i].length; j++) 
			{ 
			 
				if(anagram(agrm.primeNum[i][j],agrm.primeNum)){
					anagramAry[pos]=agrm.primeNum[i][j];
					++pos;
				}
			}
		}		
		anagramAry = Arrays.copyOf(anagramAry, pos);
		System.out.println(Arrays.toString(anagramAry));
 }
}
