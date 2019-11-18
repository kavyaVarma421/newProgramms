package com.blz.dataStructures;

public class Prime2dArray {
	public static void primeArray() {
		int[][] array = new int[10][100];
		int[][] primeNum = new int[10][100];
		int temp = 1;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 100; j++) {
				array[i][j] = temp;
				temp++;
			}
		}
		for(int i = 0;i < 10;i++)
		{
			for(int j = 0;j < 100;j++)
			{
				if(checkPrime(array[i][j]))
				{
					primeNum[i][j] = array[i][j];
				}else
				{
					primeNum[i][j] = -1;
				}
			}
		}
		for(int i = 0;i < 10;i++)
		{
			for(int j = 0;j < 100;j++)
			{
				if(primeNum[i][j] != -1)
				{
					System.out.println(primeNum[i][j]+" ");
				}
			}
			System.out.println("\n");
		}
	}
	

	public static boolean checkPrime(int num) {
		int count = 0;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) 
	{
		primeArray();
	}
}
