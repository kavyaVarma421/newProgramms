package com.bridgelabz.core;

import java.io.PrintWriter;
import java.util.Scanner;

public class Array2D 
{
	static Scanner sc = new Scanner(System.in);
	
	public static int[][] arrInt(int m, int n)
	{
		int a[][] = new int[m][n];
		System.out.println();
		System.out.println("Integer Array");
		for(int i = 0;i < m;i++)
		{
			for(int j = 0;j < n;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		return a;
		
	}
	public static double[][] arrDouble(int m, int n)
	{
		double b[][] = new double[m][n];
		System.out.println();
		System.out.println("Double  Array");
		for(int i = 0;i < m;i++)
		{
			for(int j = 0;j < n;j++)
			{
				b[i][j] = sc.nextDouble();
			}
		}
		return b;
		
	}
	public static String[][] arrBoolean(int m, int n)
	{
		String c[][] = new String[m][n];
		System.out.println();
		System.out.println("String Array");
		for(int i = 0;i < m;i++)
		{
			for(int j = 0;j < n;j++)
			{
				c[i][j] = sc.nextLine();
			}
		}
		return c;
		
	}
	public static void display(int[][] a, double[][] b, String[][] c, int m, int n)
	{
		PrintWriter pw = new PrintWriter(System.out,true);
		System.out.println();
		pw.println("2D Array Integer");
		for(int i = 0;i < m;i++)
		{
			for(int j = 0;j < n;j++)
			{
				pw.print("\t" + a[i][j] + " ");
			}
			pw.println();
		}
		
		System.out.println();
		pw.println("2D Array Double");
		for(int i = 0;i < m;i++)
		{
			for(int j = 0;j < n;j++)
			{
				pw.print("\t" + b[i][j]+ " ");
			}
			pw.println();
		}
		
		System.out.println();
		pw.println("2D Array Boolean");
		for(int i = 0;i < m;i++)
		{
			for(int j = 0;j < n;j++)
			{
				pw.print("\t" + c[i][j] + " ");
			}
			pw.println();
		}
	
	}
	
	<t> void displayArray(t[][] arr) {
		PrintWriter pw = new PrintWriter(System.out);

		
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				pw.print("\t" + arr[i][j] + " ");
			}
			pw.println("\t");
		}
	}
	public static void main(String[] args)
	{

		System.out.println("Enter number of rows: ");
		int m = sc.nextInt();
		System.out.println("Enter number of columns: ");
		int n = sc.nextInt();
		int[][] a = arrInt(m, n);
		double[][] b = arrDouble(m, n);
		String[][] c = arrBoolean(m, n);
        display(a, b, c, m, n);
	}

}
