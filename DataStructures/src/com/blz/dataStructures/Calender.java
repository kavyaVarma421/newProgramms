package com.blz.dataStructures;

import java.util.Scanner;

public class Calender {
	static String[]  dayOfWeek = { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
	static int[][] wholeDays ;
	
	public static boolean leapYear(int y) {
		if (y % 100 != 0 && y % 4 == 0) {
			return true;
		} else if (y % 100 == 0 && y % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void calender(int m, int y) {
		int day = 0;
		int year = y - (14 - m) / 12;
		int x = year + (year / 4) - (year / 100) + (year / 400);
		int month = m + 12 * ((14 - m) / 12) - 2;
		int day1 = (day + x + (31 * month) / 12) % 7;

		String[] mName = { "january", "febrauary", "march", "april", "may", "june", "july", "august", "September",
				"october", "november", "december" };
		int[] daysOfMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int monthDay = 0;
		for (int i = 0; i < daysOfMonth.length; i++) {
			if (i == (m - 1)) {
				monthDay = daysOfMonth[i];
			}
		}
		wholeDays = new int[6][7];
		boolean leapy = leapYear(y);
		if (leapy && month == 1) {
			monthDay = 29;
		}
		int s = 0;
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (i == 0 && j < day1) {
					wholeDays[i][j] = -1;
				} else if (s <= monthDay) {
					wholeDays[i][j] = s;
					s++;
				} else {
					wholeDays[i][j] = -1;
				}
			}
		}
		for (int i = 0; i < 12; i++) {
			if (m == i + 1) {
				System.out.print(mName[i] + " " + y);
			}
		}
		System.out.println();
		
		for (int i = 0; i < 7; i++) {
			System.out.print(dayOfWeek[i] + "  ");
		}
		System.out.println();
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (wholeDays[i][j] != -1) {
					if (wholeDays[i][j] < 10) {
						System.out.print(wholeDays[i][j] + "    ");
					} else {
						System.out.print(wholeDays[i][j] + "   ");
					}
				} else {
					System.out.print("     ");
				}
			}
			System.out.println();
		}


	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name of month: ");
		int m = sc.nextInt();
		System.out.println("enter the year: ");
		int y = sc.nextInt();
		System.out.println("indian calender: ");
		System.out.println();
		calender(m, y);
	}
}
